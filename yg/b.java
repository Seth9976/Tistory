package yg;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import org.reactivestreams.Processor;

public final class b implements Flow.Processor {
    public final Processor a;

    public b(Processor processor0) {
        this.a = processor0;
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

    @Override
    public final void subscribe(Flow.Subscriber flow$Subscriber0) {
        g g0 = flow$Subscriber0 == null ? null : new g(flow$Subscriber0);
        this.a.subscribe(g0);
    }
}

