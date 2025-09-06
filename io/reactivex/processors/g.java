package io.reactivex.processors;

import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class g implements ReplayBuffer {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public int e;
    public volatile i f;
    public i g;
    public Throwable h;
    public volatile boolean i;

    public g(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = ObjectHelper.verifyPositive(v, "maxSize");
        this.b = ObjectHelper.verifyPositive(v1, "maxAge");
        this.c = (TimeUnit)ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        this.d = (Scheduler)ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        i i0 = new i(null, 0L);
        this.g = i0;
        this.f = i0;
    }

    public final i a() {
        i i2;
        i i0 = this.f;
        long v = this.d.now(this.c) - this.b;
        for(i i1 = (i)i0.get(); true; i1 = (i)i0.get()) {
            i2 = i0;
            i0 = i1;
            if(i0 == null || i0.b > v) {
                break;
            }
        }
        return i2;
    }

    public final void b() {
        long v = this.d.now(this.c) - this.b;
        for(i i0 = this.f; true; i0 = i1) {
            i i1 = (i)i0.get();
            if(i1 == null) {
                if(i0.a != null) {
                    this.f = new i(null, 0L);
                    return;
                }
                this.f = i0;
                return;
            }
            if(i1.b > v) {
                if(i0.a != null) {
                    i i2 = new i(null, 0L);
                    i2.lazySet(i0.get());
                    this.f = i2;
                    return;
                }
                this.f = i0;
                return;
            }
        }
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void complete() {
        this.b();
        this.i = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void error(Throwable throwable0) {
        this.b();
        this.h = throwable0;
        this.i = true;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Throwable getError() {
        return this.h;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object getValue() {
        i i0 = this.f;
        i i1;
        while((i1 = (i)i0.get()) != null) {
            i0 = i1;
        }
        long v = this.d.now(this.c);
        return i0.b >= v - this.b ? i0.a : null;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final Object[] getValues(Object[] arr_object) {
        i i0 = this.a();
        i i1 = i0;
        int v1;
        for(v1 = 0; v1 != 0x7FFFFFFF; ++v1) {
            i1 = (i)i1.get();
            if(i1 == null) {
                break;
            }
        }
        if(v1 != 0) {
            if(arr_object.length < v1) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
            }
            for(int v = 0; v != v1; ++v) {
                i0 = (i)i0.get();
                arr_object[v] = i0.a;
            }
            if(arr_object.length > v1) {
                arr_object[v1] = null;
            }
        }
        else if(arr_object.length != 0) {
            arr_object[0] = null;
            return arr_object;
        }
        return arr_object;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final boolean isDone() {
        return this.i;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void next(Object object0) {
        i i0 = new i(object0, this.d.now(this.c));
        i i1 = this.g;
        this.g = i0;
        ++this.e;
        i1.set(i0);
        int v = this.e;
        if(v > this.a) {
            this.e = v - 1;
            this.f = (i)this.f.get();
        }
        long v1 = this.d.now(this.c) - this.b;
        for(i i2 = this.f; true; i2 = i3) {
            if(this.e <= 1) {
                this.f = i2;
                return;
            }
            i i3 = (i)i2.get();
            if(i3 == null) {
                this.f = i2;
                return;
            }
            if(i3.b > v1) {
                this.f = i2;
                return;
            }
            --this.e;
        }
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void replay(f f0) {
        if(f0.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = f0.a;
        i i0 = (i)f0.c;
        if(i0 == null) {
            i0 = this.a();
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
                boolean z = this.i;
                i i1 = (i)i0.get();
                if(z && i1 == null) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable0 = this.h;
                    if(throwable0 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable0);
                    return;
                }
                if(i1 == null) {
                    break;
                }
                subscriber0.onNext(i1.a);
                ++v;
                i0 = i1;
            }
            if(v3 == 0) {
                if(f0.e) {
                    f0.c = null;
                    return;
                }
                if(this.i && i0.get() == null) {
                    f0.c = null;
                    f0.e = true;
                    Throwable throwable1 = this.h;
                    if(throwable1 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable1);
                    return;
                }
            }
            f0.c = i0;
            f0.f = v;
            v1 = f0.addAndGet(-v1);
        }
        while(v1 != 0);
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final int size() {
        i i0 = this.a();
        int v;
        for(v = 0; v != 0x7FFFFFFF; ++v) {
            i0 = (i)i0.get();
            if(i0 == null) {
                break;
            }
        }
        return v;
    }

    @Override  // io.reactivex.processors.ReplayProcessor$ReplayBuffer
    public final void trimHead() {
        if(this.f.a != null) {
            i i0 = new i(null, 0L);
            i0.lazySet(this.f.get());
            this.f = i0;
        }
    }
}

