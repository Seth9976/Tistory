package io.reactivex.internal.operators.maybe;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class b0 extends ConcurrentLinkedQueue implements SimpleQueueWithConsumerIndex {
    public int a;
    public final AtomicInteger b;

    public b0() {
        this.b = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final int consumerIndex() {
        return this.a;
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final void drop() {
        this.poll();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        this.b.getAndIncrement();
        return super.offer(object0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final Object poll() {
        Object object0 = super.poll();
        if(object0 != null) {
            ++this.a;
        }
        return object0;
    }

    @Override  // io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex
    public final int producerIndex() {
        return this.b.get();
    }
}

