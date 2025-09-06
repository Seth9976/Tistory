package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

public final class t0 extends r0 {
    public final int c;

    public t0(Subscriber subscriber0, int v) {
        this.c = v;
        super(subscriber0);
    }

    private final void e() {
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(this.b.isDisposed()) {
            return;
        }
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if(this.get() != 0L) {
            this.a.onNext(object0);
            BackpressureHelper.produced(this, 1L);
            return;
        }
        if(this.c != 0) {
            this.onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }
}

