package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class PinInvalidActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnPinNo: Button
    internal lateinit var btnPinYes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_invalid)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnPinNo = findViewById<View>(R.id.btnPinNo) as Button
        btnPinYes = findViewById<View>(R.id.btnPinYes) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, PinTrxActivity::class.java)
            startActivity(intent)
        }

        btnPinNo.setOnClickListener {
            val intent = Intent(this, TrxFailedActivity::class.java)
            startActivity(intent)
        }

        btnPinYes.setOnClickListener {
            val intent = Intent(this, PinTrxActivity::class.java)
            startActivity(intent)
        }

    }
}
