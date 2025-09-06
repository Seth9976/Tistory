package io.reactivex.internal.schedulers;

import androidx.core.app.o;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;

public final class s extends u {
    public final Runnable a;

    public s(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // io.reactivex.internal.schedulers.u
    public final Disposable a(Worker scheduler$Worker0, CompletableObserver completableObserver0) {
        return scheduler$Worker0.schedule(new o(this.a, completableObserver0, false, 26));
    }
}

