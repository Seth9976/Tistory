package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class UnicastProcessor extends FlowableProcessor {
    public final SpscLinkedArrayQueue b;
    public final AtomicReference c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicReference g;
    public volatile boolean h;
    public final AtomicBoolean i;
    public final l j;
    public final AtomicLong k;
    public boolean l;

    public UnicastProcessor(int v) {
        this(v, null, true);
    }

    public UnicastProcessor(int v, Runnable runnable0, boolean z) {
        this.b = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(v, "capacityHint"));
        this.c = new AtomicReference(runnable0);
        this.d = z;
        this.g = new AtomicReference();
        this.i = new AtomicBoolean();
        this.j = new l(this);
        this.k = new AtomicLong();
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static UnicastProcessor create() {
        return new UnicastProcessor(0x80);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastProcessor create(int v) {
        return new UnicastProcessor(v);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastProcessor create(int v, Runnable runnable0) {
        ObjectHelper.requireNonNull(runnable0, "onTerminate");
        return new UnicastProcessor(v, runnable0, true);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastProcessor create(int v, Runnable runnable0, boolean z) {
        ObjectHelper.requireNonNull(runnable0, "onTerminate");
        return new UnicastProcessor(v, runnable0, z);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static UnicastProcessor create(boolean z) {
        return new UnicastProcessor(0x80, null, z);
    }

    public final boolean e(boolean z, boolean z1, boolean z2, Subscriber subscriber0, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        if(this.h) {
            spscLinkedArrayQueue0.clear();
            this.g.lazySet(null);
            return true;
        }
        if(z1) {
            if(z && this.f != null) {
                spscLinkedArrayQueue0.clear();
                this.g.lazySet(null);
                subscriber0.onError(this.f);
                return true;
            }
            if(z2) {
                Throwable throwable0 = this.f;
                this.g.lazySet(null);
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return true;
                }
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public final void f() {
        long v7;
        if(this.j.getAndIncrement() != 0) {
            return;
        }
        int v = 1;
        Subscriber subscriber0 = (Subscriber)this.g.get();
        int v1 = 1;
        while(true) {
            if(subscriber0 != null) {
                if(this.l) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
                    boolean z = this.d;
                    do {
                        if(this.h) {
                            this.g.lazySet(null);
                            return;
                        }
                        boolean z1 = this.e;
                        if(!z && z1 && this.f != null) {
                            spscLinkedArrayQueue0.clear();
                            this.g.lazySet(null);
                            subscriber0.onError(this.f);
                            return;
                        }
                        subscriber0.onNext(null);
                        if(z1) {
                            this.g.lazySet(null);
                            Throwable throwable0 = this.f;
                            if(throwable0 != null) {
                                subscriber0.onError(throwable0);
                                return;
                            }
                            subscriber0.onComplete();
                            return;
                        }
                        v = this.j.addAndGet(-v);
                    }
                    while(v != 0);
                    return;
                }
                SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.b;
                int v2 = !this.d;
                int v3 = 1;
            alab1:
                do {
                    long v4 = this.k.get();
                    long v5 = 0L;
                    int v6;
                    while((v6 = Long.compare(v4, v5)) != 0) {
                        boolean z2 = this.e;
                        Object object0 = spscLinkedArrayQueue1.poll();
                        v7 = v5;
                        if(this.e(((boolean)v2), z2, object0 == null, subscriber0, spscLinkedArrayQueue1)) {
                            break alab1;
                        }
                        if(object0 == null) {
                            goto label_46;
                        }
                        subscriber0.onNext(object0);
                        v5 = v7 + 1L;
                    }
                    v7 = v5;
                label_46:
                    if(v6 == 0 && this.e(((boolean)v2), this.e, spscLinkedArrayQueue1.isEmpty(), subscriber0, spscLinkedArrayQueue1)) {
                        break;
                    }
                    if(v7 != 0L && v4 != 0x7FFFFFFFFFFFFFFFL) {
                        this.k.addAndGet(-v7);
                    }
                    v3 = this.j.addAndGet(-v3);
                }
                while(v3 != 0);
                return;
            }
            v1 = this.j.addAndGet(-v1);
            if(v1 == 0) {
                return;
            }
            subscriber0 = (Subscriber)this.g.get();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.e ? this.f : null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.e && this.f == null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.g.get() != null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.e && this.f != null;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(!this.e && !this.h) {
            this.e = true;
            Runnable runnable0 = (Runnable)this.c.getAndSet(null);
            if(runnable0 != null) {
                runnable0.run();
            }
            this.f();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.e && !this.h) {
            this.f = throwable0;
            this.e = true;
            Runnable runnable0 = (Runnable)this.c.getAndSet(null);
            if(runnable0 != null) {
                runnable0.run();
            }
            this.f();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.e && !this.h) {
            this.b.offer(object0);
            this.f();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(!this.e && !this.h) {
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
            return;
        }
        subscription0.cancel();
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        if(!this.i.get() && this.i.compareAndSet(false, true)) {
            subscriber0.onSubscribe(this.j);
            this.g.set(subscriber0);
            if(this.h) {
                this.g.lazySet(null);
                return;
            }
            this.f();
            return;
        }
        EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), subscriber0);
    }
}

