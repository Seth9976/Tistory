package io.reactivex.internal.operators.flowable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d2 implements Observer, Subscription {
    public final Subscriber a;
    public Disposable b;

    public d2(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        this.b = disposable0;
        this.a.onSubscribe(this);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
    }
}

