package com.example.attune.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * File created 11/1/2022.
 * A custom CalendarView view created for specific functionality needed for the Attune app.
 * @author Sharie Rhea
 */

public class customCalendarView extends CalendarView {
    public customCalendarView(@NonNull Context context) {
        super(context);

        init(null);
    }

    public customCalendarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public customCalendarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public customCalendarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set) {

    }
}
