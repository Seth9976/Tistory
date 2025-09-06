package io.reactivex.internal.schedulers;

import androidx.core.app.o;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class z extends Worker {
    public final PriorityBlockingQueue a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public volatile boolean d;

    public z() {
        this.a = new PriorityBlockingQueue();
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public final Disposable a(long v, Runnable runnable0) {
        if(this.d) {
            return EmptyDisposable.INSTANCE;
        }
        y y0 = new y(runnable0, v, this.c.incrementAndGet());
        this.a.add(y0);
        if(this.b.getAndIncrement() == 0) {
            int v1 = 1;
            while(true) {
                if(this.d) {
                    this.a.clear();
                    return EmptyDisposable.INSTANCE;
                }
                y y1 = (y)this.a.poll();
                if(y1 == null) {
                    v1 = this.b.addAndGet(-v1);
                    if(v1 != 0) {
                        continue;
                    }
                    return EmptyDisposable.INSTANCE;
                }
                if(!y1.d) {
                    y1.a.run();
                }
            }
        }
        return Disposables.fromRunnable(new o(this, y0, false, 27));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0) {
        return this.a(this.now(TimeUnit.MILLISECONDS), runnable0);
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        long v1 = this.now(TimeUnit.MILLISECONDS);
        long v2 = timeUnit0.toMillis(v) + v1;
        return this.a(v2, new x(runnable0, this, v2));
    }
}

