package com.bumptech.glide.load.engine.prefill;

import a5.b;
import android.graphics.Bitmap.Config;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;

public final class PreFillType {
    public static class Builder {
        public final int a;
        public final int b;
        public Bitmap.Config c;
        public int d;

        public Builder(int v) {
            this(v, v);
        }

        public Builder(int v, int v1) {
            this.d = 1;
            if(v <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if(v1 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.a = v;
            this.b = v1;
        }

        public Builder setConfig(@Nullable Bitmap.Config bitmap$Config0) {
            this.c = bitmap$Config0;
            return this;
        }

        public Builder setWeight(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.d = v;
            return this;
        }
    }

    public final int a;
    public final int b;
    public final Bitmap.Config c;
    public final int d;

    static {
    }

    public PreFillType(int v, int v1, Bitmap.Config bitmap$Config0, int v2) {
        this.c = (Bitmap.Config)Preconditions.checkNotNull(bitmap$Config0, "Config must not be null");
        this.a = v;
        this.b = v1;
        this.d = v2;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof PreFillType && this.b == ((PreFillType)object0).b && this.a == ((PreFillType)object0).a && this.d == ((PreFillType)object0).d && this.c == ((PreFillType)object0).c;
    }

    @Override
    public int hashCode() {
        return (this.c.hashCode() + (this.a * 0x1F + this.b) * 0x1F) * 0x1F + this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PreFillSize{width=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", height=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", config=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", weight=");
        return b.p(stringBuilder0, this.d, '}');
    }
}

