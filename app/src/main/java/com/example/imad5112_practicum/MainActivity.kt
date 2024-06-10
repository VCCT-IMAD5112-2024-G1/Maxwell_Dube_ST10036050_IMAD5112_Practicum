package com.example.imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dayToday = findViewById<EditText>(R.id.dayTodayText)
        val menuBtn = findViewById<Button>(R.id.menuBtn)
        val exitBtn = findViewById<Button>(R.id.exitBtn)



        menuBtn.setOnClickListener {
            val intent = Intent(this, Screen_2::class.java)
            startActivity(intent)
        }

    }
}