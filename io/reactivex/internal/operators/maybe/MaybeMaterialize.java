package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
public final class MaybeMaterialize extends Single {
    public final Maybe a;

    public MaybeMaterialize(Maybe maybe0) {
        this.a = maybe0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        MaterializeSingleObserver materializeSingleObserver0 = new MaterializeSingleObserver(singleObserver0);
        this.a.subscribe(materializeSingleObserver0);
    }
}

