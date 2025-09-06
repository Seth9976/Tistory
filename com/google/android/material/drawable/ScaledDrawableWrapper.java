package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ScaledDrawableWrapper extends DrawableWrapperCompat {
    public final int b;
    public final int c;

    public ScaledDrawableWrapper(@NonNull Drawable drawable0, int v, int v1) {
        super(drawable0);
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getIntrinsicHeight() {
        return this.c;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getIntrinsicWidth() {
        return this.b;
    }
}

