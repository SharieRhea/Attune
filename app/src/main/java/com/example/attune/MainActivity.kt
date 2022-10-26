package com.example.attune

import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainCalendar = findViewById<CalendarView>(R.id.mainCalendar)
        val dates = findViewById<TextView>(R.id.textView)
        val listDates = mutableListOf<Long>()

        mainCalendar!!.setOnClickListener {
            listDates.add(mainCalendar.date)
        }

        dates.setText(getString(R.string.listOfDates))
        println(listDates.toString())
    }



}
