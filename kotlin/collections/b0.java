package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

public final class b0 extends AbstractMutableList {
    public final List a;

    public b0(List list0) {
        Intrinsics.checkNotNullParameter(list0, "delegate");
        super();
        this.a = list0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public final void add(int v, Object object0) {
        int v1 = p.access$reversePositionIndex(this, v);
        this.a.add(v1, object0);
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final Object get(int v) {
        int v1 = p.access$reverseElementIndex(this, v);
        return this.a.get(v1);
    }

    @Override  // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.a.size();
    }

    @Override
    public final Iterator iterator() {
        return new ReversedList.listIterator.1(this, 0);
    }

    @Override
    public final ListIterator listIterator() {
        return new ReversedList.listIterator.1(this, 0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new ReversedList.listIterator.1(this, v);
    }

    @Override  // kotlin.collections.AbstractMutableList
    public final Object removeAt(int v) {
        int v1 = p.access$reverseElementIndex(this, v);
        return this.a.remove(v1);
    }

    @Override  // kotlin.collections.AbstractMutableList
    public final Object set(int v, Object object0) {
        int v1 = p.access$reverseElementIndex(this, v);
        return this.a.set(v1, object0);
    }
}

