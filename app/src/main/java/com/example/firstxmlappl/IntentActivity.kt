package com.example.firstxmlappl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    //Declaring variables
    lateinit var sms: Button
    lateinit var email: Button
    lateinit var share: Button
    lateinit var camera: Button
    lateinit var stk: Button
    lateinit var call: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        //Finding view by id
        sms=findViewById(R.id.btnsms)
        email=findViewById(R.id.btnemail)
        share=findViewById(R.id.btnshare)
        camera=findViewById(R.id.btncamera)
        stk=findViewById(R.id.btnstk)
        call=findViewById(R.id.btncall)

        //Intent
        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0704239554")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hae Jenny,..")
            startActivity(intent)
        }

        //email
        email.setOnClickListener {
            val  emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "jenniferkosencha@gmail.com" ,null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear madam,..")
            startActivity(Intent.createChooser(emailIntent, "Send email,.."))
        }

        //share
        share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/Jkosencha")
            startActivity(shareIntent)
        }

        //camera
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }

        //stk
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }

        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0704239554")
            startActivity(dialIntent)
        }
    }
}