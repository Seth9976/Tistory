package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

public final class n extends AtomicReference implements FlowableSubscriber, Disposable {
    public final o a;

    public n(o o0) {
        this.a = o0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.lazySet(SubscriptionHelper.CANCELLED);
        o o0 = this.a;
        o0.e.delete(this);
        if(o0.e.size() == 0) {
            SubscriptionHelper.cancel(o0.g);
            o0.i = true;
            o0.b();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.lazySet(SubscriptionHelper.CANCELLED);
        SubscriptionHelper.cancel(this.a.g);
        this.a.e.delete(this);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        Collection collection0;
        o o0 = this.a;
        o0.getClass();
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(o0.b.call(), "The bufferSupplier returned a null Collection");
            publisher0 = (Publisher)ObjectHelper.requireNonNull(o0.d.apply(object0), "The bufferClose returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            SubscriptionHelper.cancel(o0.g);
            o0.onError(throwable0);
            return;
        }
        long v = o0.l;
        o0.l = v + 1L;
        synchronized(o0) {
            LinkedHashMap linkedHashMap0 = o0.m;
            if(linkedHashMap0 == null) {
                return;
            }
            linkedHashMap0.put(v, collection0);
        }
        p p0 = new p(o0, v);
        o0.e.add(p0);
        publisher0.subscribe(p0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

