package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g extends AtomicBoolean implements Disposable, Runnable {
    public final Runnable a;

    public g(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.lazySet(true);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }

    @Override
    public final void run() {
        if(this.get()) {
            return;
        }
        try {
            this.a.run();
        }
        finally {
            this.lazySet(true);
        }
    }
}

