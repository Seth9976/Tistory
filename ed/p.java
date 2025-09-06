package ed;

import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends AtomicInteger implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final Function c;
    public final AtomicThrowable d;
    public final SpscLinkedArrayQueue e;
    public final ErrorMode f;
    public Disposable g;
    public volatile boolean h;
    public volatile boolean i;
    public Object j;
    public volatile int k;
    public final AtomicReference l;

    public p(int v, int v1, Observer observer0, Function function0, ErrorMode errorMode0) {
        this.a = v1;
        if(v1 != 1) {
            super();
            this.b = observer0;
            this.c = function0;
            this.f = errorMode0;
            this.d = new AtomicThrowable();
            this.l = new d(this, 1);
            this.e = new SpscLinkedArrayQueue(v);
            return;
        }
        super();
        this.b = observer0;
        this.c = function0;
        this.f = errorMode0;
        this.d = new AtomicThrowable();
        this.l = new f(this, 1);
        this.e = new SpscLinkedArrayQueue(v);
    }

    public final void a() {
        MaybeSource maybeSource0;
        SingleSource singleSource0;
        if(this.a != 0) {
            if(this.getAndIncrement() == 0) {
                Observer observer0 = this.b;
                ErrorMode errorMode0 = this.f;
                SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.e;
                AtomicThrowable atomicThrowable0 = this.d;
                int v = 1;
                while(true) {
                    if(this.i) {
                        spscLinkedArrayQueue0.clear();
                        this.j = null;
                    }
                    else {
                        boolean z = false;
                        int v1 = this.k;
                        if(atomicThrowable0.get() != null && (errorMode0 == ErrorMode.IMMEDIATE || errorMode0 == ErrorMode.BOUNDARY && v1 == 0)) {
                            spscLinkedArrayQueue0.clear();
                            this.j = null;
                            observer0.onError(atomicThrowable0.terminate());
                            return;
                        }
                        switch(v1) {
                            case 0: {
                                boolean z1 = this.h;
                                Object object0 = spscLinkedArrayQueue0.poll();
                                if(object0 == null) {
                                    z = true;
                                }
                                if(z1 && z) {
                                    Throwable throwable0 = atomicThrowable0.terminate();
                                    if(throwable0 == null) {
                                        observer0.onComplete();
                                        return;
                                    }
                                    observer0.onError(throwable0);
                                    return;
                                }
                                if(!z) {
                                    try {
                                        singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.c.apply(object0), "The mapper returned a null SingleSource");
                                    }
                                    catch(Throwable throwable1) {
                                        Exceptions.throwIfFatal(throwable1);
                                        this.g.dispose();
                                        spscLinkedArrayQueue0.clear();
                                        atomicThrowable0.addThrowable(throwable1);
                                        observer0.onError(atomicThrowable0.terminate());
                                        return;
                                    }
                                    this.k = 1;
                                    singleSource0.subscribe(((f)this.l));
                                }
                                break;
                            }
                            case 2: {
                                goto label_46;
                            }
                        }
                    }
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        return;
                    label_46:
                        Object object1 = this.j;
                        this.j = null;
                        observer0.onNext(object1);
                        this.k = 0;
                    }
                }
            }
            return;
        }
        if(this.getAndIncrement() == 0) {
            Observer observer1 = this.b;
            ErrorMode errorMode1 = this.f;
            SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.e;
            AtomicThrowable atomicThrowable1 = this.d;
            int v2 = 1;
            while(true) {
                if(this.i) {
                    spscLinkedArrayQueue1.clear();
                    this.j = null;
                }
                else {
                    boolean z2 = false;
                    int v3 = this.k;
                    if(atomicThrowable1.get() != null && (errorMode1 == ErrorMode.IMMEDIATE || errorMode1 == ErrorMode.BOUNDARY && v3 == 0)) {
                        spscLinkedArrayQueue1.clear();
                        this.j = null;
                        observer1.onError(atomicThrowable1.terminate());
                        return;
                    }
                    switch(v3) {
                        case 0: {
                            boolean z3 = this.h;
                            Object object2 = spscLinkedArrayQueue1.poll();
                            if(object2 == null) {
                                z2 = true;
                            }
                            if(z3 && z2) {
                                Throwable throwable2 = atomicThrowable1.terminate();
                                if(throwable2 == null) {
                                    observer1.onComplete();
                                    return;
                                }
                                observer1.onError(throwable2);
                                return;
                            }
                            if(!z2) {
                                try {
                                    maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.c.apply(object2), "The mapper returned a null MaybeSource");
                                }
                                catch(Throwable throwable3) {
                                    Exceptions.throwIfFatal(throwable3);
                                    this.g.dispose();
                                    spscLinkedArrayQueue1.clear();
                                    atomicThrowable1.addThrowable(throwable3);
                                    observer1.onError(atomicThrowable1.terminate());
                                    return;
                                }
                                this.k = 1;
                                maybeSource0.subscribe(((d)this.l));
                            }
                            break;
                        }
                        case 2: {
                            goto label_97;
                        }
                    }
                }
                v2 = this.addAndGet(-v2);
                if(v2 == 0) {
                    return;
                label_97:
                    Object object3 = this.j;
                    this.j = null;
                    observer1.onNext(object3);
                    this.k = 0;
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.i = true;
            this.g.dispose();
            ((f)this.l).getClass();
            DisposableHelper.dispose(((f)this.l));
            if(this.getAndIncrement() == 0) {
                this.e.clear();
                this.j = null;
            }
            return;
        }
        this.i = true;
        this.g.dispose();
        ((d)this.l).getClass();
        DisposableHelper.dispose(((d)this.l));
        if(this.getAndIncrement() == 0) {
            this.e.clear();
            this.j = null;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.h = true;
            this.a();
            return;
        }
        this.h = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.d.addThrowable(throwable0)) {
                if(this.f == ErrorMode.IMMEDIATE) {
                    ((f)this.l).getClass();
                    DisposableHelper.dispose(((f)this.l));
                }
                this.h = true;
                this.a();
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(this.d.addThrowable(throwable0)) {
            if(this.f == ErrorMode.IMMEDIATE) {
                ((d)this.l).getClass();
                DisposableHelper.dispose(((d)this.l));
            }
            this.h = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.e.offer(object0);
            this.a();
            return;
        }
        this.e.offer(object0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.g, disposable0)) {
                this.g = disposable0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.b.onSubscribe(this);
        }
    }
}

