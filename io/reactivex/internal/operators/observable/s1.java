package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

public final class s1 implements Consumer {
    public final int a;
    public final Observer b;

    public s1(Observer observer0, int v) {
        this.a = v;
        this.b = observer0;
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

