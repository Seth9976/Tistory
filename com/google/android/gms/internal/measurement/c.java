package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c implements Iterator {
    public final int a;
    public int b;
    public final zzat c;

    public c(zzat zzat0, int v) {
        this.a = v;
        this.c = zzat0;
        this.b = 0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.c.a.length();
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            int v = this.b;
            zzat zzat0 = this.c;
            if(v >= zzat0.a.length()) {
                throw new NoSuchElementException();
            }
            this.b = v + 1;
            return new zzat(String.valueOf(zzat0.a.charAt(v)));
        }
        int v1 = this.b;
        if(v1 >= this.c.a.length()) {
            throw new NoSuchElementException();
        }
        this.b = v1 + 1;
        return new zzat(String.valueOf(v1));
    }
}

