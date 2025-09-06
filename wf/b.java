package wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt;
import kotlinx.coroutines.debug.internal.HashedWeakRef;

public final class b {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicReferenceArray d;
    public final AtomicReferenceArray e;
    public final ConcurrentWeakMap f;
    public static final AtomicIntegerFieldUpdater g;
    @Volatile
    private volatile int load;

    static {
        b.g = AtomicIntegerFieldUpdater.newUpdater(b.class, "load");
    }

    public b(ConcurrentWeakMap concurrentWeakMap0, int v) {
        this.f = concurrentWeakMap0;
        this.a = v;
        this.b = Integer.numberOfLeadingZeros(v) + 1;
        this.c = v * 2 / 3;
        this.d = new AtomicReferenceArray(v);
        this.e = new AtomicReferenceArray(v);
    }

    public final Object a(Object object0, Object object1, HashedWeakRef hashedWeakRef0) {
        int v = object0.hashCode() * -1640531527 >>> this.b;
        boolean z = false;
    alab1:
        while(true) {
            AtomicReferenceArray atomicReferenceArray0 = this.d;
            HashedWeakRef hashedWeakRef1 = (HashedWeakRef)atomicReferenceArray0.get(v);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = b.g;
            if(hashedWeakRef1 == null) {
                if(object1 == null) {
                    return null;
                }
                if(!z) {
                    do {
                        int v1 = atomicIntegerFieldUpdater0.get(this);
                        if(v1 >= this.c) {
                            return ConcurrentWeakMapKt.a;
                        }
                    }
                    while(!atomicIntegerFieldUpdater0.compareAndSet(this, v1, v1 + 1));
                    z = true;
                }
                if(hashedWeakRef0 == null) {
                    hashedWeakRef0 = new HashedWeakRef(object0, this.f.a);
                }
                HashedWeakRef hashedWeakRef2 = hashedWeakRef0;
                while(!atomicReferenceArray0.compareAndSet(v, null, hashedWeakRef2)) {
                    if(atomicReferenceArray0.get(v) == null) {
                        continue;
                    }
                    continue alab1;
                }
            }
            else {
                Object object2 = hashedWeakRef1.get();
                if(!Intrinsics.areEqual(object0, object2)) {
                    goto label_32;
                }
                else if(z) {
                    atomicIntegerFieldUpdater0.decrementAndGet(this);
                }
            }
            while(true) {
                AtomicReferenceArray atomicReferenceArray1 = this.e;
                Object object3 = atomicReferenceArray1.get(v);
                if(object3 instanceof k) {
                    return ConcurrentWeakMapKt.a;
                }
                do {
                    if(atomicReferenceArray1.compareAndSet(v, object3, object1)) {
                        return object3;
                    }
                }
                while(atomicReferenceArray1.get(v) == object3);
            }
        label_32:
            if(object2 == null) {
                this.c(v);
            }
            if(v == 0) {
                v = this.a;
            }
            --v;
        }
    }

    public final b b() {
        b b0;
    alab1:
        while(true) {
            b0 = new b(this.f, Integer.highestOneBit(c.coerceAtLeast(this.f.size(), 4)) * 4);
            int v = 0;
            while(true) {
                if(v >= this.a) {
                    break alab1;
                }
                HashedWeakRef hashedWeakRef0 = (HashedWeakRef)this.d.get(v);
                Object object0 = hashedWeakRef0 == null ? null : hashedWeakRef0.get();
                if(hashedWeakRef0 != null && object0 == null) {
                    this.c(v);
                }
                while(true) {
                    AtomicReferenceArray atomicReferenceArray0 = this.e;
                    Object object1 = atomicReferenceArray0.get(v);
                    if(object1 instanceof k) {
                        object1 = ((k)object1).a;
                        break;
                    }
                    k k0 = ConcurrentWeakMapKt.access$mark(object1);
                label_13:
                    if(atomicReferenceArray0.compareAndSet(v, object1, k0)) {
                        break;
                    }
                    if(atomicReferenceArray0.get(v) != object1) {
                        continue;
                    }
                    if(false) {
                        break;
                    }
                    goto label_13;
                }
                if(object0 != null && object1 != null && b0.a(object0, object1, hashedWeakRef0) == ConcurrentWeakMapKt.a) {
                    break;
                }
                ++v;
            }
        }
        return b0;
    }

    public final void c(int v) {
        while(true) {
            AtomicReferenceArray atomicReferenceArray0 = this.e;
            Object object0 = atomicReferenceArray0.get(v);
            if(object0 == null) {
                return;
            }
            if(object0 instanceof k) {
                return;
            }
            do {
                if(atomicReferenceArray0.compareAndSet(v, object0, null)) {
                    ConcurrentWeakMap.access$decrementSize(this.f);
                    return;
                }
            }
            while(atomicReferenceArray0.get(v) == object0);
        }
    }
}

