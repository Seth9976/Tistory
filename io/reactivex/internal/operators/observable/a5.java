package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class a5 extends AtomicInteger implements Disposable {
    public final Observer a;
    public final Function b;
    public final b5[] c;
    public final Object[] d;
    public final boolean e;
    public volatile boolean f;

    public a5(int v, Observer observer0, Function function0, boolean z) {
        this.a = observer0;
        this.b = function0;
        this.c = new b5[v];
        this.d = new Object[v];
        this.e = z;
    }

    public final void a() {
        b5[] arr_b5 = this.c;
        for(int v1 = 0; v1 < arr_b5.length; ++v1) {
            arr_b5[v1].b.clear();
        }
        for(int v = 0; v < arr_b5.length; ++v) {
            DisposableHelper.dispose(arr_b5[v].e);
        }
    }

    public final void b() {
        Object object2;
        if(this.getAndIncrement() != 0) {
            return;
        }
        b5[] arr_b5 = this.c;
        Observer observer0 = this.a;
        Object[] arr_object = this.d;
        boolean z = this.e;
        int v = 1;
        while(true) {
            int v2 = 0;
            int v3 = 0;
            for(int v1 = 0; v1 < arr_b5.length; ++v1) {
                b5 b50 = arr_b5[v1];
                if(arr_object[v3] == null) {
                    boolean z1 = b50.c;
                    Object object0 = b50.b.poll();
                    boolean z2 = object0 == null;
                    if(this.f) {
                        this.a();
                        return;
                    }
                    if(z1) {
                        if(!z) {
                            Throwable throwable1 = b50.d;
                            if(throwable1 != null) {
                                this.f = true;
                                this.a();
                                observer0.onError(throwable1);
                                return;
                            }
                            if(z2) {
                                this.f = true;
                                this.a();
                                observer0.onComplete();
                                return;
                            }
                        }
                        else if(z2) {
                            Throwable throwable0 = b50.d;
                            this.f = true;
                            this.a();
                            if(throwable0 != null) {
                                observer0.onError(throwable0);
                                return;
                            }
                            observer0.onComplete();
                            return;
                        }
                    }
                    if(z2) {
                        ++v2;
                    }
                    else {
                        arr_object[v3] = object0;
                    }
                }
                else if(b50.c && !z) {
                    Throwable throwable2 = b50.d;
                    if(throwable2 != null) {
                        this.f = true;
                        this.a();
                        observer0.onError(throwable2);
                        return;
                    }
                }
                ++v3;
            }
            if(v2 != 0) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            try {
                Object object1 = arr_object.clone();
                object2 = ObjectHelper.requireNonNull(this.b.apply(object1), "The zipper returned a null value");
            }
            catch(Throwable throwable3) {
                Exceptions.throwIfFatal(throwable3);
                this.a();
                observer0.onError(throwable3);
                return;
            }
            observer0.onNext(object2);
            Arrays.fill(arr_object, null);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.f) {
            this.f = true;
            b5[] arr_b5 = this.c;
            for(int v1 = 0; v1 < arr_b5.length; ++v1) {
                DisposableHelper.dispose(arr_b5[v1].e);
            }
            if(this.getAndIncrement() == 0) {
                b5[] arr_b51 = this.c;
                for(int v = 0; v < arr_b51.length; ++v) {
                    arr_b51[v].b.clear();
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f;
    }
}

