package com.ubaya.katakana_writing

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_loading.*
import java.lang.ref.WeakReference

class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        //            // Simulate loading process
//            val handler = Handler()
//            var progress = 0
//            handler.postDelayed(object : Runnable {
//                override fun run() {
//                    progress += 10
//                    progressBarLoading.progress = progress
//                    if (progress >= 100) {
//                        // Loading finished
//                        val intent = Intent(this, DatasetActivity::class.java)
//                        startActivity(intent)
//                        finish()
//                    } else {
//                        // Continue loading
//                        handler.postDelayed(this, 500)
//                    }
//                }
//            }, 500)

        val isConnected = isConnected(this)
        // Check internet connection
        if (!isConnected(this)) {
            textViewLoading.text = "No internet connection"
            progressBarLoading.visibility = ProgressBar.GONE
            return
        } else {
            LoadDataAsync(this).execute()
        }
    }
    private fun isConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnectedOrConnecting
        return true
    }
    // Start the main activity
    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    // AsyncTask to simulate loading process
    private class LoadDataAsync(activity: LoadingActivity) : AsyncTask<Void, Int, Void>() {
        private val activityReference: WeakReference<LoadingActivity> = WeakReference(activity)

        override fun doInBackground(vararg params: Void?): Void? {
            // Simulate loading process
            for (i in 1..10) {
                Thread.sleep(500)
                publishProgress(i * 10)
            }
            return null
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            // Update progress bar
            activityReference.get()?.progressBarLoading?.progress = values[0]!!
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            // Start main activity once loading is complete
            activityReference.get()?.startMainActivity()
        }
    }
}