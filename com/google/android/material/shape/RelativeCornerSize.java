package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

public final class RelativeCornerSize implements CornerSize {
    public final float a;

    public RelativeCornerSize(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a = f;
    }

    // 去混淆评级： 低(20)
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@NonNull RectF rectF0, @NonNull CornerSize cornerSize0) {
        return cornerSize0 instanceof RelativeCornerSize ? ((RelativeCornerSize)cornerSize0) : new RelativeCornerSize(cornerSize0.getCornerSize(rectF0) / Math.min(rectF0.width(), rectF0.height()));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof RelativeCornerSize ? this.a == ((RelativeCornerSize)object0).a : false;
    }

    @Override  // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF0) {
        return Math.min(rectF0.width(), rectF0.height()) * this.a;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getRelativePercent() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

