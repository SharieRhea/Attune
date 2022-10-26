package com.example.attune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainCalendar = findViewById<CalendarView>(R.id.mainCalendar)
        mainCalendar.setOnLongClickListener()
    }

    private fun CalendarView.setOnLongClickListener() {
        val mainCalendar = findViewById<CalendarView>(R.id.mainCalendar)
        val dates = findViewById<TextView>(R.id.textView)
        val listDates = mutableListOf<Long>()
        listDates.add(mainCalendar.date)
        dates.setText(R.string.listOfDates)
    }

}
