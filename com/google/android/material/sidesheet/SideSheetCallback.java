package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

public abstract class SideSheetCallback implements SheetCallback {
    @Override  // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@NonNull View arg1, float arg2);

    @Override  // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@NonNull View arg1, int arg2);
}

