package io.reactivex.internal.operators.single;

import gd.d0;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleToObservable extends Observable {
    public final SingleSource a;

    public SingleToObservable(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    public static SingleObserver create(Observer observer0) {
        return new d0(observer0);  // 初始化器: Lio/reactivex/internal/observers/DeferredScalarDisposable;-><init>(Lio/reactivex/Observer;)V
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SingleObserver singleObserver0 = SingleToObservable.create(observer0);
        this.a.subscribe(singleObserver0);
    }
}

