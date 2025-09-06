package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends DisposableObserver {
    public final int b;
    public boolean c;
    public final Object d;

    public p(Object object0, int v) {
        this.b = v;
        super();
        this.d = object0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.b) {
            case 0: {
                if(!this.c) {
                    this.c = true;
                    ((q)this.d).M();
                }
                return;
            }
            case 1: {
                if(!this.c) {
                    this.c = true;
                    DisposableHelper.dispose(((n4)this.d).d);
                    ((n4)this.d).i = true;
                    ((n4)this.d).a();
                }
                return;
            }
            default: {
                if(!this.c) {
                    this.c = true;
                    ((r4)this.d).i.dispose();
                    ((r4)this.d).j = true;
                    ((r4)this.d).b();
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.b) {
            case 0: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                ((q)this.d).onError(throwable0);
                return;
            }
            case 1: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                n4 n40 = (n4)this.d;
                DisposableHelper.dispose(n40.d);
                if(n40.g.addThrowable(throwable0)) {
                    n40.i = true;
                    n40.a();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                r4 r40 = (r4)this.d;
                r40.i.dispose();
                if(r40.f.addThrowable(throwable0)) {
                    r40.j = true;
                    r40.b();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.b) {
            case 0: {
                if(!this.c) {
                    this.c = true;
                    this.dispose();
                    ((q)this.d).M();
                }
                return;
            }
            case 1: {
                if(!this.c) {
                    ((n4)this.d).f.offer(n4.k);
                    ((n4)this.d).a();
                }
                return;
            }
            default: {
                if(!this.c) {
                    this.c = true;
                    this.dispose();
                    r4 r40 = (r4)this.d;
                    AtomicReference atomicReference0 = r40.c;
                    while(!atomicReference0.compareAndSet(this, null) && atomicReference0.get() == this) {
                    }
                    r40.e.offer(r4.m);
                    r40.b();
                }
            }
        }
    }
}

