package io.reactivex.internal.subscribers;

import g.a;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

public abstract class QueueDrainSubscriber extends a implements FlowableSubscriber, QueueDrain {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final Subscriber downstream;
    protected Throwable error;
    public final AtomicInteger l;
    public final AtomicLong m;
    protected final SimplePlainQueue queue;

    public QueueDrainSubscriber(Subscriber subscriber0, SimplePlainQueue simplePlainQueue0) {
        this.l = new AtomicInteger();
        this.m = new AtomicLong();
        this.downstream = subscriber0;
        this.queue = simplePlainQueue0;
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public boolean accept(Subscriber subscriber0, Object object0) {
        return false;
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        return this.l.getAndIncrement() == 0;
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        return this.l.get() == 0 && this.l.compareAndSet(0, 1);
    }

    public final void fastPathEmitMax(Object object0, boolean z, Disposable disposable0) {
        Subscriber subscriber0 = this.downstream;
        SimplePlainQueue simplePlainQueue0 = this.queue;
        if(this.fastEnter()) {
            long v = this.m.get();
            if(v == 0L) {
                disposable0.dispose();
                subscriber0.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
            if(this.accept(subscriber0, object0) && v != 0x7FFFFFFFFFFFFFFFL) {
                this.produced(1L);
            }
            if(this.leave(-1) == 0) {
                return;
            }
        }
        else {
            simplePlainQueue0.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue0, subscriber0, z, disposable0, this);
    }

    public final void fastPathOrderedEmitMax(Object object0, boolean z, Disposable disposable0) {
        Subscriber subscriber0 = this.downstream;
        SimplePlainQueue simplePlainQueue0 = this.queue;
        if(this.fastEnter()) {
            long v = this.m.get();
            if(v == 0L) {
                this.cancelled = true;
                disposable0.dispose();
                subscriber0.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
            if(simplePlainQueue0.isEmpty()) {
                if(this.accept(subscriber0, object0) && v != 0x7FFFFFFFFFFFFFFFL) {
                    this.produced(1L);
                }
                if(this.leave(-1) == 0) {
                    return;
                }
            }
            else {
                simplePlainQueue0.offer(object0);
                QueueDrainHelper.drainMaxLoop(simplePlainQueue0, subscriber0, z, disposable0, this);
                return;
            }
        }
        else {
            simplePlainQueue0.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue0, subscriber0, z, disposable0, this);
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final int leave(int v) {
        return this.l.addAndGet(v);
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final long produced(long v) {
        return this.m.addAndGet(-v);
    }

    public void request(long v) {
        this.requested(v);
    }

    @Override  // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.m.get();
    }

    public final void requested(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.m, v);
        }
    }
}

