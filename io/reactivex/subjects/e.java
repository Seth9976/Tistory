package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends AtomicBoolean implements Disposable {
    public final Observer a;
    public final PublishSubject b;

    public e(Observer observer0, PublishSubject publishSubject0) {
        this.a = observer0;
        this.b = publishSubject0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.compareAndSet(false, true)) {
            this.b.d(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }
}

