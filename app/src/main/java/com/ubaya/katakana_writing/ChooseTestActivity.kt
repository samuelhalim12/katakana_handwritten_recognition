package com.ubaya.katakana_writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_choose_test.*

class ChooseTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_test)
        val volumes = listOf(
            "Pilih Level",
            "Level 1",
            "Level 2",
            "Level 3",
            "Level 4",
            "Level 5",
            "Semua Level"
        )
        val romajiList = listOf(
            "a", "i", "no", "e", "ni", "he", "ko", "re", "to",
            "mi", "sa", "ra", "su", "se", "ru", "me", "ro", "ri",
            "te", "mo", "na", "o", "nu", "yo", "ta", "ha", "hi",
            "fu", "ka", "ho", "ma", "ki", "mu", "u", "ke", "ya",
            "yu", "ne", "shi", "tsu", "so", "ku", "chi", "wa", "wo", "n")
        val katakanaList = listOf(
            "ア", "イ", "ノ", "エ", "ニ", "ヘ", "コ", "レ", "ト",
            "ミ", "サ", "ラ", "ス", "セ", "ル", "メ", "ロ", "リ",
            "テ", "モ", "ナ", "オ", "ヌ", "ヨ", "タ", "ハ", "ヒ",
            "フ", "カ", "ホ", "マ", "キ", "ム", "ウ", "ケ", "ヤ",
            "ユ", "ネ", "シ", "ツ", "ソ", "ク", "チ", "ワ", "ヲ", "ン")
        spinnerChooseJilid.setSelection(0)
        val textInputNama = findViewById<EditText>(R.id.editTextNamaLengkap)
        val text = textInputNama.text.toString()
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, volumes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerChooseJilid.adapter = adapter
        buttonMulaiUjian.setOnClickListener() {
            val selectedVolString = spinnerChooseJilid.selectedItem
            println(selectedVolString.toString())
            val selectedVolume = spinnerChooseJilid.selectedItemPosition // Get the selected volume number (0-5)
            if (selectedVolume > 0) { // If a volume other than "Select a volume" is selected
                val intent = Intent(this@ChooseTestActivity, WritingTestActivity::class.java)
                val volume = selectedVolume // Get the selected volume number (1-5)
                val startIndex = if (volume <= 5) (volume - 1) * 9 else 0// Calculate the starting index of the katakana for the selected volume
                val endIndex = if (volume >= 5) 46 else volume * 9// Calculate the ending index of the katakana for the selected volume
                val answers = katakanaList.subList(startIndex, endIndex) // Get the katakana for the selected volume as quiz answers
                val questions = romajiList.subList(startIndex, endIndex)
                intent.putExtra("questions", questions.toTypedArray())
                intent.putExtra("answers", answers.toTypedArray()) // Pass the answers as an array to the quiz activity
                intent.putExtra("level", selectedVolString.toString())
                intent.putExtra("nama", textInputNama.text.toString())
                startActivity(intent) // Start the quiz activity
                this.finish()
            } else {
                Toast.makeText(applicationContext,"Tolong Pilih Level!", Toast.LENGTH_SHORT).show()
            }
        }
        buttonKembaliMenuUtama.setOnClickListener(){
            val intent = Intent(this@ChooseTestActivity, MainActivity::class.java)
            startActivity(intent)
        }
//        spinnerChooseJilid.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
//                if (position == 1) { // If "Volume 1" is selected
//                    val intent = Intent(this@ChooseTestActivity, WritingTestActivity::class.java)
//                    val questions = katakanaList.subList(1, 11) // Get the first 10 katakana as quiz questions
//                    intent.putExtra("questions", questions.toTypedArray()) // Pass the questions as an array to the quiz activity
//                    startActivity(intent) // Start the quiz activity
//                }
//            }
//            override fun onNothingSelected(parent: AdapterView<*>) {
//                // Do nothing
//            }
//        }
    }
}