package yg;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import org.reactivestreams.Publisher;

public final class a implements Flow.Publisher {
    public final Publisher a;

    public a(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override
    public final void subscribe(Flow.Subscriber flow$Subscriber0) {
        g g0 = flow$Subscriber0 == null ? null : new g(flow$Subscriber0);
        this.a.subscribe(g0);
    }
}

