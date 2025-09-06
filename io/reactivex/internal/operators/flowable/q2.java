package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscriber;

public final class q2 implements Consumer {
    public final int a;
    public final Subscriber b;

    public q2(Subscriber subscriber0, int v) {
        this.a = v;
        this.b = subscriber0;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        if(this.a != 0) {
            this.b.onNext(object0);
            return;
        }
        this.b.onError(((Throwable)object0));
    }
}

