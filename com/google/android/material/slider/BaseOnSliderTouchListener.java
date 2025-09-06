package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface BaseOnSliderTouchListener {
    void onStartTrackingTouch(@NonNull Object arg1);

    void onStopTrackingTouch(@NonNull Object arg1);
}

