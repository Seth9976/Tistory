package ed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.b3;
import io.reactivex.internal.operators.maybe.g0;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.internal.operators.maybe.y;
import io.reactivex.internal.operators.observable.a2;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends AtomicReference implements MaybeObserver {
    public final int a;
    public final Serializable b;

    public d(Serializable serializable0, int v) {
        this.a = v;
        super();
        this.b = serializable0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                ((e)this.b).o = 0;
                ((e)this.b).a();
                return;
            }
            case 1: {
                ((p)this.b).k = 0;
                ((p)this.b).a();
                return;
            }
            case 2: {
                b3 b30 = (b3)this.b;
                b30.l = 2;
                if(b30.getAndIncrement() == 0) {
                    b30.a();
                }
                return;
            }
            case 3: {
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onComplete();
                }
                return;
            }
            case 4: {
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    MaybeSource maybeSource0 = g00.c;
                    if(maybeSource0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        g00.b.onError(timeoutException0);
                        return;
                    }
                    maybeSource0.subscribe(((m)g00.e));
                }
                return;
            }
            default: {
                a2 a20 = (a2)this.b;
                a20.i = 2;
                if(a20.getAndIncrement() == 0) {
                    a20.a();
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
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
            case 3: {
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 4: {
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    g00.b.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
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

    @Override  // io.reactivex.MaybeObserver
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
            case 4: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
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
            case 3: {
                y y0 = (y)this.b;
                y0.getClass();
                if(DisposableHelper.dispose(y0)) {
                    ((MaybeObserver)y0.c).onComplete();
                }
                return;
            }
            case 4: {
                g0 g00 = (g0)this.b;
                g00.getClass();
                if(DisposableHelper.dispose(g00)) {
                    MaybeSource maybeSource0 = g00.c;
                    if(maybeSource0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        g00.b.onError(timeoutException0);
                        return;
                    }
                    maybeSource0.subscribe(((m)g00.e));
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

