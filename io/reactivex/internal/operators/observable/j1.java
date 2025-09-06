package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

public final class j1 extends BasicQueueDisposable {
    public final Observer a;
    public final Iterator b;
    public volatile boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public j1(Observer observer0, Iterator iterator0) {
        this.a = observer0;
        this.b = iterator0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.e = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.e;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if(this.e) {
            return null;
        }
        Iterator iterator0 = this.b;
        if(!this.f) {
            this.f = true;
        }
        else if(!iterator0.hasNext()) {
            this.e = true;
            return null;
        }
        Object object0 = iterator0.next();
        return ObjectHelper.requireNonNull(object0, "The iterator returned a null value");
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

