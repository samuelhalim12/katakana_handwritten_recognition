package com.ubaya.katakana_writing

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.drawToBitmap
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_practice_writing.*
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PracticeWritingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice_writing)
        val letter = intent.getStringExtra("letter")
        if(letter.toString() == "ア"){
            Glide.with(applicationContext)
                .load(R.drawable.a)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "イ"){
            Glide.with(applicationContext)
                .load(R.drawable.i)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ウ"){
            Glide.with(applicationContext)
                .load(R.drawable.u)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "エ"){
            Glide.with(applicationContext)
                .load(R.drawable.e)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "オ"){
            Glide.with(applicationContext)
                .load(R.drawable.o)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "カ"){
            Glide.with(applicationContext)
                .load(R.drawable.ka)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "キ"){
            Glide.with(applicationContext)
                .load(R.drawable.ki)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ク"){
            Glide.with(applicationContext)
                .load(R.drawable.ku)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ケ"){
            Glide.with(applicationContext)
                .load(R.drawable.ke)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "コ"){
            Glide.with(applicationContext)
                .load(R.drawable.ko)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "サ"){
            Glide.with(applicationContext)
                .load(R.drawable.sa)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "シ"){
            Glide.with(applicationContext)
                .load(R.drawable.shi)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ス"){
            Glide.with(applicationContext)
                .load(R.drawable.su)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "セ"){
            Glide.with(applicationContext)
                .load(R.drawable.se)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ソ"){
            Glide.with(applicationContext)
                .load(R.drawable.so)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "タ"){
            Glide.with(applicationContext)
                .load(R.drawable.ta)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "チ"){
            Glide.with(applicationContext)
                .load(R.drawable.chi)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ツ"){
            Glide.with(applicationContext)
                .load(R.drawable.tsu)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "テ"){
            Glide.with(applicationContext)
                .load(R.drawable.te)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ト"){
            Glide.with(applicationContext)
                .load(R.drawable.to)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ナ"){
            Glide.with(applicationContext)
                .load(R.drawable.na)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ニ"){
            Glide.with(applicationContext)
                .load(R.drawable.ni)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヌ"){
            Glide.with(applicationContext)
                .load(R.drawable.nu)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ネ"){
            Glide.with(applicationContext)
                .load(R.drawable.ne)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ノ"){
            Glide.with(applicationContext)
                .load(R.drawable.no)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ハ"){
            Glide.with(applicationContext)
                .load(R.drawable.ha)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヒ"){
            Glide.with(applicationContext)
                .load(R.drawable.hi)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "フ"){
            Glide.with(applicationContext)
                .load(R.drawable.fu)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヘ"){
            Glide.with(applicationContext)
                .load(R.drawable.he)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ホ"){
            Glide.with(applicationContext)
                .load(R.drawable.ho)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "マ"){
            Glide.with(applicationContext)
                .load(R.drawable.ma)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ミ"){
            Glide.with(applicationContext)
                .load(R.drawable.mi)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ム"){
            Glide.with(applicationContext)
                .load(R.drawable.mu)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "メ"){
            Glide.with(applicationContext)
                .load(R.drawable.me)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "モ"){
            Glide.with(applicationContext)
                .load(R.drawable.mo)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヤ"){
            Glide.with(applicationContext)
                .load(R.drawable.ya)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ユ"){
            Glide.with(applicationContext)
                .load(R.drawable.yu)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヨ"){
            Glide.with(applicationContext)
                .load(R.drawable.yo)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ラ"){
            Glide.with(applicationContext)
                .load(R.drawable.ra)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "リ"){
            Glide.with(applicationContext)
                .load(R.drawable.ri)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ル"){
            Glide.with(applicationContext)
                .load(R.drawable.ru)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "レ"){
            Glide.with(applicationContext)
                .load(R.drawable.re)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ロ"){
            Glide.with(applicationContext)
                .load(R.drawable.ro)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ワ"){
            Glide.with(applicationContext)
                .load(R.drawable.wa)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ヲ"){
            Glide.with(applicationContext)
                .load(R.drawable.wo)
                .into(imageViewGifDataset2)
        }
        else if(letter.toString() == "ン"){
            Glide.with(applicationContext)
                .load(R.drawable.n)
                .into(imageViewGifDataset2)
        }
        drawViewDataset2.setSizeForBrush(15)
        drawViewDataset2.setBrushColor(Color.BLACK)
        buttonTrashDataset2.setOnClickListener(){
            drawViewDataset2.clearDrawingBoard()
        }
        buttonUndoDataset2.setOnClickListener(){
            drawViewDataset2.undo()
        }
        buttonRedoDataset2.setOnClickListener(){
            drawViewDataset2.redo()
        }
        fun indexToKatakana(index: Int): String {
            val katakanas = arrayOf("ア", "イ", "ウ", "エ", "オ", "カ", "キ", "ク", "ケ",
                "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ツ", "テ", "ト", "ナ",
                "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ","へ", "ホ", "マ", "ミ", "ム", "メ",
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
//            val alertDialogBuilder = AlertDialog.Builder(context, R.style.CustomAlertDialogTheme)
//            val customLayout = LayoutInflater.from(context).inflate(R.layout.custom_alert_dialog, null)
//
//            AlertDialog.Builder(context)
//                .setTitle(title)
//                .setMessage(message)
//                .setPositiveButton(android.R.string.ok) { dialog, _ ->
//                    // Optional: Perform any action on OK button click
//                    dialog.dismiss()
//                }
//                .show()
//        }
        fun showMessageBox(context: Context, title: String, message: String, view:View) {
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

        buttonCheck.setOnClickListener() {
            val bitmapKatakana = drawViewDataset2.drawToBitmap()
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


// Check if the predicted Katakana character is correct
            val predictedProbability = outputData[0][predictedClass]
            for (i in 0 until outputData.size) {
                // Iterate through columns
                for (j in 0 until outputData[i].size) {
                    println("Index $j: ${outputData[i][j]}")
                }
            }

            println("MobV2 : " + predictedProbability.toString())


            println("MobV2 : " + predictedKatakana.toString())

            val isCorrect = predictedProbability > 0.9

            if(letter.toString() == predictedKatakana.toString() && isCorrect){

                val anchorView = findViewById<View>(R.id.drawViewDataset2) // Replace R.id.your_anchor_view with the ID of your anchor view

                showMessageBox(this, "Info", "Benar!", anchorView)
//                showMessageBox(this, "Info", "Benar!" )
//                    Toast.makeText(applicationContext,"Benar!", Toast.LENGTH_SHORT).show()

            }
            else {
                val anchorView = findViewById<View>(R.id.drawViewDataset2) // Replace R.id.your_anchor_view with the ID of your anchor view

                showMessageBox(this, "Info", "Salah!", anchorView)
//                showMessageBox(this, "Info", "Salah!" )
//                Toast.makeText(applicationContext,"Salah!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}