package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;

public final class ObservableSampleWithObservable extends a {
    public final ObservableSource a;
    public final boolean b;

    public ObservableSampleWithObservable(ObservableSource observableSource0, ObservableSource observableSource1, boolean z) {
        super(observableSource0);
        this.a = observableSource1;
        this.b = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        ObservableSource observableSource0 = this.a;
        if(this.b) {
            i3 i30 = new i3(serializedObserver0, observableSource0);
            this.source.subscribe(i30);
            return;
        }
        j3 j30 = new j3(serializedObserver0, observableSource0);  // 初始化器: Lio/reactivex/internal/operators/observable/k3;-><init>(Lio/reactivex/observers/SerializedObserver;Lio/reactivex/ObservableSource;)V
        this.source.subscribe(j30);
    }
}

