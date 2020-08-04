package com.binar.ccguntingbatukertas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import kotlin.system.exitProcess

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        this.supportActionBar?.hide()

        val nameFromIntent = intent.getStringExtra("name")
        tv_vs_player_title.text = "${nameFromIntent} vs Player"
        tv_vs_com_title.text = "${nameFromIntent} vs COM"

        iv_vs_player.setOnClickListener {
            val vsComIntent = Intent(this, MainActivity::class.java)
            startActivity(vsComIntent)
        }

        iv_vs_com.setOnClickListener {
            val vsPlayerIntent = Intent(this, MainActivity::class.java)
            startActivity(vsPlayerIntent)
        }

//        tv_menu_keluar.setOnClickListener {
//            exitProcess(0)
//        }
    }
}