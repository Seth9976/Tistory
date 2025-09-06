package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicLong;

public abstract class BasicQueueSubscription extends AtomicLong implements QueueSubscription {
    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

