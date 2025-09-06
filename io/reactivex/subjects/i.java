package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends AtomicReference implements ReplayBuffer {
    public final int a;
    public int b;
    public volatile f c;
    public f d;
    public volatile boolean e;

    public i(int v) {
        this.a = ObjectHelper.verifyPositive(v, "maxSize");
        f f0 = new f(null);
        this.d = f0;
        this.c = f0;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void add(Object object0) {
        f f0 = new f(object0);
        f f1 = this.d;
        this.d = f0;
        ++this.b;
        f1.set(f0);
        int v = this.b;
        if(v > this.a) {
            this.b = v - 1;
            this.c = (f)this.c.get();
        }
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void addFinal(Object object0) {
        f f0 = new f(object0);
        f f1 = this.d;
        this.d = f0;
        ++this.b;
        f1.lazySet(f0);
        this.trimHead();
        this.e = true;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object getValue() {
        f f0 = this.c;
        f f1 = null;
        f f2;
        while((f2 = (f)f0.get()) != null) {
            f1 = f0;
            f0 = f2;
        }
        Object object0 = f0.a;
        if(object0 == null) {
            return null;
        }
        return NotificationLite.isComplete(object0) || NotificationLite.isError(object0) ? f1.a : object0;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        f f0 = this.c;
        int v = this.size();
        if(v != 0) {
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            for(int v1 = 0; v1 != v; ++v1) {
                f0 = (f)f0.get();
                arr_object[v1] = f0.a;
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
        if(g0.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = g0.a;
        f f0 = (f)g0.c;
        if(f0 == null) {
            f0 = this.c;
        }
        int v = 1;
        while(true) {
            if(g0.d) {
                g0.c = null;
                return;
            }
            f f1 = (f)f0.get();
            if(f1 == null) {
                if(f0.get() != null) {
                    continue;
                }
                g0.c = f0;
                v = g0.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            Object object0 = f1.a;
            if(this.e && f1.get() == null) {
                if(NotificationLite.isComplete(object0)) {
                    observer0.onComplete();
                }
                else {
                    observer0.onError(NotificationLite.getError(object0));
                }
                g0.c = null;
                g0.d = true;
                return;
            }
            observer0.onNext(object0);
            f0 = f1;
        }
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final int size() {
        f f0 = this.c;
        int v = 0;
        while(v != 0x7FFFFFFF) {
            f f1 = (f)f0.get();
            if(f1 == null) {
                return !NotificationLite.isComplete(f0.a) && !NotificationLite.isError(f0.a) ? v : v - 1;
            }
            ++v;
            f0 = f1;
        }
        return 0x7FFFFFFF;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void trimHead() {
        f f0 = this.c;
        if(f0.a != null) {
            f f1 = new f(null);
            f1.lazySet(f0.get());
            this.c = f1;
        }
    }
}

