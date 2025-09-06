package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public final class c extends AbstractList implements RandomAccess {
    public final AbstractList a;
    public final int b;
    public final int c;

    public c(AbstractList abstractList0, int v, int v1) {
        Intrinsics.checkNotNullParameter(abstractList0, "list");
        super();
        this.a = abstractList0;
        this.b = v;
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, abstractList0.size());
        this.c = v1 - v;
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.c);
        return this.a.get(this.b + v);
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.c;
    }
}

