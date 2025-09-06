package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public final class d1 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final boolean c;
    public final int d;
    public final int e;
    public volatile SimplePlainQueue f;
    public volatile boolean g;
    public final AtomicThrowable h;
    public volatile boolean i;
    public final AtomicReference j;
    public Disposable k;
    public long l;
    public long m;
    public int n;
    public final ArrayDeque o;
    public int p;
    public static final c1[] q;
    public static final c1[] r;

    static {
        d1.q = new c1[0];
        d1.r = new c1[0];
    }

    public d1(int v, int v1, Observer observer0, Function function0, boolean z) {
        this.h = new AtomicThrowable();
        this.a = observer0;
        this.b = function0;
        this.c = z;
        this.d = v;
        this.e = v1;
        if(v != 0x7FFFFFFF) {
            this.o = new ArrayDeque(v);
        }
        this.j = new AtomicReference(d1.q);
    }

    public final boolean a() {
        if(this.i) {
            return true;
        }
        Throwable throwable0 = (Throwable)this.h.get();
        if(!this.c && throwable0 != null) {
            this.b();
            Throwable throwable1 = this.h.terminate();
            if(throwable1 != ExceptionHelper.TERMINATED) {
                this.a.onError(throwable1);
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        this.k.dispose();
        AtomicReference atomicReference0 = this.j;
        c1[] arr_c1 = (c1[])atomicReference0.get();
        c1[] arr_c11 = d1.r;
        if(arr_c1 != arr_c11) {
            c1[] arr_c12 = (c1[])atomicReference0.getAndSet(arr_c11);
            if(arr_c12 != arr_c11) {
                for(int v = 0; v < arr_c12.length; ++v) {
                    c1 c10 = arr_c12[v];
                    c10.getClass();
                    DisposableHelper.dispose(c10);
                }
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if(this.getAndIncrement() == 0) {
            this.d();
        }
    }

    public final void d() {
        Object object1;
        int v4;
        Observer observer0 = this.a;
        int v = 1;
        while(true) {
            if(this.a()) {
                return;
            }
            SimplePlainQueue simplePlainQueue0 = this.f;
            int v1 = 0;
            if(simplePlainQueue0 != null) {
                while(true) {
                    if(this.a()) {
                        return;
                    }
                    Object object0 = simplePlainQueue0.poll();
                    if(object0 == null) {
                        break;
                    }
                    observer0.onNext(object0);
                    ++v1;
                }
            }
            if(v1 == 0) {
                boolean z = this.g;
                SimplePlainQueue simplePlainQueue1 = this.f;
                c1[] arr_c1 = (c1[])this.j.get();
                int v2 = arr_c1.length;
                if(this.d == 0x7FFFFFFF) {
                    v4 = 0;
                }
                else {
                    synchronized(this) {
                        v4 = this.o.size();
                    }
                }
                if(z && (simplePlainQueue1 == null || simplePlainQueue1.isEmpty()) && v2 == 0 && v4 == 0) {
                    Throwable throwable0 = this.h.terminate();
                    if(throwable0 != ExceptionHelper.TERMINATED) {
                        if(throwable0 == null) {
                            observer0.onComplete();
                            return;
                        }
                        observer0.onError(throwable0);
                    }
                    return;
                }
                if(v2 != 0) {
                    long v5 = this.m;
                    int v6 = this.n;
                    if(v2 <= v6 || arr_c1[v6].a != v5) {
                        if(v2 <= v6) {
                            v6 = 0;
                        }
                        for(int v7 = 0; v7 < v2 && arr_c1[v6].a != v5; ++v7) {
                            ++v6;
                            v6 = v6 == v2 ? 0 : v6 + 1;
                        }
                        this.n = v6;
                        this.m = arr_c1[v6].a;
                    }
                    int v8 = 0;
                    while(v8 < v2) {
                        if(this.a()) {
                            return;
                        }
                        c1 c10 = arr_c1[v6];
                        SimpleQueue simpleQueue0 = c10.d;
                        if(simpleQueue0 != null) {
                            do {
                                try {
                                    object1 = simpleQueue0.poll();
                                }
                                catch(Throwable throwable1) {
                                    Exceptions.throwIfFatal(throwable1);
                                    DisposableHelper.dispose(c10);
                                    this.h.addThrowable(throwable1);
                                    if(this.a()) {
                                        return;
                                    }
                                    this.e(c10);
                                    ++v1;
                                    ++v6;
                                    if(v6 == v2) {
                                        v6 = 0;
                                    }
                                    goto label_84;
                                }
                                if(object1 == null) {
                                    goto label_78;
                                }
                                observer0.onNext(object1);
                            }
                            while(!this.a());
                            return;
                        }
                    label_78:
                        if(c10.c && (c10.d == null || c10.d.isEmpty())) {
                            this.e(c10);
                            if(this.a()) {
                                return;
                            }
                            ++v1;
                        }
                        v6 = v6 + 1 == v2 ? 0 : v6 + 1;
                    label_84:
                        ++v8;
                    }
                    this.n = v6;
                    this.m = arr_c1[v6].a;
                }
                if(v1 == 0) {
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
                else {
                    if(this.d == 0x7FFFFFFF) {
                        continue;
                    }
                    this.g(v1);
                }
            }
            else {
                if(this.d == 0x7FFFFFFF) {
                    continue;
                }
                this.g(v1);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.i) {
            this.i = true;
            if(this.b()) {
                Throwable throwable0 = this.h.terminate();
                if(throwable0 != null && throwable0 != ExceptionHelper.TERMINATED) {
                    RxJavaPlugins.onError(throwable0);
                }
            }
        }
    }

    public final void e(c1 c10) {
        c1[] arr_c11;
        while(true) {
            AtomicReference atomicReference0 = this.j;
            c1[] arr_c1 = (c1[])atomicReference0.get();
            int v = arr_c1.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_c1[v1] == c10) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v == 1) {
                arr_c11 = d1.q;
            }
            else {
                c1[] arr_c12 = new c1[v - 1];
                System.arraycopy(arr_c1, 0, arr_c12, 0, v1);
                System.arraycopy(arr_c1, v1 + 1, arr_c12, v1, v - v1 - 1);
                arr_c11 = arr_c12;
            }
            do {
                if(atomicReference0.compareAndSet(arr_c1, arr_c11)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_c1);
        }
    }

    public final void f(ObservableSource observableSource0) {
        Object object0;
        do {
            boolean z = false;
            if(!(observableSource0 instanceof Callable)) {
                goto label_40;
            }
            Callable callable0 = (Callable)observableSource0;
            try {
                object0 = callable0.call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.h.addThrowable(throwable0);
                this.c();
                goto label_27;
            }
            if(object0 != null) {
                if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                    SimplePlainQueue simplePlainQueue0 = this.f;
                    if(simplePlainQueue0 == null) {
                        simplePlainQueue0 = this.d == 0x7FFFFFFF ? new SpscLinkedArrayQueue(this.e) : new SpscArrayQueue(this.d);
                        this.f = simplePlainQueue0;
                    }
                    if(simplePlainQueue0.offer(object0)) {
                        if(this.getAndIncrement() == 0) {
                            goto label_26;
                        }
                        return;
                    }
                    else {
                        this.onError(new IllegalStateException("Scalar queue full?!"));
                        goto label_27;
                    }
                }
                else {
                    this.a.onNext(object0);
                    if(this.decrementAndGet() == 0) {
                        goto label_27;
                    }
                }
            label_26:
                this.d();
            }
        label_27:
            if(this.d == 0x7FFFFFFF) {
                return;
            }
            synchronized(this) {
                observableSource0 = (ObservableSource)this.o.poll();
                if(observableSource0 == null) {
                    --this.p;
                    z = true;
                }
            }
        }
        while(!z);
        this.c();
        return;
    label_40:
        long v1 = this.l;
        this.l = v1 + 1L;
        c1 c10 = new c1(this, v1);
        while(true) {
            AtomicReference atomicReference0 = this.j;
            c1[] arr_c1 = (c1[])atomicReference0.get();
            if(arr_c1 == d1.r) {
                DisposableHelper.dispose(c10);
                return;
            }
            c1[] arr_c11 = new c1[arr_c1.length + 1];
            System.arraycopy(arr_c1, 0, arr_c11, 0, arr_c1.length);
            arr_c11[arr_c1.length] = c10;
            do {
                if(atomicReference0.compareAndSet(arr_c1, arr_c11)) {
                    observableSource0.subscribe(c10);
                    return;
                }
            }
            while(atomicReference0.get() == arr_c1);
        }
    }

    public final void g(int v) {
        while(v != 0) {
            __monitor_enter(this);
            int v1 = FIN.finallyOpen$NT();
            ObservableSource observableSource0 = (ObservableSource)this.o.poll();
            if(observableSource0 == null) {
                --this.p;
                FIN.finallyExec$NT(v1);
            }
            else {
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v1);
                this.f(observableSource0);
            }
            --v;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.g) {
            return;
        }
        this.g = true;
        this.c();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(this.h.addThrowable(throwable0)) {
            this.g = true;
            this.c();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        if(this.g) {
            return;
        }
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.k.dispose();
            this.onError(throwable0);
            return;
        }
        if(this.d != 0x7FFFFFFF) {
            synchronized(this) {
                int v1 = this.p;
                if(v1 == this.d) {
                    this.o.offer(observableSource0);
                    return;
                }
                this.p = v1 + 1;
            }
        }
        this.f(observableSource0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.k, disposable0)) {
            this.k = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

