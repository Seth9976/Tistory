package io.reactivex.internal.operators.flowable;

import a5.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class s2 extends AtomicLong implements Runnable, Subscription {
    public final Subscriber a;
    public long b;
    public final AtomicReference c;

    public s2(Subscriber subscriber0) {
        this.c = new AtomicReference();
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        DisposableHelper.dispose(this.c);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this, v);
        }
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.c;
        if(atomicReference0.get() != DisposableHelper.DISPOSED) {
            int v = Long.compare(this.get(), 0L);
            Subscriber subscriber0 = this.a;
            if(v != 0) {
                long v1 = this.b;
                this.b = v1 + 1L;
                subscriber0.onNext(v1);
                BackpressureHelper.produced(this, 1L);
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder("Can\'t deliver value ");
            subscriber0.onError(new MissingBackpressureException(b.g(this.b, " due to lack of requests", stringBuilder0)));
            DisposableHelper.dispose(atomicReference0);
        }
    }
}

