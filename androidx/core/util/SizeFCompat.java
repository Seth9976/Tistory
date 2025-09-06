package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import m3.e;

public final class SizeFCompat {
    public final float a;
    public final float b;

    public SizeFCompat(float f, float f1) {
        this.a = Preconditions.checkArgumentFinite(f, "width");
        this.b = Preconditions.checkArgumentFinite(f1, "height");
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SizeFCompat ? ((SizeFCompat)object0).a == this.a && ((SizeFCompat)object0).b == this.b : false;
    }

    public float getHeight() {
        return this.b;
    }

    public float getWidth() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    @NonNull
    @RequiresApi(21)
    public SizeF toSizeF() {
        return e.a(this);
    }

    @NonNull
    @RequiresApi(21)
    public static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF0) {
        return e.b(sizeF0);
    }

    @Override
    @NonNull
    public String toString() {
        return this.a + "x" + this.b;
    }
}

