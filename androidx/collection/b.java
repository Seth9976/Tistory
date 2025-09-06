package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

public final class b extends SetWrapper implements KMutableSet {
    public final MutableScatterSet b;

    public b(MutableScatterSet mutableScatterSet0) {
        this.b = mutableScatterSet0;
        super();
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final boolean add(Object object0) {
        return this.b.add(object0);
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.b.addAll(collection0);
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final void clear() {
        this.b.clear();
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final Iterator iterator() {
        return new MutableScatterSet.MutableSetWrapper.iterator.1(this.b);
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final boolean remove(Object object0) {
        return this.b.remove(object0);
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final boolean removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterSet mutableScatterSet0 = this.b;
        int v = mutableScatterSet0.getSize();
        for(Object object0: collection0) {
            mutableScatterSet0.minusAssign(object0);
        }
        return v != mutableScatterSet0.getSize();
    }

    @Override  // androidx.collection.ScatterSet$SetWrapper
    public final boolean retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterSet mutableScatterSet0 = this.b;
        long[] arr_v = mutableScatterSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!collection0.contains(mutableScatterSet0.elements[v5])) {
                                mutableScatterSet0.removeElementAt(v5);
                                z = true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return z;
        }
        return false;
    }
}

