package b2;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.HitTestResult;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class g implements ListIterator, KMappedMarker {
    public int a;
    public final int b;
    public final int c;
    public final HitTestResult d;

    public g(HitTestResult hitTestResult0, int v, int v1) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(hitTestResult0, v, 0, hitTestResult0.size());
    }

    public g(HitTestResult hitTestResult0, int v, int v1, int v2) {
        this.d = hitTestResult0;
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasNext() {
        return this.a < this.c;
    }

    @Override
    public final boolean hasPrevious() {
        return this.a > this.b;
    }

    @Override
    public final Object next() {
        Object[] arr_object = this.d.a;
        int v = this.a;
        this.a = v + 1;
        Object object0 = arr_object[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Node)object0;
    }

    @Override
    public final int nextIndex() {
        return this.a - this.b;
    }

    @Override
    public final Object previous() {
        int v = this.a - 1;
        this.a = v;
        Object object0 = this.d.a[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Node)object0;
    }

    @Override
    public final int previousIndex() {
        return this.a - this.b - 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

