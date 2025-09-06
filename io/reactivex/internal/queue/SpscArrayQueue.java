package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue extends AtomicReferenceArray implements SimplePlainQueue {
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong d;
    public final int e;
    public static final Integer f;

    static {
        SpscArrayQueue.f = 0x1000;
    }

    public SpscArrayQueue(int v) {
        super(Pow2.roundToPowerOfTwo(v));
        this.a = this.length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(v / 4, ((int)SpscArrayQueue.f));
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
        return this.b.get() == this.d.get();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong0 = this.b;
        long v = atomicLong0.get();
        int v1 = this.a;
        int v2 = ((int)v) & v1;
        if(v >= this.c) {
            long v3 = ((long)this.e) + v;
            if(this.get(v1 & ((int)v3)) == null) {
                this.c = v3;
            }
            else if(this.get(v2) != null) {
                return false;
            }
        }
        this.lazySet(v2, object0);
        atomicLong0.lazySet(v + 1L);
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0, Object object1) {
        return this.offer(object0) && this.offer(object1);
    }

    @Override  // io.reactivex.internal.fuseable.SimplePlainQueue
    @Nullable
    public Object poll() {
        AtomicLong atomicLong0 = this.d;
        long v = atomicLong0.get();
        int v1 = ((int)v) & this.a;
        Object object0 = this.get(v1);
        if(object0 == null) {
            return null;
        }
        atomicLong0.lazySet(v + 1L);
        this.lazySet(v1, null);
        return object0;
    }
}

