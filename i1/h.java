package i1;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateListKt;
import androidx.compose.runtime.snapshots.SubList.listIterator.1;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.c;

public final class h implements List, KMutableList {
    public final SnapshotStateList a;
    public final int b;
    public int c;
    public int d;

    public h(SnapshotStateList snapshotStateList0, int v, int v1) {
        this.a = snapshotStateList0;
        this.b = v;
        this.c = snapshotStateList0.getStructure$runtime_release();
        this.d = v1 - v;
    }

    public final void a() {
        if(this.a.getStructure$runtime_release() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        this.a.add(this.b + v, object0);
        ++this.d;
        this.c = this.a.getStructure$runtime_release();
    }

    @Override
    public final boolean add(Object object0) {
        this.a();
        this.a.add(this.b + this.d, object0);
        ++this.d;
        this.c = this.a.getStructure$runtime_release();
        return true;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        this.a();
        SnapshotStateList snapshotStateList0 = this.a;
        boolean z = snapshotStateList0.addAll(v + this.b, collection0);
        if(z) {
            this.d = collection0.size() + this.d;
            this.c = snapshotStateList0.getStructure$runtime_release();
        }
        return z;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.d, collection0);
    }

    @Override
    public final void clear() {
        if(this.d > 0) {
            this.a();
            this.a.removeRange(this.b, this.d + this.b);
            this.d = 0;
            this.c = this.a.getStructure$runtime_release();
        }
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.a();
        SnapshotStateListKt.access$validateRange(v, this.d);
        return this.a.get(this.b + v);
    }

    @Override
    public final int indexOf(Object object0) {
        this.a();
        int v = this.b;
        Iterator iterator0 = c.until(v, this.d + v).iterator();
        while(iterator0.hasNext()) {
            int v1 = ((IntIterator)iterator0).nextInt();
            if(Intrinsics.areEqual(object0, this.a.get(v1))) {
                return v1 - v;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        this.a();
        int v = this.b;
        for(int v1 = this.d + v - 1; v1 >= v; --v1) {
            if(Intrinsics.areEqual(object0, this.a.get(v1))) {
                return v1 - v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        this.a();
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = v - 1;
        return new SubList.listIterator.1(ref$IntRef0, this);
    }

    @Override
    public final Object remove(int v) {
        this.a();
        Object object0 = this.a.remove(this.b + v);
        --this.d;
        this.c = this.a.getStructure$runtime_release();
        return object0;
    }

    @Override
    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        boolean z;
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(!this.remove(object0) && !z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        this.a();
        SnapshotStateList snapshotStateList0 = this.a;
        int v = snapshotStateList0.retainAllInRange$runtime_release(collection0, this.b, this.d + this.b);
        if(v > 0) {
            this.c = snapshotStateList0.getStructure$runtime_release();
            this.d -= v;
        }
        return v > 0;
    }

    @Override
    public final Object set(int v, Object object0) {
        SnapshotStateListKt.access$validateRange(v, this.d);
        this.a();
        Object object1 = this.a.set(v + this.b, object0);
        this.c = this.a.getStructure$runtime_release();
        return object1;
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override
    public final List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.d) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        this.a();
        return new h(this.a, v + this.b, v1 + this.b);
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

