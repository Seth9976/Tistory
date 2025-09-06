package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public final class ObservableRetryWhen extends a {
    public final Function a;

    public ObservableRetryWhen(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ObservableSource observableSource0;
        Subject subject0 = PublishSubject.create().toSerialized();
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.a.apply(subject0), "The handler returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        p2 p20 = new p2(observer0, subject0, this.source, 1);
        observer0.onSubscribe(p20);
        observableSource0.subscribe(((o2)p20.i));
        p20.a();
    }
}

