package com.anderysinitsyn.example_6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_center.setOnClickListener{
            onClick(it)
        }

        button_page_3.setOnClickListener{
            getPage3(it)
        }
    }

     private fun onClick(view: View) {
        val intent = Intent(this, MainActivity2:: class.java)
        startActivity(intent)
    }

    private fun getPage3(view: View) {
        val intent = Intent(this, MainActivity3:: class.java)
        // в ключ username пихаем текст из первого текстового поля
        intent.putExtra("username", editText.text.toString())
        // в ключ gift пихаем текст из второго текстового поля
        intent.putExtra("gift", editText2.text.toString())
        startActivity(intent)
    }

}