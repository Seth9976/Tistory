package a1;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.MutableVectorKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

public final class a implements List, KMutableList {
    public final int a;
    public final Object b;

    public a(MutableObjectList mutableObjectList0) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(mutableObjectList0, "objectList");
        super();
        this.b = mutableObjectList0;
    }

    public a(MutableVector mutableVector0) {
        this.a = 0;
        super();
        this.b = mutableVector0;
    }

    @Override
    public final void add(int v, Object object0) {
        if(this.a != 0) {
            ((MutableObjectList)this.b).add(v, object0);
            return;
        }
        ((MutableVector)this.b).add(v, object0);
    }

    @Override
    public final boolean add(Object object0) {
        return this.a == 0 ? ((MutableVector)this.b).add(object0) : ((MutableObjectList)this.b).add(object0);
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return ((MutableObjectList)this.b).addAll(v, collection0);
        }
        return ((MutableVector)this.b).addAll(v, collection0);
    }

    @Override
    public final boolean addAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return ((MutableObjectList)this.b).addAll(collection0);
        }
        return ((MutableVector)this.b).addAll(collection0);
    }

    @Override
    public final void clear() {
        if(this.a != 0) {
            ((MutableObjectList)this.b).clear();
            return;
        }
        ((MutableVector)this.b).clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a == 0 ? ((MutableVector)this.b).contains(object0) : ((MutableObjectList)this.b).contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return ((MutableObjectList)this.b).containsAll(collection0);
        }
        return ((MutableVector)this.b).containsAll(collection0);
    }

    @Override
    public final Object get(int v) {
        if(this.a != 0) {
            ObjectListKt.access$checkIndex(this, v);
            return ((MutableObjectList)this.b).get(v);
        }
        MutableVectorKt.access$checkIndex(this, v);
        return ((MutableVector)this.b).getContent()[v];
    }

    @Override
    public final int indexOf(Object object0) {
        return this.a == 0 ? ((MutableVector)this.b).indexOf(object0) : ((MutableObjectList)this.b).indexOf(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.a == 0 ? ((MutableVector)this.b).isEmpty() : ((MutableObjectList)this.b).isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.a == 0 ? new c(this, 0, 0) : new c(this, 0, 1);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return this.a == 0 ? ((MutableVector)this.b).lastIndexOf(object0) : ((MutableObjectList)this.b).lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        return this.a == 0 ? new c(this, 0, 0) : new c(this, 0, 1);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.a == 0 ? new c(this, v, 0) : new c(this, v, 1);
    }

    @Override
    public final Object remove(int v) {
        if(this.a != 0) {
            ObjectListKt.access$checkIndex(this, v);
            return ((MutableObjectList)this.b).removeAt(v);
        }
        MutableVectorKt.access$checkIndex(this, v);
        return ((MutableVector)this.b).removeAt(v);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.a == 0 ? ((MutableVector)this.b).remove(object0) : ((MutableObjectList)this.b).remove(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return ((MutableObjectList)this.b).removeAll(collection0);
        }
        return ((MutableVector)this.b).removeAll(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return ((MutableObjectList)this.b).retainAll(collection0);
        }
        return ((MutableVector)this.b).retainAll(collection0);
    }

    @Override
    public final Object set(int v, Object object0) {
        if(this.a != 0) {
            ObjectListKt.access$checkIndex(this, v);
            return ((MutableObjectList)this.b).set(v, object0);
        }
        MutableVectorKt.access$checkIndex(this, v);
        return ((MutableVector)this.b).set(v, object0);
    }

    @Override
    public final int size() {
        return this.a == 0 ? ((MutableVector)this.b).getSize() : ((MutableObjectList)this.b).getSize();
    }

    @Override
    public final List subList(int v, int v1) {
        if(this.a != 0) {
            ObjectListKt.access$checkSubIndex(this, v, v1);
            return new b(this, v, v1, 1);
        }
        MutableVectorKt.access$checkSubIndex(this, v, v1);
        return new b(this, v, v1, 0);
    }

    @Override
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(arr_object, "array");
            return CollectionToArray.toArray(this, arr_object);
        }
        return CollectionToArray.toArray(this, arr_object);
    }
}

