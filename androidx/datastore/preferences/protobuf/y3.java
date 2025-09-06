package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

public final class y3 implements ListIterator {
    public final ListIterator a;

    public y3(UnmodifiableLazyStringList unmodifiableLazyStringList0, int v) {
        this.a = unmodifiableLazyStringList0.a.listIterator(v);
    }

    @Override
    public final void add(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String)this.a.next();
    }

    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String)this.a.previous();
    }

    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }
}

