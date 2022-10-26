package com.example.attune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainCalendar = findViewById<CalendarView>(R.id.mainCalendar)
        mainCalendar.dateTextAppearance
    }
}