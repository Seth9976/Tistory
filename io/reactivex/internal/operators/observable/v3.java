package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class v3 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final int c;
    public final boolean d;
    public final AtomicThrowable e;
    public volatile boolean f;
    public volatile boolean g;
    public Disposable h;
    public final AtomicReference i;
    public volatile long j;
    public static final u3 k;

    static {
        u3 u30 = new u3(null, -1L, 1);
        v3.k = u30;
        DisposableHelper.dispose(u30);
    }

    public v3(int v, Observer observer0, Function function0, boolean z) {
        this.i = new AtomicReference();
        this.a = observer0;
        this.b = function0;
        this.c = v;
        this.d = z;
        this.e = new AtomicThrowable();
    }

    public final void a() {
        AtomicReference atomicReference0 = this.i;
        u3 u30 = (u3)atomicReference0.get();
        u3 u31 = v3.k;
        if(u30 != u31) {
            u3 u32 = (u3)atomicReference0.getAndSet(u31);
            if(u32 != u31 && u32 != null) {
                DisposableHelper.dispose(u32);
            }
        }
    }

    public final void b() {
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        AtomicReference atomicReference0 = this.i;
        boolean z = this.d;
        int v = 1;
        while(true) {
            if(this.g) {
                return;
            }
            if(this.f) {
                boolean z1 = atomicReference0.get() == null;
                if(!z) {
                    if(((Throwable)this.e.get()) != null) {
                        observer0.onError(this.e.terminate());
                        return;
                    }
                    if(z1) {
                        observer0.onComplete();
                        return;
                    }
                }
                else if(z1) {
                    Throwable throwable0 = (Throwable)this.e.get();
                    if(throwable0 != null) {
                        observer0.onError(throwable0);
                        return;
                    }
                    observer0.onComplete();
                    return;
                }
            }
            u3 u30 = (u3)atomicReference0.get();
            if(u30 != null) {
                SimpleQueue simpleQueue0 = u30.d;
                if(simpleQueue0 != null) {
                    if(u30.e) {
                        boolean z2 = simpleQueue0.isEmpty();
                        if(!z) {
                            if(((Throwable)this.e.get()) != null) {
                                observer0.onError(this.e.terminate());
                                return;
                            }
                            if(z2) {
                                while(!atomicReference0.compareAndSet(u30, null) && atomicReference0.get() == u30) {
                                }
                                continue;
                            }
                        }
                        else if(z2) {
                            while(!atomicReference0.compareAndSet(u30, null) && atomicReference0.get() == u30) {
                            }
                            continue;
                        }
                    }
                    boolean z3 = false;
                    while(true) {
                        if(this.g) {
                            return;
                        }
                        if(u30 != atomicReference0.get()) {
                            goto label_71;
                        }
                        if(!z && ((Throwable)this.e.get()) != null) {
                            observer0.onError(this.e.terminate());
                            return;
                        }
                        try {
                            boolean z4 = u30.e;
                            object0 = simpleQueue0.poll();
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            this.e.addThrowable(throwable1);
                            while(!atomicReference0.compareAndSet(u30, null) && atomicReference0.get() == u30) {
                            }
                            if(z) {
                                DisposableHelper.dispose(u30);
                            }
                            else {
                                this.a();
                                this.h.dispose();
                                this.f = true;
                            }
                            z3 = true;
                            object0 = null;
                        }
                        if(z4 && object0 == null) {
                            while(true) {
                                if(atomicReference0.compareAndSet(u30, null) || atomicReference0.get() != u30) {
                                    goto label_71;
                                }
                            }
                        }
                        else if(object0 != null) {
                            observer0.onNext(object0);
                            continue;
                        label_71:
                            z3 = true;
                        }
                        break;
                    }
                    if(!z3) {
                        goto label_73;
                    }
                    continue;
                }
            }
        label_73:
            v = this.addAndGet(-v);
            if(v == 0) {
                break;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.g) {
            this.g = true;
            this.h.dispose();
            this.a();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.f) {
            this.f = true;
            this.b();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(!this.f && this.e.addThrowable(throwable0)) {
            if(!this.d) {
                this.a();
            }
            this.f = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        long v = this.j + 1L;
        this.j = v;
        u3 u30 = (u3)this.i.get();
        if(u30 != null) {
            DisposableHelper.dispose(u30);
        }
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The ObservableSource returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.h.dispose();
            this.onError(throwable0);
            return;
        }
        u3 u31 = new u3(this, v, this.c);
        u3 u32;
        while((u32 = (u3)this.i.get()) != v3.k) {
            AtomicReference atomicReference0 = this.i;
        label_16:
            if(atomicReference0.compareAndSet(u32, u31)) {
                observableSource0.subscribe(u31);
                return;
            }
            if(atomicReference0.get() != u32) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_16;
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.h, disposable0)) {
            this.h = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

