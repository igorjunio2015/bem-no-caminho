package com.example.bemcaminho.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.bemcaminho.HomePageActivity
import com.example.bemcaminho.R

class InterfaceUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_interface_user)

        val btnReturn = findViewById<ImageView>(R.id.btn_return)
        btnReturn.setOnClickListener {
            val pageHome = Intent(this, HomePageActivity::class.java)
            startActivity(pageHome)
        }

        val btnSalvar = findViewById<Button>(R.id.btn_salvar)
        btnSalvar.setOnClickListener {
            val pageHome = Intent(this, HomePageActivity::class.java)
            startActivity(pageHome)
        }
    }
}