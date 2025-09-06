package yg;

import java.util.concurrent.Flow.Subscription;
import org.reactivestreams.Subscription;

public final class h implements Subscription {
    public final Flow.Subscription a;

    public h(Flow.Subscription flow$Subscription0) {
        this.a = flow$Subscription0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.a.cancel();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.a.request(v);
    }
}

