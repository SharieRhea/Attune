package com.example.attune

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Initialize CalendarView and TextView for MainActivity.
    private lateinit var dateTextView: TextView
    private lateinit var mainCalendar: CalendarView
    private lateinit var editDatesButton: Button

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
                    // Change button text to reflect status.
                    editDatesButton.text = getString(R.string.editDates_Finish)

                    // setOnDateChangeListener so that period dates can be edited.
                    mainCalendar.setOnDateChangeListener(
                        OnDateChangeListener { _, year, month, day ->
                            val dateFormatted = "$month $day $year"
                            dateTextView.text = dateFormatted
                        }
                    )
                }
                else {
                    // Change button text to reflect status.
                    editDatesButton.text = getString(R.string.editDates_Edit)

                    // setOnDateChangeListener so that selecting a date does nothing.
                    mainCalendar.setOnDateChangeListener(
                        OnDateChangeListener { _, _, _, _ ->
                            // Do nothing.
                        }
                    )
                }
            }
        )

    } // End OnCreate.
} // End MainActivity.

