package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class n extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Callable b;
    public final ObservableSource c;
    public final Function d;
    public final CompositeDisposable e;
    public final AtomicReference f;
    public final AtomicThrowable g;
    public volatile boolean h;
    public final SpscLinkedArrayQueue i;
    public volatile boolean j;
    public long k;
    public LinkedHashMap l;

    public n(Observer observer0, ObservableSource observableSource0, Function function0, Callable callable0) {
        this.a = observer0;
        this.b = callable0;
        this.c = observableSource0;
        this.d = function0;
        this.i = new SpscLinkedArrayQueue(0x80);
        this.e = new CompositeDisposable();
        this.f = new AtomicReference();
        this.l = new LinkedHashMap();
        this.g = new AtomicThrowable();
    }

    public final void a(o o0, long v) {
        boolean z;
        this.e.delete(o0);
        if(this.e.size() == 0) {
            DisposableHelper.dispose(this.f);
            z = true;
        }
        else {
            z = false;
        }
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.l;
            if(linkedHashMap0 == null) {
                return;
            }
            Object object0 = linkedHashMap0.remove(v);
            this.i.offer(object0);
        }
        if(z) {
            this.h = true;
        }
        this.b();
    }

    public final void b() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.i;
        int v = 1;
        while(true) {
            if(this.j) {
                spscLinkedArrayQueue0.clear();
                return;
            }
            boolean z = this.h;
            if(z && this.g.get() != null) {
                spscLinkedArrayQueue0.clear();
                observer0.onError(this.g.terminate());
                return;
            }
            Collection collection0 = (Collection)spscLinkedArrayQueue0.poll();
            if(z && collection0 == null) {
                observer0.onComplete();
                return;
            }
            if(collection0 == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            observer0.onNext(collection0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(DisposableHelper.dispose(this.f)) {
            this.j = true;
            this.e.dispose();
            synchronized(this) {
                this.l = null;
            }
            if(this.getAndIncrement() != 0) {
                this.i.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.f.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.e.dispose();
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.l;
            if(linkedHashMap0 == null) {
                return;
            }
            for(Object object0: linkedHashMap0.values()) {
                this.i.offer(((Collection)object0));
            }
            this.l = null;
        }
        this.h = true;
        this.b();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.g.addThrowable(throwable0)) {
            this.e.dispose();
            synchronized(this) {
                this.l = null;
            }
            this.h = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.l;
            if(linkedHashMap0 == null) {
                return;
            }
            for(Object object1: linkedHashMap0.values()) {
                ((Collection)object1).add(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this.f, disposable0)) {
            m m0 = new m(this);
            this.e.add(m0);
            this.c.subscribe(m0);
        }
    }
}

