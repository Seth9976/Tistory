package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import java.util.Iterator;

public final class BlockingFlowableIterable implements Iterable {
    public final Flowable a;
    public final int b;

    public BlockingFlowableIterable(Flowable flowable0, int v) {
        this.a = flowable0;
        this.b = v;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new b(this.b);
        this.a.subscribe(((FlowableSubscriber)iterator0));
        return iterator0;
    }
}

