package io.reactivex.internal.operators.observable;

public final class i4 implements Runnable {
    public final Object a;
    public final long b;

    public i4(long v, TimeoutSupport observableTimeoutTimed$TimeoutSupport0) {
        this.b = v;
        this.a = observableTimeoutTimed$TimeoutSupport0;
    }

    @Override
    public final void run() {
        ((TimeoutSupport)this.a).onTimeout(this.b);
    }
}

