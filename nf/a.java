package nf;

import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.internal.ListImplementation;

public final class a extends AbstractList implements ImmutableList {
    public final ImmutableList a;
    public final int b;
    public final int c;

    public a(ImmutableList immutableList0, int v, int v1) {
        Intrinsics.checkNotNullParameter(immutableList0, "source");
        super();
        this.a = immutableList0;
        this.b = v;
        ListImplementation.checkRangeIndexes$kotlinx_collections_immutable(v, v1, immutableList0.size());
        this.c = v1 - v;
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.c);
        return this.a.get(this.b + v);
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.c;
    }

    @Override  // kotlin.collections.AbstractList
    public final List subList(int v, int v1) {
        return this.subList(v, v1);
    }

    @Override  // kotlinx.collections.immutable.ImmutableList
    public final ImmutableList subList(int v, int v1) {
        ListImplementation.checkRangeIndexes$kotlinx_collections_immutable(v, v1, this.c);
        return new a(this.a, v + this.b, this.b + v1);
    }
}

