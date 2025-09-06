package io.reactivex.internal.operators.flowable;

public final class c6 implements Runnable {
    public final Number a;
    public final long b;

    public c6(long v, TimeoutSupport flowableTimeoutTimed$TimeoutSupport0) {
        this.b = v;
        this.a = (Number)flowableTimeoutTimed$TimeoutSupport0;
    }

    @Override
    public final void run() {
        ((TimeoutSupport)this.a).onTimeout(this.b);
    }
}

