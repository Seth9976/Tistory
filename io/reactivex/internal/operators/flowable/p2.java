package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

public final class p2 implements BiFunction {
    public final int a;
    public final Consumer b;

    public p2(Consumer consumer0, int v) {
        this.a = v;
        this.b = consumer0;
        super();
    }

    @Override  // io.reactivex.functions.BiFunction
    public final Object apply(Object object0, Object object1) {
        if(this.a != 0) {
            this.b.accept(((Emitter)object1));
            return object0;
        }
        this.b.accept(((Emitter)object1));
        return object0;
    }
}

