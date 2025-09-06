package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;

public final class p extends Completable {
    public final u a;
    public final q b;

    public p(q q0, u u0) {
        this.b = q0;
        super();
        this.a = u0;
    }

    @Override  // io.reactivex.Completable
    public final void subscribeActual(CompletableObserver completableObserver0) {
        u u0 = this.a;
        completableObserver0.onSubscribe(u0);
        Worker scheduler$Worker0 = this.b.a;
        Disposable disposable0 = (Disposable)u0.get();
        if(disposable0 != SchedulerWhen.g) {
            v v0 = SchedulerWhen.f;
            if(disposable0 == v0) {
                Disposable disposable1 = u0.a(scheduler$Worker0, completableObserver0);
                if(!u0.compareAndSet(v0, disposable1)) {
                    disposable1.dispose();
                }
            }
        }
    }
}

