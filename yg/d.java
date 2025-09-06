package yg;

import java.util.concurrent.Flow.Subscription;
import org.reactivestreams.Subscription;

public final class d implements Flow.Subscription {
    public final Subscription a;

    public d(Subscription subscription0) {
        this.a = subscription0;
    }

    @Override
    public final void cancel() {
        this.a.cancel();
    }

    @Override
    public final void request(long v) {
        this.a.request(v);
    }
}

