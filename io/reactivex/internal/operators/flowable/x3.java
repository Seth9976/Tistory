package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import java.util.concurrent.atomic.AtomicReference;

public final class x3 extends AtomicReference implements Consumer, Runnable {
    public final int a;
    public SequentialDisposable b;
    public long c;
    public boolean d;
    public boolean e;
    public final Object f;

    public x3(Object object0, int v) {
        this.a = v;
        super();
        this.f = object0;
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        if(this.a != 0) {
            DisposableHelper.replace(this, ((Disposable)object0));
            ObservableRefCount observableRefCount0 = (ObservableRefCount)this.f;
            synchronized(observableRefCount0) {
                if(this.e) {
                    ((ResettableConnectable)((ObservableRefCount)this.f).a).resetIf(((Disposable)object0));
                }
            }
            return;
        }
        DisposableHelper.replace(this, ((Disposable)object0));
        synchronized(((FlowableRefCount)this.f)) {
            if(this.e) {
                ((ResettableConnectable)((FlowableRefCount)this.f).b).resetIf(((Disposable)object0));
            }
        }
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ((ObservableRefCount)this.f).e(this);
            return;
        }
        ((FlowableRefCount)this.f).f(this);
    }
}

