package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import org.reactivestreams.Publisher;

public abstract class a extends Flowable implements HasUpstreamPublisher {
    protected final Flowable source;

    public a(Flowable flowable0) {
        this.source = (Flowable)ObjectHelper.requireNonNull(flowable0, "source is null");
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final Publisher source() {
        return this.source;
    }
}

