package com.ubaya.katakana_writing

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.drawToBitmap
import kotlinx.android.synthetic.main.activity_practice_writing.*
import kotlinx.android.synthetic.main.activity_writing_test.*
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.DoubleBuffer
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel
import kotlin.math.ceil
import kotlin.math.floor


class WritingTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_test)
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getStringArrayExtra("answers")
        val jilid = intent.getStringExtra("level")
        val nama = intent.getStringExtra("nama")

        var score: Double = 0.0
        var ceiledScore: Int = 0

//        println("Questions")
//        if (questions != null) {
//            for (value in questions) {
//                println(value)
//            }
//        }
//        println("Answers")
//        if (answers != null) {
//            for (value in answers) {
//                println(value)
//            }
//        }

        val totalQuestion = questions!!.size
//        println(totalQuestion)

        textTotalQuestion.setText(totalQuestion.toString())
        progressBarTest.max = totalQuestion
        var indexNow = 0
//        println(questions!![indexNow])

        fun generateQuestion() {
            progressBarTest.progress = indexNow + 1
            buttonQuestion.setText(questions!![indexNow].toString())
            drawViewTest.clearDrawingBoard()
            textQuestionNow.setText((indexNow + 1).toString())
        }
        generateQuestion()

        drawViewTest.setSizeForBrush(15)
        drawViewTest.setBrushColor(Color.BLACK)
        buttonTrashTest.setOnClickListener(){
            drawViewTest.clearDrawingBoard()
        }
        buttonUndoTest.setOnClickListener(){
            drawViewTest.undo()
        }
        buttonRedoTest.setOnClickListener(){
            drawViewTest.redo()
        }
        fun indexToKatakana(index: Int): String {
            val katakanas = arrayOf("ア", "イ", "ウ", "エ", "オ", "カ", "キ", "ク", "ケ",
                "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ツ", "テ", "ト", "ナ",
                "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ","ヘ", "ホ", "マ", "ミ", "ム", "メ",
                "モ", "ヤ", "ユ", "ヨ", "ラ", "リ", "ル", "レ", "ロ", "ワ", "ヲ", "ン")
            return katakanas[index]
        }

        fun loadModelFile(modelFilename: String): MappedByteBuffer {
            val assetFileDescriptor = assets.openFd(modelFilename)
            val inputStream = FileInputStream(assetFileDescriptor.fileDescriptor)
            val fileChannel = inputStream.channel
            val startOffset = assetFileDescriptor.startOffset
            val declaredLength = assetFileDescriptor.declaredLength
            return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
        }
