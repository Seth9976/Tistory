package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.completable.CompletableDoOnEvent;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import java.util.concurrent.Callable;

public final class b implements CompletableObserver {
    public final int a;
    public final Object b;
    public final Object c;

    public b(CompletableToSingle completableToSingle0, SingleObserver singleObserver0) {
        this.a = 3;
        super();
        this.b = completableToSingle0;
        this.c = singleObserver0;
    }

    public b(Object object0, CompletableObserver completableObserver0, int v) {
        this.a = v;
        this.c = object0;
        this.b = completableObserver0;
        super();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        Object object0;
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onComplete();
                return;
            }
            case 1: {
                CompletableObserver completableObserver0 = (CompletableObserver)this.b;
                try {
                    ((CompletableDoOnEvent)this.c).b.accept(null);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    completableObserver0.onError(throwable1);
                    return;
                }
                completableObserver0.onComplete();
                return;
            }
            case 2: {
                ((CompletableObserver)this.b).onComplete();
                return;
            }
            default: {
                CompletableToSingle completableToSingle0 = (CompletableToSingle)this.b;
                Callable callable0 = completableToSingle0.b;
                SingleObserver singleObserver0 = (SingleObserver)this.c;
                if(callable0 == null) {
                    object0 = completableToSingle0.c;
                }
                else {
                    try {
                        object0 = callable0.call();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        singleObserver0.onError(throwable0);
                        return;
                    }
                }
                if(object0 == null) {
                    singleObserver0.onError(new NullPointerException("The value supplied is null"));
                    return;
                }
                singleObserver0.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                try {
                    ((CompletableDoOnEvent)this.c).b.accept(throwable0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                ((CompletableObserver)this.b).onError(throwable0);
                return;
            }
            case 2: {
                CompletableObserver completableObserver0 = (CompletableObserver)this.b;
                try {
                    if(((CompletableOnErrorComplete)this.c).b.test(throwable0)) {
                        goto label_19;
                    }
                    goto label_21;
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    completableObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable2}));
                    return;
                }
            label_19:
                completableObserver0.onComplete();
                return;
            label_21:
                completableObserver0.onError(throwable0);
                return;
            }
            default: {
                ((SingleObserver)this.c).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.replace(((c)this.c), disposable0);
                return;
            }
            case 1: {
                ((CompletableObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 2: {
                ((CompletableObserver)this.b).onSubscribe(disposable0);
                return;
            }
            default: {
                ((SingleObserver)this.c).onSubscribe(disposable0);
            }
        }
    }
}

