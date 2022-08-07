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
            intent.data= Uri.parse("sms:9815400317")
            startActivity(intent)
        }

        btnDail.setOnClickListener {
            var intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:9815400317")
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            var intent=Intent(Intent.ACTION_SENDTO)
            intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            intent.type="vnd.android.cursor.item/email"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@xyz.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"MY EMAIL SUBJECT")
            intent.putExtra(Intent.EXTRA_TEXT,"MY EMAIL CONTENT")
            startActivity(Intent.createChooser(intent,"SEND MAIL"))
            

        }

        btnShare.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://open.spotify.com/")
            startActivity(intent)
        }

    }

}
