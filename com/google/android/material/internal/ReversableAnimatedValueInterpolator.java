package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    public final TimeInterpolator a;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator0) {
        this.a = timeInterpolator0;
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }

    @NonNull
    public static TimeInterpolator of(boolean z, @NonNull TimeInterpolator timeInterpolator0) {
        return z ? timeInterpolator0 : new ReversableAnimatedValueInterpolator(timeInterpolator0);
    }
}

