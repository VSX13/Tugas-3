package com.example.projecttugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Next(view: View) {
        val intent = Intent(this@MainActivity, Frame::class.java)
        startActivity(intent)
    }
    fun kembali(view: View) {}
}