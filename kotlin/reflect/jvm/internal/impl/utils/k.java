package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class k implements Iterator, KMutableIterator {
    public final Object a;
    public boolean b;

    public k(Object object0) {
        this.a = object0;
        this.b = true;
    }

    @Override
    public final boolean hasNext() {
        return this.b;
    }

    @Override
    public final Object next() {
        if(!this.b) {
            throw new NoSuchElementException();
        }
        this.b = false;
        return this.a;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

