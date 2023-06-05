package com.example.firstxmlappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FeedbackActivity : AppCompatActivity() {

    lateinit var intb: Button
    lateinit var image: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)


        intb=findViewById(R.id.btn5)
        image=findViewById(R.id.btn9)

        intb.setOnClickListener {
            Toast.makeText(applicationContext, "sent!", Toast.LENGTH_LONG).show()
            var next= Intent(this,IntentActivity::class.java)
            startActivity(next)
        }

        image.setOnClickListener {
            var next= Intent(this,ImageActivity::class.java)
            startActivity(next)
        }

    }
}