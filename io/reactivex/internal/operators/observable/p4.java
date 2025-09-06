package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class p4 extends QueueDrainObserver implements Disposable {
    public final ObservableSource c;
    public final Function d;
    public final int e;
    public final CompositeDisposable f;
    public Disposable g;
    public final AtomicReference h;
    public final ArrayList i;
    public final AtomicLong j;
    public final AtomicBoolean k;

    public p4(SerializedObserver serializedObserver0, ObservableSource observableSource0, Function function0, int v) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.h = new AtomicReference();
        AtomicLong atomicLong0 = new AtomicLong();
        this.j = atomicLong0;
        this.k = new AtomicBoolean();
        this.c = observableSource0;
        this.d = function0;
        this.e = v;
        this.f = new CompositeDisposable();
        this.i = new ArrayList();
        atomicLong0.lazySet(1L);
    }

    public final void M(o4 o40) {
        this.f.delete(o40);
        q4 q40 = new q4(o40.c, null);
        this.queue.offer(q40);
        if(this.enter()) {
            this.N();
        }
    }

    public final void N() {
        Iterator iterator2;
        o4 o40;
        ObservableSource observableSource0;
        q4 q40;
        Object object0;
        MpscLinkedQueue mpscLinkedQueue0 = (MpscLinkedQueue)this.queue;
        Observer observer0 = this.downstream;
        ArrayList arrayList0 = this.i;
        int v = 1;
        while(true) {
        alab1:
            while(true) {
                while(true) {
                    do {
                        while(true) {
                            while(true) {
                            label_4:
                                boolean z = this.done;
                                object0 = mpscLinkedQueue0.poll();
                                if(z && object0 == null) {
                                    this.f.dispose();
                                    DisposableHelper.dispose(this.h);
                                    Throwable throwable0 = this.error;
                                    if(throwable0 == null) {
                                        for(Object object2: arrayList0) {
                                            ((UnicastSubject)object2).onComplete();
                                        }
                                    }
                                    else {
                                        for(Object object1: arrayList0) {
                                            ((UnicastSubject)object1).onError(throwable0);
                                        }
                                    }
                                    arrayList0.clear();
                                    return;
                                }
                                if(object0 != null) {
                                    break;
                                }
                                v = this.leave(-v);
                                if(v == 0) {
                                    return;
                                }
                            }
                            if(object0 instanceof q4) {
                                q40 = (q4)object0;
                                UnicastSubject unicastSubject0 = q40.a;
                                if(unicastSubject0 == null) {
                                    goto label_39;
                                }
                                else {
                                    if(!arrayList0.remove(unicastSubject0)) {
                                        goto label_4;
                                    }
                                    break;
                                }
                            }
                            goto label_58;
                        }
                        q40.a.onComplete();
                    }
                    while(this.j.decrementAndGet() != 0L);
                    this.f.dispose();
                    DisposableHelper.dispose(this.h);
                    return;
                label_39:
                    if(this.k.get()) {
                        continue alab1;
                    }
                    else {
                        UnicastSubject unicastSubject1 = UnicastSubject.create(this.e);
                        arrayList0.add(unicastSubject1);
                        observer0.onNext(unicastSubject1);
                        try {
                            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.d.apply(q40.b), "The ObservableSource supplied is null");
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            this.k.set(true);
                            observer0.onError(throwable1);
                            goto label_4;
                        }
                        o40 = new o4(this, unicastSubject1);
                        if(!this.f.add(o40)) {
                            goto label_4;
                        }
                        break;
                    }
                    goto label_58;
                }
                this.j.getAndIncrement();
                observableSource0.subscribe(o40);
            }
            iterator2 = arrayList0.iterator();
            goto label_59;
        label_58:
            iterator2 = arrayList0.iterator();
        label_59:
            if(!iterator2.hasNext()) {
                goto label_4;
            }
            break;
        }
        Object object3 = iterator2.next();
        ((UnicastSubject)object3).onNext(object0);
        goto label_59;
    }

    public final void O(Object object0) {
        q4 q40 = new q4(null, object0);
        this.queue.offer(q40);
        if(this.enter()) {
            this.N();
        }
    }

    @Override  // io.reactivex.internal.observers.QueueDrainObserver
    public final void accept(Observer observer0, Object object0) {
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.k.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.h);
            if(this.j.decrementAndGet() == 0L) {
                this.g.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.k.get();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.done) {
            return;
        }
        this.done = true;
        if(this.enter()) {
            this.N();
        }
        if(this.j.decrementAndGet() == 0L) {
            this.f.dispose();
        }
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.N();
        }
        if(this.j.decrementAndGet() == 0L) {
            this.f.dispose();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.fastEnter()) {
            for(Object object1: this.i) {
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
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.downstream.onSubscribe(this);
            if(this.k.get()) {
                return;
            }
            r r0 = new r(this, 1);
            AtomicReference atomicReference0 = this.h;
            while(true) {
                if(atomicReference0.compareAndSet(null, r0)) {
                    this.c.subscribe(r0);
                    return;
                }
                if(atomicReference0.get() != null) {
                    break;
                }
            }
        }
    }
}

