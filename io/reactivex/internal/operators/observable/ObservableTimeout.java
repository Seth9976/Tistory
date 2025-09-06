package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableTimeout extends a {
    interface TimeoutSelectorSupport extends TimeoutSupport {
        void onTimeoutError(long arg1, Throwable arg2);
    }

    public final ObservableSource a;
    public final Function b;
    public final ObservableSource c;

    public ObservableTimeout(Observable observable0, ObservableSource observableSource0, Function function0, ObservableSource observableSource1) {
        super(observable0);
        this.a = observableSource0;
        this.b = function0;
        this.c = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ObservableSource observableSource0 = this.a;
        Function function0 = this.b;
        ObservableSource observableSource1 = this.c;
        if(observableSource1 == null) {
            f4 f40 = new f4(observer0, function0);
            observer0.onSubscribe(f40);
            if(observableSource0 != null) {
                d4 d40 = new d4(0L, f40);
                if(f40.c.replace(d40)) {
                    observableSource0.subscribe(d40);
                }
            }
            this.source.subscribe(f40);
            return;
        }
        e4 e40 = new e4(observableSource1, observer0, function0);
        observer0.onSubscribe(e40);
        if(observableSource0 != null) {
            d4 d41 = new d4(0L, e40);
            if(e40.c.replace(d41)) {
                observableSource0.subscribe(d41);
            }
        }
        this.source.subscribe(e40);
    }
}

