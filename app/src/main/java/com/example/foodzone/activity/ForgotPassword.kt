package com.example.foodzone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodzone.R

class ForgotPassword : AppCompatActivity() {

    lateinit var btnBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)


        btnBack=findViewById(R.id.btnBack)


        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}