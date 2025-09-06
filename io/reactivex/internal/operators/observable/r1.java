package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

public final class r1 implements Function {
    public final int a;
    public final Object b;
    public final Object c;

    public r1(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                return ((BiFunction)this.b).apply(this.c, object0);
            }
            case 1: {
                return new ObservableMap(((ObservableSource)ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The mapper returned a null ObservableSource")), new r1(0, ((BiFunction)this.b), object0));
            }
            default: {
                return Observable.wrap(((ObservableSource)ObjectHelper.requireNonNull(((Function)this.b).apply(((Observable)object0)), "The selector returned a null ObservableSource"))).observeOn(((Scheduler)this.c));
            }
        }
    }
}

