package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.subjects.Subject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class p2 extends AtomicInteger implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final AtomicInteger c;
    public final AtomicThrowable d;
    public final Subject e;
    public final AtomicReference f;
    public final ObservableSource g;
    public volatile boolean h;
    public final AtomicReference i;

    public p2(Observer observer0, Subject subject0, ObservableSource observableSource0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = observer0;
            this.e = subject0;
            this.g = observableSource0;
            this.c = new AtomicInteger();
            this.d = new AtomicThrowable();
            this.i = new o2(this, 0);
            this.f = new AtomicReference();
            return;
        }
        super();
        this.b = observer0;
        this.e = subject0;
        this.g = observableSource0;
        this.c = new AtomicInteger();
        this.d = new AtomicThrowable();
        this.i = new o2(this, 1);
        this.f = new AtomicReference();
    }

    public final void a() {
        if(this.a != 0) {
            if(this.c.getAndIncrement() == 0) {
                while(!this.isDisposed()) {
                    if(!this.h) {
                        this.h = true;
                        this.g.subscribe(this);
                    }
                    if(this.c.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
            return;
        }
        if(this.c.getAndIncrement() == 0) {
            while(!this.isDisposed()) {
                if(!this.h) {
                    this.h = true;
                    this.g.subscribe(this);
                }
                if(this.c.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(this.f);
            DisposableHelper.dispose(((o2)this.i));
            return;
        }
        DisposableHelper.dispose(this.f);
        DisposableHelper.dispose(((o2)this.i));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.f.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            DisposableHelper.dispose(((o2)this.i));
            HalfSerializer.onComplete(this.b, this, this.d);
            return;
        }
        DisposableHelper.replace(this.f, null);
        this.h = false;
        this.e.onNext(0);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            DisposableHelper.replace(this.f, null);
            this.h = false;
            this.e.onNext(throwable0);
            return;
        }
        DisposableHelper.dispose(((o2)this.i));
        HalfSerializer.onError(this.b, throwable0, this, this.d);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            HalfSerializer.onNext(this.b, object0, this, this.d);
            return;
        }
        HalfSerializer.onNext(this.b, object0, this, this.d);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.replace(this.f, disposable0);
            return;
        }
        DisposableHelper.setOnce(this.f, disposable0);
    }
}

