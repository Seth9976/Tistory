package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class h0 extends f0 {
    public final Subscriber m;
    public final AtomicInteger n;

    public h0(Subscriber subscriber0, Function function0, int v) {
        super(function0, v);
        this.m = subscriber0;
        this.n = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.operators.flowable.f0
    public final void a() {
        Object object1;
        Publisher publisher0;
        Object object0;
        if(this.n.getAndIncrement() == 0) {
            while(true) {
                if(this.i) {
                    return;
                }
                if(!this.k) {
                    try {
                        boolean z = this.h;
                        object0 = this.g.poll();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.e.cancel();
                        this.j.addThrowable(throwable0);
                        Throwable throwable1 = this.j.terminate();
                        this.m.onError(throwable1);
                        return;
                    }
                    if(z && object0 == null) {
                        this.m.onComplete();
                        return;
                    }
                    if(object0 != null) {
                        try {
                            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
                        }
                        catch(Throwable throwable2) {
                            Exceptions.throwIfFatal(throwable2);
                            this.e.cancel();
                            this.j.addThrowable(throwable2);
                            Throwable throwable3 = this.j.terminate();
                            this.m.onError(throwable3);
                            return;
                        }
                        if(this.l != 1) {
                            int v = this.f + 1;
                            if(v == this.d) {
                                this.f = 0;
                                this.e.request(((long)v));
                            }
                            else {
                                this.f = v;
                            }
                        }
                        if(publisher0 instanceof Callable) {
                            Callable callable0 = (Callable)publisher0;
                            try {
                                object1 = callable0.call();
                                if(object1 == null) {
                                    continue;
                                }
                            }
                            catch(Throwable throwable4) {
                                Exceptions.throwIfFatal(throwable4);
                                this.e.cancel();
                                this.j.addThrowable(throwable4);
                                Throwable throwable5 = this.j.terminate();
                                this.m.onError(throwable5);
                                return;
                            }
                            if(this.a.isUnbounded()) {
                                if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                                    continue;
                                }
                                this.m.onNext(object1);
                                if(this.compareAndSet(1, 0)) {
                                    continue;
                                }
                                Throwable throwable6 = this.j.terminate();
                                this.m.onError(throwable6);
                                return;
                            }
                            else {
                                this.k = true;
                                j0 j00 = new j0(object1, this.a);
                                this.a.setSubscription(j00);
                                goto label_59;
                            }
                            goto label_57;
                        }
                        else {
                        label_57:
                            this.k = true;
                            publisher0.subscribe(this.a);
                        }
                    }
                }
            label_59:
                if(this.n.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.f0
    public final void b() {
        this.m.onSubscribe(this);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.i) {
            this.i = true;
            this.a.cancel();
            this.e.cancel();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport
    public final void innerError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.j;
        if(atomicThrowable0.addThrowable(throwable0)) {
            this.e.cancel();
            if(this.getAndIncrement() == 0) {
                Throwable throwable1 = atomicThrowable0.terminate();
                this.m.onError(throwable1);
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport
    public final void innerNext(Object object0) {
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            Subscriber subscriber0 = this.m;
            subscriber0.onNext(object0);
            if(this.compareAndSet(1, 0)) {
                return;
            }
            subscriber0.onError(this.j.terminate());
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.j;
        if(atomicThrowable0.addThrowable(throwable0)) {
            this.a.cancel();
            if(this.getAndIncrement() == 0) {
                Throwable throwable1 = atomicThrowable0.terminate();
                this.m.onError(throwable1);
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.a.request(v);
    }
}

