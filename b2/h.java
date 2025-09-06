package b2;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.HitTestResult;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class h implements List, KMappedMarker {
    public final int a;
    public final int b;
    public final HitTestResult c;

    public h(HitTestResult hitTestResult0, int v, int v1) {
        this.c = hitTestResult0;
        this.a = v;
        this.b = v1;
    }

    @Override
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Node ? this.indexOf(((Node)object0)) != -1 : false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(((Node)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.c.a[v + this.a];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Node)object0;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Node)) {
            return -1;
        }
        int v = this.a;
        int v1 = this.b;
        if(v <= v1) {
            for(int v2 = v; true; ++v2) {
                if(Intrinsics.areEqual(this.c.a[v2], ((Node)object0))) {
                    return v2 - v;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Iterator iterator() {
        return new g(this.c, this.a, this.a, this.b);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof Node)) {
            return -1;
        }
        int v = this.b;
        int v1 = this.a;
        if(v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(this.c.a[v], ((Node)object0))) {
                    return v - v1;
                }
                if(v == v1) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new g(this.c, this.a, this.a, this.b);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new g(this.c, v + this.a, this.a, this.b);
    }

    @Override
    public final Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.b - this.a;
    }

    @Override
    public final void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int v, int v1) {
        return new h(this.c, v + this.a, this.a + v1);
    }

    @Override
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }
}

