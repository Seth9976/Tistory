package dd;

import ed.c;
import ed.o;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.a3;
import io.reactivex.internal.operators.observable.z1;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends AtomicReference implements CompletableObserver {
    public final int a;
    public final Serializable b;

    public e(Serializable serializable0, int v) {
        this.a = v;
        super();
        this.b = serializable0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                ((f)this.b).k = false;
                ((f)this.b).a();
                return;
            }
            case 1: {
                w w0 = (w)this.b;
                if(w0.c.compareAndSet(false, true)) {
                    DisposableHelper.dispose(w0);
                    w0.a.onComplete();
                }
                return;
            }
            case 2: {
                ((c)this.b).i = false;
                ((c)this.b).a();
                return;
            }
            case 3: {
                ((o)this.b).i = false;
                ((o)this.b).a();
                return;
            }
            case 4: {
                a3 a30 = (a3)this.b;
                a30.d = true;
                if(a30.c) {
                    HalfSerializer.onComplete(a30.b, a30, ((AtomicThrowable)a30.h));
                }
                return;
            }
            default: {
                z1 z10 = (z1)this.b;
                z10.f = true;
                if(z10.e) {
                    HalfSerializer.onComplete(z10.a, z10, z10.d);
                }
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                f f0 = (f)this.b;
                if(f0.e.compareAndSet(false, true)) {
                    f0.i.cancel();
                    f0.a.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 1: {
                w w0 = (w)this.b;
                if(w0.c.compareAndSet(false, true)) {
                    DisposableHelper.dispose(w0);
                    w0.a.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            case 2: {
                c c0 = (c)this.b;
                if(c0.d.addThrowable(throwable0)) {
                    if(c0.c != ErrorMode.IMMEDIATE) {
                        c0.i = false;
                        c0.a();
                        return;
                    }
                    c0.h.cancel();
                    Throwable throwable1 = c0.d.terminate();
                    if(throwable1 != ExceptionHelper.TERMINATED) {
                        c0.a.onError(throwable1);
                    }
                    if(c0.getAndIncrement() == 0) {
                        c0.g.clear();
                        return;
                    }
                }
                else {
                    RxJavaPlugins.onError(throwable0);
                }
                return;
            }
            case 3: {
                o o0 = (o)this.b;
                if(o0.d.addThrowable(throwable0)) {
                    if(o0.c != ErrorMode.IMMEDIATE) {
                        o0.i = false;
                        o0.a();
                        return;
                    }
                    o0.k = true;
                    o0.h.dispose();
                    Throwable throwable2 = o0.d.terminate();
                    if(throwable2 != ExceptionHelper.TERMINATED) {
                        o0.a.onError(throwable2);
                    }
                    if(o0.getAndIncrement() == 0) {
                        o0.g.clear();
                        return;
                    }
                }
                else {
                    RxJavaPlugins.onError(throwable0);
                }
                return;
            }
            case 4: {
                SubscriptionHelper.cancel(((a3)this.b).f);
                HalfSerializer.onError(((a3)this.b).b, throwable0, ((a3)this.b), ((AtomicThrowable)((a3)this.b).h));
                return;
            }
            default: {
                DisposableHelper.dispose(((z1)this.b).b);
                HalfSerializer.onError(((z1)this.b).a, throwable0, ((z1)this.b), ((z1)this.b).d);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.replace(this, disposable0);
                return;
            }
            case 1: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 2: {
                DisposableHelper.replace(this, disposable0);
                return;
            }
            case 3: {
                DisposableHelper.replace(this, disposable0);
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
}

