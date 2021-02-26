package com.example.android.kotlinone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textView = findViewById<TextView>(R.id.number)
        var i = intent
        if(i != null)textView.setText(i.getIntExtra("salut", 2).toString())
    }
}





