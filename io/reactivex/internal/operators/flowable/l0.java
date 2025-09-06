package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l0 extends AtomicReference implements CompletableObserver, FlowableSubscriber, Subscription {
    public final Subscriber a;
    public Subscription b;
    public CompletableSource c;
    public boolean d;

    public l0(Subscriber subscriber0, CompletableSource completableSource0) {
        this.a = subscriber0;
        this.c = completableSource0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b.cancel();
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            this.a.onComplete();
            return;
        }
        this.d = true;
        this.b = SubscriptionHelper.CANCELLED;
        CompletableSource completableSource0 = this.c;
        this.c = null;
        completableSource0.subscribe(this);
    }

    @Override  // io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.b.request(v);
    }
}

