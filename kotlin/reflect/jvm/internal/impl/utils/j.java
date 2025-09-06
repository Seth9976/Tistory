package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class j implements Iterator, KMutableIterator {
    public final Iterator a;

    public j(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        super();
        this.a = ArrayIteratorKt.iterator(arr_object);
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        return this.a.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

