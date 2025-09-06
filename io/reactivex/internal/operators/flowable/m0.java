package io.reactivex.internal.operators.flowable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class m0 extends SinglePostCompleteSubscriber implements MaybeObserver {
    public final AtomicReference a;
    public MaybeSource b;
    public boolean c;

    public m0(Subscriber subscriber0, MaybeSource maybeSource0) {
        super(subscriber0);
        this.b = maybeSource0;
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
    public final void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.a);
    }

    @Override  // io.reactivex.MaybeObserver, org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.c) {
            this.downstream.onComplete();
            return;
        }
        this.c = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        MaybeSource maybeSource0 = this.b;
        this.b = null;
        maybeSource0.subscribe(this);
    }

    @Override  // io.reactivex.MaybeObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.produced;
        this.downstream.onNext(object0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.a, disposable0);
    }
}

