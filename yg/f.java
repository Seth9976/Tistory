package yg;

import java.util.concurrent.Flow.Processor;
import org.reactivestreams.Processor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f implements Processor {
    public final Flow.Processor a;

    public f(Flow.Processor flow$Processor0) {
        this.a = flow$Processor0;
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

    @Override  // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber0) {
        c c0 = subscriber0 == null ? null : new c(subscriber0);
        this.a.subscribe(c0);
    }
}

