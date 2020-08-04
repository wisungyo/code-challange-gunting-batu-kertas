package com.binar.ccguntingbatukertas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val nameFromIntent = intent.getStringExtra("name")
        btn_vs_player.text = "${nameFromIntent} VS Player"
        btn_vs_com.text = "${nameFromIntent} VS COM"

        btn_vs_com.setOnClickListener {
            val vsComIntent = Intent(this, MainActivity::class.java)
            startActivity(vsComIntent)
        }

        btn_vs_player.setOnClickListener {
            val vsPlayerIntent = Intent(this, MainActivity::class.java)
            startActivity(vsPlayerIntent)
        }
    }
}