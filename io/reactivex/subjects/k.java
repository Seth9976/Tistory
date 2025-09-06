package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends AtomicReference implements ReplayBuffer {
    public final ArrayList a;
    public volatile boolean b;
    public volatile int c;

    public k(int v) {
        this.a = new ArrayList(ObjectHelper.verifyPositive(v, "capacityHint"));
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void add(Object object0) {
        this.a.add(object0);
        ++this.c;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void addFinal(Object object0) {
        this.a.add(object0);
        ++this.c;
        this.b = true;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object getValue() {
        int v = this.c;
        if(v != 0) {
            ArrayList arrayList0 = this.a;
            Object object0 = arrayList0.get(v - 1);
            if(!NotificationLite.isComplete(object0) && !NotificationLite.isError(object0)) {
                return object0;
            }
            return v == 1 ? null : arrayList0.get(v - 2);
        }
        return null;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        int v = this.c;
        if(v == 0) {
            if(arr_object.length != 0) {
                arr_object[0] = null;
            }
            return arr_object;
        }
        ArrayList arrayList0 = this.a;
        Object object0 = arrayList0.get(v - 1);
        if(NotificationLite.isComplete(object0) || NotificationLite.isError(object0)) {
            --v;
            if(v == 0) {
                if(arr_object.length != 0) {
                    arr_object[0] = null;
                }
                return arr_object;
            }
        }
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = arrayList0.get(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void replay(g g0) {
        int v;
        if(g0.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList0 = this.a;
        Observer observer0 = g0.a;
        Integer integer0 = (Integer)g0.c;
        if(integer0 == null) {
            v = 0;
            g0.c = 0;
        }
        else {
            v = (int)integer0;
        }
        int v1 = 1;
        while(true) {
            if(g0.d) {
                g0.c = null;
                return;
            }
            int v2 = this.c;
            while(v2 != v) {
                if(g0.d) {
                    g0.c = null;
                    return;
                }
                Object object0 = arrayList0.get(v);
                if(this.b && v + 1 == v2) {
                    v2 = this.c;
                    if(v + 1 == v2) {
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
                }
                observer0.onNext(object0);
                ++v;
            }
            if(v == this.c) {
                g0.c = v;
                v1 = g0.addAndGet(-v1);
                if(v1 == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final int size() {
        int v = this.c;
        if(v != 0) {
            Object object0 = this.a.get(v - 1);
            return NotificationLite.isComplete(object0) || NotificationLite.isError(object0) ? v - 1 : v;
        }
        return 0;
    }

    @Override  // io.reactivex.subjects.ReplaySubject$ReplayBuffer
    public final void trimHead() {
    }
}

