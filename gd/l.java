package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class l implements SingleObserver {
    public final SingleObserver a;
    public final Consumer b;
    public boolean c;

    public l(SingleObserver singleObserver0, Consumer consumer0) {
        this.a = singleObserver0;
        this.b = consumer0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        SingleObserver singleObserver0;
        try {
            singleObserver0 = this.a;
            this.b.accept(disposable0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.c = true;
            disposable0.dispose();
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        singleObserver0.onSubscribe(disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        if(this.c) {
            return;
        }
        this.a.onSuccess(object0);
    }
}

