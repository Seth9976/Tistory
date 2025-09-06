package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;

public final class l6 extends DisposableSubscriber {
    public final m6 b;
    public final UnicastProcessor c;
    public boolean d;

    public l6(m6 m60, UnicastProcessor unicastProcessor0) {
        this.b = m60;
        this.c = unicastProcessor0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.b.d0(this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.b.f0(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.cancel();
        this.onComplete();
    }
}

