package com.google.android.gms.common.images;

import a5.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class Size {
    public final int a;
    public final int b;

    public Size(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public static void a(String s) {
        throw new NumberFormatException(b.q(new StringBuilder(s.length() + 16), "Invalid Size: \"", s, "\""));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof Size && this.a == ((Size)object0).a && this.b == ((Size)object0).b;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (this.a >>> 16 | this.a << 16) ^ this.b;
    }

    @NonNull
    public static Size parseSize(@NonNull String s) throws NumberFormatException {
        if(s == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int v = s.indexOf(42);
        if(v < 0) {
            v = s.indexOf(120);
        }
        if(v >= 0) {
            try {
                return new Size(Integer.parseInt(s.substring(0, v)), Integer.parseInt(s.substring(v + 1)));
            }
            catch(NumberFormatException unused_ex) {
                Size.a(s);
                throw null;
            }
        }
        Size.a(s);
        throw null;
    }

    @Override
    @NonNull
    public String toString() {
        return this.a + "x" + this.b;
    }
}

