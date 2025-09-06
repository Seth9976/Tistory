package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import org.reactivestreams.Publisher;

public final class BlockingFlowableNext implements Iterable {
    public final Publisher a;

    public BlockingFlowableNext(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override
    public Iterator iterator() {
        f f0 = new f();
        return new e(this.a, f0, 0);
    }
}

