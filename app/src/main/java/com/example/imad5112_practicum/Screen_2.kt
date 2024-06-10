package com.example.imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Screen_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val backBtn = findViewById<Button>(R.id.backBtn)

        var day2 = findViewById<TextView>(R.id.day2)
        var day3 = findViewById<TextView>(R.id.day3)
        var day4 = findViewById<TextView>(R.id.day4)
        var temp2 = findViewById<TextView>(R.id.temp2)
        var temp3 = findViewById<TextView>(R.id.temp3)
        var temp4 = findViewById<TextView>(R.id.temp4)
        var con2 = findViewById<TextView>(R.id.con2)
        var con3 = findViewById<TextView>(R.id.con3)
        var con4 = findViewById<TextView>(R.id.con4)



        val weekDays: List<String> = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        val minValues: Array<Int> = arrayOf(15, 20, 11, 12, 10, 17, 8)
        val maxValues: Array<Int> = arrayOf(26, 31, 19, 16, 18, 22, 13)
        val weatherCon: List<String> = listOf(" Sunny", " Sunny", "Cloudy", "Rainy", "Partly Cloudy", " Sunny", "Cold")

        var count = 15

        if (count.toString().toInt() == 15){
            day2.text = weekDays[1]
            day3.text = weekDays[2]
            day4.text = weekDays[3]
            temp2.text = maxValues[1].toString()

            con2.text = weatherCon[1]
            con3.text = weatherCon[2]
            con4.text = weatherCon[3]
        }

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var mondayBtn = findViewById<Button>(R.id.open)
        mondayBtn.setOnClickListener {
            val intent = Intent(this, Screen_3::class.java)
            startActivity(intent)

        }




    }

    fun oM() {

    }
}