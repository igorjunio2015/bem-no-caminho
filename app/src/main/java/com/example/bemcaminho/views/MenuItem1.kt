package com.example.bemcaminho.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.bemcaminho.HomePageActivity
import com.example.bemcaminho.R

class MenuItem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_menu_item1)

        val btnReturnMenu = findViewById<ImageView>(R.id.imageButton)
        btnReturnMenu.setOnClickListener {
            val menu = Intent(this, HomePageActivity::class.java)
            startActivity(menu)
        }

        val btnGo = findViewById<Button>(R.id.btn_enviar)
        btnGo.setOnClickListener {
            val map = Intent(this, MenuItem1Router::class.java)
            startActivity(map)
        }
    }
}