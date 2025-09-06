package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

public final class f extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final CompletableObserver a;
    public final int b;
    public final int c;
    public final e d;
    public final AtomicBoolean e;
    public int f;
    public int g;
    public SimpleQueue h;
    public Subscription i;
    public volatile boolean j;
    public volatile boolean k;

    public f(CompletableObserver completableObserver0, int v) {
        this.a = completableObserver0;
        this.b = v;
        this.d = new e(this, 0);
        this.e = new AtomicBoolean();
        this.c = v - (v >> 2);
    }

    public final void a() {
        CompletableSource completableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        do {
            if(this.isDisposed()) {
                return;
            }
            if(!this.k) {
                try {
                    boolean z = this.j;
                    completableSource0 = (CompletableSource)this.h.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    if(this.e.compareAndSet(false, true)) {
                        this.i.cancel();
                        this.a.onError(throwable0);
                        return;
                    }
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                if(z && completableSource0 == null) {
                    if(this.e.compareAndSet(false, true)) {
                        this.a.onComplete();
                    }
                    return;
                }
                if(completableSource0 != null) {
                    this.k = true;
                    completableSource0.subscribe(this.d);
                    if(this.f != 1) {
                        int v = this.g + 1;
                        if(v == this.c) {
                            this.g = 0;
                            this.i.request(((long)v));
                        }
                        else {
                            this.g = v;
                        }
                    }
                }
            }
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.i.cancel();
        DisposableHelper.dispose(this.d);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.d.get()));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.d);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.f == 0 && !this.h.offer(((CompletableSource)object0))) {
            this.onError(new MissingBackpressureException());
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.i, subscription0)) {
            this.i = subscription0;
            long v = this.b == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)this.b);
            if(subscription0 instanceof QueueSubscription) {
                int v1 = ((QueueSubscription)subscription0).requestFusion(3);
                if(v1 == 1) {
                    this.f = 1;
                    this.h = (QueueSubscription)subscription0;
                    this.j = true;
                    this.a.onSubscribe(this);
                    this.a();
                    return;
                }
                if(v1 == 2) {
                    this.f = 2;
                    this.h = (QueueSubscription)subscription0;
                    this.a.onSubscribe(this);
                    subscription0.request(v);
                    return;
                }
            }
            this.h = this.b == 0x7FFFFFFF ? new SpscLinkedArrayQueue(0x80) : new SpscArrayQueue(this.b);
            this.a.onSubscribe(this);
            subscription0.request(v);
        }
    }
}

