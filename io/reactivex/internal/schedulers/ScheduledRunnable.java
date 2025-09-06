package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray implements Disposable, Runnable, Callable {
    public final Runnable a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;

    static {
        ScheduledRunnable.b = new Object();
        ScheduledRunnable.c = new Object();
        ScheduledRunnable.d = new Object();
        ScheduledRunnable.e = new Object();
    }

    public ScheduledRunnable(Runnable runnable0, DisposableContainer disposableContainer0) {
        super(3);
        this.a = runnable0;
        this.lazySet(0, disposableContainer0);
    }

    @Override
    public Object call() {
        this.run();
        return null;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        while(true) {
            Object object0 = this.get(1);
            Object object1 = ScheduledRunnable.e;
            if(object0 == object1) {
                break;
            }
            Object object2 = ScheduledRunnable.c;
            if(object0 == object2) {
                break;
            }
            Object object3 = ScheduledRunnable.d;
            if(object0 == object3) {
                break;
            }
            boolean z = this.get(2) != Thread.currentThread();
            if(z) {
                object2 = object3;
            }
            if(this.compareAndSet(1, object0, object2)) {
                if(object0 == null) {
                    break;
                }
                ((Future)object0).cancel(z);
                break;
            }
        }
        Object object4;
        while((object4 = this.get(0)) != object1) {
            Object object5 = ScheduledRunnable.b;
            if(object4 == object5 || object4 == null) {
                break;
            }
            if(this.compareAndSet(0, object4, object5)) {
                ((DisposableContainer)object4).delete(this);
                return;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        Object object0 = this.get(0);
        return object0 == ScheduledRunnable.b || object0 == ScheduledRunnable.e;
    }

    @Override
    public void run() {
        Object object0 = ScheduledRunnable.d;
        Object object1 = ScheduledRunnable.c;
        Object object2 = ScheduledRunnable.b;
        Object object3 = ScheduledRunnable.e;
        this.lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        }
        catch(Throwable throwable0) {
            RxJavaPlugins.onError(throwable0);
        }
        finally {
            this.lazySet(2, null);
            Object object4 = this.get(0);
            if(object4 != object2 && this.compareAndSet(0, object4, object3) && object4 != null) {
                ((DisposableContainer)object4).delete(this);
            }
            do {
                Object object5 = this.get(1);
            }
            while(object5 != object1 && object5 != object0 && !this.compareAndSet(1, object5, object3));
        }
    }

    public void setFuture(Future future0) {
        do {
            Object object0 = this.get(1);
            if(object0 == ScheduledRunnable.e) {
                return;
            }
            if(object0 == ScheduledRunnable.c) {
                future0.cancel(false);
                return;
            }
            if(object0 == ScheduledRunnable.d) {
                future0.cancel(true);
                return;
            }
        }
        while(!this.compareAndSet(1, object0, future0));
    }
}

