package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BasicIntQueueDisposable extends AtomicInteger implements QueueDisposable {
    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called");
    }
}

