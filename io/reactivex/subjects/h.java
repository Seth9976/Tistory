package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends AtomicReference implements ReplayBuffer {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public int e;
    public volatile j f;
    public j g;
    public volatile boolean h;

    public h(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = ObjectHelper.verifyPositive(v, "maxSize");
        this.b = ObjectHelper.verifyPositive(v1, "maxAge");
        this.c = (TimeUnit)ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        this.d = (Scheduler)ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        j j0 = new j(null, 0L);
        this.g = j0;
        this.f = j0;
    }

    public final j a() {
        j j2;
        j j0 = this.f;
        long v = this.d.now(this.c) - this.b;
        for(j j1 = (j)j0.get(); true; j1 = (j)j0.get()) {
            j2 = j0;
            j0 = j1;
            if(j0 == null || j0.b > v) {
                break;
            }
        }
        return j2;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void add(Object object0) {
        j j0 = new j(object0, this.d.now(this.c));
        j j1 = this.g;
        this.g = j0;
        ++this.e;
        j1.set(j0);
        int v = this.e;
        if(v > this.a) {
            this.e = v - 1;
            this.f = (j)this.f.get();
        }
        long v1 = this.d.now(this.c) - this.b;
        for(j j2 = this.f; true; j2 = j3) {
            if(this.e <= 1) {
                this.f = j2;
                return;
            }
            j j3 = (j)j2.get();
            if(j3 == null) {
                this.f = j2;
                return;
            }
            if(j3.b > v1) {
                this.f = j2;
                return;
            }
            --this.e;
        }
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void addFinal(Object object0) {
        j j0 = new j(object0, 0x7FFFFFFFFFFFFFFFL);
        j j1 = this.g;
        this.g = j0;
        ++this.e;
        j1.lazySet(j0);
        long v = this.d.now(this.c) - this.b;
        for(j j2 = this.f; true; j2 = j3) {
            j j3 = (j)j2.get();
            if(j3.get() != null) {
                if(j3.b <= v) {
                    continue;
                }
                else if(j2.a != null) {
                    j j5 = new j(null, 0L);
                    j5.lazySet(j2.get());
                    this.f = j5;
                }
                else {
                    this.f = j2;
                }
            }
            else if(j2.a != null) {
                j j4 = new j(null, 0L);
                j4.lazySet(j2.get());
                this.f = j4;
            }
            else {
                this.f = j2;
            }
            this.h = true;
            return;
        }
    }

    public static int b(j j0) {
        int v = 0;
        while(v != 0x7FFFFFFF) {
            j j1 = (j)j0.get();
            if(j1 == null) {
                return !NotificationLite.isComplete(j0.a) && !NotificationLite.isError(j0.a) ? v : v - 1;
            }
            ++v;
            j0 = j1;
        }
        return 0x7FFFFFFF;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object getValue() {
        j j0 = this.f;
        j j1 = null;
        j j2;
        while((j2 = (j)j0.get()) != null) {
            j1 = j0;
            j0 = j2;
        }
        long v = this.d.now(this.c);
        if(j0.b < v - this.b) {
            return null;
        }
        Object object0 = j0.a;
        if(object0 == null) {
            return null;
        }
        return NotificationLite.isComplete(object0) || NotificationLite.isError(object0) ? j1.a : object0;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        j j0 = this.a();
        int v = h.b(j0);
        if(v != 0) {
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            for(int v1 = 0; v1 != v; ++v1) {
                j0 = (j)j0.get();
                arr_object[v1] = j0.a;
            }
            if(arr_object.length > v) {
                arr_object[v] = null;
            }
        }
        else if(arr_object.length != 0) {
            arr_object[0] = null;
            return arr_object;
        }
        return arr_object;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void replay(g g0) {
        j j1;
        if(g0.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = g0.a;
        j j0 = (j)g0.c;
        if(j0 == null) {
            j0 = this.a();
        }
        int v = 1;
        while(true) {
            if(g0.d) {
                g0.c = null;
                return;
            }
        label_10:
            if(g0.d) {
                g0.c = null;
                return;
            }
            j1 = (j)j0.get();
            if(j1 != null) {
                break;
            }
            if(j0.get() != null) {
                continue;
            }
            g0.c = j0;
            v = g0.addAndGet(-v);
            if(v != 0) {
                continue;
            }
            return;
        }
        Object object0 = j1.a;
        if(!this.h || j1.get() != null) {
            observer0.onNext(object0);
            j0 = j1;
            goto label_10;
        }
        if(NotificationLite.isComplete(object0)) {
            observer0.onComplete();
        }
        else {
            observer0.onError(NotificationLite.getError(object0));
        }
        g0.c = null;
        g0.d = true;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final int size() {
        return h.b(this.a());
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void trimHead() {
        j j0 = this.f;
        if(j0.a != null) {
            j j1 = new j(null, 0L);
            j1.lazySet(j0.get());
            this.f = j1;
        }
    }
}

