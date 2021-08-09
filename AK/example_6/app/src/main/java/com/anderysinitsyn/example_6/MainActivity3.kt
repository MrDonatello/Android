package com.anderysinitsyn.example_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var user = "ЖЫвотное"
        var gift = "дырку от бублика"

        user = intent.getStringExtra("username")!!
        gift = intent.getStringExtra("gift")!!

        textView_page_3.text = getString(R.string.def_out_string, user, gift)
    }
}