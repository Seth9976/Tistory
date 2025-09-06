package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
public final class SingleMaterialize extends Single {
    public final Single a;

    public SingleMaterialize(Single single0) {
        this.a = single0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        MaterializeSingleObserver materializeSingleObserver0 = new MaterializeSingleObserver(singleObserver0);
        this.a.subscribe(materializeSingleObserver0);
    }
}

