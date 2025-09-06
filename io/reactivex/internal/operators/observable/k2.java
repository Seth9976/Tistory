package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class k2 extends BasicIntQueueDisposable {
    public final int a;
    public final Observer b;
    public final long c;
    public long d;
    public boolean e;

    public k2(Observer observer0, long v, long v1, int v2) {
        this.a = v2;
        super();
        this.b = observer0;
        this.d = v;
        this.c = v1;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        if(this.a != 0) {
            this.d = this.c;
            this.lazySet(1);
            return;
        }
        this.d = this.c;
        this.lazySet(1);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.set(1);
            return;
        }
        this.set(1);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() != 0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.d == this.c;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if(this.a != 0) {
            long v = this.d;
            if(v != this.c) {
                this.d = v + 1L;
                return v;
            }
            this.lazySet(1);
            return null;
        }
        long v1 = this.d;
        if(v1 != this.c) {
            this.d = v1 + 1L;
            return (int)v1;
        }
        this.lazySet(1);
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if(this.a != 0) {
            if((v & 1) != 0) {
                this.e = true;
                return 1;
            }
            return 0;
        }
        if((v & 1) != 0) {
            this.e = true;
            return 1;
        }
        return 0;
    }
}

