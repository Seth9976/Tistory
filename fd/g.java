package fd;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Subscription;

public final class g implements Subscription {
    public final int a;
    public final int b;
    public final h c;

    public g(h h0, int v, int v1) {
        this.c = h0;
        this.a = v;
        this.b = v1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.c.b.compareAndSet(this.a + this.b, 0L, 1L)) {
            h h0 = this.c;
            if(h0.b.decrementAndGet(this.b + this.b) == 0L) {
                h0.k = true;
                h0.f.cancel();
                if(h0.getAndIncrement() == 0) {
                    h0.g.clear();
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            h h0 = this.c;
            AtomicLongArray atomicLongArray0 = h0.b;
            do {
                long v1 = atomicLongArray0.get(this.a);
                if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                    return;
                }
            }
            while(!atomicLongArray0.compareAndSet(this.a, v1, BackpressureHelper.addCap(v1, v)));
            if(h0.l.get() == this.b) {
                h0.a();
            }
        }
    }
}

