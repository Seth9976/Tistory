package io.reactivex.internal.operators.mixed;

import ed.l;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableSwitchMapSingle extends Flowable {
    public final Flowable b;
    public final Function c;
    public final boolean d;

    public FlowableSwitchMapSingle(Flowable flowable0, Function function0, boolean z) {
        this.b = flowable0;
        this.c = function0;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        l l0 = new l(subscriber0, this.c, this.d);
        this.b.subscribe(l0);
    }
}

