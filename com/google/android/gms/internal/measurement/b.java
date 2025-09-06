package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class b implements Iterator {
    public final Iterator a;

    public b(Iterator iterator0) {
        this.a = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.a.next();
        return new zzat(((String)object0));
    }
}

