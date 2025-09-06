package com.google.android.material.timepicker;

import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface TimePickerControls {
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActiveSelection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClockPeriod {
    }

    void setActiveSelection(int arg1);

    void setHandRotation(float arg1);

    void setValues(String[] arg1, @StringRes int arg2);

    void updateTime(int arg1, int arg2, @IntRange(from = 0L) int arg3);
}

