package retrofit2.adapter.rxjava2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class c implements Disposable, Callback {
    public final Call a;
    public final Observer b;
    public volatile boolean c;
    public boolean d;

    public c(Call call0, Observer observer0) {
        this.d = false;
        this.a = call0;
        this.b = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c = true;
        this.a.cancel();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override  // retrofit2.Callback
    public final void onFailure(Call call0, Throwable throwable0) {
        if(call0.isCanceled()) {
            return;
        }
        try {
            this.b.onError(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // retrofit2.Callback
    public final void onResponse(Call call0, Response response0) {
        if(this.c) {
            return;
        }
        try {
            this.b.onNext(response0);
            if(!this.c) {
                this.d = true;
                this.b.onComplete();
            }
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            if(this.d) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            if(!this.c) {
                try {
                    this.b.onError(throwable0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                }
            }
        }
    }
}

