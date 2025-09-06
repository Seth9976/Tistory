package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class SubscriberCompletableObserver implements CompletableObserver, Subscription {
    public final Subscriber a;
    public Disposable b;

    public SubscriberCompletableObserver(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.b.dispose();
    }

    @Override  // io.reactivex.CompletableObserver
    public void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.b, disposable0)) {
            this.b = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
    }
}

