package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;

public final class d extends Observable {
    public final int a;
    public final Call b;

    public d(Call call0, int v) {
        this.a = v;
        super();
        this.b = call0;
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        boolean z;
        if(this.a != 0) {
            Call call0 = this.b.clone();
            e e0 = new e(call0);
            observer0.onSubscribe(e0);
            if(!e0.b) {
                try {
                    z = false;
                    Response response0 = call0.execute();
                    if(!e0.b) {
                        observer0.onNext(response0);
                    }
                }
                catch(Throwable throwable0) {
                    goto label_17;
                }
                if(!e0.b) {
                    try {
                        observer0.onComplete();
                        return;
                    }
                    catch(Throwable throwable0) {
                        z = true;
                    }
                label_17:
                    Exceptions.throwIfFatal(throwable0);
                    if(z) {
                        RxJavaPlugins.onError(throwable0);
                        return;
                    }
                    if(!e0.b) {
                        try {
                            observer0.onError(throwable0);
                            return;
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                        }
                    }
                }
            }
            return;
        }
        Call call1 = this.b.clone();
        c c0 = new c(call1, observer0);
        observer0.onSubscribe(c0);
        if(!c0.c) {
            call1.enqueue(c0);
        }
    }
}

