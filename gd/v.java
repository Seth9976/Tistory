package gd;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.single.SingleToFlowable;

public enum v implements Function {
    INSTANCE;

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        return new SingleToFlowable(((SingleSource)object0));
    }
}

