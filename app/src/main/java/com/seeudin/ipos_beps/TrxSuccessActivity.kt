package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class TrxSuccessActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trx_success)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView

        imgViewBack.setOnClickListener {
            val intent = Intent(this, RegulerSaleConfirmActivity::class.java)
            startActivity(intent)
        }
    }
}