//        fun showMessageBox(context: Context, title: String, message: String) {
//            AlertDialog.Builder(context)
//                .setTitle(title)
//                .setMessage(message)
//                .setPositiveButton(android.R.string.ok) { dialog, _ ->
//                    // Optional: Perform any action on OK button click
//                    dialog.dismiss()
//                }
//                .show()
//        }
        fun showMessageBox(context: Context, title: String, message: String, view: View) {
            val alertDialogBuilder = AlertDialog.Builder(context)
            alertDialogBuilder.setTitle(title)
//            alertDialogBuilder.setMessage(message)

            // Create and customize the TextView for the AlertDialog
            val textView = TextView(context)
            textView.text = message
            textView.setPadding(16, 16, 16, 16)
            textView.gravity = Gravity.CENTER
            textView.setTextSize(18F)

            // Set the TextView as the view for the AlertDialog
            alertDialogBuilder.setView(textView)

            // Create and show the AlertDialog
            val alertDialog = alertDialogBuilder.create()

            // Set the AlertDialog position above the anchor view
            val layoutParams = alertDialog.window?.attributes
            layoutParams?.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            alertDialog.window?.attributes = layoutParams

            // Show the AlertDialog
            alertDialog.show()

            // Adjust the width to match the width of the anchor view
            val width = view.width
            alertDialog.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
        var attempt = 3
        buttonCheckTest.setOnClickListener() {
            val bitmapKatakana = drawViewTest.drawToBitmap()
            // Load the TFLite model from the assets directory
            val tflite = Interpreter(loadModelFile("model_alexnet_converted.tflite"))
            val INPUT_SIZE = 100
            val CHANNELS = 3 // RGB image
            val BYTES_PER_CHANNEL = 4 // TFLite model uses Float32
// Prepare the input data
            val bitmap = bitmapKatakana
//            val bitmap = BitmapFactory.decodeFile("path/to/image")
            val resizedBitmap = Bitmap.createScaledBitmap(bitmap, INPUT_SIZE, INPUT_SIZE, true)
            val inputData = ByteBuffer.allocateDirect(INPUT_SIZE * INPUT_SIZE * CHANNELS * BYTES_PER_CHANNEL)
            inputData.order(ByteOrder.nativeOrder())
            for (y in 0 until INPUT_SIZE) {
                for (x in 0 until INPUT_SIZE) {
                    val pixelValue = resizedBitmap.getPixel(x, y)
                    inputData.putFloat((pixelValue shr 16 and 0xFF) / 255.0f)
                    inputData.putFloat((pixelValue shr 8 and 0xFF) / 255.0f)
                    inputData.putFloat((pixelValue and 0xFF) / 255.0f)
                }
            }

// Perform inference
            val outputData = Array(1) { FloatArray(46) }
            tflite.run(inputData, outputData)

// Find the index of the predicted class
            val predictedClass = outputData[0].indices.maxByOrNull { outputData[0][it] } ?: -1

// Convert the index to a Katakana character
            val predictedKatakana = indexToKatakana(predictedClass)
            val predictedProbability = outputData[0][predictedClass]
            println(predictedProbability.toString())
            val isCorrect = predictedProbability > 0.9
            println(answers!![indexNow])
            println(predictedKatakana.toString())
            println(attempt.toString())
            if(answers!![indexNow] == predictedKatakana.toString() && isCorrect){
//                Toast.makeText(applicationContext,"Benar!", Toast.LENGTH_SHORT).show()
                val anchorView = findViewById<View>(R.id.drawViewTest) // Replace R.id.your_anchor_view with the ID of your anchor view

                showMessageBox(this, "Info", "Benar!", anchorView)
                score += 100 / totalQuestion.toDouble()
                println(score.toString())
                if(indexNow + 1 == totalQuestion){
                    ceiledScore = floor(score).toInt()
                    val intent = Intent(this, TestDoneActivity::class.java)
                    intent.putExtra("score", ceiledScore)
                    intent.putExtra("level", jilid.toString())
                    intent.putExtra("nama", nama.toString())
                    startActivity(intent)
                    finish()
                    println("Score = " + ceiledScore)
                } else if (indexNow + 1 != totalQuestion) {
                    indexNow += 1
                    generateQuestion()
                }
                attempt = 3
            }
            else if (answers!![indexNow] == predictedKatakana.toString() && !isCorrect)
            {
                attempt -= 1
                if(attempt == 0) {
                    val anchorView = findViewById<View>(R.id.drawViewTest) // Replace R.id.your_anchor_view with the ID of your anchor view

                    showMessageBox(this, "Info", "Salah! Kesempatan habis!", anchorView)
                    attempt = 3
                    if(indexNow + 1 == totalQuestion){
                        ceiledScore = floor(score).toInt()
                        val intent = Intent(this, TestDoneActivity::class.java)
                        intent.putExtra("score", ceiledScore)
                        intent.putExtra("level", jilid.toString())
                        intent.putExtra("nama", nama.toString())
                        startActivity(intent)
                        finish()
                        println("Score = " + ceiledScore)
                    } else if (indexNow + 1 != totalQuestion) {
                        indexNow += 1
                        generateQuestion()
                    }
                }
                else {
                    val anchorView = findViewById<View>(R.id.drawViewTest) // Replace R.id.your_anchor_view with the ID of your anchor view

                    showMessageBox(this, "Info", "Salah! Silahkan ulangi lagi! Sisa kesempatan "
                            + attempt.toString(), anchorView)
                }
            }
            else {
//                Toast.makeText(applicationContext,"Salah!", Toast.LENGTH_SHORT).show()
                val anchorView = findViewById<View>(R.id.drawViewTest) // Replace R.id.your_anchor_view with the ID of your anchor view

                showMessageBox(this, "Info", "Salah!", anchorView)
                attempt = 3
                if(indexNow + 1 == totalQuestion){
                    ceiledScore = floor(score).toInt()
                    val intent = Intent(this, TestDoneActivity::class.java)
                    intent.putExtra("score", ceiledScore)
                    intent.putExtra("level", jilid.toString())
                    intent.putExtra("nama", nama.toString())
                    startActivity(intent)
                    finish()
                    println("Score = " + ceiledScore)
                } else if (indexNow + 1 != totalQuestion) {
                    indexNow += 1
                    generateQuestion()
                }
            }
//            if(indexNow + 1 == totalQuestion && answers!![indexNow] == predictedKatakana.toString() && isCorrect) {
//                ceiledScore = floor(score).toInt()
//                val intent = Intent(this, TestDoneActivity::class.java)
//                intent.putExtra("score", ceiledScore)
//                intent.putExtra("level", jilid.toString())
//                startActivity(intent)
//                finish()
//                println("Score = " + ceiledScore)
//            } else if (indexNow + 1 != totalQuestion && answers!![indexNow] == predictedKatakana.toString() && isCorrect)
//            {
//                indexNow += 1
//                generateQuestion()
//            }
        }
    }
}