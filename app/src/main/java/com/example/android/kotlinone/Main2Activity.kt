package com.example.android.kotlinone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    companion object {
        const val STATE_INTENT = "intent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (intent != null) number.text = intent.getIntExtra(STATE_INTENT, 0).toString()
    }
}










