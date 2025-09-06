package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ClampedCornerSize implements CornerSize {
    public final float a;

    public ClampedCornerSize(float f) {
        this.a = f;
    }

    @NonNull
    public static ClampedCornerSize createFromCornerSize(@NonNull AbsoluteCornerSize absoluteCornerSize0) {
        return new ClampedCornerSize(absoluteCornerSize0.getCornerSize());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ClampedCornerSize ? this.a == ((ClampedCornerSize)object0).a : false;
    }

    @Override  // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF0) {
        float f = Math.min(rectF0.width() / 2.0f, rectF0.height() / 2.0f);
        return Math.min(this.a, f);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

