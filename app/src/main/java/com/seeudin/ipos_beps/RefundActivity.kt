package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class RefundActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refund)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnConfirm = findViewById<View>(R.id.btnConfirm) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnConfirm.setOnClickListener {
            val intent = Intent(this, PinTrxActivity::class.java)
            startActivity(intent)
        }

    }
}
