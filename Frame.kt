package com.example.projecttugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Frame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame)
    }

    fun Ok(view: View) {
        val intent = Intent(this@Frame, Constrain::class.java)
        startActivity(intent)
    }
}