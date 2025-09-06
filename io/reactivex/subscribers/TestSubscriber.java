package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ld.a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class TestSubscriber extends BaseTestConsumer implements FlowableSubscriber, Disposable, Subscription {
    public final Subscriber a;
    public volatile boolean b;
    public final AtomicReference c;
    public final AtomicLong d;
    public QueueSubscription e;

    public TestSubscriber() {
        this(a.a, 0x7FFFFFFFFFFFFFFFL);
    }

    public TestSubscriber(long v) {
        this(a.a, v);
    }

    public TestSubscriber(Subscriber subscriber0) {
        this(subscriber0, 0x7FFFFFFFFFFFFFFFL);
    }

    public TestSubscriber(Subscriber subscriber0, long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.a = subscriber0;
        this.c = new AtomicReference();
        this.d = new AtomicLong(v);
    }

    @Override  // io.reactivex.observers.BaseTestConsumer
    public BaseTestConsumer assertNotSubscribed() {
        return this.assertNotSubscribed();
    }

    public final TestSubscriber assertNotSubscribed() {
        if(this.c.get() != null) {
            throw this.fail("Subscribed!");
        }
        if(!this.errors.isEmpty()) {
            throw this.fail("Not subscribed but errors found");
        }
        return this;
    }

    public final TestSubscriber assertOf(Consumer consumer0) {
        try {
            consumer0.accept(this);
            return this;
        }
        catch(Throwable throwable0) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @Override  // io.reactivex.observers.BaseTestConsumer
    public BaseTestConsumer assertSubscribed() {
        return this.assertSubscribed();
    }

    public final TestSubscriber assertSubscribed() {
        if(this.c.get() == null) {
            throw this.fail("Not subscribed!");
        }
        return this;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.b) {
            this.b = true;
            SubscriptionHelper.cancel(this.c);
        }
    }

    public static TestSubscriber create() {
        return new TestSubscriber();
    }

    public static TestSubscriber create(long v) {
        return new TestSubscriber(v);
    }

    public static TestSubscriber create(Subscriber subscriber0) {
        return new TestSubscriber(subscriber0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.cancel();
    }

    public final boolean hasSubscription() {
        return this.c.get() != null;
    }

    public final boolean isCancelled() {
        return this.b;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.c.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.errors.add(illegalStateException0);
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            ++this.completions;
            this.a.onComplete();
        }
        finally {
            this.done.countDown();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.c.get() == null) {
                NullPointerException nullPointerException0 = new NullPointerException("onSubscribe not called in proper order");
                this.errors.add(nullPointerException0);
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(throwable0);
            if(throwable0 == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onError received a null Throwable");
                this.errors.add(illegalStateException0);
            }
            this.a.onError(throwable0);
        }
        finally {
            this.done.countDown();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.c.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.errors.add(illegalStateException0);
            }
        }
        this.lastThread = Thread.currentThread();
        if(this.establishedFusionMode == 2) {
            while(true) {
                try {
                    Object object1 = this.e.poll();
                    if(object1 == null) {
                        break;
                    }
                    this.values.add(object1);
                }
                catch(Throwable throwable0) {
                    this.errors.add(throwable0);
                    this.e.cancel();
                    break;
                }
            }
            return;
        }
        this.values.add(object0);
        if(object0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onNext received a null value");
            this.errors.add(nullPointerException0);
        }
        this.a.onNext(object0);
    }

    public void onStart() {
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        this.lastThread = Thread.currentThread();
        if(subscription0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onSubscribe received a null Subscription");
            this.errors.add(nullPointerException0);
            return;
        }
        AtomicReference atomicReference0 = this.c;
        do {
            if(atomicReference0.compareAndSet(null, subscription0)) {
                int v = this.initialFusionMode;
                if(v != 0 && subscription0 instanceof QueueSubscription) {
                    this.e = (QueueSubscription)subscription0;
                    int v1 = ((QueueSubscription)subscription0).requestFusion(v);
                    this.establishedFusionMode = v1;
                    if(v1 == 1) {
                        this.checkSubscriptionOnce = true;
                        this.lastThread = Thread.currentThread();
                        try {
                            Object object0;
                            while((object0 = this.e.poll()) != null) {
                                this.values.add(object0);
                            }
                            ++this.completions;
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                        this.errors.add(throwable0);
                        return;
                    }
                }
                this.a.onSubscribe(subscription0);
                long v2 = this.d.getAndSet(0L);
                if(v2 != 0L) {
                    subscription0.request(v2);
                }
                return;
            }
        }
        while(atomicReference0.get() == null);
        subscription0.cancel();
        if(atomicReference0.get() != SubscriptionHelper.CANCELLED) {
            IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe received multiple subscriptions: " + subscription0);
            this.errors.add(illegalStateException0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.c, this.d, v);
    }

    public final TestSubscriber requestMore(long v) {
        this.request(v);
        return this;
    }
}

