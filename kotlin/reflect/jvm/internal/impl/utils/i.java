package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {
    public boolean a;
    public final int b;
    public final SmartList c;

    public i(SmartList smartList0) {
        this.c = smartList0;
        this.b = smartList0.modCount;
    }

    public final void a() {
        SmartList smartList0 = this.c;
        int v = this.b;
        if(smartList0.modCount != v) {
            throw new ConcurrentModificationException("ModCount: " + smartList0.modCount + "; expected: " + v);
        }
    }

    @Override
    public final boolean hasNext() {
        return !this.a;
    }

    @Override
    public final Object next() {
        if(this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        this.a();
        return this.c.b;
    }

    @Override
    public final void remove() {
        this.a();
        this.c.clear();
    }
}

