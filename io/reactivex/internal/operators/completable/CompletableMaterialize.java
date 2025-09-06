package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
public final class CompletableMaterialize extends Single {
    public final Completable a;

    public CompletableMaterialize(Completable completable0) {
        this.a = completable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        MaterializeSingleObserver materializeSingleObserver0 = new MaterializeSingleObserver(singleObserver0);
        this.a.subscribe(materializeSingleObserver0);
    }
}

