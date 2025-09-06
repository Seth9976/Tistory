package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class u extends AtomicReference implements FlowableSubscriber {
    public final v a;
    public final int b;

    public u(v v0, int v1) {
        this.a = v0;
        this.b = v1;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        v v0 = this.a;
        AtomicReference atomicReference0 = v0.i;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                v0.b();
                return;
            }
        }
        while(atomicReference0.get() == null);
        if(throwable0 != atomicReference0.get()) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        v v0 = this.a;
        v0.c[this.b] = (List)object0;
        if(v0.h.decrementAndGet() == 0) {
            v0.b();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

