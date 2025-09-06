package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class g extends AtomicInteger implements Disposable {
    public final Observer a;
    public final ReplaySubject b;
    public Serializable c;
    public volatile boolean d;

    public g(Observer observer0, ReplaySubject replaySubject0) {
        this.a = observer0;
        this.b = replaySubject0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.d) {
            this.d = true;
            this.b.d(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }
}

