package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class m6 extends QueueDrainSubscriber implements Subscription {
    public final Publisher n;
    public final Function o;
    public final int p;
    public final CompositeDisposable q;
    public Subscription r;
    public final AtomicReference s;
    public final ArrayList t;
    public final AtomicLong u;
    public final AtomicBoolean v;

    public m6(SerializedSubscriber serializedSubscriber0, Publisher publisher0, Function function0, int v) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.s = new AtomicReference();
        AtomicLong atomicLong0 = new AtomicLong();
        this.u = atomicLong0;
        this.v = new AtomicBoolean();
        this.n = publisher0;
        this.o = function0;
        this.p = v;
        this.q = new CompositeDisposable();
        this.t = new ArrayList();
        atomicLong0.lazySet(1L);
    }

    @Override  // io.reactivex.internal.subscribers.QueueDrainSubscriber
    public final boolean accept(Subscriber subscriber0, Object object0) {
        return false;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.v.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.s);
            if(this.u.decrementAndGet() == 0L) {
                this.r.cancel();
            }
        }
    }

    public final void d0(l6 l60) {
        this.q.delete(l60);
        n6 n60 = new n6(l60.c, null);
        this.queue.offer(n60);
        if(this.enter()) {
            this.e0();
        }
    }

    public final void e0() {
        Iterator iterator2;
        l6 l60;
        Publisher publisher0;
        n6 n60;
        Object object0;
        SimplePlainQueue simplePlainQueue0 = this.queue;
        Subscriber subscriber0 = this.downstream;
        ArrayList arrayList0 = this.t;
        int v = 1;
        while(true) {
            while(true) {
                while(true) {
                    do {
                        while(true) {
                            while(true) {
                            label_4:
                                boolean z = this.done;
                                object0 = simplePlainQueue0.poll();
                                if(z && object0 == null) {
                                    this.q.dispose();
                                    DisposableHelper.dispose(this.s);
                                    Throwable throwable0 = this.error;
                                    if(throwable0 == null) {
                                        for(Object object2: arrayList0) {
                                            ((UnicastProcessor)object2).onComplete();
                                        }
                                    }
                                    else {
                                        for(Object object1: arrayList0) {
                                            ((UnicastProcessor)object1).onError(throwable0);
                                        }
                                    }
                                    arrayList0.clear();
                                    return;
                                }
                                if(object0 != null) {
                                    break;
                                }
                                v = this.leave(-v);
                                if(v == 0) {
                                    return;
                                }
                            }
                            if(object0 instanceof n6) {
                                n60 = (n6)object0;
                                UnicastProcessor unicastProcessor0 = n60.a;
                                if(unicastProcessor0 == null) {
                                    goto label_39;
                                }
                                else {
                                    if(!arrayList0.remove(unicastProcessor0)) {
                                        goto label_4;
                                    }
                                    break;
                                }
                            }
                            goto label_64;
                        }
                        n60.a.onComplete();
                    }
                    while(this.u.decrementAndGet() != 0L);
                    this.q.dispose();
                    DisposableHelper.dispose(this.s);
                    return;
                label_39:
                    if(!this.v.get()) {
                        UnicastProcessor unicastProcessor1 = UnicastProcessor.create(this.p);
                        long v1 = this.requested();
                        if(v1 == 0L) {
                            goto label_58;
                        }
                        else {
                            arrayList0.add(unicastProcessor1);
                            subscriber0.onNext(unicastProcessor1);
                            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                                this.produced(1L);
                            }
                            try {
                                publisher0 = (Publisher)ObjectHelper.requireNonNull(this.o.apply(n60.b), "The publisher supplied is null");
                            }
                            catch(Throwable throwable1) {
                                this.cancel();
                                subscriber0.onError(throwable1);
                                goto label_4;
                            }
                            l60 = new l6(this, unicastProcessor1);
                            if(!this.q.add(l60)) {
                                goto label_4;
                            }
                            break;
                        }
                    }
                }
                this.u.getAndIncrement();
                publisher0.subscribe(l60);
                goto label_4;
            label_58:
                this.cancel();
                subscriber0.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
            }
            iterator2 = arrayList0.iterator();
            goto label_65;
        label_64:
            iterator2 = arrayList0.iterator();
        label_65:
            if(!iterator2.hasNext()) {
                goto label_4;
            }
            break;
        }
        Object object3 = iterator2.next();
        ((UnicastProcessor)object3).onNext(object0);
        goto label_65;
    }

    public final void f0(Throwable throwable0) {
        this.r.cancel();
        this.q.dispose();
        DisposableHelper.dispose(this.s);
        this.downstream.onError(throwable0);
    }

    public final void g0(Object object0) {
        n6 n60 = new n6(null, object0);
        this.queue.offer(n60);
        if(this.enter()) {
            this.e0();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.done) {
            return;
        }
        this.done = true;
        if(this.enter()) {
            this.e0();
        }
        if(this.u.decrementAndGet() == 0L) {
            this.q.dispose();
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.e0();
        }
        if(this.u.decrementAndGet() == 0L) {
            this.q.dispose();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.done) {
            return;
        }
        if(this.fastEnter()) {
            for(Object object1: this.t) {
                ((UnicastProcessor)object1).onNext(object0);
            }
            if(this.leave(-1) == 0) {
                return;
            }
        }
        else {
            this.queue.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        this.e0();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.r, subscription0)) {
            this.r = subscription0;
            this.downstream.onSubscribe(this);
            if(this.v.get()) {
                return;
            }
            s s0 = new s(this, 1);
            AtomicReference atomicReference0 = this.s;
            while(true) {
                if(atomicReference0.compareAndSet(null, s0)) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                    this.n.subscribe(s0);
                    return;
                }
                if(atomicReference0.get() != null) {
                    break;
                }
            }
        }
    }
}

