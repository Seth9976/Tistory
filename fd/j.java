package fd;

import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class j extends AtomicInteger implements Subscription {
    public final Subscriber a;
    public final i[] b;
    public final AtomicThrowable c;
    public final AtomicLong d;
    public volatile boolean e;
    public final AtomicInteger f;
    public final int g;

    public j(Subscriber subscriber0, int v, int v1, int v2) {
        this.g = v2;
        super();
        this.c = new AtomicThrowable();
        this.d = new AtomicLong();
        this.f = new AtomicInteger();
        this.a = subscriber0;
        i[] arr_i = new i[v];
        for(int v3 = 0; v3 < v; ++v3) {
            arr_i[v3] = new i(this, v1);
        }
        this.b = arr_i;
        this.f.lazySet(v);
    }

    public final void a() {
        i[] arr_i = this.b;
        for(int v = 0; v < arr_i.length; ++v) {
            i i0 = arr_i[v];
            i0.getClass();
            SubscriptionHelper.cancel(i0);
        }
    }

    public final void b() {
        i[] arr_i = this.b;
        for(int v = 0; v < arr_i.length; ++v) {
            arr_i[v].e = null;
        }
    }

    public final void c() {
        if(this.g != 0) {
            if(this.getAndIncrement() == 0) {
                this.d();
            }
            return;
        }
        if(this.getAndIncrement() == 0) {
            this.d();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.e) {
            this.e = true;
            this.a();
            if(this.getAndIncrement() == 0) {
                this.b();
            }
        }
    }

    public final void d() {
        if(this.g != 0) {
            i[] arr_i = this.b;
            Subscriber subscriber0 = this.a;
            int v = 1;
            while(true) {
                long v1 = this.d.get();
                long v2 = 0L;
            alab1:
                while(v2 != v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    boolean z = this.f.get() == 0;
                    boolean z1 = true;
                    for(int v3 = 0; v3 < arr_i.length; ++v3) {
                        i i0 = arr_i[v3];
                        SpscArrayQueue spscArrayQueue0 = i0.e;
                        if(spscArrayQueue0 != null) {
                            Object object0 = spscArrayQueue0.poll();
                            if(object0 != null) {
                                subscriber0.onNext(object0);
                                i0.b();
                                ++v2;
                                if(v2 == v1) {
                                    break alab1;
                                }
                                else {
                                    z1 = false;
                                }
                            }
                        }
                    }
                    if(z && z1) {
                        if(((Throwable)this.c.get()) != null) {
                            subscriber0.onError(this.c.terminate());
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                    if(z1) {
                        break;
                    }
                }
                if(v2 == v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    boolean z2 = this.f.get() == 0;
                    int v4 = 0;
                    while(true) {
                        boolean z3 = true;
                        if(v4 < arr_i.length) {
                            SpscArrayQueue spscArrayQueue1 = arr_i[v4].e;
                            if(spscArrayQueue1 == null || spscArrayQueue1.isEmpty()) {
                                ++v4;
                                continue;
                            }
                            else {
                                z3 = false;
                            }
                        }
                        break;
                    }
                    if(z2 && z3) {
                        if(((Throwable)this.c.get()) != null) {
                            subscriber0.onError(this.c.terminate());
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.d.addAndGet(-v2);
                }
                int v5 = this.get();
                if(v5 == v) {
                    v5 = this.addAndGet(-v);
                    if(v5 == 0) {
                        return;
                    }
                }
                v = v5;
            }
        }
        i[] arr_i1 = this.b;
        Subscriber subscriber1 = this.a;
        int v6 = 1;
        while(true) {
            long v7 = this.d.get();
            long v8 = 0L;
        alab2:
            while(v8 != v7) {
                if(this.e) {
                    this.b();
                    return;
                }
                Throwable throwable0 = (Throwable)this.c.get();
                if(throwable0 != null) {
                    this.b();
                    subscriber1.onError(throwable0);
                    return;
                }
                boolean z4 = this.f.get() == 0;
                boolean z5 = true;
                for(int v9 = 0; v9 < arr_i1.length; ++v9) {
                    i i1 = arr_i1[v9];
                    SpscArrayQueue spscArrayQueue2 = i1.e;
                    if(spscArrayQueue2 != null) {
                        Object object1 = spscArrayQueue2.poll();
                        if(object1 != null) {
                            subscriber1.onNext(object1);
                            i1.b();
                            ++v8;
                            if(v8 == v7) {
                                break alab2;
                            }
                            else {
                                z5 = false;
                            }
                        }
                    }
                }
                if(z4 && z5) {
                    subscriber1.onComplete();
                    return;
                }
                if(z5) {
                    break;
                }
            }
            if(v8 == v7) {
                if(this.e) {
                    this.b();
                    return;
                }
                Throwable throwable1 = (Throwable)this.c.get();
                if(throwable1 != null) {
                    this.b();
                    subscriber1.onError(throwable1);
                    return;
                }
                boolean z6 = this.f.get() == 0;
                int v10 = 0;
                while(true) {
                    boolean z7 = true;
                    if(v10 < arr_i1.length) {
                        SpscArrayQueue spscArrayQueue3 = arr_i1[v10].e;
                        if(spscArrayQueue3 == null || spscArrayQueue3.isEmpty()) {
                            ++v10;
                            continue;
                        }
                        else {
                            z7 = false;
                        }
                    }
                    break;
                }
                if(z6 && z7) {
                    subscriber1.onComplete();
                    return;
                }
            }
            if(v8 != 0L && v7 != 0x7FFFFFFFFFFFFFFFL) {
                this.d.addAndGet(-v8);
            }
            int v11 = this.get();
            if(v11 == v6) {
                v11 = this.addAndGet(-v6);
                if(v11 == 0) {
                    return;
                }
            }
            v6 = v11;
        }
    }

    public final void e(Throwable throwable0) {
        if(this.g != 0) {
            this.c.addThrowable(throwable0);
            this.f.decrementAndGet();
            this.c();
            return;
        }
        AtomicThrowable atomicThrowable0 = this.c;
        if(atomicThrowable0.compareAndSet(null, throwable0)) {
            this.a();
            this.c();
            return;
        }
        if(throwable0 != atomicThrowable0.get()) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.d, v);
            this.c();
        }
    }
}

