package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {
    public final Iterator a;
    public final Iterator b;

    public a(Iterator iterator0, Iterator iterator1) {
        this.a = iterator0;
        this.b = iterator1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.a.hasNext() ? true : this.b.hasNext();
    }

    @Override
    public final Object next() {
        Iterator iterator0 = this.a;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return new zzat(((Integer)object0).toString());
        }
        Iterator iterator1 = this.b;
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        return new zzat(((String)object1));
    }
}

