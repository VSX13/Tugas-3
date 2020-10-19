package com.example.projecttugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Linier : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linier)
    }

    fun kembali(view: View) {
        val intent = Intent(this@Linier, Constrain::class.java)
        startActivity(intent)
    }
}