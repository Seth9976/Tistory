package org.reactivestreams;

import i3.b;
import java.util.Objects;
import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import yg.a;
import yg.c;
import yg.e;
import yg.f;
import yg.g;

public final class FlowAdapters {
    public static Flow.Processor toFlowProcessor(Processor processor0) {
        Objects.requireNonNull(processor0, "reactiveStreamsProcessor");
        if(processor0 instanceof f) {
            return ((f)processor0).a;
        }
        return b.u(processor0) ? ((Flow.Processor)processor0) : new yg.b(processor0);
    }

    public static Flow.Publisher toFlowPublisher(Publisher publisher0) {
        Objects.requireNonNull(publisher0, "reactiveStreamsPublisher");
        if(publisher0 instanceof e) {
            return ((e)publisher0).a;
        }
        return b.v(publisher0) ? ((Flow.Publisher)publisher0) : new a(publisher0);
    }

    public static Flow.Subscriber toFlowSubscriber(Subscriber subscriber0) {
        Objects.requireNonNull(subscriber0, "reactiveStreamsSubscriber");
        if(subscriber0 instanceof g) {
            return ((g)subscriber0).a;
        }
        return b.w(subscriber0) ? ((Flow.Subscriber)subscriber0) : new c(subscriber0);
    }

    public static Processor toProcessor(Flow.Processor flow$Processor0) {
        Objects.requireNonNull(flow$Processor0, "flowProcessor");
        if(flow$Processor0 instanceof yg.b) {
            return ((yg.b)flow$Processor0).a;
        }
        return flow$Processor0 instanceof Processor ? ((Processor)flow$Processor0) : new f(flow$Processor0);
    }

    public static Publisher toPublisher(Flow.Publisher flow$Publisher0) {
        Objects.requireNonNull(flow$Publisher0, "flowPublisher");
        if(flow$Publisher0 instanceof a) {
            return ((a)flow$Publisher0).a;
        }
        return flow$Publisher0 instanceof Publisher ? ((Publisher)flow$Publisher0) : new e(flow$Publisher0);
    }

    public static Subscriber toSubscriber(Flow.Subscriber flow$Subscriber0) {
        Objects.requireNonNull(flow$Subscriber0, "flowSubscriber");
        if(flow$Subscriber0 instanceof c) {
            return ((c)flow$Subscriber0).a;
        }
        return flow$Subscriber0 instanceof Subscriber ? ((Subscriber)flow$Subscriber0) : new g(flow$Subscriber0);
    }
}

