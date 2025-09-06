package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r0.a;

public final class Encoding {
    public final String a;

    public Encoding(String s) {
        if(s == null) {
            throw new NullPointerException("name is null");
        }
        this.a = s;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Encoding ? this.a.equals(((Encoding)object0).a) : false;
    }

    public String getName() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public static Encoding of(@NonNull String s) {
        return new Encoding(s);
    }

    @Override
    @NonNull
    public String toString() {
        return a.o(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}

