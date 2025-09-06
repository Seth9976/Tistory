package gd;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.single.SingleToObservable;

public enum x implements Function {
    INSTANCE;

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        return new SingleToObservable(((SingleSource)object0));
    }
}

