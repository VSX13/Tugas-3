package com.example.projecttugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Constrain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain)
    }

    fun Pesan(view: View) {
        val intent = Intent(this@Constrain, Relative::class.java)
        startActivity(intent)
    }
    fun Comment(view: View) {
        val intent = Intent(this@Constrain, Linier::class.java)
        startActivity(intent)
    }
}