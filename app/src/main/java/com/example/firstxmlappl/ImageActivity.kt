package com.example.firstxmlappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity : AppCompatActivity() {

    lateinit var prdct: Button
    lateinit var bgimg: Button
    lateinit var circleimg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        prdct=findViewById(R.id.btn10)
        bgimg=findViewById(R.id.btn8)
        circleimg=findViewById(R.id.btn11)


        prdct.setOnClickListener {
            var next= Intent(this,ProductActivity::class.java)
            startActivity(next)
        }

        bgimg.setOnClickListener {
            var next= Intent(this,BackgroundImage::class.java)
            startActivity(next)
        }

        circleimg.setOnClickListener {
            var next= Intent(this,CircularImage::class.java)
            startActivity(next)
        }
    }
}