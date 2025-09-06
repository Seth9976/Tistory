package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import java.util.Iterator;
import org.reactivestreams.Publisher;

public final class BlockingFlowableLatest implements Iterable {
    public final Publisher a;

    public BlockingFlowableLatest(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new c();
        Flowable.fromPublisher(this.a).materialize().subscribe(((FlowableSubscriber)iterator0));
        return iterator0;
    }
}

