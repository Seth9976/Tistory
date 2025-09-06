package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class OnSelectionChangedListener {
    public void onIncompleteSelectionChanged() {
    }

    public abstract void onSelectionChanged(@NonNull Object arg1);
}

