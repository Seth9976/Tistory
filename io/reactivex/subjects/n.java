package io.reactivex.subjects;

import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class n extends BasicIntQueueDisposable {
    public final UnicastSubject a;

    public n(UnicastSubject unicastSubject0) {
        this.a = unicastSubject0;
        super();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.a.a.clear();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.a.e) {
            this.a.e = true;
            this.a.d();
            this.a.b.lazySet(null);
            if(this.a.i.getAndIncrement() == 0) {
                this.a.b.lazySet(null);
                UnicastSubject unicastSubject0 = this.a;
                if(!unicastSubject0.j) {
                    unicastSubject0.a.clear();
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.e;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.a.a.isEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return this.a.a.poll();
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.a.j = true;
            return 2;
        }
        return 0;
    }
}

