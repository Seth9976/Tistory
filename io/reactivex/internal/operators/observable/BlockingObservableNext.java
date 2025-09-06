package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.flowable.e;
import java.util.Iterator;

public final class BlockingObservableNext implements Iterable {
    public final ObservableSource a;

    public BlockingObservableNext(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override
    public Iterator iterator() {
        f f0 = new f();
        return new e(this.a, f0, 1);
    }
}

