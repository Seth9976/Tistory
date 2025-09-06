package gd;

import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.maybe.l0;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class f0 extends AtomicInteger implements Disposable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public final Object e;

    public f0(int v, MaybeObserver maybeObserver0, Function function0) {
        this.a = 2;
        super(v);
        this.b = maybeObserver0;
        this.c = function0;
        l0[] arr_l0 = new l0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_l0[v1] = new l0(this, v1);
        }
        this.d = arr_l0;
        this.e = new Object[v];
    }

    public f0(int v, SingleObserver singleObserver0, Function function0) {
        this.a = 0;
        super(v);
        this.b = singleObserver0;
        this.c = function0;
        g0[] arr_g0 = new g0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_g0[v1] = new g0(this, v1);
        }
        this.d = arr_g0;
        this.e = new Object[v];
    }

    public f0(SingleObserver singleObserver0, BiPredicate biPredicate0) {
        this.a = 1;
        super(2);
        this.b = singleObserver0;
        this.e = biPredicate0;
        this.c = new p(this);
        this.d = new p(this);
    }

    public void a(int v) {
        l0[] arr_l0 = (l0[])this.d;
        for(int v1 = 0; v1 < v; ++v1) {
            l0 l00 = arr_l0[v1];
            l00.getClass();
            DisposableHelper.dispose(l00);
        }
        while(true) {
            ++v;
            if(v >= arr_l0.length) {
                break;
            }
            l0 l01 = arr_l0[v];
            l01.getClass();
            DisposableHelper.dispose(l01);
        }
    }

    public void b() {
        boolean z;
        if(this.decrementAndGet() == 0) {
            Object object0 = ((p)this.c).b;
            Object object1 = ((p)this.d).b;
            SingleObserver singleObserver0 = (SingleObserver)this.b;
            if(object0 != null && object1 != null) {
                try {
                    z = ((BiPredicate)this.e).test(object0, object1);
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    singleObserver0.onError(throwable0);
                    return;
                }
                singleObserver0.onSuccess(Boolean.valueOf(z));
                return;
            }
            singleObserver0.onSuccess(Boolean.valueOf(object0 == null && object1 == null));
        }
    }

    public void c(Throwable throwable0, int v) {
        if(this.getAndSet(0) > 0) {
            g0[] arr_g0 = (g0[])this.d;
            for(int v1 = 0; v1 < v; ++v1) {
                g0 g00 = arr_g0[v1];
                g00.getClass();
                DisposableHelper.dispose(g00);
            }
            while(true) {
                ++v;
                if(v >= arr_g0.length) {
                    break;
                }
                g0 g01 = arr_g0[v];
                g01.getClass();
                DisposableHelper.dispose(g01);
            }
            ((SingleObserver)this.b).onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                if(this.getAndSet(0) > 0) {
                    g0[] arr_g0 = (g0[])this.d;
                    for(int v = 0; v < arr_g0.length; ++v) {
                        g0 g00 = arr_g0[v];
                        g00.getClass();
                        DisposableHelper.dispose(g00);
                    }
                }
                return;
            }
            case 1: {
                ((p)this.c).getClass();
                DisposableHelper.dispose(((p)this.c));
                ((p)this.d).getClass();
                DisposableHelper.dispose(((p)this.d));
                return;
            }
            default: {
                if(this.getAndSet(0) > 0) {
                    l0[] arr_l0 = (l0[])this.d;
                    for(int v1 = 0; v1 < arr_l0.length; ++v1) {
                        l0 l00 = arr_l0[v1];
                        l00.getClass();
                        DisposableHelper.dispose(l00);
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.get() <= 0;
            }
            case 1: {
                return DisposableHelper.isDisposed(((Disposable)((p)this.c).get()));
            }
            default: {
                return this.get() <= 0;
            }
        }
    }
}

