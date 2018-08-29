package com.seeudin.ipos_beps

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import com.seeudin.ipos_beps.R.id.message
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    internal lateinit var imgViewPayment: ImageView
    internal lateinit var imgViewSale: ImageView
    internal lateinit var imgViewVoid: ImageView
    internal lateinit var imgViewRefund: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgViewPayment = findViewById<View>(R.id.imgViewPayment) as ImageView
        imgViewSale = findViewById<View>(R.id.imgViewSale) as ImageView
        imgViewVoid = findViewById<View>(R.id.imgViewVoid) as ImageView
        imgViewRefund = findViewById<View>(R.id.imgViewRefund) as ImageView

        imgViewPayment.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }

        imgViewSale.setOnClickListener {
            val intent = Intent(this, RegulerSaleActivity::class.java)
            startActivity(intent)
        }

        imgViewVoid.setOnClickListener {
            val intent = Intent(this, PasswordTrxActivity::class.java)
            startActivity(intent)
        }

        imgViewRefund.setOnClickListener {
            val intent = Intent(this, PasswordTrxActivity::class.java)
            startActivity(intent)
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        }
    }


private fun Int.setText(title_home: Int) {}
