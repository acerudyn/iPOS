package com.seeudin.ipos_beps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class PasswordTrxActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var pwdEntry: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_trx)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        pwdEntry = findViewById<View>(R.id.editTextPwd) as EditText

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //pwdEntry = findViewById<View>(R.id.editTextPwd) as EditText
        pwdEntry.setOnClickListener { str ->
            if (str.toString() == "Bahana12") {
                Toast.makeText(this@PasswordTrxActivity, "SUCCESS", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@PasswordTrxActivity, "INVALID", Toast.LENGTH_SHORT).show()
                pwdEntry.setText(null)
            }
        }

    }
}
