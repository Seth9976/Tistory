package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface ViewOverlayImpl {
    void add(@NonNull Drawable arg1);

    void remove(@NonNull Drawable arg1);
}

