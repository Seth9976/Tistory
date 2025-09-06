package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.x1;
import io.reactivex.internal.operators.flowable.z1;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class g1 extends AtomicInteger implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final boolean c;
    public final CompositeDisposable d;
    public final AtomicInteger e;
    public final AtomicThrowable f;
    public final Function g;
    public final AtomicReference h;
    public Disposable i;
    public volatile boolean j;

    public g1(int v, Observer observer0, Function function0, boolean z) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = observer0;
            this.g = function0;
            this.c = z;
            this.d = new CompositeDisposable();
            this.f = new AtomicThrowable();
            this.e = new AtomicInteger(1);
            this.h = new AtomicReference();
            return;
        }
        super();
        this.b = observer0;
        this.g = function0;
        this.c = z;
        this.d = new CompositeDisposable();
        this.f = new AtomicThrowable();
        this.e = new AtomicInteger(1);
        this.h = new AtomicReference();
    }

    public final void a() {
        Object object1;
        Object object0;
        if(this.a != 0) {
            Observer observer0 = this.b;
            AtomicInteger atomicInteger0 = this.e;
            AtomicReference atomicReference0 = this.h;
            int v = 1;
            while(true) {
                boolean z = false;
                if(this.j) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)this.h.get();
                    if(spscLinkedArrayQueue0 != null) {
                        spscLinkedArrayQueue0.clear();
                        return;
                    }
                }
                else {
                    if(!this.c && ((Throwable)this.f.get()) != null) {
                        Throwable throwable0 = this.f.terminate();
                        SpscLinkedArrayQueue spscLinkedArrayQueue1 = (SpscLinkedArrayQueue)this.h.get();
                        if(spscLinkedArrayQueue1 != null) {
                            spscLinkedArrayQueue1.clear();
                        }
                        observer0.onError(throwable0);
                        return;
                    }
                    boolean z1 = atomicInteger0.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue)atomicReference0.get();
                    object0 = spscLinkedArrayQueue2 == null ? null : spscLinkedArrayQueue2.poll();
                    if(object0 == null) {
                        z = true;
                    }
                    if(z1 && z) {
                        Throwable throwable1 = this.f.terminate();
                        if(throwable1 != null) {
                            observer0.onError(throwable1);
                            return;
                        }
                        observer0.onComplete();
                        return;
                    }
                    if(z) {
                        v = this.addAndGet(-v);
                        if(v == 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        goto label_34;
                    }
                }
                return;
            label_34:
                observer0.onNext(object0);
            }
        }
        Observer observer1 = this.b;
        AtomicInteger atomicInteger1 = this.e;
        AtomicReference atomicReference1 = this.h;
        int v1 = 1;
        while(true) {
            boolean z2 = false;
            if(this.j) {
                SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue)this.h.get();
                if(spscLinkedArrayQueue3 != null) {
                    spscLinkedArrayQueue3.clear();
                    return;
                }
            }
            else {
                if(!this.c && ((Throwable)this.f.get()) != null) {
                    Throwable throwable2 = this.f.terminate();
                    SpscLinkedArrayQueue spscLinkedArrayQueue4 = (SpscLinkedArrayQueue)this.h.get();
                    if(spscLinkedArrayQueue4 != null) {
                        spscLinkedArrayQueue4.clear();
                    }
                    observer1.onError(throwable2);
                    return;
                }
                boolean z3 = atomicInteger1.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue5 = (SpscLinkedArrayQueue)atomicReference1.get();
                object1 = spscLinkedArrayQueue5 == null ? null : spscLinkedArrayQueue5.poll();
                if(object1 == null) {
                    z2 = true;
                }
                if(z3 && z2) {
                    Throwable throwable3 = this.f.terminate();
                    if(throwable3 != null) {
                        observer1.onError(throwable3);
                        return;
                    }
                    observer1.onComplete();
                    return;
                }
                if(z2) {
                    v1 = this.addAndGet(-v1);
                    if(v1 == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    goto label_69;
                }
            }
            return;
        label_69:
            observer1.onNext(object1);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.j = true;
            this.i.dispose();
            this.d.dispose();
            return;
        }
        this.j = true;
        this.i.dispose();
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.j;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.e.decrementAndGet();
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        this.e.decrementAndGet();
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.e.decrementAndGet();
            if(this.f.addThrowable(throwable0)) {
                if(!this.c) {
                    this.d.dispose();
                }
                if(this.getAndIncrement() == 0) {
                    this.a();
                    return;
                }
            }
            else {
                RxJavaPlugins.onError(throwable0);
            }
            return;
        }
        this.e.decrementAndGet();
        if(this.f.addThrowable(throwable0)) {
            if(!this.c) {
                this.d.dispose();
            }
            if(this.getAndIncrement() == 0) {
                this.a();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        MaybeSource maybeSource0;
        SingleSource singleSource0;
        if(this.a != 0) {
            try {
                singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.g.apply(object0), "The mapper returned a null SingleSource");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.i.dispose();
                this.onError(throwable0);
                return;
            }
            this.e.getAndIncrement();
            z1 z10 = new z1(this, 1);
            if(!this.j && this.d.add(z10)) {
                singleSource0.subscribe(z10);
                return;
            }
            return;
        }
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.g.apply(object0), "The mapper returned a null MaybeSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            this.i.dispose();
            this.onError(throwable1);
            return;
        }
        this.e.getAndIncrement();
        x1 x10 = new x1(this, 1);
        if(!this.j && this.d.add(x10)) {
            maybeSource0.subscribe(x10);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.i, disposable0)) {
                this.i = disposable0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.i, disposable0)) {
            this.i = disposable0;
            this.b.onSubscribe(this);
        }
    }
}

