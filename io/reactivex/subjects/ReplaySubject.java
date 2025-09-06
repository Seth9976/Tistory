package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ReplaySubject extends Subject {
    interface ReplayBuffer {
        void add(Object arg1);

        void addFinal(Object arg1);

        boolean compareAndSet(Object arg1, Object arg2);

        Object get();

        @Nullable
        Object getValue();

        Object[] getValues(Object[] arg1);

        void replay(g arg1);

        int size();

        void trimHead();
    }

    public final AtomicReference a;
    public final AtomicReference b;
    public boolean c;
    public static final g[] d;
    public static final g[] e;
    public static final Object[] f;

    static {
        ReplaySubject.d = new g[0];
        ReplaySubject.e = new g[0];
        ReplaySubject.f = new Object[0];
    }

    public ReplaySubject(ReplayBuffer replaySubject$ReplayBuffer0) {
        this.a = (AtomicReference)replaySubject$ReplayBuffer0;
        this.b = new AtomicReference(ReplaySubject.d);
    }

    public void cleanupBuffer() {
        ((ReplayBuffer)this.a).trimHead();
    }

    @CheckReturnValue
    @NonNull
    public static ReplaySubject create() {
        return new ReplaySubject(new k(16));
    }

    @CheckReturnValue
    @NonNull
    public static ReplaySubject create(int v) {
        return new ReplaySubject(new k(v));
    }

    @CheckReturnValue
    @NonNull
    public static ReplaySubject createWithSize(int v) {
        return new ReplaySubject(new i(v));
    }

    @CheckReturnValue
    @NonNull
    public static ReplaySubject createWithTime(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new ReplaySubject(new h(0x7FFFFFFF, v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    public static ReplaySubject createWithTimeAndSize(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return new ReplaySubject(new h(v1, v, timeUnit0, scheduler0));
    }

    public final void d(g g0) {
        while(true) {
            AtomicReference atomicReference0 = this.b;
            g[] arr_g = (g[])atomicReference0.get();
            if(arr_g == ReplaySubject.e) {
                break;
            }
            g[] arr_g1 = ReplaySubject.d;
            if(arr_g == arr_g1) {
                break;
            }
            int v = arr_g.length;
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_g[v1] == g0) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v != 1) {
                arr_g1 = new g[v - 1];
                System.arraycopy(arr_g, 0, arr_g1, 0, v1);
                System.arraycopy(arr_g, v1 + 1, arr_g1, v1, v - v1 - 1);
            }
            do {
                if(atomicReference0.compareAndSet(arr_g, arr_g1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_g);
        }
    }

    @Override  // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object object0 = ((ReplayBuffer)this.a).get();
        return NotificationLite.isError(object0) ? NotificationLite.getError(object0) : null;
    }

    @Nullable
    public Object getValue() {
        return ((ReplayBuffer)this.a).getValue();
    }

    public Object[] getValues() {
        Object[] arr_object = this.getValues(ReplaySubject.f);
        return arr_object == ReplaySubject.f ? new Object[0] : arr_object;
    }

    public Object[] getValues(Object[] arr_object) {
        return ((ReplayBuffer)this.a).getValues(arr_object);
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(((ReplayBuffer)this.a).get());
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return ((g[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(((ReplayBuffer)this.a).get());
    }

    public boolean hasValue() {
        return ((ReplayBuffer)this.a).size() != 0;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        Object object0 = NotificationLite.complete();
        AtomicReference atomicReference0 = this.a;
        ((ReplayBuffer)atomicReference0).addFinal(object0);
        g[] arr_g = ((ReplayBuffer)atomicReference0).compareAndSet(null, object0) ? ((g[])this.b.getAndSet(ReplaySubject.e)) : ReplaySubject.e;
        for(int v = 0; v < arr_g.length; ++v) {
            ((ReplayBuffer)atomicReference0).replay(arr_g[v]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        Object object0 = NotificationLite.error(throwable0);
        AtomicReference atomicReference0 = this.a;
        ((ReplayBuffer)atomicReference0).addFinal(object0);
        g[] arr_g = ((ReplayBuffer)atomicReference0).compareAndSet(null, object0) ? ((g[])this.b.getAndSet(ReplaySubject.e)) : ReplaySubject.e;
        for(int v = 0; v < arr_g.length; ++v) {
            ((ReplayBuffer)atomicReference0).replay(arr_g[v]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            return;
        }
        AtomicReference atomicReference0 = this.a;
        ((ReplayBuffer)atomicReference0).add(object0);
        g[] arr_g = (g[])this.b.get();
        for(int v = 0; v < arr_g.length; ++v) {
            ((ReplayBuffer)atomicReference0).replay(arr_g[v]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(this.c) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        g g0 = new g(observer0, this);
        observer0.onSubscribe(g0);
        if(!g0.d) {
            while(true) {
                AtomicReference atomicReference0 = this.b;
                g[] arr_g = (g[])atomicReference0.get();
                if(arr_g == ReplaySubject.e) {
                    break;
                }
                g[] arr_g1 = new g[arr_g.length + 1];
                System.arraycopy(arr_g, 0, arr_g1, 0, arr_g.length);
                arr_g1[arr_g.length] = g0;
            label_9:
                if(atomicReference0.compareAndSet(arr_g, arr_g1)) {
                    if(!g0.d) {
                        break;
                    }
                    this.d(g0);
                    return;
                }
                if(atomicReference0.get() != arr_g) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_9;
            }
            ((ReplayBuffer)this.a).replay(g0);
        }
    }
}

