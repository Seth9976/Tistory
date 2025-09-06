package io.reactivex.internal.operators.flowable;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class n0 extends SinglePostCompleteSubscriber implements SingleObserver {
    public final AtomicReference a;
    public SingleSource b;

    public n0(Subscriber subscriber0, SingleSource singleSource0) {
        super(subscriber0);
        this.b = singleSource0;
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
    public final void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.a);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.upstream = SubscriptionHelper.CANCELLED;
        SingleSource singleSource0 = this.b;
        this.b = null;
        singleSource0.subscribe(this);
    }

    @Override  // io.reactivex.SingleObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.produced;
        this.downstream.onNext(object0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.a, disposable0);
    }
}

