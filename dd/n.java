package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.k3;
import io.reactivex.internal.operators.observable.r0;
import io.reactivex.internal.operators.observable.x4;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.Result;

public final class n implements Observer {
    public final int a;
    public final Object b;

    public n(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a() {
    }

    private final void b(Object object0) {
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onComplete();
                return;
            }
            case 1: {
                ((r0)this.b).b.onComplete();
                return;
            }
            case 2: {
                ((k3)this.b).d.dispose();
                ((k3)this.b).a();
                return;
            }
            case 3: {
                break;
            }
            default: {
                ((Observer)this.b).onComplete();
                break;
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                ((r0)this.b).b.onError(throwable0);
                return;
            }
            case 2: {
                ((k3)this.b).d.dispose();
                ((k3)this.b).a.onError(throwable0);
                return;
            }
            case 3: {
                DisposableHelper.dispose(((x4)this.b).c);
                ((x4)this.b).a.onError(throwable0);
                return;
            }
            default: {
                Observer observer0 = (Observer)this.b;
                try {
                    observer0.onNext(Result.error(throwable0));
                }
                catch(Throwable throwable1) {
                    try {
                        observer0.onError(throwable1);
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable1, throwable2}));
                    }
                    return;
                }
                observer0.onComplete();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                break;
            }
            case 1: {
                ((r0)this.b).b.onNext(object0);
                break;
            }
            case 2: {
                ((k3)this.b).b();
                return;
            }
            case 3: {
                ((x4)this.b).lazySet(object0);
                return;
            }
            default: {
                Result result0 = Result.response(((Response)object0));
                ((Observer)this.b).onNext(result0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 1: {
                ((r0)this.b).c.update(disposable0);
                return;
            }
            case 2: {
                DisposableHelper.setOnce(((k3)this.b).c, disposable0);
                return;
            }
            case 3: {
                DisposableHelper.setOnce(((x4)this.b).d, disposable0);
                return;
            }
            default: {
                ((Observer)this.b).onSubscribe(disposable0);
            }
        }
    }
}

