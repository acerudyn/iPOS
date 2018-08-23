package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class VoidActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var imgViewCard: ImageView
    internal lateinit var imgViewCardOnly: ImageView
    internal lateinit var imgViewContactless: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_void)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        imgViewCard = findViewById<View>(R.id.imgViewCard) as ImageView
        imgViewCardOnly = findViewById<View>(R.id.imgViewCardOnly) as ImageView
        imgViewContactless = findViewById<View>(R.id.imgViewContactless) as ImageView

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imgViewCard.setOnClickListener {
            val intent = Intent(this, RegulerSaleActivity::class.java)
            startActivity(intent)
        }

        imgViewCardOnly.setOnClickListener {
            val intent = Intent(this, CardOnlyActivity::class.java)
            startActivity(intent)
        }

        imgViewContactless.setOnClickListener {
            val intent = Intent(this, ContactlessActivity::class.java)
            startActivity(intent)
        }
    }
}
