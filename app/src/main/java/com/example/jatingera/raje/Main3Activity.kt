package com.example.jatingera.raje

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        but21.setOnClickListener{
            var intent=Intent(this,Main4Activity::class.java)
            startActivity(intent)

        }
    }
}
