package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.flowable.x3;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.TimeUnit;

public final class ObservableRefCount extends Observable {
    public final ConnectableObservable a;
    public final int b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public x3 f;

    public ObservableRefCount(ConnectableObservable connectableObservable0) {
        this(connectableObservable0, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public ObservableRefCount(ConnectableObservable connectableObservable0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = connectableObservable0;
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
    }

    public final void d(x3 x30) {
        synchronized(this) {
            if(this.a instanceof ObservablePublishClassic) {
                if(this.f != null && this.f == x30) {
                    this.f = null;
                    SequentialDisposable sequentialDisposable0 = x30.b;
                    if(sequentialDisposable0 != null) {
                        sequentialDisposable0.dispose();
                        x30.b = null;
                    }
                }
                long v1 = x30.c - 1L;
                x30.c = v1;
                if(v1 == 0L) {
                    ConnectableObservable connectableObservable0 = this.a;
                    if(connectableObservable0 instanceof Disposable) {
                        ((Disposable)connectableObservable0).dispose();
                    }
                    else if(connectableObservable0 instanceof ResettableConnectable) {
                        ((ResettableConnectable)connectableObservable0).resetIf(((Disposable)x30.get()));
                    }
                }
            }
            else if(this.f != null && this.f == x30) {
                SequentialDisposable sequentialDisposable1 = x30.b;
                if(sequentialDisposable1 != null) {
                    sequentialDisposable1.dispose();
                    x30.b = null;
                }
                long v2 = x30.c - 1L;
                x30.c = v2;
                if(v2 == 0L) {
                    this.f = null;
                    ConnectableObservable connectableObservable1 = this.a;
                    if(connectableObservable1 instanceof Disposable) {
                        ((Disposable)connectableObservable1).dispose();
                    }
                    else if(connectableObservable1 instanceof ResettableConnectable) {
                        ((ResettableConnectable)connectableObservable1).resetIf(((Disposable)x30.get()));
                    }
                }
            }
        }
    }

    public final void e(x3 x30) {
        synchronized(this) {
            if(x30.c == 0L && x30 == this.f) {
                this.f = null;
                Disposable disposable0 = (Disposable)x30.get();
                DisposableHelper.dispose(x30);
                ConnectableObservable connectableObservable0 = this.a;
                if(connectableObservable0 instanceof Disposable) {
                    ((Disposable)connectableObservable0).dispose();
                }
                else if(connectableObservable0 instanceof ResettableConnectable) {
                    if(disposable0 == null) {
                        x30.e = true;
                    }
                    else {
                        ((ResettableConnectable)connectableObservable0).resetIf(disposable0);
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        x3 x30;
        boolean z;
        synchronized(this) {
            x30 = this.f;
            if(x30 == null) {
                x30 = new x3(this, 1);
                this.f = x30;
            }
            long v1 = x30.c;
            if(v1 == 0L) {
                SequentialDisposable sequentialDisposable0 = x30.b;
                if(sequentialDisposable0 != null) {
                    sequentialDisposable0.dispose();
                }
            }
            x30.c = v1 + 1L;
            if(x30.d || v1 + 1L != ((long)this.b)) {
                z = false;
            }
            else {
                z = true;
                x30.d = true;
            }
        }
        l2 l20 = new l2(observer0, this, x30);
        this.a.subscribe(l20);
        if(z) {
            this.a.connect(x30);
        }
    }
}

