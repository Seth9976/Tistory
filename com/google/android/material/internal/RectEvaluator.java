package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RectEvaluator implements TypeEvaluator {
    public final Rect a;

    public RectEvaluator(@NonNull Rect rect0) {
        this.a = rect0;
    }

    public Rect evaluate(float f, @NonNull Rect rect0, @NonNull Rect rect1) {
        this.a.set(rect0.left + ((int)(((float)(rect1.left - rect0.left)) * f)), rect0.top + ((int)(((float)(rect1.top - rect0.top)) * f)), rect0.right + ((int)(((float)(rect1.right - rect0.right)) * f)), rect0.bottom + ((int)(((float)(rect1.bottom - rect0.bottom)) * f)));
        return this.a;
    }

    @Override  // android.animation.TypeEvaluator
    public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
        return this.evaluate(f, ((Rect)object0), ((Rect)object1));
    }
}

