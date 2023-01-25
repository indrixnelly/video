package com.example.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //fun panggilActivityKedua(view: View?) {
    //val i = Intent(applicationContext, MainActivity2::class.java)
    // i.putExtra("Value1","Belajar Android")
    // i.putExtra("Value2", "Pemrograman Mobile")
    //startActivity(i)
    fun buka(view: View?) {
        val url = "https://www.youtube.com/@BKKBNOFFICIAL/channels"
        val bukaVideo = Intent(Intent.ACTION_VIEW)
        bukaVideo.data = Uri.parse(url)
        startActivity(bukaVideo)
    }
}