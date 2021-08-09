package com.anderysinitsyn.l3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mConstant: ConstraintLayout = findViewById(R.id.con)
        val mText: TextView = findViewById(R.id.textView)
        val red: Button = findViewById(R.id.red_button)
        val green: Button = findViewById(R.id.green_button)
        val yellow: Button = findViewById(R.id.yellow_button)

        red.setOnClickListener {
            mText.text = "K"
            mConstant.setBackgroundColor(ContextCompat.getColor(this, R.color.redd))

        }

        green.setOnClickListener {
            mText.text = "З"
            mConstant.setBackgroundColor(ContextCompat.getColor(this, R.color.greenn))
        }

        yellow.setOnClickListener {
            mText.text = "Ж"
            mConstant.setBackgroundColor(ContextCompat.getColor(this, R.color.yelloww))
        }
    }
}