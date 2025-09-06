package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class o3 implements Observer {
    public final int a;
    public final SpscLinkedArrayQueue b;
    public final int c;
    public volatile boolean d;
    public Throwable e;
    public final AtomicInteger f;

    public o3(n3 n30, int v, int v1) {
        this.a = 0;
        super();
        this.f = n30;
        this.c = v;
        this.b = new SpscLinkedArrayQueue(v1);
    }

    public o3(n3 n30, int v, int v1, byte b) {
        this.a = 1;
        super();
        this.f = n30;
        this.c = v;
        this.b = new SpscLinkedArrayQueue(v1);
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.d = true;
            ((n3)this.f).a();
            return;
        }
        this.d = true;
        ((n3)this.f).a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.e = throwable0;
            this.d = true;
            ((n3)this.f).a();
            return;
        }
        this.e = throwable0;
        this.d = true;
        ((n3)this.f).a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.b.offer(object0);
            ((n3)this.f).a();
            return;
        }
        this.b.offer(object0);
        ((n3)this.f).a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            ((n3)this.f).c.setResource(this.c, disposable0);
            return;
        }
        ((n3)this.f).c.setResource(this.c, disposable0);
    }
}

