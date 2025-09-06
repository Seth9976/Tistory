package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableSamplePublisher extends Flowable {
    public final Publisher b;
    public final Publisher c;
    public final boolean d;

    public FlowableSamplePublisher(Publisher publisher0, Publisher publisher1, boolean z) {
        this.b = publisher0;
        this.c = publisher1;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        Publisher publisher0 = this.c;
        Publisher publisher1 = this.b;
        if(this.d) {
            publisher1.subscribe(new r4(serializedSubscriber0, publisher0));
            return;
        }
        publisher1.subscribe(new s4(serializedSubscriber0, publisher0));  // 初始化器: Lio/reactivex/internal/operators/flowable/t4;-><init>(Lio/reactivex/subscribers/SerializedSubscriber;Lorg/reactivestreams/Publisher;)V
    }
}

