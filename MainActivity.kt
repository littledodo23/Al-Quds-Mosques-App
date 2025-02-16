package com.example.user.algudsmosques

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(this,web::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,list::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,video::class.java)
            startActivity(intent)
        }
    }
}
