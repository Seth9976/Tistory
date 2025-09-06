package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class h2 extends AtomicInteger implements JoinSupport, Subscription {
    public final Subscriber a;
    public final AtomicLong b;
    public final SpscLinkedArrayQueue c;
    public final CompositeDisposable d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final AtomicReference g;
    public final Function h;
    public final Function i;
    public final BiFunction j;
    public final AtomicInteger k;
    public int l;
    public int m;
    public volatile boolean n;

    public h2(Subscriber subscriber0, Function function0, Function function1, BiFunction biFunction0) {
        this.a = subscriber0;
        this.b = new AtomicLong();
        this.d = new CompositeDisposable();
        this.c = new SpscLinkedArrayQueue(0x80);
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new AtomicReference();
        this.h = function0;
        this.i = function1;
        this.j = biFunction0;
        this.k = new AtomicInteger(2);
    }

    public final void a() {
        Publisher publisher1;
        Object object2;
        Publisher publisher0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.c;
        Subscriber subscriber0 = this.a;
        int v = 1;
        while(true) {
            if(this.n) {
                spscLinkedArrayQueue0.clear();
                return;
            }
            if(((Throwable)this.g.get()) != null) {
                spscLinkedArrayQueue0.clear();
                this.d.dispose();
                this.b(subscriber0);
                return;
            }
            boolean z = this.k.get() == 0;
            Integer integer0 = (Integer)spscLinkedArrayQueue0.poll();
            if(z && integer0 == null) {
                for(Object object0: this.e.values()) {
                    ((UnicastProcessor)object0).onComplete();
                }
                this.e.clear();
                this.f.clear();
                this.d.dispose();
                subscriber0.onComplete();
                return;
            }
            if(integer0 == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            Object object1 = spscLinkedArrayQueue0.poll();
            if(integer0 == 1) {
                UnicastProcessor unicastProcessor0 = UnicastProcessor.create();
                int v1 = this.l;
                this.l = v1 + 1;
                this.e.put(v1, unicastProcessor0);
                try {
                    publisher0 = (Publisher)ObjectHelper.requireNonNull(this.h.apply(object1), "The leftEnd returned a null Publisher");
                }
                catch(Throwable throwable0) {
                    this.c(throwable0, subscriber0, spscLinkedArrayQueue0);
                    return;
                }
                i2 i20 = new i2(this, true, v1);
                this.d.add(i20);
                publisher0.subscribe(i20);
                if(((Throwable)this.g.get()) != null) {
                    spscLinkedArrayQueue0.clear();
                    this.d.dispose();
                    this.b(subscriber0);
                    return;
                }
                try {
                    object2 = ObjectHelper.requireNonNull(this.j.apply(object1, unicastProcessor0), "The resultSelector returned a null value");
                }
                catch(Throwable throwable1) {
                    this.c(throwable1, subscriber0, spscLinkedArrayQueue0);
                    return;
                }
                if(this.b.get() != 0L) {
                    subscriber0.onNext(object2);
                    BackpressureHelper.produced(this.b, 1L);
                    for(Object object3: this.f.values()) {
                        unicastProcessor0.onNext(object3);
                    }
                    continue;
                }
                this.c(new MissingBackpressureException("Could not emit value due to lack of requests"), subscriber0, spscLinkedArrayQueue0);
                return;
            }
            if(integer0 == 2) {
                int v2 = this.m;
                this.m = v2 + 1;
                this.f.put(v2, object1);
                try {
                    publisher1 = (Publisher)ObjectHelper.requireNonNull(this.i.apply(object1), "The rightEnd returned a null Publisher");
                }
                catch(Throwable throwable2) {
                    this.c(throwable2, subscriber0, spscLinkedArrayQueue0);
                    return;
                }
                i2 i21 = new i2(this, false, v2);
                this.d.add(i21);
                publisher1.subscribe(i21);
                if(((Throwable)this.g.get()) != null) {
                    spscLinkedArrayQueue0.clear();
                    this.d.dispose();
                    this.b(subscriber0);
                    return;
                }
                for(Object object4: this.e.values()) {
                    ((UnicastProcessor)object4).onNext(object1);
                }
            }
            else if(integer0 == 3) {
                UnicastProcessor unicastProcessor1 = (UnicastProcessor)this.e.remove(((i2)object1).c);
                this.d.remove(((i2)object1));
                if(unicastProcessor1 == null) {
                    continue;
                }
                unicastProcessor1.onComplete();
            }
            else if(integer0 == 4) {
                this.f.remove(((i2)object1).c);
                this.d.remove(((i2)object1));
            }
        }
    }

    public final void b(Subscriber subscriber0) {
        Throwable throwable0 = ExceptionHelper.terminate(this.g);
        LinkedHashMap linkedHashMap0 = this.e;
        for(Object object0: linkedHashMap0.values()) {
            ((UnicastProcessor)object0).onError(throwable0);
        }
        linkedHashMap0.clear();
        this.f.clear();
        subscriber0.onError(throwable0);
    }

    public final void c(Throwable throwable0, Subscriber subscriber0, SimpleQueue simpleQueue0) {
        Exceptions.throwIfFatal(throwable0);
        ExceptionHelper.addThrowable(this.g, throwable0);
        simpleQueue0.clear();
        this.d.dispose();
        this.b(subscriber0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.n) {
            return;
        }
        this.n = true;
        this.d.dispose();
        if(this.getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport
    public final void innerClose(boolean z, i2 i20) {
        synchronized(this) {
            this.c.offer((z ? 3 : 4), i20);
        }
        this.a();
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport
    public final void innerCloseError(Throwable throwable0) {
        if(ExceptionHelper.addThrowable(this.g, throwable0)) {
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport
    public final void innerComplete(j2 j20) {
        this.d.delete(j20);
        this.k.decrementAndGet();
        this.a();
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport
    public final void innerError(Throwable throwable0) {
        if(ExceptionHelper.addThrowable(this.g, throwable0)) {
            this.k.decrementAndGet();
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport
    public final void innerValue(boolean z, Object object0) {
        synchronized(this) {
            this.c.offer((z ? 1 : 2), object0);
        }
        this.a();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.b, v);
        }
    }
}

