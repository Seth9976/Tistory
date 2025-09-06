package r;

import androidx.collection.ArrayMap;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Set {
    public final ArrayMap a;

    public b(ArrayMap arrayMap0) {
        this.a = arrayMap0;
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            try {
                return this.size() == set0.size() && this.containsAll(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        ArrayMap arrayMap0 = this.a;
        int v = arrayMap0.size() - 1;
        int v1 = 0;
        while(v >= 0) {
            Object object0 = arrayMap0.keyAt(v);
            v1 += (object0 == null ? 0 : object0.hashCode());
            --v;
        }
        return v1;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a(this.a, 0);
    }

    @Override
    public final boolean remove(Object object0) {
        ArrayMap arrayMap0 = this.a;
        int v = arrayMap0.indexOfKey(object0);
        if(v >= 0) {
            arrayMap0.removeAt(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        return this.a.removeAll(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        return this.a.retainAll(collection0);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Object[] toArray() {
        ArrayMap arrayMap0 = this.a;
        int v = arrayMap0.size();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = arrayMap0.keyAt(v1);
        }
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        ArrayMap arrayMap0 = this.a;
        int v = arrayMap0.size();
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = arrayMap0.keyAt(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

