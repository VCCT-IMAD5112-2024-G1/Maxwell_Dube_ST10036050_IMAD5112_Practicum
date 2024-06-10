package com.example.imad5112_practicum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Screen_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        var dayDisplay = findViewById<TextView>(R.id.dayDisplay)
        var tempDisplay = findViewById<TextView>(R.id.tempDisplay)
        var conditionDis = findViewById<TextView>(R.id.conditionDis)
        var iconDisplay = findViewById<TextView>(R.id.iconDisplay)

        fun ooM() {
            Screen_2().oM() // Call the method from ActivityA
        }

    }
}