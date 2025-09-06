package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

public final class a0 extends AtomicInteger implements Disposable {
    public final Observer a;
    public final Function b;
    public final z[] c;
    public Object[] d;
    public final SpscLinkedArrayQueue e;
    public final boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public final AtomicThrowable i;
    public int j;
    public int k;

    public a0(int v, int v1, Observer observer0, Function function0, boolean z) {
        this.i = new AtomicThrowable();
        this.a = observer0;
        this.b = function0;
        this.f = z;
        this.d = new Object[v];
        z[] arr_z = new z[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_z[v2] = new z(this, v2);
        }
        this.c = arr_z;
        this.e = new SpscLinkedArrayQueue(v1);
    }

    public final void a() {
        z[] arr_z = this.c;
        for(int v = 0; v < arr_z.length; ++v) {
            z z0 = arr_z[v];
            z0.getClass();
            DisposableHelper.dispose(z0);
        }
    }

    public final void b(SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        synchronized(this) {
            this.d = null;
        }
        spscLinkedArrayQueue0.clear();
    }

    public final void c() {
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.e;
        Observer observer0 = this.a;
        boolean z = this.f;
        int v = 1;
        while(true) {
            if(this.g) {
                this.b(spscLinkedArrayQueue0);
                return;
            }
            if(!z && this.i.get() != null) {
                this.a();
                this.b(spscLinkedArrayQueue0);
                observer0.onError(this.i.terminate());
                return;
            }
            boolean z1 = this.h;
            Object[] arr_object = (Object[])spscLinkedArrayQueue0.poll();
            if(z1 && arr_object == null) {
                this.b(spscLinkedArrayQueue0);
                Throwable throwable0 = this.i.terminate();
                if(throwable0 == null) {
                    observer0.onComplete();
                    return;
                }
                observer0.onError(throwable0);
                return;
            }
            if(arr_object == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            try {
                object0 = ObjectHelper.requireNonNull(this.b.apply(arr_object), "The combiner returned a null value");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.i.addThrowable(throwable1);
                this.a();
                this.b(spscLinkedArrayQueue0);
                observer0.onError(this.i.terminate());
                return;
            }
            observer0.onNext(object0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.g) {
            this.g = true;
            this.a();
            if(this.getAndIncrement() == 0) {
                this.b(this.e);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }
}

