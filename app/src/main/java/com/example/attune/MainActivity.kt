package com.example.attune

import android.os.Bundle
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var dateTextView: TextView
    lateinit var mainCalendar: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateTextView = findViewById(R.id.textView)
        mainCalendar = findViewById(R.id.mainCalendar)

        mainCalendar.setOnDateChangeListener(
            OnDateChangeListener {view, year, month, day ->
                var dateFormatted = "$month $day $year"
                dateTextView.text = dateFormatted
            }
        )

    }
}

