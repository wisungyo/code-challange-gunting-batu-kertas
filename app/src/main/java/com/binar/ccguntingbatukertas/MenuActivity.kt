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
        tv_vs_player_title.text = "${nameFromIntent} VS Player"
        tv_vs_com_title.text = "${nameFromIntent} VS COM"

        iv_vs_player.setOnClickListener {
            val vsComIntent = Intent(this, MainActivity::class.java)
            startActivity(vsComIntent)
        }

        iv_vs_com.setOnClickListener {
            val vsPlayerIntent = Intent(this, MainActivity::class.java)
            startActivity(vsPlayerIntent)
        }
    }
}