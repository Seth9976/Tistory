package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.subjects.PublishSubject;

public final class ObservablePublishSelector extends a {
    public final Function a;

    public ObservablePublishSelector(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ObservableSource observableSource0;
        PublishSubject publishSubject0 = PublishSubject.create();
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.a.apply(publishSubject0), "The selector returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        j2 j20 = new j2(observer0, 0);
        observableSource0.subscribe(j20);
        i2 i20 = new i2(publishSubject0, j20, 0);
        this.source.subscribe(i20);
    }
}

