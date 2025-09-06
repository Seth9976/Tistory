package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableMaterialize;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

public final class e implements Iterator {
    public final int a;
    public Object b;
    public boolean c;
    public boolean d;
    public Throwable e;
    public boolean f;
    public final Disposable g;
    public final Object h;

    public e(Object object0, Disposable disposable0, int v) {
        this.a = v;
        this.c = true;
        this.d = true;
        this.h = object0;
        this.g = disposable0;
        super();
    }

    @Override
    public final boolean hasNext() {
        f f1;
        Notification notification0;
        if(this.a != 0) {
            Throwable throwable0 = this.e;
            if(throwable0 != null) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
            if(this.c) {
                if(!this.d) {
                    return true;
                }
                boolean z = this.f;
                io.reactivex.internal.operators.observable.f f0 = (io.reactivex.internal.operators.observable.f)this.g;
                AtomicInteger atomicInteger0 = f0.c;
                if(!z) {
                    this.f = true;
                    atomicInteger0.set(1);
                    new ObservableMaterialize(((ObservableSource)this.h)).subscribe(f0);
                }
                try {
                    atomicInteger0.set(1);
                    BlockingHelper.verifyNonBlocking();
                    notification0 = (Notification)f0.b.take();
                }
                catch(InterruptedException interruptedException0) {
                    f0.dispose();
                    this.e = interruptedException0;
                    throw ExceptionHelper.wrapOrThrow(interruptedException0);
                }
                if(notification0.isOnNext()) {
                    this.d = false;
                    this.b = notification0.getValue();
                    return true;
                }
                this.c = false;
                if(!notification0.isOnComplete()) {
                    Throwable throwable1 = notification0.getError();
                    this.e = throwable1;
                    throw ExceptionHelper.wrapOrThrow(throwable1);
                }
            }
            return false;
        }
        Throwable throwable2 = this.e;
        if(throwable2 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable2);
        }
        if(this.c) {
            if(!this.d) {
                return true;
            }
            f1 = (f)this.g;
            AtomicInteger atomicInteger1 = f1.c;
            try {
                if(!this.f) {
                    this.f = true;
                    atomicInteger1.set(1);
                    Flowable.fromPublisher(((Publisher)this.h)).materialize().subscribe(f1);
                }
                atomicInteger1.set(1);
                BlockingHelper.verifyNonBlocking();
                Notification notification1 = (Notification)f1.b.take();
                if(notification1.isOnNext()) {
                    this.d = false;
                    this.b = notification1.getValue();
                    return true;
                }
                this.c = false;
                if(!notification1.isOnComplete()) {
                    if(!notification1.isOnError()) {
                        throw new IllegalStateException("Should not reach here");
                    }
                    Throwable throwable3 = notification1.getError();
                    this.e = throwable3;
                    throw ExceptionHelper.wrapOrThrow(throwable3);
                }
                return false;
            }
            catch(InterruptedException interruptedException1) {
            }
        }
        else {
            return false;
        }
        f1.dispose();
        this.e = interruptedException1;
        throw ExceptionHelper.wrapOrThrow(interruptedException1);
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            Throwable throwable0 = this.e;
            if(throwable0 != null) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
            if(!this.hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.d = true;
            return this.b;
        }
        Throwable throwable1 = this.e;
        if(throwable1 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable1);
        }
        if(!this.hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        this.d = true;
        return this.b;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}

