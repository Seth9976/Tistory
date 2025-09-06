package yg;

import java.util.concurrent.Flow.Publisher;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class e implements Publisher {
    public final Flow.Publisher a;

    public e(Flow.Publisher flow$Publisher0) {
        this.a = flow$Publisher0;
    }

    @Override  // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber0) {
        c c0 = subscriber0 == null ? null : new c(subscriber0);
        this.a.subscribe(c0);
    }
}

