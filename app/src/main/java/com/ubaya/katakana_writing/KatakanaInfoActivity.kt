package com.ubaya.katakana_writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_katakana_info.*
import kotlinx.android.synthetic.main.activity_loading.*
import kotlinx.android.synthetic.main.activity_loading.textLetterKatakanaInfo

class KatakanaInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katakana_info)
        val letter = intent.getStringExtra("letter")
        val explanation = intent.getStringExtra("explanation")
        textLetterKatakanaInfo.setText(letter.toString())
        textExplanationKatakanaInfo.setText(explanation.toString())
        val katakanaList = listOf("ア", "イ", "ウ", "エ", "オ", "カ", "キ", "ク", "ケ", "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ツ", "テ", "ト", "ナ", "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ", "ヘ", "ホ", "マ", "ミ", "ム", "メ", "モ", "ヤ", "ユ", "ヨ", "ラ", "リ", "ル", "レ", "ロ", "ワ", "ヲ", "ン")

        buttonMulai.setOnClickListener() {
            for (katakana in katakanaList) {
                if(letter.toString() == katakana) {
                    val intent = Intent(this, PracticeWritingActivity::class.java)
                    intent.putExtra("letter", katakana)
                    startActivity(intent)
                }
            }
        }
//            if(letter.toString() == "ア"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ア")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "イ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "イ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ウ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ウ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "エ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "エ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "オ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "オ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "カ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "カ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "キ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "キ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ク"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ク")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ケ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ケ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "コ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "コ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "サ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "サ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "シ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "シ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ス"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ス")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "セ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "セ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ソ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ソ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "タ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "タ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "チ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "チ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ツ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ツ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "テ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "テ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ト"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ト")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ナ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ナ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ニ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ニ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヌ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヌ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ネ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ネ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ノ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ノ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ハ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ハ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヒ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヒ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "フ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "フ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヘ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヘ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ホ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ホ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "マ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "マ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ミ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ミ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ム"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ム")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "メ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "メ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "モ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "モ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヤ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヤ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ユ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ユ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヨ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヨ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ラ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ラ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "リ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "リ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ル"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ル")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "レ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "レ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ロ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ロ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ワ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ワ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ヲ"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ヲ")
//                startActivity(intent)
//            }
//            else if(letter.toString() == "ン"){
//                val intent = Intent(this, DatasetActivity::class.java)
//                intent.putExtra("letter", "ン")
//                startActivity(intent)
//            }

    }
}