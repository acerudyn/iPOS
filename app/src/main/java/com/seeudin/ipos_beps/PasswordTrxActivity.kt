package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class PasswordTrxActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var pwdEntry: EditText
    internal lateinit var btnEnter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_trx)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        pwdEntry = findViewById<View>(R.id.editTextPwd) as EditText
        btnEnter = findViewById<View>(R.id.btnEnter) as Button

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnEnter.setOnClickListener {
            if (pwdEntry.text.toString() == "Bahana911") {
                Toast.makeText(this@PasswordTrxActivity, "SUCCESS", Toast.LENGTH_SHORT).show()
                pwdEntry.setText(null)
                val intent = Intent(this, VoidActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@PasswordTrxActivity, "INVALID", Toast.LENGTH_SHORT).show()
                pwdEntry.setText(null)
                val intent = Intent(this, PinInvalidActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
