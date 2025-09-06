package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableRefCount extends Flowable {
    public final ConnectableFlowable b;
    public final int c;
    public final long d;
    public final TimeUnit e;
    public final Scheduler f;
    public x3 g;

    public FlowableRefCount(ConnectableFlowable connectableFlowable0) {
        this(connectableFlowable0, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public FlowableRefCount(ConnectableFlowable connectableFlowable0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.b = connectableFlowable0;
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.f = scheduler0;
    }

    public final void e(x3 x30) {
        synchronized(this) {
            if(this.b instanceof FlowablePublishClassic) {
                if(this.g != null && this.g == x30) {
                    this.g = null;
                    SequentialDisposable sequentialDisposable0 = x30.b;
                    if(sequentialDisposable0 != null) {
                        sequentialDisposable0.dispose();
                        x30.b = null;
                    }
                }
                long v1 = x30.c - 1L;
                x30.c = v1;
                if(v1 == 0L) {
                    ConnectableFlowable connectableFlowable0 = this.b;
                    if(connectableFlowable0 instanceof Disposable) {
                        ((Disposable)connectableFlowable0).dispose();
                    }
                    else if(connectableFlowable0 instanceof ResettableConnectable) {
                        ((ResettableConnectable)connectableFlowable0).resetIf(((Disposable)x30.get()));
                    }
                }
            }
            else if(this.g != null && this.g == x30) {
                SequentialDisposable sequentialDisposable1 = x30.b;
                if(sequentialDisposable1 != null) {
                    sequentialDisposable1.dispose();
                    x30.b = null;
                }
                long v2 = x30.c - 1L;
                x30.c = v2;
                if(v2 == 0L) {
                    this.g = null;
                    ConnectableFlowable connectableFlowable1 = this.b;
                    if(connectableFlowable1 instanceof Disposable) {
                        ((Disposable)connectableFlowable1).dispose();
                    }
                    else if(connectableFlowable1 instanceof ResettableConnectable) {
                        ((ResettableConnectable)connectableFlowable1).resetIf(((Disposable)x30.get()));
                    }
                }
            }
        }
    }

    public final void f(x3 x30) {
        synchronized(this) {
            if(x30.c == 0L && x30 == this.g) {
                this.g = null;
                Disposable disposable0 = (Disposable)x30.get();
                DisposableHelper.dispose(x30);
                ConnectableFlowable connectableFlowable0 = this.b;
                if(connectableFlowable0 instanceof Disposable) {
                    ((Disposable)connectableFlowable0).dispose();
                }
                else if(connectableFlowable0 instanceof ResettableConnectable) {
                    if(disposable0 == null) {
                        x30.e = true;
                    }
                    else {
                        ((ResettableConnectable)connectableFlowable0).resetIf(disposable0);
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        x3 x30;
        boolean z;
        synchronized(this) {
            x30 = this.g;
            if(x30 == null) {
                x30 = new x3(this, 0);
                this.g = x30;
            }
            long v1 = x30.c;
            if(v1 == 0L) {
                SequentialDisposable sequentialDisposable0 = x30.b;
                if(sequentialDisposable0 != null) {
                    sequentialDisposable0.dispose();
                }
            }
            x30.c = v1 + 1L;
            if(x30.d || v1 + 1L != ((long)this.c)) {
                z = false;
            }
            else {
                z = true;
                x30.d = true;
            }
        }
        y3 y30 = new y3(subscriber0, this, x30);
        this.b.subscribe(y30);
        if(z) {
            this.b.connect(x30);
        }
    }
}

