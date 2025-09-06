package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

interface SheetCallback {
    void onSlide(@NonNull View arg1, float arg2);

    void onStateChanged(@NonNull View arg1, int arg2);
}

