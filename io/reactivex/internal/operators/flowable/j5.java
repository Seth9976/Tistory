package io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;

public final class j5 implements Runnable {
    public final Subscription a;
    public final long b;

    public j5(long v, Subscription subscription0) {
        this.a = subscription0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.request(this.b);
    }
}

