package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class z1 implements Iterator {
    public final Iterator a;

    public z1(zzmt zzmt0) {
        this.a = zzmt0.a.iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        return this.a.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

