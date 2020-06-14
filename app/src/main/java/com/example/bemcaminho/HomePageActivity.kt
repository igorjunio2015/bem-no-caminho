package com.example.bemcaminho

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bemcaminho.views.*

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_home_page)

        val btnInterfaceUser = findViewById<ImageView>(R.id.interface_user)
        btnInterfaceUser.setOnClickListener {
            val pageInterfaceUser = Intent(this, InterfaceUser::class.java)
            startActivity(pageInterfaceUser)
        }
        val btnMenu1 = findViewById<ImageView>(R.id.imageView4)
        btnMenu1.setOnClickListener {
            val pageMenuItem1 = Intent(this, MenuItem1::class.java)
            startActivity(pageMenuItem1)
        }

        val btnMenu2 = findViewById<ImageView>(R.id.imageView8)
        btnMenu2.setOnClickListener {
            val pageMenuItem2 = Intent(this, MenuItem2::class.java)
            startActivity(pageMenuItem2)
        }

        val btnMenu3 = findViewById<ImageView>(R.id.imageView9)
        btnMenu3.setOnClickListener {
            val pageMenuItem3 = Intent(this, MenuItem3::class.java)
            startActivity(pageMenuItem3)
        }

        val btnMenu4 = findViewById<ImageView>(R.id.imageView10)
        btnMenu4.setOnClickListener {
            val pageMenuItem4 = Intent(this, MenuItem4::class.java)
            startActivity(pageMenuItem4)
        }
        val btnMenu5 = findViewById<ImageView>(R.id.imageView11)
        btnMenu5.setOnClickListener {
            val pageMenuItem5 = Intent(this, MenuItem5::class.java)
            startActivity(pageMenuItem5)
        }
    }
}