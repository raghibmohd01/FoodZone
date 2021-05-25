package com.example.foodzone.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.foodzone.R
import com.example.foodzone.Variables

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed( {

            val mainActivity= Intent(this@SplashActivity
                ,MainActivity::class.java)
            val logInActivity=Intent(this,LogIn::class.java)
            if(Variables.isLoggedIn)
                startActivity(mainActivity)
            else
                startActivity(logInActivity)
        },2000)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

}
