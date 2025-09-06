package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class u3 extends AtomicReference implements Observer {
    public final v3 a;
    public final long b;
    public final int c;
    public volatile SimpleQueue d;
    public volatile boolean e;

    public u3(v3 v30, long v, int v1) {
        this.a = v30;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.b == this.a.j) {
            this.e = true;
            this.a.b();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        v3 v30 = this.a;
        v30.getClass();
        if(this.b == v30.j && v30.e.addThrowable(throwable0)) {
            if(!v30.d) {
                v30.h.dispose();
                v30.f = true;
            }
            this.e = true;
            v30.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.b == this.a.j) {
            if(object0 != null) {
                this.d.offer(object0);
            }
            this.a.b();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(7);
                if(v == 1) {
                    this.d = (QueueDisposable)disposable0;
                    this.e = true;
                    this.a.b();
                    return;
                }
                if(v == 2) {
                    this.d = (QueueDisposable)disposable0;
                    return;
                }
            }
            this.d = new SpscLinkedArrayQueue(this.c);
        }
    }
}

