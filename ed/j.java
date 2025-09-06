package ed;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeSource;
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

public final class j extends AtomicInteger implements FlowableSubscriber, Subscription {
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
    public static final i k;

    static {
        j.k = new i(null);
    }

    public j(Subscriber subscriber0, Function function0, boolean z) {
        this.a = subscriber0;
        this.b = function0;
        this.c = z;
        this.d = new AtomicThrowable();
        this.e = new AtomicLong();
        this.f = new AtomicReference();
    }

    public final void a() {
        i i0 = (i)this.f.getAndSet(j.k);
        if(i0 != null && i0 != j.k) {
            DisposableHelper.dispose(i0);
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
            i i0 = (i)atomicReference0.get();
            if(z && i0 == null) {
                Throwable throwable0 = atomicThrowable0.terminate();
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            if(i0 != null && i0.b != null && v != atomicLong0.get()) {
                while(!atomicReference0.compareAndSet(i0, null) && atomicReference0.get() == i0) {
                }
                subscriber0.onNext(i0.b);
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
        MaybeSource maybeSource0;
        i i0 = j.k;
        AtomicReference atomicReference0 = this.f;
        i i1 = (i)atomicReference0.get();
        if(i1 != null) {
            DisposableHelper.dispose(i1);
        }
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null MaybeSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.g.cancel();
            atomicReference0.getAndSet(i0);
            this.onError(throwable0);
            return;
        }
        i i2 = new i(this);
        i i3;
        while((i3 = (i)atomicReference0.get()) != i0) {
        label_16:
            if(atomicReference0.compareAndSet(i3, i2)) {
                maybeSource0.subscribe(i2);
                return;
            }
            if(atomicReference0.get() != i3) {
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

