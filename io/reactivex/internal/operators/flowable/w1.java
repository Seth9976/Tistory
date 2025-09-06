package io.reactivex.internal.operators.flowable;

import dd.q;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

public final class w1 extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final CompletableObserver a;
    public final AtomicThrowable b;
    public final Function c;
    public final boolean d;
    public final CompositeDisposable e;
    public final int f;
    public Subscription g;
    public volatile boolean h;

    public w1(CompletableObserver completableObserver0, Function function0, boolean z, int v) {
        this.a = completableObserver0;
        this.c = function0;
        this.d = z;
        this.b = new AtomicThrowable();
        this.e = new CompositeDisposable();
        this.f = v;
        this.lazySet(1);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.h = true;
        this.g.cancel();
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.decrementAndGet() == 0) {
            Throwable throwable0 = this.b.terminate();
            CompletableObserver completableObserver0 = this.a;
            if(throwable0 != null) {
                completableObserver0.onError(throwable0);
                return;
            }
            completableObserver0.onComplete();
            return;
        }
        if(this.f != 0x7FFFFFFF) {
            this.g.request(1L);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.b;
        if(atomicThrowable0.addThrowable(throwable0)) {
            CompletableObserver completableObserver0 = this.a;
            if(this.d) {
                if(this.decrementAndGet() == 0) {
                    completableObserver0.onError(atomicThrowable0.terminate());
                    return;
                }
                if(this.f != 0x7FFFFFFF) {
                    this.g.request(1L);
                }
            }
            else {
                this.dispose();
                if(this.getAndSet(0) > 0) {
                    completableObserver0.onError(atomicThrowable0.terminate());
                }
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        CompletableSource completableSource0;
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.c.apply(object0), "The mapper returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.g.cancel();
            this.onError(throwable0);
            return;
        }
        this.getAndIncrement();
        q q0 = new q(this, 2);
        if(!this.h && this.e.add(q0)) {
            completableSource0.subscribe(q0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            int v = this.f;
            if(v == 0x7FFFFFFF) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            subscription0.request(((long)v));
        }
    }
}

