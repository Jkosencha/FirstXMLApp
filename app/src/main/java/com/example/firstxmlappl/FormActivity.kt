package com.example.firstxmlappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FormActivity : AppCompatActivity() {

    lateinit var nxt: Button
    lateinit var buttn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        nxt=findViewById(R.id.btn4)
        buttn=findViewById(R.id.btn6)

        nxt.setOnClickListener {
            Toast.makeText(applicationContext, "Kindly fill in the Survey", Toast.LENGTH_LONG).show()
            var mynext= Intent(this,FeedbackActivity::class.java)
            startActivity(mynext)
        }

        buttn.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}