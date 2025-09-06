package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class i1 extends BasicQueueDisposable {
    public final Observer a;
    public final Object[] b;
    public int c;
    public boolean d;
    public volatile boolean e;

    public i1(Observer observer0, Object[] arr_object) {
        this.a = observer0;
        this.b = arr_object;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.c = this.b.length;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        int v = this.c;
        Object[] arr_object = this.b;
        if(v != arr_object.length) {
            this.c = v + 1;
            return ObjectHelper.requireNonNull(arr_object[v], "The array element is null");
        }
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 1) != 0) {
            this.d = true;
            return 1;
        }
        return 0;
    }
}

