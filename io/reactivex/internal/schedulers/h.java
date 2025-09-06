package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.atomic.AtomicInteger;

public final class h extends AtomicInteger implements Disposable, Runnable {
    public final Runnable a;
    public final DisposableContainer b;
    public volatile Thread c;

    public h(Runnable runnable0, DisposableContainer disposableContainer0) {
        this.a = runnable0;
        this.b = disposableContainer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
    alab1:
        while(true) {
            do {
                int v = this.get();
                if(v >= 2) {
                    break alab1;
                }
                if(v != 0) {
                    goto label_8;
                }
            }
            while(!this.compareAndSet(0, 4));
            DisposableContainer disposableContainer0 = this.b;
            if(disposableContainer0 == null) {
                break;
            }
            disposableContainer0.delete(this);
            return;
        label_8:
            if(this.compareAndSet(1, 3)) {
                Thread thread0 = this.c;
                if(thread0 != null) {
                    thread0.interrupt();
                    this.c = null;
                }
                this.set(4);
                DisposableContainer disposableContainer1 = this.b;
                if(disposableContainer1 == null) {
                    break;
                }
                disposableContainer1.delete(this);
                return;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() >= 2;
    }

    @Override
    public final void run() {
        if(this.get() == 0) {
            this.c = Thread.currentThread();
            if(this.compareAndSet(0, 1)) {
                try {
                    this.a.run();
                }
                catch(Throwable throwable0) {
                    this.c = null;
                    if(this.compareAndSet(1, 2)) {
                        DisposableContainer disposableContainer0 = this.b;
                        if(disposableContainer0 != null) {
                            disposableContainer0.delete(this);
                        }
                    }
                    else {
                        while(this.get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    }
                    throw throwable0;
                }
                this.c = null;
                if(!this.compareAndSet(1, 2)) {
                    goto label_23;
                }
                DisposableContainer disposableContainer1 = this.b;
                if(disposableContainer1 != null) {
                    disposableContainer1.delete(this);
                    return;
                label_23:
                    while(this.get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
            }
            else {
                this.c = null;
            }
        }
    }
}

