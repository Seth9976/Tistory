package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class AdjustedCornerSize implements CornerSize {
    public final CornerSize a;
    public final float b;

    public AdjustedCornerSize(float f, @NonNull CornerSize cornerSize0) {
        while(cornerSize0 instanceof AdjustedCornerSize) {
            cornerSize0 = ((AdjustedCornerSize)cornerSize0).a;
            f += ((AdjustedCornerSize)cornerSize0).b;
        }
        this.a = cornerSize0;
        this.b = f;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdjustedCornerSize ? this.a.equals(((AdjustedCornerSize)object0).a) && this.b == ((AdjustedCornerSize)object0).b : false;
    }

    @Override  // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF0) {
        return Math.max(0.0f, this.a.getCornerSize(rectF0) + this.b);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

