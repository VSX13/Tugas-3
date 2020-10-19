package com.example.projecttugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Relative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)
    }

    fun SEND(view: View) {
        val intent = Intent(this@Relative, Linier::class.java)
        startActivity(intent)
    }
}