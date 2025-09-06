package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.Iterator;

public final class BlockingObservableLatest implements Iterable {
    public final ObservableSource a;

    public BlockingObservableLatest(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new c();
        Observable.wrap(this.a).materialize().subscribe(((Observer)iterator0));
        return iterator0;
    }
}

