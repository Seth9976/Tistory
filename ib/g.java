package ib;

import a5.b;
import kotlin.collections.AbstractList;

public final class g extends AbstractList {
    public final int a;

    public g(int v) {
        this.a = v;
    }

    @Override  // kotlin.collections.AbstractCollection
    public final boolean contains(Object object0) {
        return object0 instanceof String ? super.contains(((String)object0)) : false;
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        return b.f(1, "%03d", "format(...)", new Object[]{((int)(v + 1))});
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractList
    public final int indexOf(Object object0) {
        return object0 instanceof String ? super.indexOf(((String)object0)) : -1;
    }

    @Override  // kotlin.collections.AbstractList
    public final int lastIndexOf(Object object0) {
        return object0 instanceof String ? super.lastIndexOf(((String)object0)) : -1;
    }
}

