package com.rupinder.implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.ShareActionProvider

class MainActivity : AppCompatActivity() {
    lateinit var btnDail: Button
    lateinit var btnMessage: Button
    lateinit var btnEmail: Button
    lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btnDail = findViewById(R.id.btnDail)
        btnMessage = findViewById(R.id.btnMsg)
        btnEmail = findViewById(R.id.btnEmail)
        btnShare = findViewById(R.id.btnShare)

        btnMessage.setOnClickListener {
            var intent= Intent(Intent.ACTION_SENDTO)
            intent.data= Uri.parse("sms:goodluck")
            startActivity(intent)
        }

        btnDail.setOnClickListener {
            var intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:9815400317")
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("email: khuranaishakaur17@gmail.com ")
            startActivity(intent)
        }

        btnShare.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://open.spotify.com/")
            startActivity(intent)
        }

    }
    }
