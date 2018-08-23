package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class RegulerSaleActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnConfirm: Button
    internal lateinit var btnConfirmTip: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reguler_sale)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnConfirm = findViewById<View>(R.id.btnConfirm) as Button
        btnConfirmTip = findViewById<View>(R.id.btnConfirmTip) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, VoidActivity::class.java)
            startActivity(intent)
        }

        btnConfirm.setOnClickListener {
            val intent = Intent(this, RegulerSaleConfirmActivity::class.java)
            startActivity(intent)
        }

        btnConfirmTip.setOnClickListener {
            val intent = Intent(this, RegulerSaleTipActivity::class.java)
            startActivity(intent)
        }
    }
}
