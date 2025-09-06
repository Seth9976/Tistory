package io.reactivex.processors;

import io.reactivex.internal.functions.ObjectHelper;
import java.lang.reflect.Array;
import org.reactivestreams.Subscriber;

public final class h implements ReplayBuffer {
    public final int a;
    public int b;
    public volatile e c;
    public e d;
    public Throwable e;
    public volatile boolean f;

    public h(int v) {
        this.a = ObjectHelper.verifyPositive(v, "maxSize");
        e e0 = new e(null);
        this.d = e0;
        this.c = e0;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void complete() {
        this.trimHead();
        this.f = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void error(Throwable throwable0) {
        this.e = throwable0;
        this.trimHead();
        this.f = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Throwable getError() {
        return this.e;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object getValue() {
        e e0 = this.c;
        e e1;
        while((e1 = (e)e0.get()) != null) {
            e0 = e1;
        }
        return e0.a;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        e e0 = this.c;
        e e1 = e0;
        int v1;
        for(v1 = 0; true; ++v1) {
            e1 = (e)e1.get();
            if(e1 == null) {
                break;
            }
        }
        if(arr_object.length < v1) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
        }
        for(int v = 0; v < v1; ++v) {
            e0 = (e)e0.get();
            arr_object[v] = e0.a;
        }
        if(arr_object.length > v1) {
            arr_object[v1] = null;
        }
        return arr_object;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final boolean isDone() {
        return this.f;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void next(Object object0) {
        e e0 = new e(object0);
        e e1 = this.d;
        this.d = e0;
        ++this.b;
        e1.set(e0);
        int v = this.b;
        if(v > this.a) {
            this.b = v - 1;
            this.c = (e)this.c.get();
        }
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void replay(f f0) {
        if(f0.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = f0.a;
        e e0 = (e)f0.c;
        if(e0 == null) {
            e0 = this.c;
        }
        long v = f0.f;
        int v1 = 1;
        do {
            long v2 = f0.d.get();
            int v3;
            while((v3 = Long.compare(v, v2)) != 0) {
                if(f0.e) {
                    f0.c = null;
                    return;
                }
                boolean z = this.f;
                e e1 = (e)e0.get();
                if(z && e1 == null) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable0 = this.e;
                    if(throwable0 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable0);
                    return;
                }
                if(e1 == null) {
                    break;
                }
                subscriber0.onNext(e1.a);
                ++v;
                e0 = e1;
            }
            if(v3 == 0) {
                if(f0.e) {
                    f0.c = null;
                    return;
                }
                if(this.f && e0.get() == null) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable1 = this.e;
                    if(throwable1 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable1);
                    return;
                }
            }
            f0.c = e0;
            f0.f = v;
            v1 = f0.addAndGet(-v1);
        }
        while(v1 != 0);
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final int size() {
        e e0 = this.c;
        int v;
        for(v = 0; v != 0x7FFFFFFF; ++v) {
            e0 = (e)e0.get();
            if(e0 == null) {
                break;
            }
        }
        return v;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void trimHead() {
        if(this.c.a != null) {
            e e0 = new e(null);
            e0.lazySet(this.c.get());
            this.c = e0;
        }
    }
}

