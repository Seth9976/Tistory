package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

public final class c0 extends AbstractList {
    public final List a;

    public c0(List list0) {
        Intrinsics.checkNotNullParameter(list0, "delegate");
        super();
        this.a = list0;
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        int v1 = p.access$reverseElementIndex(this, v);
        return this.a.get(v1);
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.a.size();
    }

    @Override  // kotlin.collections.AbstractList
    public final Iterator iterator() {
        return new ReversedListReadOnly.listIterator.1(this, 0);
    }

    @Override  // kotlin.collections.AbstractList
    public final ListIterator listIterator() {
        return new ReversedListReadOnly.listIterator.1(this, 0);
    }

    @Override  // kotlin.collections.AbstractList
    public final ListIterator listIterator(int v) {
        return new ReversedListReadOnly.listIterator.1(this, v);
    }
}

