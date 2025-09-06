package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface BaseOnChangeListener {
    void onValueChange(@NonNull Object arg1, float arg2, boolean arg3);
}

