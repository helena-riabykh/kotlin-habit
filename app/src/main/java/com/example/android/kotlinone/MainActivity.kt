package com.example.android.kotlinone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private val TAG = "MainActivity"

    var x = 0

    companion object {
        const val STATE_NUMBER = "number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle) called")
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            x = savedInstanceState.getInt(STATE_NUMBER)
        }
        number.text = x.toString();
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    fun onClick(v: View?) {
        val intent = Intent(this, Main2Activity::class.java).apply { putExtra("salut", x * x) }
        startActivity(intent)
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt("number", x + 1);
    }
}

