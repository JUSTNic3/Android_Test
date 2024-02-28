package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        val name: String? = intent.getStringExtra("name")
        val message = "Good job $name! You made 10 steps"
        val textShare = findViewById<TextView>(R.id.textShare)
        textShare.text = message
    }
}