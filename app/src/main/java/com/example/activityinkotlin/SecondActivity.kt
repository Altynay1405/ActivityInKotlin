package com.example.activityinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editText1 = findViewById(R.id.editText1) as EditText
        val button1 = findViewById<View>(R.id.button1) as Button

        button1.setOnClickListener {
            val message = editText1.text.toString()
            val intent = Intent()
            intent.putExtra("MESSAGE", message)
            setResult(2, intent)
            finish()//finishing activity
        }


    }
}
