package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d6 extends AtomicReference implements Runnable, Subscription {
    public final Subscriber a;
    public volatile boolean b;

    public d6(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        DisposableHelper.dispose(this);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            this.b = true;
        }
    }

    @Override
    public final void run() {
        if(this.get() != DisposableHelper.DISPOSED) {
            if(this.b) {
                this.a.onNext(0L);
                this.lazySet(EmptyDisposable.INSTANCE);
                this.a.onComplete();
                return;
            }
            this.lazySet(EmptyDisposable.INSTANCE);
            MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Can\'t deliver value due to lack of requests");
            this.a.onError(missingBackpressureException0);
        }
    }
}

