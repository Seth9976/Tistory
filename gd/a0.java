package gd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.d1;
import io.reactivex.internal.operators.flowable.h5;
import io.reactivex.internal.operators.flowable.s5;
import io.reactivex.internal.operators.maybe.g0;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.internal.operators.maybe.y;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class a0 extends AtomicReference implements FlowableSubscriber {
    public final int a;
    public final Serializable b;

    public a0(Number number0, int v) {
        this.a = v;
        this.b = number0;
        super();
    }

    public a0(AtomicReference atomicReference0, int v) {
        this.a = v;
        super();
        this.b = atomicReference0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                Object object0 = this.get();
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(object0 != subscriptionHelper0) {
                    this.lazySet(subscriptionHelper0);
                    CancellationException cancellationException0 = new CancellationException();
                    ((h)this.b).a(cancellationException0);
                }
                return;
            }
            case 1: {
                if(((Subscription)this.get()) != SubscriptionHelper.CANCELLED) {
                    ((d1)this.b).b.subscribe(((d1)this.b));
                }
                return;
            }
            case 2: {
                ((h5)this.b).f = true;
                return;
            }
            case 3: {
                SubscriptionHelper.cancel(((s5)this.b).c);
                HalfSerializer.onComplete(((s5)this.b).a, ((s5)this.b), ((s5)this.b).d);
                return;
            }
            case 4: {
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onComplete();
                }
                return;
            }
            default: {
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    MaybeSource maybeSource0 = g00.c;
                    if(maybeSource0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        g00.b.onError(timeoutException0);
                        return;
                    }
                    maybeSource0.subscribe(((m)g00.e));
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((h)this.b).a(throwable0);
                return;
            }
            case 1: {
                if(((Subscription)this.get()) != SubscriptionHelper.CANCELLED) {
                    ((d1)this.b).a.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 2: {
                SubscriptionHelper.cancel(((h5)this.b).b);
                HalfSerializer.onError(((h5)this.b).a, throwable0, ((h5)this.b), ((h5)this.b).e);
                return;
            }
            case 3: {
                SubscriptionHelper.cancel(((s5)this.b).c);
                HalfSerializer.onError(((s5)this.b).a, throwable0, ((s5)this.b), ((s5)this.b).d);
                return;
            }
            case 4: {
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    g00.b.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.cancel(this)) {
                    CancellationException cancellationException0 = new CancellationException();
                    ((h)this.b).a(cancellationException0);
                }
                return;
            }
            case 1: {
                Subscription subscription0 = (Subscription)this.get();
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(subscription0 != subscriptionHelper0) {
                    this.lazySet(subscriptionHelper0);
                    subscription0.cancel();
                    ((d1)this.b).b.subscribe(((d1)this.b));
                }
                return;
            }
            case 2: {
                ((h5)this.b).f = true;
                ((Subscription)this.get()).cancel();
                return;
            }
            case 3: {
                SubscriptionHelper.cancel(this);
                this.onComplete();
                return;
            }
            case 4: {
                SubscriptionHelper.cancel(this);
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onComplete();
                }
                return;
            }
            default: {
                ((Subscription)this.get()).cancel();
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    MaybeSource maybeSource0 = g00.c;
                    if(maybeSource0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        g00.b.onError(timeoutException0);
                        return;
                    }
                    maybeSource0.subscribe(((m)g00.e));
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
                return;
            }
            case 1: {
                if(SubscriptionHelper.setOnce(this, subscription0)) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            case 2: {
                SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
                return;
            }
            case 3: {
                SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
                return;
            }
            case 4: {
                SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
                return;
            }
            default: {
                SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
            }
        }
    }
}

