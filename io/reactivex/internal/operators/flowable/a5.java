package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

public final class a5 extends DeferredScalarSubscription implements EqualCoordinatorHelper {
    public final BiPredicate a;
    public final b5 b;
    public final b5 c;
    public final AtomicThrowable d;
    public final AtomicInteger e;
    public Object f;
    public Object g;

    public a5(Subscriber subscriber0, int v, BiPredicate biPredicate0) {
        super(subscriber0);
        this.a = biPredicate0;
        this.e = new AtomicInteger();
        this.b = new b5(this, v);
        this.c = new b5(this, v);
        this.d = new AtomicThrowable();
    }

    public final void a() {
        this.b.getClass();
        SubscriptionHelper.cancel(this.b);
        this.b.a();
        this.c.getClass();
        SubscriptionHelper.cancel(this.c);
        this.c.a();
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        b5 b50 = this.b;
        b50.getClass();
        SubscriptionHelper.cancel(b50);
        b5 b51 = this.c;
        b51.getClass();
        SubscriptionHelper.cancel(b51);
        if(this.e.getAndIncrement() == 0) {
            b50.a();
            b51.a();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper
    public final void drain() {
        if(this.e.getAndIncrement() != 0) {
            return;
        }
        int v = 1;
        do {
            SimpleQueue simpleQueue0 = this.b.e;
            SimpleQueue simpleQueue1 = this.c.e;
            if(simpleQueue0 == null || simpleQueue1 == null) {
                if(this.isCancelled()) {
                    this.b.a();
                    this.c.a();
                    return;
                }
                if(((Throwable)this.d.get()) != null) {
                    this.a();
                    Throwable throwable7 = this.d.terminate();
                    this.downstream.onError(throwable7);
                    return;
                }
            }
            else {
                while(true) {
                    if(this.isCancelled()) {
                        this.b.a();
                        this.c.a();
                        return;
                    }
                    if(((Throwable)this.d.get()) != null) {
                        this.a();
                        Throwable throwable0 = this.d.terminate();
                        this.downstream.onError(throwable0);
                        return;
                    }
                    boolean z = this.b.f;
                    Object object0 = this.f;
                    if(object0 == null) {
                        try {
                            object0 = simpleQueue0.poll();
                            this.f = object0;
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            this.a();
                            this.d.addThrowable(throwable1);
                            Throwable throwable2 = this.d.terminate();
                            this.downstream.onError(throwable2);
                            return;
                        }
                    }
                    int v1 = 0;
                    int v2 = object0 == null ? 1 : 0;
                    boolean z1 = this.c.f;
                    Object object1 = this.g;
                    if(object1 == null) {
                        try {
                            object1 = simpleQueue1.poll();
                            this.g = object1;
                        }
                        catch(Throwable throwable3) {
                            Exceptions.throwIfFatal(throwable3);
                            this.a();
                            this.d.addThrowable(throwable3);
                            Throwable throwable4 = this.d.terminate();
                            this.downstream.onError(throwable4);
                            return;
                        }
                    }
                    if(object1 == null) {
                        v1 = 1;
                    }
                    if(z && z1 && v2 != 0 && v1 != 0) {
                        this.complete(Boolean.TRUE);
                        return;
                    }
                    if(z && z1 && v2 != v1) {
                        this.a();
                        this.complete(Boolean.FALSE);
                        return;
                    }
                    if(v2 != 0 || v1 != 0) {
                        break;
                    }
                    try {
                        if(!this.a.test(object0, object1)) {
                            goto label_62;
                        }
                        goto label_65;
                    }
                    catch(Throwable throwable5) {
                        Exceptions.throwIfFatal(throwable5);
                        this.a();
                        this.d.addThrowable(throwable5);
                        Throwable throwable6 = this.d.terminate();
                        this.downstream.onError(throwable6);
                        return;
                    }
                label_62:
                    this.a();
                    this.complete(Boolean.FALSE);
                    return;
                label_65:
                    this.f = null;
                    this.g = null;
                    this.b.b();
                    this.c.b();
                }
            }
            v = this.e.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper
    public final void innerError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }
}

