package fd;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class v extends AtomicInteger implements Subscription {
    public final Subscriber a;
    public final u[] b;
    public final List[] c;
    public final int[] d;
    public final Comparator e;
    public final AtomicLong f;
    public volatile boolean g;
    public final AtomicInteger h;
    public final AtomicReference i;

    public v(Subscriber subscriber0, int v, Comparator comparator0) {
        this.f = new AtomicLong();
        this.h = new AtomicInteger();
        this.i = new AtomicReference();
        this.a = subscriber0;
        this.e = comparator0;
        u[] arr_u = new u[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_u[v1] = new u(this, v1);
        }
        this.b = arr_u;
        this.c = new List[v];
        this.d = new int[v];
        this.h.lazySet(v);
    }

    public final void a() {
        u[] arr_u = this.b;
        for(int v = 0; v < arr_u.length; ++v) {
            u u0 = arr_u[v];
            u0.getClass();
            SubscriptionHelper.cancel(u0);
        }
    }

    public final void b() {
        int v3;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        List[] arr_list = this.c;
        int[] arr_v = this.d;
        int v = 1;
    alab1:
        while(true) {
            long v1 = this.f.get();
            long v2 = 0L;
            while(true) {
                v3 = 0;
                if(Long.compare(v2, v1) == 0) {
                    break;
                }
                if(this.g) {
                    Arrays.fill(arr_list, null);
                    return;
                }
                Throwable throwable0 = (Throwable)this.i.get();
                if(throwable0 != null) {
                    this.a();
                    Arrays.fill(arr_list, null);
                    subscriber0.onError(throwable0);
                    return;
                }
                int v4 = -1;
                Object object0 = null;
                while(v3 < arr_v.length) {
                    List list0 = arr_list[v3];
                    int v5 = arr_v[v3];
                    if(list0.size() != v5) {
                        if(object0 == null) {
                            object0 = list0.get(v5);
                        }
                        else {
                            Object object1 = list0.get(v5);
                            try {
                                if(this.e.compare(object0, object1) > 0) {
                                    goto label_44;
                                }
                                goto label_46;
                            }
                            catch(Throwable throwable1) {
                                Exceptions.throwIfFatal(throwable1);
                                this.a();
                                Arrays.fill(arr_list, null);
                                AtomicReference atomicReference0 = this.i;
                                while(!atomicReference0.compareAndSet(null, throwable1)) {
                                    if(atomicReference0.get() != null) {
                                        RxJavaPlugins.onError(throwable1);
                                        break;
                                    }
                                    if(false) {
                                        break;
                                    }
                                }
                                subscriber0.onError(((Throwable)this.i.get()));
                                return;
                            }
                        label_44:
                            object0 = object1;
                        }
                        v4 = v3;
                    }
                label_46:
                    ++v3;
                }
                if(object0 == null) {
                    Arrays.fill(arr_list, null);
                    subscriber0.onComplete();
                    return;
                }
                subscriber0.onNext(object0);
                ++arr_v[v4];
                ++v2;
            }
            if(this.g) {
                Arrays.fill(arr_list, null);
                return;
            }
            Throwable throwable2 = (Throwable)this.i.get();
            if(throwable2 != null) {
                this.a();
                Arrays.fill(arr_list, null);
                subscriber0.onError(throwable2);
                return;
            }
            while(true) {
                if(v3 >= arr_v.length) {
                    break alab1;
                }
                if(arr_v[v3] != arr_list[v3].size()) {
                    if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.f.addAndGet(-v2);
                    }
                    int v6 = this.get();
                    if(v6 == v) {
                        v6 = this.addAndGet(-v);
                        if(v6 == 0) {
                            return;
                        }
                    }
                    v = v6;
                    break;
                }
                ++v3;
            }
        }
        Arrays.fill(arr_list, null);
        subscriber0.onComplete();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.g) {
            this.g = true;
            this.a();
            if(this.getAndIncrement() == 0) {
                Arrays.fill(this.c, null);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.f, v);
            if(this.h.get() == 0) {
                this.b();
            }
        }
    }
}

