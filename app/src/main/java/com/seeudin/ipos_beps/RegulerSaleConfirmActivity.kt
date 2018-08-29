package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class RegulerSaleConfirmActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnSignature: Button
    internal lateinit var btnPinEntry: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reguler_sale_confirm)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnSignature = findViewById<View>(R.id.btnSignature) as Button
        btnPinEntry = findViewById<View>(R.id.btnCancel) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, RegulerSaleActivity::class.java)
            startActivity(intent)
        }

        btnSignature.setOnClickListener {
            val intent = Intent(this, TrxSuccessActivity::class.java)
            startActivity(intent)
        }

        btnPinEntry.setOnClickListener {
            val intent = Intent(this, PinTrxActivity::class.java)
            startActivity(intent)
        }
    }
}
