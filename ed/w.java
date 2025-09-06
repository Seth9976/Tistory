package ed;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class w extends AtomicReference implements Observer, SingleObserver, Disposable {
    public final Observer a;
    public final Function b;

    public w(Observer observer0, Function function0) {
        this.a = observer0;
        this.b = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer, io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.replace(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        ObservableSource observableSource0;
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.a.onError(throwable0);
            return;
        }
        observableSource0.subscribe(this);
    }
}

