package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

public enum MaybeToPublisher implements Function {
    INSTANCE;

    @Override  // io.reactivex.functions.Function
    public Object apply(Object object0) throws Exception {
        return this.apply(((MaybeSource)object0));
    }

    public Publisher apply(MaybeSource maybeSource0) throws Exception {
        return new MaybeToFlowable(maybeSource0);
    }

    public static Function instance() {
        return MaybeToPublisher.INSTANCE;
    }
}

