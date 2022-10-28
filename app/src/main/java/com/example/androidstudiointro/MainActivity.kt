package com.example.androidstudiointro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTextView = findViewById(R.id.nameTextView)

        nameTextView.text = "Susan"

        //Log.d("!!!","Nu körs onCreate!")

    }
}