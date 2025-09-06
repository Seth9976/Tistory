package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.TimeUnit;

public final class u4 extends QueueDrainObserver implements Disposable, Runnable {
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final int f;
    public Disposable g;
    public UnicastSubject h;
    public final SequentialDisposable i;
    public volatile boolean j;
    public static final Object k;

    static {
        u4.k = new Object();
    }

    public u4(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.i = new SequentialDisposable();
        this.c = v;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = v1;
    }

    public final void M() {
        MpscLinkedQueue mpscLinkedQueue0 = (MpscLinkedQueue)this.queue;
        Observer observer0 = this.downstream;
        UnicastSubject unicastSubject0 = this.h;
        int v = 1;
        while(true) {
            boolean z = this.j;
            boolean z1 = this.done;
            Object object0 = mpscLinkedQueue0.poll();
            Object object1 = u4.k;
            if(z1 && (object0 == null || object0 == object1)) {
                this.h = null;
                mpscLinkedQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    unicastSubject0.onComplete();
                }
                else {
                    unicastSubject0.onError(throwable0);
                }
                this.i.dispose();
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(object0 == object1) {
                unicastSubject0.onComplete();
                if(z) {
                    this.g.dispose();
                }
                else {
                    unicastSubject0 = UnicastSubject.create(this.f);
                    this.h = unicastSubject0;
                    observer0.onNext(unicastSubject0);
                }
            }
            else {
                unicastSubject0.onNext(object0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.cancelled = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.done = true;
        if(this.enter()) {
            this.M();
        }
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.M();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.j) {
            return;
        }
        if(this.fastEnter()) {
            this.h.onNext(object0);
            if(this.leave(-1) == 0) {
                return;
            }
        }
        else {
            this.queue.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        this.M();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.h = UnicastSubject.create(this.f);
            this.downstream.onSubscribe(this);
            this.downstream.onNext(this.h);
            if(!this.cancelled) {
                Disposable disposable1 = this.e.schedulePeriodicallyDirect(this, this.c, this.c, this.d);
                this.i.replace(disposable1);
            }
        }
    }

    @Override
    public final void run() {
        if(this.cancelled) {
            this.j = true;
        }
        this.queue.offer(u4.k);
        if(this.enter()) {
            this.M();
        }
    }
}

