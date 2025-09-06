package retrofit2.adapter.rxjava2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

public final class a implements Observer {
    public final Observer a;
    public boolean b;

    public a(Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.b) {
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(!this.b) {
            this.a.onError(throwable0);
            return;
        }
        AssertionError assertionError0 = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError0.initCause(throwable0);
        RxJavaPlugins.onError(assertionError0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Observer observer0 = this.a;
        if(((Response)object0).isSuccessful()) {
            observer0.onNext(((Response)object0).body());
            return;
        }
        this.b = true;
        HttpException httpException0 = new HttpException(((Response)object0));
        try {
            observer0.onError(httpException0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{httpException0, throwable0}));
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        this.a.onSubscribe(disposable0);
    }
}

