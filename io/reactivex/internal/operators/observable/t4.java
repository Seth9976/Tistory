package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.TimeUnit;

public final class t4 extends QueueDrainObserver implements Disposable {
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final int f;
    public final boolean g;
    public final long h;
    public final Worker i;
    public long j;
    public long k;
    public Disposable l;
    public UnicastSubject m;
    public volatile boolean n;
    public final SequentialDisposable o;

    public t4(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, long v2, boolean z) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.o = new SequentialDisposable();
        this.c = v;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = v1;
        this.h = v2;
        this.g = z;
        if(z) {
            this.i = scheduler0.createWorker();
            return;
        }
        this.i = null;
    }

    public static boolean M(t4 t40) {
        return t40.cancelled;
    }

    public static SimplePlainQueue N(t4 t40) {
        return t40.queue;
    }

    public final void O() {
        MpscLinkedQueue mpscLinkedQueue0 = (MpscLinkedQueue)this.queue;
        Observer observer0 = this.downstream;
        UnicastSubject unicastSubject0 = this.m;
        int v = 1;
        while(true) {
            if(this.n) {
                this.l.dispose();
                mpscLinkedQueue0.clear();
                DisposableHelper.dispose(this.o);
                Worker scheduler$Worker0 = this.i;
                if(scheduler$Worker0 != null) {
                    scheduler$Worker0.dispose();
                }
                return;
            }
            boolean z = this.done;
            Object object0 = mpscLinkedQueue0.poll();
            if(z && (object0 == null || object0 instanceof s4)) {
                this.m = null;
                mpscLinkedQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    unicastSubject0.onComplete();
                }
                else {
                    unicastSubject0.onError(throwable0);
                }
                DisposableHelper.dispose(this.o);
                Worker scheduler$Worker1 = this.i;
                if(scheduler$Worker1 != null) {
                    scheduler$Worker1.dispose();
                }
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(!(object0 instanceof s4)) {
                unicastSubject0.onNext(object0);
                long v1 = this.j + 1L;
                if(v1 >= this.h) {
                    ++this.k;
                    this.j = 0L;
                    unicastSubject0.onComplete();
                    unicastSubject0 = UnicastSubject.create(this.f);
                    this.m = unicastSubject0;
                    this.downstream.onNext(unicastSubject0);
                    if(!this.g) {
                        continue;
                    }
                    Disposable disposable0 = (Disposable)this.o.get();
                    disposable0.dispose();
                    s4 s40 = new s4(this.k, this);
                    Disposable disposable1 = this.i.schedulePeriodically(s40, this.c, this.c, this.d);
                    if(this.o.compareAndSet(disposable0, disposable1)) {
                        continue;
                    }
                    disposable1.dispose();
                }
                else {
                    this.j = v1;
                }
            }
            else if(!this.g || this.k == ((s4)object0).a) {
                unicastSubject0.onComplete();
                this.j = 0L;
                unicastSubject0 = UnicastSubject.create(this.f);
                this.m = unicastSubject0;
                observer0.onNext(unicastSubject0);
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
            this.O();
        }
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.O();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.n) {
            return;
        }
        if(this.fastEnter()) {
            UnicastSubject unicastSubject0 = this.m;
            unicastSubject0.onNext(object0);
            long v = this.j + 1L;
            if(v >= this.h) {
                ++this.k;
                this.j = 0L;
                unicastSubject0.onComplete();
                UnicastSubject unicastSubject1 = UnicastSubject.create(this.f);
                this.m = unicastSubject1;
                this.downstream.onNext(unicastSubject1);
                if(this.g) {
                    ((Disposable)this.o.get()).dispose();
                    s4 s40 = new s4(this.k, this);
                    Disposable disposable0 = this.i.schedulePeriodically(s40, this.c, this.c, this.d);
                    DisposableHelper.replace(this.o, disposable0);
                }
            }
            else {
                this.j = v;
            }
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
        this.O();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.l, disposable0)) {
            this.l = disposable0;
            Observer observer0 = this.downstream;
            observer0.onSubscribe(this);
            if(this.cancelled) {
                return;
            }
            UnicastSubject unicastSubject0 = UnicastSubject.create(this.f);
            this.m = unicastSubject0;
            observer0.onNext(unicastSubject0);
            s4 s40 = new s4(this.k, this);
            Disposable disposable1 = this.g ? this.i.schedulePeriodically(s40, this.c, this.c, this.d) : this.e.schedulePeriodicallyDirect(s40, this.c, this.c, this.d);
            this.o.replace(disposable1);
        }
    }
}

