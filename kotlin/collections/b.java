package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b extends a implements ListIterator {
    public final AbstractList d;

    public b(AbstractList abstractList0, int v) {
        this.d = abstractList0;
        super(abstractList0);
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, abstractList0.size());
        this.b = v;
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.b - 1;
        this.b = v;
        return this.d.get(v);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

