package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var brojac = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        //Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onCreate")
        Log.d("My Log D", "onCreate")
        Log.v("My Log V", "onCreate")
        Log.w("My Log V", "onCreate")
        Log.e("My Log V", "onCreate")*/

        val textView = findViewById<TextView>(R.id.textViewCounter)
        textView.text = "$brojac"

    }
}