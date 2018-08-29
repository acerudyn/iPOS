package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class PassIncorrectActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnPwdNo: Button
    internal lateinit var btnPwdYes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_incorrect)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnPwdNo = findViewById<View>(R.id.btnPwdNo) as Button
        btnPwdYes = findViewById<View>(R.id.btnPwdYes) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, PasswordTrxActivity::class.java)
            startActivity(intent)
        }

        btnPwdNo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnPwdYes.setOnClickListener {
            val intent = Intent(this, PasswordTrxActivity::class.java)
            startActivity(intent)
        }
    }
}
