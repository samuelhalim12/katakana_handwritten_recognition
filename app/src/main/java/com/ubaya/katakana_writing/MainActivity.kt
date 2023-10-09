package com.ubaya.katakana_writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonLatihanMenulis.setOnClickListener(){
            val intent = Intent(this, ChooseLetterActivity::class.java)
            startActivity(intent)
        }
        buttonUjianMenulis.setOnClickListener(){
            val intent = Intent(this, ChooseTestActivity::class.java)
            startActivity(intent)
        }
        buttonExit.setOnClickListener(){
            val activity = this
            activity.finish()
        }
    }
}