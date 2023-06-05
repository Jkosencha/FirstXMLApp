package com.example.firstxmlappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductActivity : AppCompatActivity() {

    lateinit var myimage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        myimage=findViewById(R.id.image5)


        myimage.setOnClickListener {
            val myintent=Intent(this,PaymentActivity::class.java)
            startActivity(myintent)
        }
    }
}