package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class n5 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Function b;
    public final int c;
    public final boolean d;
    public volatile boolean e;
    public final AtomicThrowable f;
    public volatile boolean g;
    public Subscription h;
    public final AtomicReference i;
    public final AtomicLong j;
    public volatile long k;
    public static final m5 l;

    static {
        m5 m50 = new m5(null, -1L, 1);
        n5.l = m50;
        SubscriptionHelper.cancel(m50);
    }

    public n5(int v, Function function0, Subscriber subscriber0, boolean z) {
        this.i = new AtomicReference();
        this.j = new AtomicLong();
        this.a = subscriber0;
        this.b = function0;
        this.c = v;
        this.d = z;
        this.f = new AtomicThrowable();
    }

    public final void a() {
        AtomicReference atomicReference0 = this.i;
        m5 m50 = (m5)atomicReference0.get();
        m5 m51 = n5.l;
        if(m50 != m51) {
            m5 m52 = (m5)atomicReference0.getAndSet(m51);
            if(m52 != m51 && m52 != null) {
                SubscriptionHelper.cancel(m52);
            }
        }
    }

    public final void b() {
        Object object0;
        boolean z1;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        int v = 1;
        while(true) {
            if(this.g) {
                return;
            }
            if(this.e) {
                if(!this.d) {
                    if(((Throwable)this.f.get()) != null) {
                        this.a();
                        subscriber0.onError(this.f.terminate());
                        return;
                    }
                    if(this.i.get() == null) {
                        subscriber0.onComplete();
                        return;
                    }
                }
                else if(this.i.get() == null) {
                    if(((Throwable)this.f.get()) != null) {
                        subscriber0.onError(this.f.terminate());
                        return;
                    }
                    subscriber0.onComplete();
                    return;
                }
            }
            m5 m50 = (m5)this.i.get();
            SimpleQueue simpleQueue0 = m50 == null ? null : m50.d;
            if(simpleQueue0 == null) {
            label_82:
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
            else {
                if(m50.e) {
                    if(!this.d) {
                        if(((Throwable)this.f.get()) != null) {
                            this.a();
                            subscriber0.onError(this.f.terminate());
                            return;
                        }
                        if(simpleQueue0.isEmpty()) {
                            AtomicReference atomicReference0 = this.i;
                            while(!atomicReference0.compareAndSet(m50, null) && atomicReference0.get() == m50) {
                            }
                            continue;
                        }
                    }
                    else if(simpleQueue0.isEmpty()) {
                        AtomicReference atomicReference1 = this.i;
                        while(!atomicReference1.compareAndSet(m50, null) && atomicReference1.get() == m50) {
                        }
                        continue;
                    }
                }
                boolean z = false;
                long v1 = this.j.get();
                long v2 = 0L;
                while(v2 != v1) {
                    try {
                        if(this.g) {
                            return;
                        }
                        z1 = m50.e;
                        object0 = simpleQueue0.poll();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        SubscriptionHelper.cancel(m50);
                        this.f.addThrowable(throwable0);
                        z1 = true;
                        object0 = null;
                    }
                    if(m50 != this.i.get()) {
                    label_75:
                        z = true;
                        break;
                    }
                    if(z1) {
                        if(!this.d) {
                            if(((Throwable)this.f.get()) != null) {
                                subscriber0.onError(this.f.terminate());
                                return;
                            }
                            if(object0 == null) {
                                AtomicReference atomicReference2 = this.i;
                                while(!atomicReference2.compareAndSet(m50, null) && atomicReference2.get() == m50) {
                                }
                                goto label_75;
                            }
                        }
                        else if(object0 == null) {
                            AtomicReference atomicReference3 = this.i;
                            while(!atomicReference3.compareAndSet(m50, null) && atomicReference3.get() == m50) {
                            }
                            goto label_75;
                        }
                    }
                    if(object0 == null) {
                        break;
                    }
                    subscriber0.onNext(object0);
                    ++v2;
                }
                if(v2 != 0L && !this.g) {
                    if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.j.addAndGet(-v2);
                    }
                    if(m50.f != 1) {
                        ((Subscription)m50.get()).request(v2);
                    }
                }
                if(!z) {
                    goto label_82;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.g) {
            this.g = true;
            this.h.cancel();
            this.a();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.e) {
            return;
        }
        this.e = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(!this.e && this.f.addThrowable(throwable0)) {
            if(!this.d) {
                this.a();
            }
            this.e = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        if(this.e) {
            return;
        }
        long v = this.k + 1L;
        this.k = v;
        m5 m50 = (m5)this.i.get();
        if(m50 != null) {
            SubscriptionHelper.cancel(m50);
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The publisher returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.h.cancel();
            this.onError(throwable0);
            return;
        }
        m5 m51 = new m5(this, v, this.c);
        m5 m52;
        while((m52 = (m5)this.i.get()) != n5.l) {
            AtomicReference atomicReference0 = this.i;
        label_18:
            if(atomicReference0.compareAndSet(m52, m51)) {
                publisher0.subscribe(m51);
                return;
            }
            if(atomicReference0.get() != m52) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_18;
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.h, subscription0)) {
            this.h = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.j, v);
            if(this.k == 0L) {
                this.h.request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            this.b();
        }
    }
}

