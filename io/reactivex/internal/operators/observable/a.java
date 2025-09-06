package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

public abstract class a extends Observable implements HasUpstreamObservableSource {
    protected final ObservableSource source;

    public a(ObservableSource observableSource0) {
        this.source = observableSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final ObservableSource source() {
        return this.source;
    }
}

