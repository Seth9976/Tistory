package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class g0 extends f0 {
    public final Subscriber m;
    public final boolean n;

    public g0(int v, Function function0, Subscriber subscriber0, boolean z) {
        super(function0, v);
        this.m = subscriber0;
        this.n = z;
    }

    @Override  // io.reactivex.internal.operators.flowable.f0
    public final void a() {
        Object object1;
        Publisher publisher0;
        Object object0;
        if(this.getAndIncrement() == 0) {
            while(true) {
                if(this.i) {
                    return;
                }
                if(!this.k) {
                    boolean z = this.h;
                    if(z && !this.n && ((Throwable)this.j.get()) != null) {
                        Throwable throwable0 = this.j.terminate();
                        this.m.onError(throwable0);
                        return;
                    }
                    try {
                        object0 = this.g.poll();
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.e.cancel();
                        this.j.addThrowable(throwable1);
                        Throwable throwable2 = this.j.terminate();
                        this.m.onError(throwable2);
                        return;
                    }
                    if(z && object0 == null) {
                        Throwable throwable3 = this.j.terminate();
                        if(throwable3 != null) {
                            this.m.onError(throwable3);
                            return;
                        }
                        this.m.onComplete();
                        return;
                    }
                    if(object0 != null) {
                        try {
                            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
                        }
                        catch(Throwable throwable4) {
                            Exceptions.throwIfFatal(throwable4);
                            this.e.cancel();
                            this.j.addThrowable(throwable4);
                            Throwable throwable5 = this.j.terminate();
                            this.m.onError(throwable5);
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
                            }
                            catch(Throwable throwable6) {
                                Exceptions.throwIfFatal(throwable6);
                                this.j.addThrowable(throwable6);
                                if(!this.n) {
                                    this.e.cancel();
                                    Throwable throwable7 = this.j.terminate();
                                    this.m.onError(throwable7);
                                    return;
                                }
                                object1 = null;
                            }
                            if(object1 == null) {
                                continue;
                            }
                            if(this.a.isUnbounded()) {
                                this.m.onNext(object1);
                                continue;
                            }
                            else {
                                this.k = true;
                                j0 j00 = new j0(object1, this.a);
                                this.a.setSubscription(j00);
                                goto label_65;
                            }
                            goto label_63;
                        }
                        else {
                        label_63:
                            this.k = true;
                            publisher0.subscribe(this.a);
                        }
                    }
                }
            label_65:
                if(this.decrementAndGet() == 0) {
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
        if(this.j.addThrowable(throwable0)) {
            if(!this.n) {
                this.e.cancel();
                this.h = true;
            }
            this.k = false;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport
    public final void innerNext(Object object0) {
        this.m.onNext(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.j.addThrowable(throwable0)) {
            this.h = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.a.request(v);
    }
}

