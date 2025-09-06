package io.reactivex.internal.operators.mixed;

import ed.j;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableSwitchMapMaybe extends Flowable {
    public final Flowable b;
    public final Function c;
    public final boolean d;

    public FlowableSwitchMapMaybe(Flowable flowable0, Function function0, boolean z) {
        this.b = flowable0;
        this.c = function0;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        j j0 = new j(subscriber0, this.c, this.d);
        this.b.subscribe(j0);
    }
}

