package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class VoidActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnCancel: Button
    internal lateinit var btnVoid: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_void)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnCancel = findViewById<View>(R.id.btnCancel) as Button
        btnVoid = findViewById<View>(R.id.btnVoid) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnCancel.setOnClickListener {
            val intent = Intent(this, TrxFailedActivity::class.java)
            startActivity(intent)
        }

        btnVoid.setOnClickListener {
            val intent = Intent(this, TrxSuccessActivity::class.java)
            startActivity(intent)
        }

    }
}
