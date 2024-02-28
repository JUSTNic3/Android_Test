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
    override fun onStart() {
        super.onStart()
        //Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onStart")
        Log.d("My Log D", "onStart")
        Log.v("My Log V", "onStart")
        Log.w("My Log V", "onStart")
        Log.e("My Log V", "onStart")*/
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onResume")
        Log.d("My Log D", "onResume")
        Log.v("My Log V", "onResume")
        Log.w("My Log V", "onResume")
        Log.e("My Log V", "onResum")*/
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onStop")
        Log.d("My Log D", "onStop")
        Log.v("My Log V", "onStop")
        Log.w("My Log V", "onStop")
        Log.e("My Log V", "onStop")*/
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onRestart")
        Log.d("My Log D", "onRestart")
        Log.v("My Log V", "onRestart")
        Log.w("My Log V", "onRestart")
        Log.e("My Log V", "onRestart")*/
    }

    override fun onDestroy() {
        super.onDestroy()
        //Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onDestroy")
        Log.d("My Log D", "onDestroy")
        Log.v("My Log V", "onDestroy")
        Log.w("My Log V", "onDestroy")
        Log.e("My Log V", "onDestroy")*/
    }
}