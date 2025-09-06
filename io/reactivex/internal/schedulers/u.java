package io.reactivex.internal.schedulers;

import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public abstract class u extends AtomicReference implements Disposable {
    public u() {
        super(SchedulerWhen.f);
    }

    public abstract Disposable a(Worker arg1, CompletableObserver arg2);

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable disposable1;
        Disposable disposable0 = SchedulerWhen.g;
        do {
            disposable1 = (Disposable)this.get();
            if(disposable1 == SchedulerWhen.g) {
                return;
            }
        }
        while(!this.compareAndSet(disposable1, disposable0));
        if(disposable1 != SchedulerWhen.f) {
            disposable1.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return ((Disposable)this.get()).isDisposed();
    }
}

