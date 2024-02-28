package com.example.androidtest

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        val name: String? = intent.getStringExtra("name")
        val message = "Good job $name! You made 10 steps"
        val textShare = findViewById<TextView>(R.id.textShare)
        textShare.text = message
    }
    fun setOnClickListenerShare(view: View) {
        val name: String? = intent.getStringExtra("name")
        val smsNumber: String = "0953594946"
        val smsText: String = "Good job $name! You made 10 steps"
        val uri = Uri.parse("smsto:$smsNumber")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        intent.putExtra("sms_body", smsText)
        startActivity(intent)
    }


}