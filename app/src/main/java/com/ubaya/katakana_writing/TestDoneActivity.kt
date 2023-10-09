package com.ubaya.katakana_writing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_test_done.*
import org.json.JSONObject

class TestDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_done)
        val score = intent.getIntExtra("score", 0)
        val jilid = intent.getStringExtra("level")
        val nama = intent.getStringExtra("nama")
        if (score > 50) {
            textSelamatUjian.setText("Selamat! Ujian anda pada " + jilid.toString() + " mendapat nilai " + score.toString())
        } else {
            textSelamatUjian.setText("Sayang sekali! Ujian anda pada " + jilid.toString() + " mendapat nilai " + score.toString() +
                    ". Belajar lebih giat untuk mendapatkan nilai 100!")
        }
        val TAG = "volleyTag"
        var queue: RequestQueue? = null
//                private var job = Job()

        queue = Volley.newRequestQueue(getApplication())

        val url = "https://katakanadataset.000webhostapp.com/inserttest.php"
        val stringRequest = object : StringRequest(
            Method.POST,
            url,
            Response.Listener {
//                        Log.d("loginuserresult",it)
                val obj = JSONObject(it)
                if(obj.getString("result")=="OK") {
                    println("Upload Berhasil!")
//                            val data = obj.getJSONObject("data")
//
//                            with(data) {
////                                var user = User(
////                                    getString("iduser"),
////                                    getString("name"),
////                                    getInt("vaccine_dose"),
////                                    getString("profile_picture")
////                                )
//
//                            }
                } else {
                    println("Upload Gagal!")
                }
            },
            {
                Log.e("apierror",it.toString())
            }
        ) {
            override fun getParams(): MutableMap<String, String> {
                return hashMapOf("nama" to nama.toString(),
                "nilai" to score.toString())
            }
        }
        queue.add(stringRequest)
        buttonKembaliMenuPilihUjian.setOnClickListener() {
            val intent = Intent(this, ChooseTestActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}