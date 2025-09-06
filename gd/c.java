package gd;

import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.y;
import io.reactivex.internal.operators.single.SingleContains;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnEvent;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleDoOnTerminate;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;

public final class c implements SingleObserver {
    public final int a;
    public final Object b;
    public final Object c;

    public c(int v, SingleObserver singleObserver0, Object object0) {
        this.a = v;
        this.c = object0;
        this.b = singleObserver0;
        super();
    }

    public c(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        Object object0;
        switch(this.a) {
            case 0: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                try {
                    ((SingleDoOnError)this.c).b.accept(throwable0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 2: {
                try {
                    ((SingleDoOnEvent)this.c).b.accept(null, throwable0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable2});
                }
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 3: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 4: {
                try {
                    ((SingleDoOnTerminate)this.c).b.run();
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable3});
                }
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 5: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 6: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 7: {
                SingleOnErrorReturn singleOnErrorReturn0 = (SingleOnErrorReturn)this.c;
                Function function0 = singleOnErrorReturn0.b;
                SingleObserver singleObserver0 = (SingleObserver)this.b;
                if(function0 == null) {
                    object0 = singleOnErrorReturn0.c;
                }
                else {
                    try {
                        object0 = function0.apply(throwable0);
                    }
                    catch(Throwable throwable4) {
                        Exceptions.throwIfFatal(throwable4);
                        singleObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable4}));
                        return;
                    }
                }
                if(object0 == null) {
                    NullPointerException nullPointerException0 = new NullPointerException("Value supplied was null");
                    nullPointerException0.initCause(throwable0);
                    singleObserver0.onError(nullPointerException0);
                    return;
                }
                singleObserver0.onSuccess(object0);
                return;
            }
            case 8: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 9: {
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            default: {
                ((SingleObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 2: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 3: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 4: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 5: {
                DisposableHelper.replace(((n)this.c), disposable0);
                return;
            }
            case 6: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 7: {
                ((SingleObserver)this.b).onSubscribe(disposable0);
                return;
            }
            case 8: {
                DisposableHelper.replace(((y)this.c), disposable0);
                return;
            }
            case 9: {
                DisposableHelper.replace(((y)this.b), disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(((y)this.c), disposable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Object object1;
        boolean z;
        switch(this.a) {
            case 0: {
                SingleObserver singleObserver0 = (SingleObserver)this.b;
                try {
                    z = ((SingleContains)this.c).c.test(object0, ((SingleContains)this.c).b);
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    singleObserver0.onError(throwable0);
                    return;
                }
                singleObserver0.onSuccess(Boolean.valueOf(z));
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 2: {
                SingleObserver singleObserver1 = (SingleObserver)this.b;
                try {
                    ((SingleDoOnEvent)this.c).b.accept(object0, null);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    singleObserver1.onError(throwable1);
                    return;
                }
                singleObserver1.onSuccess(object0);
                return;
            }
            case 3: {
                SingleObserver singleObserver2 = (SingleObserver)this.b;
                try {
                    ((SingleDoOnSuccess)this.c).b.accept(object0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    singleObserver2.onError(throwable2);
                    return;
                }
                singleObserver2.onSuccess(object0);
                return;
            }
            case 4: {
                SingleObserver singleObserver3 = (SingleObserver)this.b;
                try {
                    ((SingleDoOnTerminate)this.c).b.run();
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    singleObserver3.onError(throwable3);
                    return;
                }
                singleObserver3.onSuccess(object0);
                return;
            }
            case 5: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 6: {
                try {
                    object1 = ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The mapper function returned a null value.");
                }
                catch(Throwable throwable4) {
                    Exceptions.throwIfFatal(throwable4);
                    this.onError(throwable4);
                    return;
                }
                ((SingleObserver)this.b).onSuccess(object1);
                return;
            }
            case 7: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 8: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 9: {
                ((MaybeObserver)this.c).onSuccess(object0);
                return;
            }
            default: {
                ((SingleObserver)this.b).onSuccess(object0);
            }
        }
    }
}

