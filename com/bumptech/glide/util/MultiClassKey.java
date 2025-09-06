package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MultiClassKey {
    public Class a;
    public Class b;
    public Class c;

    public MultiClassKey() {
    }

    public MultiClassKey(@NonNull Class class0, @NonNull Class class1) {
        this.set(class0, class1);
    }

    public MultiClassKey(@NonNull Class class0, @NonNull Class class1, @Nullable Class class2) {
        this.set(class0, class1, class2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.a.equals(((MultiClassKey)object0).a)) {
            return false;
        }
        return this.b.equals(((MultiClassKey)object0).b) ? Util.bothNullOrEqual(this.c, ((MultiClassKey)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    public void set(@NonNull Class class0, @NonNull Class class1) {
        this.set(class0, class1, null);
    }

    public void set(@NonNull Class class0, @NonNull Class class1, @Nullable Class class2) {
        this.a = class0;
        this.b = class1;
        this.c = class2;
    }

    @Override
    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}

