package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class d0 extends AtomicReferenceArray implements SimpleQueueWithConsumerIndex {
    public final AtomicInteger a;
    public int b;

    public d0(int v) {
        super(v);
        this.a = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while(this.poll() != null && !this.isEmpty()) {
        }
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final int consumerIndex() {
        return this.b;
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final void drop() {
        int v = this.b;
        this.lazySet(v, null);
        this.b = v + 1;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.b == this.a.get();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        ObjectHelper.requireNonNull(object0, "value is null");
        int v = this.a.getAndIncrement();
        if(v < this.length()) {
            this.lazySet(v, object0);
            return true;
        }
        return false;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final Object peek() {
        int v = this.b;
        return v == this.length() ? null : this.get(v);
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final Object poll() {
        int v = this.b;
        if(v == this.length()) {
            return null;
        }
        AtomicInteger atomicInteger0 = this.a;
        do {
            Object object0 = this.get(v);
            if(object0 != null) {
                this.b = v + 1;
                this.lazySet(v, null);
                return object0;
            }
        }
        while(atomicInteger0.get() != v);
        return null;
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final int producerIndex() {
        return this.a.get();
    }
}

