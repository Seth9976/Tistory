package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class m4 extends AtomicBoolean implements Observer, Disposable, Runnable {
    public final Observer a;
    public final long b;
    public final long c;
    public final int d;
    public final ArrayDeque e;
    public long f;
    public volatile boolean g;
    public long h;
    public Disposable i;
    public final AtomicInteger j;

    public m4(Observer observer0, long v, long v1, int v2) {
        this.j = new AtomicInteger();
        this.a = observer0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = new ArrayDeque();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        ArrayDeque arrayDeque0 = this.e;
        while(!arrayDeque0.isEmpty()) {
            ((UnicastSubject)arrayDeque0.poll()).onComplete();
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        ArrayDeque arrayDeque0 = this.e;
        while(!arrayDeque0.isEmpty()) {
            ((UnicastSubject)arrayDeque0.poll()).onError(throwable0);
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ArrayDeque arrayDeque0 = this.e;
        long v = this.f;
        long v1 = this.c;
        if(v % v1 == 0L && !this.g) {
            this.j.getAndIncrement();
            UnicastSubject unicastSubject0 = UnicastSubject.create(this.d, this);
            arrayDeque0.offer(unicastSubject0);
            this.a.onNext(unicastSubject0);
        }
        long v2 = this.h + 1L;
        for(Object object1: arrayDeque0) {
            ((UnicastSubject)object1).onNext(object0);
        }
        if(v2 >= this.b) {
            ((UnicastSubject)arrayDeque0.poll()).onComplete();
            if(arrayDeque0.isEmpty() && this.g) {
                this.i.dispose();
                return;
            }
            this.h = v2 - v1;
        }
        else {
            this.h = v2;
        }
        this.f = v + 1L;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.i, disposable0)) {
            this.i = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        if(this.j.decrementAndGet() == 0 && this.g) {
            this.i.dispose();
        }
    }
}

