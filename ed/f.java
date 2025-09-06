package ed;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.b3;
import io.reactivex.internal.operators.observable.a2;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends AtomicReference implements SingleObserver {
    public final int a;
    public final Object b;

    public f(Object object0, int v) {
        this.a = v;
        super();
        this.b = object0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                e e0 = (e)this.b;
                if(e0.f.addThrowable(throwable0)) {
                    if(e0.h != ErrorMode.END) {
                        e0.i.cancel();
                    }
                    e0.o = 0;
                    e0.a();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 1: {
                p p0 = (p)this.b;
                if(p0.d.addThrowable(throwable0)) {
                    if(p0.f != ErrorMode.END) {
                        p0.g.dispose();
                    }
                    p0.k = 0;
                    p0.a();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 2: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 3: {
                b3 b30 = (b3)this.b;
                if(b30.d.addThrowable(throwable0)) {
                    SubscriptionHelper.cancel(b30.c);
                    if(b30.getAndIncrement() == 0) {
                        b30.a();
                        return;
                    }
                }
                else {
                    RxJavaPlugins.onError(throwable0);
                }
                return;
            }
            default: {
                a2 a20 = (a2)this.b;
                if(a20.d.addThrowable(throwable0)) {
                    DisposableHelper.dispose(a20.c);
                    if(a20.getAndIncrement() == 0) {
                        a20.a();
                    }
                }
                else {
                    RxJavaPlugins.onError(throwable0);
                }
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.replace(this, disposable0);
                return;
            }
            case 1: {
                DisposableHelper.replace(this, disposable0);
                return;
            }
            case 2: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 3: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        switch(this.a) {
            case 0: {
                ((e)this.b).n = object0;
                ((e)this.b).o = 2;
                ((e)this.b).a();
                return;
            }
            case 1: {
                ((p)this.b).j = object0;
                ((p)this.b).k = 2;
                ((p)this.b).a();
                return;
            }
            case 2: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 3: {
                b3 b30 = (b3)this.b;
                if(b30.compareAndSet(0, 1)) {
                    long v = b30.m;
                    if(b30.e.get() == v) {
                        b30.i = object0;
                        b30.l = 1;
                        if(b30.decrementAndGet() == 0) {
                            return;
                        }
                    }
                    else {
                        b30.m = v + 1L;
                        b30.b.onNext(object0);
                        b30.l = 2;
                    }
                    b30.a();
                    return;
                }
                b30.i = object0;
                b30.l = 1;
                if(b30.getAndIncrement() == 0) {
                    b30.a();
                }
                return;
            }
            default: {
                a2 a20 = (a2)this.b;
                if(a20.compareAndSet(0, 1)) {
                    a20.b.onNext(object0);
                    a20.i = 2;
                    a20.a();
                    return;
                }
                a20.f = object0;
                a20.i = 1;
                if(a20.getAndIncrement() == 0) {
                    a20.a();
                }
            }
        }
    }
}

