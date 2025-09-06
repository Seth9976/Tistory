package io.reactivex.processors;

import io.reactivex.internal.functions.ObjectHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.reactivestreams.Subscriber;

public final class j implements ReplayBuffer {
    public final ArrayList a;
    public Throwable b;
    public volatile boolean c;
    public volatile int d;

    public j(int v) {
        this.a = new ArrayList(ObjectHelper.verifyPositive(v, "capacityHint"));
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void complete() {
        this.c = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void error(Throwable throwable0) {
        this.b = throwable0;
        this.c = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Throwable getError() {
        return this.b;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object getValue() {
        return this.d == 0 ? null : this.a.get(this.d - 1);
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        int v = this.d;
        if(v == 0) {
            if(arr_object.length != 0) {
                arr_object[0] = null;
            }
            return arr_object;
        }
        ArrayList arrayList0 = this.a;
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

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final boolean isDone() {
        return this.c;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void next(Object object0) {
        this.a.add(object0);
        ++this.d;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void replay(f f0) {
        int v;
        if(f0.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList0 = this.a;
        Subscriber subscriber0 = f0.a;
        Integer integer0 = (Integer)f0.c;
        if(integer0 == null) {
            v = 0;
            f0.c = 0;
        }
        else {
            v = (int)integer0;
        }
        long v1 = f0.f;
        int v2 = 1;
        do {
            long v3 = f0.d.get();
            int v4;
            while((v4 = Long.compare(v1, v3)) != 0) {
                if(f0.e) {
                    f0.c = null;
                    return;
                }
                int v5 = this.d;
                if(this.c && v == v5) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable0 = this.b;
                    if(throwable0 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable0);
                    return;
                }
                if(v == v5) {
                    break;
                }
                subscriber0.onNext(arrayList0.get(v));
                ++v;
                ++v1;
            }
            if(v4 == 0) {
                if(f0.e) {
                    f0.c = null;
                    return;
                }
                if(this.c && v == this.d) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable1 = this.b;
                    if(throwable1 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable1);
                    return;
                }
            }
            f0.c = v;
            f0.f = v1;
            v2 = f0.addAndGet(-v2);
        }
        while(v2 != 0);
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final int size() {
        return this.d;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void trimHead() {
    }
}

