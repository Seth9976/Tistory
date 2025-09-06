package yg;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import org.reactivestreams.Subscriber;

public final class c implements Flow.Subscriber {
    public final Subscriber a;

    public c(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override
    public final void onSubscribe(Flow.Subscription flow$Subscription0) {
        h h0 = flow$Subscription0 == null ? null : new h(flow$Subscription0);
        this.a.onSubscribe(h0);
    }
}

