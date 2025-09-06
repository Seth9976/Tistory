package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
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
import java.util.concurrent.atomic.AtomicReference;

public final class q extends QueueDrainObserver implements Disposable {
    public final int c;
    public final Callable d;
    public Disposable e;
    public Collection f;
    public final Object g;
    public Object h;

    public q(SerializedObserver serializedObserver0, Callable callable0, ObservableSource observableSource0) {
        this.c = 1;
        super(serializedObserver0, new MpscLinkedQueue());
        this.d = callable0;
        this.g = observableSource0;
    }

    public q(SerializedObserver serializedObserver0, Callable callable0, Callable callable1) {
        this.c = 0;
        super(serializedObserver0, new MpscLinkedQueue());
        this.h = new AtomicReference();
        this.d = callable0;
        this.g = callable1;
    }

    public final void M() {
        Collection collection3;
        Collection collection1;
        ObservableSource observableSource0;
        Collection collection2;
        Collection collection0;
        if(this.c != 0) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.d.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.dispose();
                this.downstream.onError(throwable0);
                return;
            }
            synchronized(this) {
                collection1 = this.f;
                if(collection1 == null) {
                    return;
                }
                this.f = collection0;
            }
            this.fastPathEmit(collection1, false, this);
            return;
        }
        try {
            collection2 = (Collection)ObjectHelper.requireNonNull(this.d.call(), "The buffer supplied is null");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            this.dispose();
            this.downstream.onError(throwable1);
            return;
        }
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(((Callable)this.g).call(), "The boundary ObservableSource supplied is null");
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            this.cancelled = true;
            this.e.dispose();
            this.downstream.onError(throwable2);
            return;
        }
        p p0 = new p(this, 0);
        if(DisposableHelper.replace(((AtomicReference)this.h), p0)) {
            synchronized(this) {
                collection3 = this.f;
                if(collection3 == null) {
                    return;
                }
                this.f = collection2;
            }
            observableSource0.subscribe(p0);
            this.fastPathEmit(collection3, false, this);
        }
    }

    @Override  // io.reactivex.internal.observers.QueueDrainObserver
    public final void accept(Observer observer0, Object object0) {
        if(this.c != 0) {
            this.downstream.onNext(((Collection)object0));
            return;
        }
        this.downstream.onNext(((Collection)object0));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.c != 0) {
            if(!this.cancelled) {
                this.cancelled = true;
                ((r)this.h).dispose();
                this.e.dispose();
                if(this.enter()) {
                    this.queue.clear();
                }
            }
            return;
        }
        if(!this.cancelled) {
            this.cancelled = true;
            this.e.dispose();
            DisposableHelper.dispose(((AtomicReference)this.h));
            if(this.enter()) {
                this.queue.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Collection collection1;
        Collection collection0;
        if(this.c != 0) {
            synchronized(this) {
                collection0 = this.f;
                if(collection0 == null) {
                    return;
                }
                this.f = null;
            }
            this.queue.offer(collection0);
            this.done = true;
            if(this.enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
            }
            return;
        }
        synchronized(this) {
            collection1 = this.f;
            if(collection1 == null) {
                return;
            }
            this.f = null;
        }
        this.queue.offer(collection1);
        this.done = true;
        if(this.enter()) {
            QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.c != 0) {
            this.dispose();
            this.downstream.onError(throwable0);
            return;
        }
        this.dispose();
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.c != 0) {
            synchronized(this) {
                Collection collection0 = this.f;
                if(collection0 != null) {
                    collection0.add(object0);
                    return;
                }
                return;
            }
            return;
        }
        synchronized(this) {
            Collection collection1 = this.f;
            if(collection1 != null) {
                collection1.add(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        ObservableSource observableSource0;
        Observer observer0;
        Collection collection0;
        if(this.c != 0) {
            if(DisposableHelper.validate(this.e, disposable0)) {
                try {
                    this.e = disposable0;
                    collection0 = (Collection)ObjectHelper.requireNonNull(this.d.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.cancelled = true;
                    disposable0.dispose();
                    EmptyDisposable.error(throwable0, this.downstream);
                    return;
                }
                this.f = collection0;
                r r0 = new r(this, 0);
                this.h = r0;
                this.downstream.onSubscribe(this);
                if(!this.cancelled) {
                    ((ObservableSource)this.g).subscribe(r0);
                    return;
                }
            }
            return;
        }
        if(DisposableHelper.validate(this.e, disposable0)) {
            try {
                this.e = disposable0;
                observer0 = this.downstream;
                this.f = (Collection)ObjectHelper.requireNonNull(this.d.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.cancelled = true;
                disposable0.dispose();
                EmptyDisposable.error(throwable1, observer0);
                return;
            }
            try {
                observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(((Callable)this.g).call(), "The boundary ObservableSource supplied is null");
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                this.cancelled = true;
                disposable0.dispose();
                EmptyDisposable.error(throwable2, observer0);
                return;
            }
            p p0 = new p(this, 0);
            ((AtomicReference)this.h).set(p0);
            observer0.onSubscribe(this);
            if(!this.cancelled) {
                observableSource0.subscribe(p0);
            }
        }
    }
}

