package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class b5 implements Observer {
    public final a5 a;
    public final SpscLinkedArrayQueue b;
    public volatile boolean c;
    public Throwable d;
    public final AtomicReference e;

    public b5(a5 a50, int v) {
        this.e = new AtomicReference();
        this.a = a50;
        this.b = new SpscLinkedArrayQueue(v);
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.c = true;
        this.a.b();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.d = throwable0;
        this.c = true;
        this.a.b();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.b.offer(object0);
        this.a.b();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.e, disposable0);
    }
}

