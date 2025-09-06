package io.reactivex.internal.operators.flowable;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class c5 extends AtomicInteger implements Disposable, EqualCoordinatorHelper {
    public final SingleObserver a;
    public final BiPredicate b;
    public final b5 c;
    public final b5 d;
    public final AtomicThrowable e;
    public Object f;
    public Object g;

    public c5(SingleObserver singleObserver0, int v, BiPredicate biPredicate0) {
        this.a = singleObserver0;
        this.b = biPredicate0;
        this.c = new b5(this, v);
        this.d = new b5(this, v);
        this.e = new AtomicThrowable();
    }

    public final void a() {
        this.c.getClass();
        SubscriptionHelper.cancel(this.c);
        this.c.a();
        this.d.getClass();
        SubscriptionHelper.cancel(this.d);
        this.d.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        b5 b50 = this.c;
        b50.getClass();
        SubscriptionHelper.cancel(b50);
        b5 b51 = this.d;
        b51.getClass();
        SubscriptionHelper.cancel(b51);
        if(this.getAndIncrement() == 0) {
            b50.a();
            b51.a();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper
    public final void drain() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        int v = 1;
        do {
            SimpleQueue simpleQueue0 = this.c.e;
            SimpleQueue simpleQueue1 = this.d.e;
            if(simpleQueue0 == null || simpleQueue1 == null) {
                if(this.isDisposed()) {
                    this.c.a();
                    this.d.a();
                    return;
                }
                if(((Throwable)this.e.get()) != null) {
                    this.a();
                    Throwable throwable7 = this.e.terminate();
                    this.a.onError(throwable7);
                    return;
                }
            }
            else {
                while(true) {
                    if(this.isDisposed()) {
                        this.c.a();
                        this.d.a();
                        return;
                    }
                    if(((Throwable)this.e.get()) != null) {
                        this.a();
                        Throwable throwable0 = this.e.terminate();
                        this.a.onError(throwable0);
                        return;
                    }
                    boolean z = this.c.f;
                    Object object0 = this.f;
                    if(object0 == null) {
                        try {
                            object0 = simpleQueue0.poll();
                            this.f = object0;
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            this.a();
                            this.e.addThrowable(throwable1);
                            Throwable throwable2 = this.e.terminate();
                            this.a.onError(throwable2);
                            return;
                        }
                    }
                    int v1 = 0;
                    int v2 = object0 == null ? 1 : 0;
                    boolean z1 = this.d.f;
                    Object object1 = this.g;
                    if(object1 == null) {
                        try {
                            object1 = simpleQueue1.poll();
                            this.g = object1;
                        }
                        catch(Throwable throwable3) {
                            Exceptions.throwIfFatal(throwable3);
                            this.a();
                            this.e.addThrowable(throwable3);
                            Throwable throwable4 = this.e.terminate();
                            this.a.onError(throwable4);
                            return;
                        }
                    }
                    if(object1 == null) {
                        v1 = 1;
                    }
                    if(z && z1 && v2 != 0 && v1 != 0) {
                        this.a.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if(z && z1 && v2 != v1) {
                        this.a();
                        this.a.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if(v2 != 0 || v1 != 0) {
                        break;
                    }
                    try {
                        if(!this.b.test(object0, object1)) {
                            goto label_62;
                        }
                        goto label_65;
                    }
                    catch(Throwable throwable5) {
                        Exceptions.throwIfFatal(throwable5);
                        this.a();
                        this.e.addThrowable(throwable5);
                        Throwable throwable6 = this.e.terminate();
                        this.a.onError(throwable6);
                        return;
                    }
                label_62:
                    this.a();
                    this.a.onSuccess(Boolean.FALSE);
                    return;
                label_65:
                    this.f = null;
                    this.g = null;
                    this.c.b();
                    this.d.b();
                }
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper
    public final void innerError(Throwable throwable0) {
        if(this.e.addThrowable(throwable0)) {
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == SubscriptionHelper.CANCELLED;
    }
}

