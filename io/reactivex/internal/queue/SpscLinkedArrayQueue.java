package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscLinkedArrayQueue implements SimplePlainQueue {
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int d;
    public AtomicReferenceArray e;
    public final int f;
    public AtomicReferenceArray g;
    public final AtomicLong h;
    public static final int i;
    public static final Object j;

    static {
        SpscLinkedArrayQueue.i = 0x1000;
        SpscLinkedArrayQueue.j = new Object();
    }

    public SpscLinkedArrayQueue(int v) {
        AtomicLong atomicLong0 = new AtomicLong();
        this.a = atomicLong0;
        this.h = new AtomicLong();
        int v1 = Pow2.roundToPowerOfTwo(Math.max(8, v));
        AtomicReferenceArray atomicReferenceArray0 = new AtomicReferenceArray(v1 + 1);
        this.e = atomicReferenceArray0;
        this.d = v1 - 1;
        this.b = Math.min(v1 / 4, SpscLinkedArrayQueue.i);
        this.g = atomicReferenceArray0;
        this.f = v1 - 1;
        this.c = (long)(v1 - 2);
        atomicLong0.lazySet(0L);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while(true) {
            if(this.poll() != null) {
            }
            else if(this.isEmpty()) {
                break;
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.a.get() == this.h.get();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        AtomicLong atomicLong0 = this.a;
        long v = atomicLong0.get();
        int v1 = this.d;
        int v2 = ((int)v) & v1;
        if(Long.compare(v, this.c) < 0) {
            atomicReferenceArray0.lazySet(v2, object0);
            atomicLong0.lazySet(v + 1L);
            return true;
        }
        long v3 = ((long)this.b) + v;
        if(atomicReferenceArray0.get(((int)v3) & v1) == null) {
            this.c = v3 - 1L;
            atomicReferenceArray0.lazySet(v2, object0);
            atomicLong0.lazySet(v + 1L);
            return true;
        }
        if(atomicReferenceArray0.get(((int)(v + 1L)) & v1) == null) {
            atomicReferenceArray0.lazySet(v2, object0);
            atomicLong0.lazySet(v + 1L);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray1 = new AtomicReferenceArray(atomicReferenceArray0.length());
        this.e = atomicReferenceArray1;
        this.c = v + ((long)v1) - 1L;
        atomicReferenceArray1.lazySet(v2, object0);
        atomicReferenceArray0.lazySet(atomicReferenceArray0.length() - 1, atomicReferenceArray1);
        atomicReferenceArray0.lazySet(v2, SpscLinkedArrayQueue.j);
        atomicLong0.lazySet(v + 1L);
        return true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0, Object object1) {
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        AtomicLong atomicLong0 = this.a;
        long v = atomicLong0.get();
        int v1 = this.d;
        if(atomicReferenceArray0.get(((int)(v + 2L)) & v1) == null) {
            int v2 = ((int)v) & v1;
            atomicReferenceArray0.lazySet(v2 + 1, object1);
            atomicReferenceArray0.lazySet(v2, object0);
            atomicLong0.lazySet(v + 2L);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray1 = new AtomicReferenceArray(atomicReferenceArray0.length());
        this.e = atomicReferenceArray1;
        int v3 = ((int)v) & v1;
        atomicReferenceArray1.lazySet(v3 + 1, object1);
        atomicReferenceArray1.lazySet(v3, object0);
        atomicReferenceArray0.lazySet(atomicReferenceArray0.length() - 1, atomicReferenceArray1);
        atomicReferenceArray0.lazySet(v3, SpscLinkedArrayQueue.j);
        atomicLong0.lazySet(v + 2L);
        return true;
    }

    public Object peek() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        int v = (int)this.h.get();
        int v1 = this.f;
        int v2 = v & v1;
        Object object0 = atomicReferenceArray0.get(v2);
        if(object0 == SpscLinkedArrayQueue.j) {
            AtomicReferenceArray atomicReferenceArray1 = (AtomicReferenceArray)atomicReferenceArray0.get(v1 + 1);
            atomicReferenceArray0.lazySet(v1 + 1, null);
            this.g = atomicReferenceArray1;
            return atomicReferenceArray1.get(v2);
        }
        return object0;
    }

    @Override  // io.reactivex.internal.fuseable.SimplePlainQueue
    @Nullable
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        AtomicLong atomicLong0 = this.h;
        long v = atomicLong0.get();
        int v1 = this.f;
        int v2 = ((int)v) & v1;
        Object object0 = atomicReferenceArray0.get(v2);
        boolean z = object0 == SpscLinkedArrayQueue.j;
        if(object0 != null && !z) {
            atomicReferenceArray0.lazySet(v2, null);
            atomicLong0.lazySet(v + 1L);
            return object0;
        }
        if(z) {
            AtomicReferenceArray atomicReferenceArray1 = (AtomicReferenceArray)atomicReferenceArray0.get(v1 + 1);
            atomicReferenceArray0.lazySet(v1 + 1, null);
            this.g = atomicReferenceArray1;
            Object object1 = atomicReferenceArray1.get(v2);
            if(object1 != null) {
                atomicReferenceArray1.lazySet(v2, null);
                atomicLong0.lazySet(v + 1L);
            }
            return object1;
        }
        return null;
    }

    public int size() {
        long v2;
        long v1;
        AtomicLong atomicLong0 = this.h;
        for(long v = atomicLong0.get(); true; v = v2) {
            v1 = this.a.get();
            v2 = atomicLong0.get();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }
}

