package io.reactivex.internal.observers;

import g.b;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class QueueDrainObserver extends b implements Observer, ObservableQueueDrain {
    public final AtomicInteger b;
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final Observer downstream;
    protected Throwable error;
    protected final SimplePlainQueue queue;

    public QueueDrainObserver(Observer observer0, SimplePlainQueue simplePlainQueue0) {
        this.b = new AtomicInteger();
        this.downstream = observer0;
        this.queue = simplePlainQueue0;
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public void accept(Observer observer0, Object object0) {
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean enter() {
        return this.b.getAndIncrement() == 0;
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        return this.b.get() == 0 && this.b.compareAndSet(0, 1);
    }

    public final void fastPathEmit(Object object0, boolean z, Disposable disposable0) {
        Observer observer0 = this.downstream;
        SimplePlainQueue simplePlainQueue0 = this.queue;
        if(this.b.get() != 0 || !this.b.compareAndSet(0, 1)) {
            simplePlainQueue0.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        else {
            this.accept(observer0, object0);
            if(this.leave(-1) == 0) {
                return;
            }
        }
        QueueDrainHelper.drainLoop(simplePlainQueue0, observer0, z, disposable0, this);
    }

    public final void fastPathOrderedEmit(Object object0, boolean z, Disposable disposable0) {
        Observer observer0 = this.downstream;
        SimplePlainQueue simplePlainQueue0 = this.queue;
        if(this.b.get() != 0 || !this.b.compareAndSet(0, 1)) {
            simplePlainQueue0.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        else if(simplePlainQueue0.isEmpty()) {
            this.accept(observer0, object0);
            if(this.leave(-1) == 0) {
                return;
            }
        }
        else {
            simplePlainQueue0.offer(object0);
        }
        QueueDrainHelper.drainLoop(simplePlainQueue0, observer0, z, disposable0, this);
    }

    @Override  // io.reactivex.internal.util.ObservableQueueDrain
    public final int leave(int v) {
        return this.b.addAndGet(v);
    }
}

