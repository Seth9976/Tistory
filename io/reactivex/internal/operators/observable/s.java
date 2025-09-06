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
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class s extends QueueDrainObserver implements Disposable, Runnable {
    public final Callable c;
    public final long d;
    public final TimeUnit e;
    public final int f;
    public final boolean g;
    public final Worker h;
    public Collection i;
    public Disposable j;
    public Disposable k;
    public long l;
    public long m;

    public s(SerializedObserver serializedObserver0, Callable callable0, long v, TimeUnit timeUnit0, int v1, boolean z, Worker scheduler$Worker0) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.c = callable0;
        this.d = v;
        this.e = timeUnit0;
        this.f = v1;
        this.g = z;
        this.h = scheduler$Worker0;
    }

    @Override  // io.reactivex.internal.observers.QueueDrainObserver
    public final void accept(Observer observer0, Object object0) {
        observer0.onNext(((Collection)object0));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.cancelled) {
            this.cancelled = true;
            this.k.dispose();
            this.h.dispose();
            synchronized(this) {
                this.i = null;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Collection collection0;
        this.h.dispose();
        synchronized(this) {
            collection0 = this.i;
            this.i = null;
        }
        if(collection0 != null) {
            this.queue.offer(collection0);
            this.done = true;
            if(this.enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        synchronized(this) {
            this.i = null;
        }
        this.downstream.onError(throwable0);
        this.h.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Collection collection0;
        Collection collection1;
        synchronized(this) {
            collection0 = this.i;
            if(collection0 == null) {
                return;
            }
            collection0.add(object0);
            if(collection0.size() < this.f) {
                return;
            }
            this.i = null;
            ++this.l;
        }
        if(this.g) {
            this.j.dispose();
        }
        this.fastPathOrderedEmit(collection0, false, this);
        try {
            collection1 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The buffer supplied is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.downstream.onError(throwable0);
            this.dispose();
            return;
        }
        synchronized(this) {
            this.i = collection1;
            ++this.m;
        }
        if(this.g) {
            this.j = this.h.schedulePeriodically(this, this.d, this.d, this.e);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        Collection collection0;
        if(DisposableHelper.validate(this.k, disposable0)) {
            try {
                this.k = disposable0;
                collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                disposable0.dispose();
                EmptyDisposable.error(throwable0, this.downstream);
                this.h.dispose();
                return;
            }
            this.i = collection0;
            this.downstream.onSubscribe(this);
            this.j = this.h.schedulePeriodically(this, this.d, this.d, this.e);
        }
    }

    @Override
    public final void run() {
        Collection collection0;
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The bufferSupplier returned a null buffer");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.dispose();
            this.downstream.onError(throwable0);
            return;
        }
        synchronized(this) {
            Collection collection1 = this.i;
            if(collection1 != null && this.l == this.m) {
                this.i = collection0;
                this.fastPathOrderedEmit(collection1, false, this);
            }
        }
    }
}

