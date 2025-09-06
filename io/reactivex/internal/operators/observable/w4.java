package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public final class w4 extends QueueDrainObserver implements Disposable, Runnable {
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final Worker f;
    public final int g;
    public final LinkedList h;
    public Disposable i;
    public volatile boolean j;

    public w4(SerializedObserver serializedObserver0, long v, long v1, TimeUnit timeUnit0, Worker scheduler$Worker0, int v2) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.f = scheduler$Worker0;
        this.g = v2;
        this.h = new LinkedList();
    }

    public final void M(UnicastSubject unicastSubject0) {
        v4 v40 = new v4(unicastSubject0, false);
        this.queue.offer(v40);
        if(this.enter()) {
            this.N();
        }
    }

    public final void N() {
        MpscLinkedQueue mpscLinkedQueue0 = (MpscLinkedQueue)this.queue;
        Observer observer0 = this.downstream;
        LinkedList linkedList0 = this.h;
        int v = 1;
        while(true) {
            if(this.j) {
                this.i.dispose();
                mpscLinkedQueue0.clear();
                linkedList0.clear();
                this.f.dispose();
                return;
            }
            boolean z = this.done;
            Object object0 = mpscLinkedQueue0.poll();
            if(z && (object0 == null || object0 instanceof v4)) {
                mpscLinkedQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    for(Object object2: linkedList0) {
                        ((UnicastSubject)object2).onComplete();
                    }
                }
                else {
                    for(Object object1: linkedList0) {
                        ((UnicastSubject)object1).onError(throwable0);
                    }
                }
                linkedList0.clear();
                this.f.dispose();
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(!(object0 instanceof v4)) {
                for(Object object3: linkedList0) {
                    ((UnicastSubject)object3).onNext(object0);
                }
            }
            else if(!((v4)object0).b) {
                linkedList0.remove(((v4)object0).a);
                ((v4)object0).a.onComplete();
                if(!linkedList0.isEmpty() || !this.cancelled) {
                    continue;
                }
                this.j = true;
            }
            else if(!this.cancelled) {
                UnicastSubject unicastSubject0 = UnicastSubject.create(this.g);
                linkedList0.add(unicastSubject0);
                observer0.onNext(unicastSubject0);
                t3 t30 = new t3(2, this, unicastSubject0);
                this.f.schedule(t30, this.c, this.e);
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
            this.N();
        }
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.N();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.fastEnter()) {
            for(Object object1: this.h) {
                ((UnicastSubject)object1).onNext(object0);
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
        this.N();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.i, disposable0)) {
            this.i = disposable0;
            this.downstream.onSubscribe(this);
            if(this.cancelled) {
                return;
            }
            UnicastSubject unicastSubject0 = UnicastSubject.create(this.g);
            this.h.add(unicastSubject0);
            this.downstream.onNext(unicastSubject0);
            t3 t30 = new t3(2, this, unicastSubject0);
            this.f.schedule(t30, this.c, this.e);
            this.f.schedulePeriodically(this, this.d, this.d, this.e);
        }
    }

    @Override
    public final void run() {
        v4 v40 = new v4(UnicastSubject.create(this.g), true);
        if(!this.cancelled) {
            this.queue.offer(v40);
        }
        if(this.enter()) {
            this.N();
        }
    }
}

