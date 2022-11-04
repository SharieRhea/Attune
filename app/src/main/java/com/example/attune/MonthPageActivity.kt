package com.example.attune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import com.google.android.material.tabs.TabLayout

class MonthPageActivity : AppCompatActivity() {
    private lateinit var dateTextView: TextView
    private lateinit var mainCalendar: CalendarView
    private lateinit var editDatesButton: Button
    private lateinit var mainTabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_page)

        // Set dateTextView and mainCalendar to their respective Views.
        dateTextView = findViewById(R.id.textView)
        mainCalendar = findViewById(R.id.mainCalendar)
        editDatesButton = findViewById(R.id.editDates)
        mainTabs = findViewById(R.id.mainTabs)

        // Initialize a list for period dates.
        val periodDates = mutableListOf<String>()

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
                        CalendarView.OnDateChangeListener { _, year, month, day ->
                            val dateFormatted = "$month $day $year"
                            if (dateFormatted !in periodDates) {
                                periodDates.add(dateFormatted)
                            } else {
                                periodDates.remove(dateFormatted)
                            }
                            dateTextView.text = periodDates.toString()
                        }
                    )
                }
                else {
                    // Change button text to reflect status.
                    editDatesButton.text = getString(R.string.editDates_Edit)

                    // setOnDateChangeListener so that selecting a date does nothing.
                    mainCalendar.setOnDateChangeListener(
                        CalendarView.OnDateChangeListener { _, _, _, _ ->
                            // Do nothing.
                        }
                    )
                }
            }
        )

    } // End OnCreate.
} // End MainActivity.

}