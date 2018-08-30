package com.seeudin.ipos_beps

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import android.widget.*

class VoidSearchActivity : AppCompatActivity() {

    internal lateinit var imgViewBack: ImageView
    internal lateinit var listItem: ListView
    internal lateinit var editTextSearch: EditText
    internal lateinit var imgViewSerach: ImageView
    internal lateinit var source: ArrayList<String>
    internal lateinit var adapter: ArrayAdapter<String>

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_void_search)

        imgViewBack = findViewById<View>(R.id.imgViewBack) as ImageView
        listItem = findViewById<View>(R.id.listItem) as ListView
        editTextSearch = findViewById<View>(R.id.editTextSearch) as EditText
        imgViewSerach = findViewById<View>(R.id.imageViewSearch) as ImageView

        imgViewBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imgViewSerach.setOnClickListener {
            val msg: String = editTextSearch.text.toString()

            if (msg.trim().isNotEmpty()) {
                val intent = Intent(this, PassIncorrectActivity::class.java)
                startActivity(intent)
            }  else {
                Toast.makeText(this@VoidSearchActivity, "Can't Empty", Toast.LENGTH_SHORT).show()
            }
        }

        //source = arrayListOf("apple", "banana", "kiwifruit")
        val source = arrayOf(
                "Trace Number : 0001 \n" +
                        "Transaction Type : Reguler Sale \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 100.000",
                "Trace Number : 0002 \n" +
                        "Transaction Type : Void \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 150.000",
                "Trace Number : 0003 \n" +
                        "Transaction Type : Reguler Sale Tip \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 100.000",
                "Trace Number : 0004 \n" +
                        "Transaction Type : Void \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 200.000",
                "Trace Number : 0005 \n" +
                        "Transaction Type : Reguler Sale \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 300.000",
                "Trace Number : 0006 \n" +
                        "Transaction Type : Reguler Sale \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 100.000",
                "Trace Number : 0007 \n" +
                        "Transaction Type : Void \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 150.000",
                "Trace Number : 0008 \n" +
                        "Transaction Type : Reguler Sale Tip \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 100.000",
                "Trace Number : 0009 \n" +
                        "Transaction Type : Void \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 200.000",
                "Trace Number : 0010 \n" +
                        "Transaction Type : Reguler Sale \n" +
                        "PAN : 5432-****-12**-9876 \n" +
                        "Amount : Rp. 300.000")
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, source)
        listItem.adapter = adapter


        /*
        val relativeLayout = findViewById<View>(R.id.RelativeLayout) as RelativeLayout
        val listItem = ListView(this)

        val values = arrayOf(
                "Rick and Morty",
                "Gaeme of Thrones",
                "Silicon Valley",
                "IT Crowd",
                "Person of Interest")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)
        listItem.adapter = adapter
        relativeLayout.addView(listItem)
        */

    }
}
