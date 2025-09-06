package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import jd.b;

public final class o2 implements BiFunction {
    public final int a;
    public final Object b;

    public o2(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // io.reactivex.functions.BiFunction
    public final Object apply(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                ((BiConsumer)this.b).accept(object0, ((Emitter)object1));
                return object0;
            }
            case 1: {
                ((BiConsumer)this.b).accept(object0, ((Emitter)object1));
                return object0;
            }
            default: {
                return ((b)this.b).invoke(object0, object1);
            }
        }
    }
}

