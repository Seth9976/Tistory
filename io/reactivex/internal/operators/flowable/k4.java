package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class k4 extends AtomicReference implements FlowableSubscriber, Disposable {
    public final ReplayBuffer a;
    public boolean b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final AtomicInteger e;
    public long f;
    public long g;
    public static final f4[] h;
    public static final f4[] i;

    static {
        k4.h = new f4[0];
        k4.i = new f4[0];
    }

    public k4(ReplayBuffer flowableReplay$ReplayBuffer0) {
        this.a = flowableReplay$ReplayBuffer0;
        this.e = new AtomicInteger();
        this.c = new AtomicReference(k4.h);
        this.d = new AtomicBoolean();
    }

    public final void a() {
        AtomicInteger atomicInteger0 = this.e;
        if(atomicInteger0.getAndIncrement() != 0) {
            return;
        }
        int v = 1;
        do {
            if(this.isDisposed()) {
                return;
            }
            f4[] arr_f4 = (f4[])this.c.get();
            long v1 = this.f;
            long v3 = v1;
            for(int v2 = 0; v2 < arr_f4.length; ++v2) {
                v3 = Math.max(v3, arr_f4[v2].d.get());
            }
            long v4 = this.g;
            Subscription subscription0 = (Subscription)this.get();
            long v5 = v3 - v1;
            if(v5 != 0L) {
                this.f = v3;
                if(subscription0 == null) {
                    this.g = v4 + v5 >= 0L ? v4 + v5 : 0x7FFFFFFFFFFFFFFFL;
                }
                else if(v4 == 0L) {
                    subscription0.request(v5);
                }
                else {
                    this.g = 0L;
                    subscription0.request(v4 + v5);
                }
            }
            else if(v4 != 0L && subscription0 != null) {
                this.g = 0L;
                subscription0.request(v4);
            }
            v = atomicInteger0.addAndGet(-v);
        }
        while(v != 0);
    }

    public final void b(f4 f40) {
        f4[] arr_f41;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            f4[] arr_f4 = (f4[])atomicReference0.get();
            int v = arr_f4.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_f4[v1].equals(f40)) {
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
            if(v == 1) {
                arr_f41 = k4.h;
            }
            else {
                f4[] arr_f42 = new f4[v - 1];
                System.arraycopy(arr_f4, 0, arr_f42, 0, v1);
                System.arraycopy(arr_f4, v1 + 1, arr_f42, v1, v - v1 - 1);
                arr_f41 = arr_f42;
            }
            do {
                if(atomicReference0.compareAndSet(arr_f4, arr_f41)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_f4);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.set(k4.i);
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == k4.i;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.b) {
            this.b = true;
            ReplayBuffer flowableReplay$ReplayBuffer0 = this.a;
            flowableReplay$ReplayBuffer0.complete();
            f4[] arr_f4 = (f4[])this.c.getAndSet(k4.i);
            for(int v = 0; v < arr_f4.length; ++v) {
                flowableReplay$ReplayBuffer0.replay(arr_f4[v]);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(!this.b) {
            this.b = true;
            ReplayBuffer flowableReplay$ReplayBuffer0 = this.a;
            flowableReplay$ReplayBuffer0.error(throwable0);
            f4[] arr_f4 = (f4[])this.c.getAndSet(k4.i);
            for(int v = 0; v < arr_f4.length; ++v) {
                flowableReplay$ReplayBuffer0.replay(arr_f4[v]);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.b) {
            ReplayBuffer flowableReplay$ReplayBuffer0 = this.a;
            flowableReplay$ReplayBuffer0.next(object0);
            f4[] arr_f4 = (f4[])this.c.get();
            for(int v = 0; v < arr_f4.length; ++v) {
                flowableReplay$ReplayBuffer0.replay(arr_f4[v]);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            this.a();
            f4[] arr_f4 = (f4[])this.c.get();
            for(int v = 0; v < arr_f4.length; ++v) {
                this.a.replay(arr_f4[v]);
            }
        }
    }
}

