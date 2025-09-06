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

public final class t2 extends AtomicLong implements Runnable, Subscription {
    public final Subscriber a;
    public final long b;
    public long c;
    public final AtomicReference d;

    public t2(Subscriber subscriber0, long v, long v1) {
        this.d = new AtomicReference();
        this.a = subscriber0;
        this.c = v;
        this.b = v1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        DisposableHelper.dispose(this.d);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this, v);
        }
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.d;
        Object object0 = atomicReference0.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            long v = this.get();
            Subscriber subscriber0 = this.a;
            if(Long.compare(v, 0L) == 0) {
                StringBuilder stringBuilder0 = new StringBuilder("Can\'t deliver value ");
                subscriber0.onError(new MissingBackpressureException(b.g(this.c, " due to lack of requests", stringBuilder0)));
                DisposableHelper.dispose(atomicReference0);
            }
            else {
                long v1 = this.c;
                subscriber0.onNext(v1);
                if(v1 == this.b) {
                    if(atomicReference0.get() != disposableHelper0) {
                        subscriber0.onComplete();
                    }
                    DisposableHelper.dispose(atomicReference0);
                    return;
                }
                this.c = v1 + 1L;
                if(v != 0x7FFFFFFFFFFFFFFFL) {
                    this.decrementAndGet();
                }
            }
        }
    }
}

