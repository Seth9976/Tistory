package io.reactivex.internal.operators.observable;

import ed.d;
import ed.f;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class a2 extends AtomicInteger implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final AtomicReference c;
    public final AtomicThrowable d;
    public volatile SpscLinkedArrayQueue e;
    public Object f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile int i;
    public final AtomicReference j;

    public a2(Observer observer0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = observer0;
            this.c = new AtomicReference();
            this.j = new d(this, 5);
            this.d = new AtomicThrowable();
            return;
        }
        super();
        this.b = observer0;
        this.c = new AtomicReference();
        this.j = new f(this, 4);
        this.d = new AtomicThrowable();
    }

    public final void a() {
        if(this.a != 0) {
            Observer observer0 = this.b;
            int v = 1;
            while(true) {
                if(this.g) {
                    this.f = null;
                    this.e = null;
                    return;
                }
                if(this.d.get() != null) {
                    this.f = null;
                    this.e = null;
                    observer0.onError(this.d.terminate());
                    return;
                }
                int v1 = this.i;
                if(v1 == 1) {
                    Object object0 = this.f;
                    this.f = null;
                    this.i = 2;
                    observer0.onNext(object0);
                    v1 = 2;
                }
                boolean z = this.h;
                Object object1 = this.e == null ? null : this.e.poll();
                if(z && object1 == null && v1 == 2) {
                    this.e = null;
                    observer0.onComplete();
                    return;
                }
                if(object1 == null) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                observer0.onNext(object1);
            }
        }
        Observer observer1 = this.b;
        int v2 = 1;
        while(true) {
            if(this.g) {
                this.f = null;
                this.e = null;
                return;
            }
            if(this.d.get() != null) {
                this.f = null;
                this.e = null;
                observer1.onError(this.d.terminate());
                return;
            }
            int v3 = this.i;
            if(v3 == 1) {
                Object object2 = this.f;
                this.f = null;
                this.i = 2;
                observer1.onNext(object2);
                v3 = 2;
            }
            boolean z1 = this.h;
            Object object3 = this.e == null ? null : this.e.poll();
            if(z1 && object3 == null && v3 == 2) {
                this.e = null;
                observer1.onComplete();
                return;
            }
            if(object3 == null) {
                v2 = this.addAndGet(-v2);
                if(v2 != 0) {
                    continue;
                }
                return;
            }
            observer1.onNext(object3);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.g = true;
            DisposableHelper.dispose(this.c);
            DisposableHelper.dispose(((f)this.j));
            if(this.getAndIncrement() == 0) {
                this.e = null;
                this.f = null;
            }
            return;
        }
        this.g = true;
        DisposableHelper.dispose(this.c);
        DisposableHelper.dispose(((d)this.j));
        if(this.getAndIncrement() == 0) {
            this.e = null;
            this.f = null;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.c.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.h = true;
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        this.h = true;
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.d.addThrowable(throwable0)) {
                DisposableHelper.dispose(((f)this.j));
                if(this.getAndIncrement() == 0) {
                    this.a();
                    return;
                }
            }
            else {
                RxJavaPlugins.onError(throwable0);
            }
            return;
        }
        if(this.d.addThrowable(throwable0)) {
            DisposableHelper.dispose(((d)this.j));
            if(this.getAndIncrement() == 0) {
                this.a();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(this.compareAndSet(0, 1)) {
                this.b.onNext(object0);
                if(this.decrementAndGet() == 0) {
                    return;
                }
                this.a();
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.e;
            if(spscLinkedArrayQueue0 == null) {
                spscLinkedArrayQueue0 = new SpscLinkedArrayQueue(0x80);
                this.e = spscLinkedArrayQueue0;
            }
            spscLinkedArrayQueue0.offer(object0);
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        if(this.compareAndSet(0, 1)) {
            this.b.onNext(object0);
            if(this.decrementAndGet() == 0) {
                return;
            }
            this.a();
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.e;
        if(spscLinkedArrayQueue1 == null) {
            spscLinkedArrayQueue1 = new SpscLinkedArrayQueue(0x80);
            this.e = spscLinkedArrayQueue1;
        }
        spscLinkedArrayQueue1.offer(object0);
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(this.c, disposable0);
            return;
        }
        DisposableHelper.setOnce(this.c, disposable0);
    }
}

