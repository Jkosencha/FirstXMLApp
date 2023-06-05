package com.example.firstxmlappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toastbutton1: Button
    lateinit var toastbutton2: Button
    lateinit var formbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastbutton1=findViewById(R.id.btn1)
        toastbutton2=findViewById(R.id.btn2)
        formbutton=findViewById(R.id.btn3)

        toastbutton1.setOnClickListener {
            Toast.makeText(applicationContext, "Succesfully done", Toast.LENGTH_LONG).show()
        }

        toastbutton2.setOnClickListener {
            Toast.makeText(applicationContext, "Thank you", Toast.LENGTH_LONG).show()
        }

        formbutton.setOnClickListener {
            Toast.makeText(applicationContext, "You are in!", Toast.LENGTH_LONG).show()
            var form=Intent(this,FormActivity::class.java)
            startActivity(form)
        }

    }
}