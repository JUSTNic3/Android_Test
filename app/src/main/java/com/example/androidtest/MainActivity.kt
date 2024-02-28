package com.example.androidtest

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var brojac = 0
    private lateinit var sharedPreferences: SharedPreferences

    companion object {
        const val STEPS = "steps"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        //Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        /*Log.i("MyLog", "onCreate")
        Log.d("My Log D", "onCreate")
        Log.v("My Log V", "onCreate")
        Log.w("My Log V", "onCreate")
        Log.e("My Log V", "onCreate")*/

        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        // Restore
        brojac = sharedPreferences.getInt(STEPS, 0)

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
    fun setOnClickListenerUp(view: View) {
        brojac++
        Log.i("brojac", "Stanje je $brojac")
        val steps = findViewById<TextView>(R.id.textViewCounter) //promjeni to u neki broj
        steps.text = "$brojac"
        if (brojac == 10) {
            val intent = Intent(this, SuccessActivity::class.java).apply {
                putExtra("name", findViewById<TextView>(R.id.plainTextName).text.toString())
            }
            startActivity(intent)
        }
    }
    fun setOnClickListenerDown(view: View) {
        if (brojac > 0) {
            brojac--
            Log.i("brojac", "Stannje je $brojac")
            val firstName = findViewById<TextView>(R.id.textViewCounter)
            firstName.text = "$brojac"
        } else {
            Toast.makeText(applicationContext, "Greška", Toast.LENGTH_SHORT).show()
        }
    }
}