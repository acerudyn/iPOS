package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.alimuzaffar.lib.pin.PinEntryEditText



class PinTrxActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_trx)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView

        imgViewBack.setOnClickListener {
            val intent = Intent(this, RegulerSaleConfirmActivity::class.java)
            startActivity(intent)
        }

        val pinEntry = findViewById<View>(R.id.txt_pin_entry) as PinEntryEditText
        pinEntry?.setOnPinEnteredListener { str ->
            if (str.toString() == "123456") {
                Toast.makeText(this@PinTrxActivity, "SUCCESS", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, TrxSuccessActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@PinTrxActivity, "INVALID", Toast.LENGTH_SHORT).show()
                pinEntry.setText(null)
                val intent = Intent(this, PinInvalidActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
