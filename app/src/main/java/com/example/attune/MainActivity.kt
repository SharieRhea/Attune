package com.example.attune

import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Initialize CalendarView and TextView for MainActivity.
    lateinit var dateTextView: TextView
    lateinit var mainCalendar: CalendarView
    lateinit var editDatesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set dateTextView and mainCalendar to their respective Views.
        dateTextView = findViewById(R.id.textView)
        mainCalendar = findViewById(R.id.mainCalendar)
        editDatesButton = findViewById(R.id.editDates)

        // Set dateTextView for startup (no date selected yet).
        dateTextView.text = getString(R.string.noDate)

        // Set editDatesStatus.
        var editDatesStatus = false

        // Set OnClickListener for editDatesButton to switch editDatesStatus.
        editDatesButton.setOnClickListener(
            View.OnClickListener {
                editDatesStatus = !editDatesStatus
                if (editDatesStatus) {
                    editDatesButton.text = getString(R.string.editDates_Finish)
                }
                else {
                    editDatesButton.text = getString(R.string.editDates_Edit)
                }
            }
        )

        if (editDatesStatus) {
            // Listen for date to change in mainCalendar, if so, display the selected date.
            mainCalendar.setOnDateChangeListener(
                OnDateChangeListener { view, year, month, day ->
                    var dateFormatted = "$month $day $year"
                    dateTextView.text = dateFormatted
                }
            )
        }
        else {
            mainCalendar.isClickable = false
        }

    } // End OnCreate.
} // End MainActivity.

