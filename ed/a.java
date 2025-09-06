package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends AtomicReference implements CompletableObserver, Observer, Disposable {
    public final Observer a;
    public ObservableSource b;

    public a(ObservableSource observableSource0, Observer observer0) {
        this.b = observableSource0;
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onComplete() {
        ObservableSource observableSource0 = this.b;
        if(observableSource0 == null) {
            this.a.onComplete();
            return;
        }
        this.b = null;
        observableSource0.subscribe(this);
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.replace(this, disposable0);
    }
}

