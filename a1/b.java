package a1;

import androidx.collection.ObjectListKt;
import androidx.compose.runtime.collection.MutableVectorKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

public final class b implements List, KMutableList {
    public final int a;
    public final Object b;
    public final int c;
    public int d;

    public b(List list0, int v, int v1, int v2) {
        this.a = v2;
        if(v2 != 1) {
            super();
            this.b = list0;
            this.c = v;
            this.d = v1;
            return;
        }
        Intrinsics.checkNotNullParameter(list0, "list");
        super();
        this.b = list0;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final void add(int v, Object object0) {
        if(this.a != 0) {
            ((List)this.b).add(v + this.c, object0);
            ++this.d;
            return;
        }
        ((List)this.b).add(v + this.c, object0);
        ++this.d;
    }

    @Override
    public final boolean add(Object object0) {
        if(this.a != 0) {
            int v = this.d;
            this.d = v + 1;
            ((List)this.b).add(v, object0);
            return true;
        }
        int v1 = this.d;
        this.d = v1 + 1;
        ((List)this.b).add(v1, object0);
        return true;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            ((List)this.b).addAll(v + this.c, collection0);
            this.d = collection0.size() + this.d;
            return collection0.size() > 0;
        }
        ((List)this.b).addAll(v + this.c, collection0);
        this.d = collection0.size() + this.d;
        return collection0.size() > 0;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            ((List)this.b).addAll(this.d, collection0);
            this.d = collection0.size() + this.d;
            return collection0.size() > 0;
        }
        ((List)this.b).addAll(this.d, collection0);
        this.d = collection0.size() + this.d;
        return collection0.size() > 0;
    }

    @Override
    public final void clear() {
        if(this.a != 0) {
            int v = this.d - 1;
            int v1 = this.c;
            if(v1 <= v) {
                while(true) {
                    ((List)this.b).remove(v);
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            this.d = v1;
            return;
        }
        int v2 = this.d - 1;
        int v3 = this.c;
        if(v3 <= v2) {
            while(true) {
                ((List)this.b).remove(v2);
                if(v2 == v3) {
                    break;
                }
                --v2;
            }
        }
        this.d = v3;
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.a != 0) {
            int v = this.d;
            for(int v1 = this.c; v1 < v; ++v1) {
                if(Intrinsics.areEqual(((List)this.b).get(v1), object0)) {
                    return true;
                }
            }
            return false;
        }
        int v2 = this.d;
        for(int v3 = this.c; v3 < v2; ++v3) {
            if(Intrinsics.areEqual(((List)this.b).get(v3), object0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        for(Object object1: collection0) {
            if(!this.contains(object1)) {
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
        if(this.a != 0) {
            ObjectListKt.access$checkIndex(this, v);
            return ((List)this.b).get(v + this.c);
        }
        MutableVectorKt.access$checkIndex(this, v);
        return ((List)this.b).get(v + this.c);
    }

    @Override
    public final int indexOf(Object object0) {
        if(this.a != 0) {
            int v = this.d;
            int v1 = this.c;
            for(int v2 = v1; v2 < v; ++v2) {
                if(Intrinsics.areEqual(((List)this.b).get(v2), object0)) {
                    return v2 - v1;
                }
            }
            return -1;
        }
        int v3 = this.d;
        int v4 = this.c;
        for(int v5 = v4; v5 < v3; ++v5) {
            if(Intrinsics.areEqual(((List)this.b).get(v5), object0)) {
                return v5 - v4;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.d == this.c;
    }

    @Override
    public final Iterator iterator() {
        return this.a == 0 ? new c(this, 0, 0) : new c(this, 0, 1);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(this.a != 0) {
            int v = this.d - 1;
            int v1 = this.c;
            if(v1 <= v) {
                while(true) {
                    if(Intrinsics.areEqual(((List)this.b).get(v), object0)) {
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
        int v2 = this.d - 1;
        int v3 = this.c;
        if(v3 <= v2) {
            while(true) {
                if(Intrinsics.areEqual(((List)this.b).get(v2), object0)) {
                    return v2 - v3;
                }
                if(v2 == v3) {
                    break;
                }
                --v2;
            }
        }
        return -1;
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
            Object object0 = ((List)this.b).remove(v + this.c);
            --this.d;
            return object0;
        }
        MutableVectorKt.access$checkIndex(this, v);
        Object object1 = ((List)this.b).remove(v + this.c);
        --this.d;
        return object1;
    }

    @Override
    public final boolean remove(Object object0) {
        if(this.a != 0) {
            int v = this.d;
            for(int v1 = this.c; v1 < v; ++v1) {
                Object object1 = this.b;
                if(Intrinsics.areEqual(((List)object1).get(v1), object0)) {
                    ((List)object1).remove(v1);
                    --this.d;
                    return true;
                }
            }
            return false;
        }
        int v2 = this.d;
        for(int v3 = this.c; v3 < v2; ++v3) {
            Object object2 = this.b;
            if(Intrinsics.areEqual(((List)object2).get(v3), object0)) {
                ((List)object2).remove(v3);
                --this.d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            int v = this.d;
            for(Object object0: collection0) {
                this.remove(object0);
            }
            return v != this.d;
        }
        int v1 = this.d;
        for(Object object1: collection0) {
            this.remove(object1);
        }
        return v1 != this.d;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            int v = this.d;
            int v1 = v - 1;
            int v2 = this.c;
            if(v2 <= v1) {
                while(true) {
                    Object object0 = this.b;
                    if(!collection0.contains(((List)object0).get(v1))) {
                        ((List)object0).remove(v1);
                        --this.d;
                    }
                    if(v1 == v2) {
                        break;
                    }
                    --v1;
                }
            }
            return v != this.d;
        }
        int v3 = this.d;
        int v4 = v3 - 1;
        int v5 = this.c;
        if(v5 <= v4) {
            while(true) {
                Object object1 = this.b;
                if(!collection0.contains(((List)object1).get(v4))) {
                    ((List)object1).remove(v4);
                    --this.d;
                }
                if(v4 == v5) {
                    break;
                }
                --v4;
            }
        }
        return v3 != this.d;
    }

    @Override
    public final Object set(int v, Object object0) {
        if(this.a != 0) {
            ObjectListKt.access$checkIndex(this, v);
            return ((List)this.b).set(v + this.c, object0);
        }
        MutableVectorKt.access$checkIndex(this, v);
        return ((List)this.b).set(v + this.c, object0);
    }

    @Override
    public final int size() {
        return this.d - this.c;
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

