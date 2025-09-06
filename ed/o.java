package ed;

import dd.e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class o extends AtomicInteger implements Observer, Disposable {
    public final CompletableObserver a;
    public final Function b;
    public final ErrorMode c;
    public final AtomicThrowable d;
    public final e e;
    public final int f;
    public SimpleQueue g;
    public Disposable h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;

    public o(CompletableObserver completableObserver0, Function function0, ErrorMode errorMode0, int v) {
        this.a = completableObserver0;
        this.b = function0;
        this.c = errorMode0;
        this.f = v;
        this.d = new AtomicThrowable();
        this.e = new e(this, 3);
    }

    public final void a() {
        boolean z1;
        CompletableSource completableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        AtomicThrowable atomicThrowable0 = this.d;
        ErrorMode errorMode0 = this.c;
        do {
            if(this.k) {
                this.g.clear();
                return;
            }
            if(!this.i) {
                if(errorMode0 == ErrorMode.BOUNDARY && atomicThrowable0.get() != null) {
                    this.k = true;
                    this.g.clear();
                    Throwable throwable0 = atomicThrowable0.terminate();
                    this.a.onError(throwable0);
                    return;
                }
                try {
                    boolean z = this.j;
                    Object object0 = this.g.poll();
                    if(object0 == null) {
                        completableSource0 = null;
                        z1 = true;
                    }
                    else {
                        completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null CompletableSource");
                        z1 = false;
                    }
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    this.k = true;
                    this.g.clear();
                    this.h.dispose();
                    atomicThrowable0.addThrowable(throwable1);
                    Throwable throwable2 = atomicThrowable0.terminate();
                    this.a.onError(throwable2);
                    return;
                }
                if(z && z1) {
                    this.k = true;
                    Throwable throwable3 = atomicThrowable0.terminate();
                    if(throwable3 != null) {
                        this.a.onError(throwable3);
                        return;
                    }
                    this.a.onComplete();
                    return;
                }
                if(!z1) {
                    this.i = true;
                    completableSource0.subscribe(this.e);
                }
            }
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.k = true;
        this.h.dispose();
        this.e.getClass();
        DisposableHelper.dispose(this.e);
        if(this.getAndIncrement() == 0) {
            this.g.clear();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.k;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.j = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            if(this.c != ErrorMode.IMMEDIATE) {
                this.j = true;
                this.a();
                return;
            }
            this.k = true;
            this.e.getClass();
            DisposableHelper.dispose(this.e);
            Throwable throwable1 = this.d.terminate();
            if(throwable1 != ExceptionHelper.TERMINATED) {
                this.a.onError(throwable1);
            }
            if(this.getAndIncrement() == 0) {
                this.g.clear();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(object0 != null) {
            this.g.offer(object0);
        }
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.h, disposable0)) {
            this.h = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(3);
                if(v == 1) {
                    this.g = (QueueDisposable)disposable0;
                    this.j = true;
                    this.a.onSubscribe(this);
                    this.a();
                    return;
                }
                if(v == 2) {
                    this.g = (QueueDisposable)disposable0;
                    this.a.onSubscribe(this);
                    return;
                }
            }
            this.g = new SpscLinkedArrayQueue(this.f);
            this.a.onSubscribe(this);
        }
    }
}

