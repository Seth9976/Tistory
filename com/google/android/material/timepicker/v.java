package com.google.android.material.timepicker;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

public final class v extends GestureDetector.SimpleOnGestureListener {
    public final TimePickerView a;

    public v(TimePickerView timePickerView0) {
        this.a = timePickerView0;
        super();
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onDoubleTap(MotionEvent motionEvent0) {
        MaterialTimePicker materialTimePicker0 = this.a.h;
        if(materialTimePicker0 != null) {
            materialTimePicker0.onDoubleTap();
            return true;
        }
        return false;
    }
}

