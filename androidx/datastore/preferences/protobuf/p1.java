package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public final class p1 implements Iterator {
    public final Iterator a;
    public final MapAdapter b;

    public p1(MapAdapter internal$MapAdapter0, Iterator iterator0) {
        this.b = internal$MapAdapter0;
        this.a = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.a.next();
        return new o1(this.b, ((Map.Entry)object0));
    }

    @Override
    public final void remove() {
        this.a.remove();
    }
}

