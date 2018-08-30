package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class NoResultActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var btnSrcNo: Button
    internal lateinit var btnSrcYes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_result)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        btnSrcNo = findViewById<View>(R.id.btnSrcNo) as Button
        btnSrcYes = findViewById<View>(R.id.btnSrcYes) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, VoidSearchActivity::class.java)
            startActivity(intent)
        }

        btnSrcNo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnSrcYes.setOnClickListener {
            val intent = Intent(this, VoidSearchActivity::class.java)
            startActivity(intent)
        }

    }
}
