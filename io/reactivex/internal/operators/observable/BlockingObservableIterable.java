package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.Iterator;

public final class BlockingObservableIterable implements Iterable {
    public final ObservableSource a;
    public final int b;

    public BlockingObservableIterable(ObservableSource observableSource0, int v) {
        this.a = observableSource0;
        this.b = v;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new b(this.b);
        this.a.subscribe(((Observer)iterator0));
        return iterator0;
    }
}

