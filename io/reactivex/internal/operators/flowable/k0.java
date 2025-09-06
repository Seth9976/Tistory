package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k0 extends AtomicInteger implements FlowableSubscriber, InnerQueuedSubscriberSupport, Subscription {
    public final Subscriber a;
    public final Function b;
    public final int c;
    public final int d;
    public final ErrorMode e;
    public final AtomicThrowable f;
    public final AtomicLong g;
    public final SpscLinkedArrayQueue h;
    public Subscription i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile InnerQueuedSubscriber l;

    public k0(int v, int v1, Function function0, ErrorMode errorMode0, Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = function0;
        this.c = v;
        this.d = v1;
        this.e = errorMode0;
        this.h = new SpscLinkedArrayQueue(Math.min(v1, v));
        this.f = new AtomicThrowable();
        this.g = new AtomicLong();
    }

    public final void a() {
        InnerQueuedSubscriber innerQueuedSubscriber0 = this.l;
        this.l = null;
        if(innerQueuedSubscriber0 != null) {
            innerQueuedSubscriber0.cancel();
        }
        InnerQueuedSubscriber innerQueuedSubscriber1;
        while((innerQueuedSubscriber1 = (InnerQueuedSubscriber)this.h.poll()) != null) {
            innerQueuedSubscriber1.cancel();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.j) {
            return;
        }
        this.j = true;
        this.i.cancel();
        if(this.getAndIncrement() == 0) {
            while(true) {
                this.a();
                if(this.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
    public final void drain() {
        boolean z1;
        Object object0;
        int v4;
        long v2;
        InnerQueuedSubscriber innerQueuedSubscriber1;
        if(this.getAndIncrement() != 0) {
            return;
        }
        InnerQueuedSubscriber innerQueuedSubscriber0 = this.l;
        Subscriber subscriber0 = this.a;
        ErrorMode errorMode0 = this.e;
        int v = 1;
        while(true) {
            long v1 = this.g.get();
            if(innerQueuedSubscriber0 == null) {
                if(errorMode0 != ErrorMode.END && ((Throwable)this.f.get()) != null) {
                    this.a();
                    subscriber0.onError(this.f.terminate());
                    return;
                }
                boolean z = this.k;
                innerQueuedSubscriber1 = (InnerQueuedSubscriber)this.h.poll();
                if(z && innerQueuedSubscriber1 == null) {
                    Throwable throwable0 = this.f.terminate();
                    if(throwable0 != null) {
                        subscriber0.onError(throwable0);
                        return;
                    }
                    subscriber0.onComplete();
                    return;
                }
                if(innerQueuedSubscriber1 != null) {
                    this.l = innerQueuedSubscriber1;
                }
            }
            else {
                innerQueuedSubscriber1 = innerQueuedSubscriber0;
            }
            if(innerQueuedSubscriber1 == null) {
                v4 = v;
                z1 = false;
                v2 = 0L;
            }
            else {
                SimpleQueue simpleQueue0 = innerQueuedSubscriber1.queue();
                if(simpleQueue0 == null) {
                    v4 = v;
                    z1 = false;
                    v2 = 0L;
                }
                else {
                    v2 = 0L;
                    while(true) {
                        int v3 = Long.compare(v2, v1);
                        v4 = v;
                        if(v3 != 0) {
                            if(this.j) {
                                this.a();
                                return;
                            }
                            if(errorMode0 == ErrorMode.IMMEDIATE && ((Throwable)this.f.get()) != null) {
                                this.l = null;
                                innerQueuedSubscriber1.cancel();
                                this.a();
                                subscriber0.onError(this.f.terminate());
                                return;
                            }
                            try {
                                object0 = simpleQueue0.poll();
                            }
                            catch(Throwable throwable1) {
                                Exceptions.throwIfFatal(throwable1);
                                this.l = null;
                                innerQueuedSubscriber1.cancel();
                                this.a();
                                subscriber0.onError(throwable1);
                                return;
                            }
                            if(innerQueuedSubscriber1.isDone() && object0 == null) {
                                this.l = null;
                                this.i.request(1L);
                                innerQueuedSubscriber1 = null;
                                z1 = true;
                                break;
                            }
                            else if(object0 != null) {
                                subscriber0.onNext(object0);
                                ++v2;
                                innerQueuedSubscriber1.requestOne();
                                v = v4;
                                continue;
                            }
                        }
                        z1 = false;
                        break;
                    }
                    if(v3 == 0) {
                        if(this.j) {
                            this.a();
                            return;
                        }
                        if(errorMode0 == ErrorMode.IMMEDIATE && ((Throwable)this.f.get()) != null) {
                            this.l = null;
                            innerQueuedSubscriber1.cancel();
                            this.a();
                            subscriber0.onError(this.f.terminate());
                            return;
                        }
                        if(innerQueuedSubscriber1.isDone() && simpleQueue0.isEmpty()) {
                            this.l = null;
                            this.i.request(1L);
                            innerQueuedSubscriber1 = null;
                            z1 = true;
                        }
                    }
                }
            }
            if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                this.g.addAndGet(-v2);
            }
            if(z1) {
                innerQueuedSubscriber0 = innerQueuedSubscriber1;
                v = v4;
            }
            else {
                v = this.addAndGet(-v4);
                if(v == 0) {
                    return;
                }
                innerQueuedSubscriber0 = innerQueuedSubscriber1;
            }
        }
    }

    @Override  // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
    public final void innerComplete(InnerQueuedSubscriber innerQueuedSubscriber0) {
        innerQueuedSubscriber0.setDone();
        this.drain();
    }

    @Override  // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
    public final void innerError(InnerQueuedSubscriber innerQueuedSubscriber0, Throwable throwable0) {
        if(this.f.addThrowable(throwable0)) {
            innerQueuedSubscriber0.setDone();
            if(this.e != ErrorMode.END) {
                this.i.cancel();
            }
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
    public final void innerNext(InnerQueuedSubscriber innerQueuedSubscriber0, Object object0) {
        if(innerQueuedSubscriber0.queue().offer(object0)) {
            this.drain();
            return;
        }
        innerQueuedSubscriber0.cancel();
        this.innerError(innerQueuedSubscriber0, new MissingBackpressureException());
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.k = true;
        this.drain();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f.addThrowable(throwable0)) {
            this.k = true;
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.i.cancel();
            this.onError(throwable0);
            return;
        }
        InnerQueuedSubscriber innerQueuedSubscriber0 = new InnerQueuedSubscriber(this, this.d);
        if(this.j) {
            return;
        }
        this.h.offer(innerQueuedSubscriber0);
        publisher0.subscribe(innerQueuedSubscriber0);
        if(this.j) {
            innerQueuedSubscriber0.cancel();
            if(this.getAndIncrement() == 0) {
                while(true) {
                    this.a();
                    if(this.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.i, subscription0)) {
            this.i = subscription0;
            this.a.onSubscribe(this);
            subscription0.request((this.c == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)this.c)));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.g, v);
            this.drain();
        }
    }
}

