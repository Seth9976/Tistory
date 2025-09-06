package com.google.android.gms.measurement.internal;

import java.util.Iterator;

public final class i implements Iterator {
    public final Iterator a;

    public i(zzau zzau0) {
        this.a = zzau0.a.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}

