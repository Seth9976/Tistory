package b1;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.collections.AbstractList;

public final class a extends AbstractList implements ImmutableList {
    public final ImmutableList a;
    public final int b;
    public final int c;

    public a(ImmutableList immutableList0, int v, int v1) {
        this.a = immutableList0;
        this.b = v;
        ListImplementation.checkRangeIndexes$runtime_release(v, v1, immutableList0.size());
        this.c = v1 - v;
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.c);
        return this.a.get(this.b + v);
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final ImmutableList subList(int v, int v1) {
        ListImplementation.checkRangeIndexes$runtime_release(v, v1, this.c);
        return new a(this.a, v + this.b, this.b + v1);
    }

    @Override  // kotlin.collections.AbstractList, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final List subList(int v, int v1) {
        return this.subList(v, v1);
    }
}

