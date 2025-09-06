package ed;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Function b;
    public final boolean c;
    public final AtomicThrowable d;
    public final AtomicLong e;
    public final AtomicReference f;
    public Subscription g;
    public volatile boolean h;
    public volatile boolean i;
    public long j;
    public static final k k;

    static {
        l.k = new k(null);
    }

    public l(Subscriber subscriber0, Function function0, boolean z) {
        this.a = subscriber0;
        this.b = function0;
        this.c = z;
        this.d = new AtomicThrowable();
        this.e = new AtomicLong();
        this.f = new AtomicReference();
    }

    public final void a() {
        k k0 = (k)this.f.getAndSet(l.k);
        if(k0 != null && k0 != l.k) {
            DisposableHelper.dispose(k0);
        }
    }

    public final void b() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        AtomicThrowable atomicThrowable0 = this.d;
        AtomicReference atomicReference0 = this.f;
        AtomicLong atomicLong0 = this.e;
        long v = this.j;
        int v1 = 1;
        while(true) {
            if(this.i) {
                return;
            }
            if(atomicThrowable0.get() != null && !this.c) {
                subscriber0.onError(atomicThrowable0.terminate());
                return;
            }
            boolean z = this.h;
            k k0 = (k)atomicReference0.get();
            if(z && k0 == null) {
                Throwable throwable0 = atomicThrowable0.terminate();
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            if(k0 != null && k0.b != null && v != atomicLong0.get()) {
                while(!atomicReference0.compareAndSet(k0, null) && atomicReference0.get() == k0) {
                }
                subscriber0.onNext(k0.b);
                ++v;
            }
            else {
                this.j = v;
                v1 = this.addAndGet(-v1);
                if(v1 == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.i = true;
        this.g.cancel();
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.h = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            if(!this.c) {
                this.a();
            }
            this.h = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        SingleSource singleSource0;
        k k0 = l.k;
        AtomicReference atomicReference0 = this.f;
        k k1 = (k)atomicReference0.get();
        if(k1 != null) {
            DisposableHelper.dispose(k1);
        }
        try {
            singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null SingleSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.g.cancel();
            atomicReference0.getAndSet(k0);
            this.onError(throwable0);
            return;
        }
        k k2 = new k(this);
        k k3;
        while((k3 = (k)atomicReference0.get()) != k0) {
        label_16:
            if(atomicReference0.compareAndSet(k3, k2)) {
                singleSource0.subscribe(k2);
                return;
            }
            if(atomicReference0.get() != k3) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_16;
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        BackpressureHelper.add(this.e, v);
        this.b();
    }
}

