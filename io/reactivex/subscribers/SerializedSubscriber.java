package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class SerializedSubscriber implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final boolean b;
    public Subscription c;
    public boolean d;
    public AppendOnlyLinkedArrayList e;
    public volatile boolean f;

    public SerializedSubscriber(Subscriber subscriber0) {
        this(subscriber0, false);
    }

    public SerializedSubscriber(Subscriber subscriber0, boolean z) {
        this.a = subscriber0;
        this.b = z;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.f) {
            return;
        }
        synchronized(this) {
            if(this.f) {
                return;
            }
            if(this.d) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.e = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(NotificationLite.complete());
                return;
            }
            this.f = true;
            this.d = true;
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.f) {
                if(this.d) {
                    this.f = true;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    Object object0 = NotificationLite.error(throwable0);
                    if(this.b) {
                        appendOnlyLinkedArrayList0.add(object0);
                    }
                    else {
                        appendOnlyLinkedArrayList0.setFirst(object0);
                    }
                    return;
                }
                this.f = true;
                this.d = true;
                z = false;
            }
        }
        if(z) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.f) {
            return;
        }
        if(object0 == null) {
            this.c.cancel();
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized(this) {
            if(!this.f) {
                if(this.d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.add(object0);
                    return;
                }
                goto label_16;
            }
            return;
        }
        return;
    label_16:
        this.d = true;
        this.a.onNext(object0);
        do {
            synchronized(this) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList1 = this.e;
                if(appendOnlyLinkedArrayList1 == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        }
        while(!appendOnlyLinkedArrayList1.accept(this.a));
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        this.c.request(v);
    }
}

