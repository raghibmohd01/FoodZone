package com.example.foodzone.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toolbar
import androidx.fragment.app.FragmentManager
import com.example.foodzone.R
import com.example.foodzone.fragment.HomeFragment

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,HomeFragment()).commit()



    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}