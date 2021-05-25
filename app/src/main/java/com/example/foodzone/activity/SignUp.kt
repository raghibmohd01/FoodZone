package com.example.foodzone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodzone.R

class SignUp : AppCompatActivity() {

    lateinit var btnBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnBack=findViewById(R.id.btnBack)


        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}