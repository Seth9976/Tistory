package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class w extends QueueDrainObserver implements Disposable, Runnable {
    public final Callable c;
    public final long d;
    public final long e;
    public final TimeUnit f;
    public final Worker g;
    public final LinkedList h;
    public Disposable i;

    public w(SerializedObserver serializedObserver0, Callable callable0, long v, long v1, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.c = callable0;
        this.d = v;
        this.e = v1;
        this.f = timeUnit0;
        this.g = scheduler$Worker0;
        this.h = new LinkedList();
    }

    @Override  // io.reactivex.internal.observers.QueueDrainObserver
    public final void accept(Observer observer0, Object object0) {
        observer0.onNext(((Collection)object0));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.cancelled) {
            this.cancelled = true;
            synchronized(this) {
                this.h.clear();
            }
            this.i.dispose();
            this.g.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.h);
            this.h.clear();
        }
        for(Object object0: arrayList0) {
            this.queue.offer(((Collection)object0));
        }
        this.done = true;
        if(this.enter()) {
            QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.g, this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.done = true;
        synchronized(this) {
            this.h.clear();
        }
        this.downstream.onError(throwable0);
        this.g.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        synchronized(this) {
            for(Object object1: this.h) {
                ((Collection)object1).add(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        Collection collection0;
        Worker scheduler$Worker0 = this.g;
        if(DisposableHelper.validate(this.i, disposable0)) {
            try {
                this.i = disposable0;
                collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                disposable0.dispose();
                EmptyDisposable.error(throwable0, this.downstream);
                scheduler$Worker0.dispose();
                return;
            }
            this.h.add(collection0);
            this.downstream.onSubscribe(this);
            this.g.schedulePeriodically(this, this.e, this.e, this.f);
            scheduler$Worker0.schedule(new v(this, collection0), this.d, this.f);
        }
    }

    @Override
    public final void run() {
        Collection collection0;
        if(this.cancelled) {
            return;
        }
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The bufferSupplier returned a null buffer");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.downstream.onError(throwable0);
            this.dispose();
            return;
        }
        synchronized(this) {
            if(this.cancelled) {
                return;
            }
            this.h.add(collection0);
        }
        u u0 = new u(this, collection0);
        this.g.schedule(u0, this.d, this.f);
    }
}

