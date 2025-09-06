package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import org.reactivestreams.Subscription;

public final class v2 implements FlowableSubscriber, Disposable {
    public final int a;
    public Subscription b;
    public final Object c;
    public Object d;

    public v2(MaybeObserver maybeObserver0) {
        this.a = 0;
        super();
        this.c = maybeObserver0;
    }

    public v2(MaybeObserver maybeObserver0, MaybeSource maybeSource0) {
        this.a = 2;
        super();
        this.c = new m(maybeObserver0, 0);
        this.d = maybeSource0;
    }

    public v2(SingleObserver singleObserver0, Collection collection0) {
        this.a = 1;
        super();
        this.c = singleObserver0;
        this.d = collection0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.b.cancel();
                this.b = SubscriptionHelper.CANCELLED;
                return;
            }
            case 1: {
                this.b.cancel();
                this.b = SubscriptionHelper.CANCELLED;
                return;
            }
            default: {
                this.b.cancel();
                this.b = SubscriptionHelper.CANCELLED;
                DisposableHelper.dispose(((m)this.c));
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.b == SubscriptionHelper.CANCELLED;
            }
            case 1: {
                return this.b == SubscriptionHelper.CANCELLED;
            }
            default: {
                return DisposableHelper.isDisposed(((Disposable)((m)this.c).get()));
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.b = SubscriptionHelper.CANCELLED;
                Object object0 = this.d;
                MaybeObserver maybeObserver0 = (MaybeObserver)this.c;
                if(object0 != null) {
                    this.d = null;
                    maybeObserver0.onSuccess(object0);
                    return;
                }
                maybeObserver0.onComplete();
                return;
            }
            case 1: {
                this.b = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.c).onSuccess(((Collection)this.d));
                return;
            }
            default: {
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(this.b != subscriptionHelper0) {
                    this.b = subscriptionHelper0;
                    MaybeSource maybeSource0 = (MaybeSource)this.d;
                    this.d = null;
                    maybeSource0.subscribe(((m)this.c));
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b = SubscriptionHelper.CANCELLED;
                this.d = null;
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            case 1: {
                this.d = null;
                this.b = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.c).onError(throwable0);
                return;
            }
            default: {
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(this.b != subscriptionHelper0) {
                    this.b = subscriptionHelper0;
                    ((m)this.c).b.onError(throwable0);
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
                this.d = object0;
                return;
            }
            case 1: {
                ((Collection)this.d).add(object0);
                return;
            }
            default: {
                Subscription subscription0 = this.b;
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(subscription0 != subscriptionHelper0) {
                    subscription0.cancel();
                    this.b = subscriptionHelper0;
                    MaybeSource maybeSource0 = (MaybeSource)this.d;
                    this.d = null;
                    maybeSource0.subscribe(((m)this.c));
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.validate(this.b, subscription0)) {
                    this.b = subscription0;
                    ((MaybeObserver)this.c).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.b, subscription0)) {
                    this.b = subscription0;
                    ((SingleObserver)this.c).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            default: {
                if(SubscriptionHelper.validate(this.b, subscription0)) {
                    this.b = subscription0;
                    ((m)this.c).b.onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
            }
        }
    }
}

