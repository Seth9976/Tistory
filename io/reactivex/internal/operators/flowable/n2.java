package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
import io.reactivex.internal.operators.observable.ObservableTake;
import java.util.List;
import org.reactivestreams.Publisher;

public final class n2 implements Function {
    public final int a;
    public final Function b;

    public n2(Function function0, int v) {
        this.a = v;
        this.b = function0;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                return new FlowableFromIterable(((Iterable)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Iterable")));
            }
            case 1: {
                return new FlowableTakePublisher(((Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The itemDelay returned a null Publisher")), 1L).map(Functions.justFunction(object0)).defaultIfEmpty(object0);
            }
            case 2: {
                return Flowable.zipIterable(((List)object0), this.b, false, 0x80);
            }
            case 3: {
                return new ObservableFromIterable(((Iterable)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Iterable")));
            }
            case 4: {
                return new ObservableTake(((ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The itemDelay returned a null ObservableSource")), 1L).map(Functions.justFunction(object0)).defaultIfEmpty(object0);
            }
            default: {
                return Observable.zipIterable(((List)object0), this.b, false, 0x80);
            }
        }
    }
}

