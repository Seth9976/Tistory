package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m extends Worker implements Runnable {
    public final CompositeDisposable a;
    public final l b;
    public final n c;
    public final AtomicBoolean d;

    public m(l l0) {
        n n1;
        n n0;
        this.d = new AtomicBoolean();
        this.b = l0;
        this.a = new CompositeDisposable();
        CompositeDisposable compositeDisposable0 = l0.c;
        if(compositeDisposable0.isDisposed()) {
            n0 = IoScheduler.i;
        }
        else {
            do {
                ConcurrentLinkedQueue concurrentLinkedQueue0 = l0.b;
                if(concurrentLinkedQueue0.isEmpty()) {
                    goto label_14;
                }
                n1 = (n)concurrentLinkedQueue0.poll();
            }
            while(n1 == null);
            n n2 = n1;
            n0 = n2;
            this.c = n0;
            return;
        label_14:
            n2 = new n(l0.f);
            compositeDisposable0.add(n2);
            n0 = n2;
        }
        this.c = n0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.d.compareAndSet(false, true)) {
            this.a.dispose();
            if(IoScheduler.j) {
                this.c.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            this.b.getClass();
            this.c.c = System.nanoTime() + this.b.a;
            this.b.b.offer(this.c);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.get();
    }

    @Override
    public final void run() {
        this.b.getClass();
        this.c.c = System.nanoTime() + this.b.a;
        this.b.b.offer(this.c);
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return this.a.isDisposed() ? EmptyDisposable.INSTANCE : this.c.scheduleActual(runnable0, v, timeUnit0, this.a);
    }
}

