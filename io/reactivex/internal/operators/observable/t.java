package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
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
import java.util.concurrent.atomic.AtomicReference;

public final class t extends QueueDrainObserver implements Disposable, Runnable {
    public final Callable c;
    public final long d;
    public final TimeUnit e;
    public final Scheduler f;
    public Disposable g;
    public Collection h;
    public final AtomicReference i;

    public t(SerializedObserver serializedObserver0, Callable callable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(serializedObserver0, new MpscLinkedQueue());
        this.i = new AtomicReference();
        this.c = callable0;
        this.d = v;
        this.e = timeUnit0;
        this.f = scheduler0;
    }

    @Override  // io.reactivex.internal.observers.QueueDrainObserver
    public final void accept(Observer observer0, Object object0) {
        this.downstream.onNext(((Collection)object0));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.i);
        this.g.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.i.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Collection collection0;
        synchronized(this) {
            collection0 = this.h;
            this.h = null;
        }
        if(collection0 != null) {
            this.queue.offer(collection0);
            this.done = true;
            if(this.enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
            }
        }
        DisposableHelper.dispose(this.i);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        synchronized(this) {
            this.h = null;
        }
        this.downstream.onError(throwable0);
        DisposableHelper.dispose(this.i);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        synchronized(this) {
            Collection collection0 = this.h;
            if(collection0 == null) {
                return;
            }
            collection0.add(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        Collection collection0;
        if(DisposableHelper.validate(this.g, disposable0)) {
            try {
                this.g = disposable0;
                collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.dispose();
                EmptyDisposable.error(throwable0, this.downstream);
                return;
            }
            this.h = collection0;
            this.downstream.onSubscribe(this);
            if(!this.cancelled) {
                Disposable disposable1 = this.f.schedulePeriodicallyDirect(this, this.d, this.d, this.e);
                AtomicReference atomicReference0 = this.i;
                while(!atomicReference0.compareAndSet(null, disposable1)) {
                    if(atomicReference0.get() != null) {
                        disposable1.dispose();
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Collection collection1;
        Collection collection0;
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
            collection1 = this.h;
            if(collection1 != null) {
                this.h = collection0;
            }
        }
        if(collection1 == null) {
            DisposableHelper.dispose(this.i);
            return;
        }
        this.fastPathEmit(collection1, false, this);
    }
}

