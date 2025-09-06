package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class AbsoluteCornerSize implements CornerSize {
    public final float a;

    public AbsoluteCornerSize(float f) {
        this.a = f;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AbsoluteCornerSize ? this.a == ((AbsoluteCornerSize)object0).a : false;
    }

    public float getCornerSize() {
        return this.a;
    }

    @Override  // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF0) {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

