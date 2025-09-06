package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import java.util.Iterator;

public final class BlockingObservableMostRecent implements Iterable {
    public final ObservableSource a;
    public final Object b;

    public BlockingObservableMostRecent(ObservableSource observableSource0, Object object0) {
        this.a = observableSource0;
        this.b = object0;
    }

    @Override
    public Iterator iterator() {
        e e0 = new e();  // 初始化器: Lio/reactivex/observers/DefaultObserver;-><init>()V
        e0.b = this.b;
        this.a.subscribe(e0);
        return new d(e0);
    }
}

