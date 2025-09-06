package yg;

import java.util.concurrent.Flow.Subscriber;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class g implements Subscriber {
    public final Flow.Subscriber a;

    public g(Flow.Subscriber flow$Subscriber0) {
        this.a = flow$Subscriber0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription0) {
        d d0 = subscription0 == null ? null : new d(subscription0);
        this.a.onSubscribe(d0);
    }
}

