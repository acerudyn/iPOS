package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class RegulerSaleActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reguler_sale)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView

        imgViewBack.setOnClickListener {
            val intent = Intent(this, VoidActivity::class.java)
            startActivity(intent)
        }
    }
}
