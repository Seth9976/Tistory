package fd;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class o extends DeferredScalarSubscription {
    public final n[] a;
    public final BiFunction b;
    public final AtomicReference c;
    public final AtomicInteger d;
    public final AtomicReference e;

    public o(Subscriber subscriber0, int v, BiFunction biFunction0) {
        super(subscriber0);
        this.c = new AtomicReference();
        this.d = new AtomicInteger();
        this.e = new AtomicReference();
        n[] arr_n = new n[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_n[v1] = new n(this, biFunction0);
        }
        this.a = arr_n;
        this.b = biFunction0;
        this.d.lazySet(v);
    }

    public final void a(Object object0) {
        AtomicReference atomicReference0 = this.c;
        if(object0 != null) {
        alab1:
            while(true) {
                p p0 = (p)atomicReference0.get();
                if(p0 == null) {
                    p p1 = new p();
                    while(true) {
                        if(atomicReference0.compareAndSet(null, p1)) {
                            p0 = p1;
                            break;
                        }
                        if(atomicReference0.get() != null) {
                            continue alab1;
                        }
                    }
                }
                do {
                    int v = p0.get();
                    if(v >= 2) {
                        v = -1;
                        break;
                    }
                }
                while(!p0.compareAndSet(v, v + 1));
                if(v >= 0) {
                    if(v == 0) {
                        p0.a = object0;
                    }
                    else {
                        p0.b = object0;
                    }
                    if(p0.c.incrementAndGet() == 2) {
                        while(!atomicReference0.compareAndSet(p0, null) && atomicReference0.get() == p0) {
                        }
                    }
                    else {
                        p0 = null;
                    }
                    if(p0 != null) {
                        try {
                            object0 = ObjectHelper.requireNonNull(this.b.apply(p0.a, p0.b), "The reducer returned a null value");
                            continue;
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            this.innerError(throwable0);
                            return;
                        }
                    }
                    break;
                }
                while(!atomicReference0.compareAndSet(p0, null) && atomicReference0.get() == p0) {
                }
            }
        }
        if(this.d.decrementAndGet() == 0) {
            p p2 = (p)atomicReference0.get();
            atomicReference0.lazySet(null);
            if(p2 != null) {
                this.complete(p2.a);
                return;
            }
            this.downstream.onComplete();
        }
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        n[] arr_n = this.a;
        for(int v = 0; v < arr_n.length; ++v) {
            n n0 = arr_n[v];
            n0.getClass();
            SubscriptionHelper.cancel(n0);
        }
    }

    public final void innerError(Throwable throwable0) {
        AtomicReference atomicReference0 = this.e;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                this.cancel();
                this.downstream.onError(throwable0);
                return;
            }
        }
        while(atomicReference0.get() == null);
        if(throwable0 != atomicReference0.get()) {
            RxJavaPlugins.onError(throwable0);
        }
    }
}

