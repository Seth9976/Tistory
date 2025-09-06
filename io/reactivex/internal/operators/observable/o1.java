package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class o1 extends AtomicInteger implements Disposable, JoinSupport {
    public final Observer a;
    public final SpscLinkedArrayQueue b;
    public final CompositeDisposable c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final AtomicReference f;
    public final Function g;
    public final Function h;
    public final BiFunction i;
    public final AtomicInteger j;
    public int k;
    public int l;
    public volatile boolean m;

    public o1(Observer observer0, Function function0, Function function1, BiFunction biFunction0) {
        this.a = observer0;
        this.c = new CompositeDisposable();
        this.b = new SpscLinkedArrayQueue(0x80);
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new AtomicReference();
        this.g = function0;
        this.h = function1;
        this.i = biFunction0;
        this.j = new AtomicInteger(2);
    }

    public final void a() {
        ObservableSource observableSource1;
        Object object2;
        ObservableSource observableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
        Observer observer0 = this.a;
        int v = 1;
        while(true) {
            if(this.m) {
                spscLinkedArrayQueue0.clear();
                return;
            }
            if(((Throwable)this.f.get()) != null) {
                spscLinkedArrayQueue0.clear();
                this.c.dispose();
                this.b(observer0);
                return;
            }
            boolean z = this.j.get() == 0;
            Integer integer0 = (Integer)spscLinkedArrayQueue0.poll();
            if(z && integer0 == null) {
                for(Object object0: this.d.values()) {
                    ((UnicastSubject)object0).onComplete();
                }
                this.d.clear();
                this.e.clear();
                this.c.dispose();
                observer0.onComplete();
                return;
            }
            if(integer0 == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            Object object1 = spscLinkedArrayQueue0.poll();
            if(integer0 == 1) {
                UnicastSubject unicastSubject0 = UnicastSubject.create();
                int v1 = this.k;
                this.k = v1 + 1;
                this.d.put(v1, unicastSubject0);
                try {
                    observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.g.apply(object1), "The leftEnd returned a null ObservableSource");
                }
                catch(Throwable throwable0) {
                    this.c(throwable0, observer0, spscLinkedArrayQueue0);
                    return;
                }
                p1 p10 = new p1(this, true, v1);
                this.c.add(p10);
                observableSource0.subscribe(p10);
                if(((Throwable)this.f.get()) != null) {
                    spscLinkedArrayQueue0.clear();
                    this.c.dispose();
                    this.b(observer0);
                    return;
                }
                try {
                    object2 = ObjectHelper.requireNonNull(this.i.apply(object1, unicastSubject0), "The resultSelector returned a null value");
                }
                catch(Throwable throwable1) {
                    this.c(throwable1, observer0, spscLinkedArrayQueue0);
                    return;
                }
                observer0.onNext(object2);
                for(Object object3: this.e.values()) {
                    unicastSubject0.onNext(object3);
                }
            }
            else if(integer0 == 2) {
                int v2 = this.l;
                this.l = v2 + 1;
                this.e.put(v2, object1);
                try {
                    observableSource1 = (ObservableSource)ObjectHelper.requireNonNull(this.h.apply(object1), "The rightEnd returned a null ObservableSource");
                }
                catch(Throwable throwable2) {
                    this.c(throwable2, observer0, spscLinkedArrayQueue0);
                    return;
                }
                p1 p11 = new p1(this, false, v2);
                this.c.add(p11);
                observableSource1.subscribe(p11);
                if(((Throwable)this.f.get()) != null) {
                    spscLinkedArrayQueue0.clear();
                    this.c.dispose();
                    this.b(observer0);
                    return;
                }
                for(Object object4: this.d.values()) {
                    ((UnicastSubject)object4).onNext(object1);
                }
            }
            else if(integer0 == 3) {
                UnicastSubject unicastSubject1 = (UnicastSubject)this.d.remove(((p1)object1).c);
                this.c.remove(((p1)object1));
                if(unicastSubject1 == null) {
                    continue;
                }
                unicastSubject1.onComplete();
            }
            else if(integer0 == 4) {
                this.e.remove(((p1)object1).c);
                this.c.remove(((p1)object1));
            }
        }
    }

    public final void b(Observer observer0) {
        Throwable throwable0 = ExceptionHelper.terminate(this.f);
        LinkedHashMap linkedHashMap0 = this.d;
        for(Object object0: linkedHashMap0.values()) {
            ((UnicastSubject)object0).onError(throwable0);
        }
        linkedHashMap0.clear();
        this.e.clear();
        observer0.onError(throwable0);
    }

    public final void c(Throwable throwable0, Observer observer0, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        Exceptions.throwIfFatal(throwable0);
        ExceptionHelper.addThrowable(this.f, throwable0);
        spscLinkedArrayQueue0.clear();
        this.c.dispose();
        this.b(observer0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.m) {
            return;
        }
        this.m = true;
        this.c.dispose();
        if(this.getAndIncrement() == 0) {
            this.b.clear();
        }
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport
    public final void innerClose(boolean z, p1 p10) {
        synchronized(this) {
            this.b.offer((z ? 3 : 4), p10);
        }
        this.a();
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport
    public final void innerCloseError(Throwable throwable0) {
        if(ExceptionHelper.addThrowable(this.f, throwable0)) {
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport
    public final void innerComplete(q1 q10) {
        this.c.delete(q10);
        this.j.decrementAndGet();
        this.a();
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport
    public final void innerError(Throwable throwable0) {
        if(ExceptionHelper.addThrowable(this.f, throwable0)) {
            this.j.decrementAndGet();
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport
    public final void innerValue(boolean z, Object object0) {
        synchronized(this) {
            this.b.offer((z ? 1 : 2), object0);
        }
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.m;
    }
}

