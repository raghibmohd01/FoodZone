package com.example.foodzone.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.foodzone.R
import org.w3c.dom.Text

class LogIn : AppCompatActivity() {

    lateinit var etMobileNo:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogIn: TextView
    lateinit var btnSignUp: TextView
    lateinit var tvForgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        etMobileNo=findViewById(R.id.etMobileNo)
        etPassword=findViewById(R.id.etPassword)
        btnLogIn=findViewById(R.id.btnLogin)
        btnSignUp=findViewById(R.id.tvRegister)
        tvForgotPassword=findViewById(R.id.tvForgotPassword)


        btnSignUp.setOnClickListener {
            val intent=Intent(this@LogIn,SignUp::class.java)
            startActivity(intent)
        }

        tvForgotPassword.setOnClickListener {
            val intent=Intent(this@LogIn,ForgotPassword::class.java)
            startActivity(intent)
        }




    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

}