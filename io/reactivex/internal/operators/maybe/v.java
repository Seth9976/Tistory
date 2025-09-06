package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

public final class v extends BasicQueueDisposable implements MaybeObserver {
    public final Observer a;
    public final Function b;
    public Disposable c;
    public volatile Iterator d;
    public volatile boolean e;
    public boolean f;

    public v(Observer observer0, Function function0) {
        this.a = observer0;
        this.b = function0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.d = null;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e = true;
        this.c.dispose();
        this.c = DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.d == null;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.c = DisposableHelper.DISPOSED;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        Object object1;
        Iterator iterator0;
        Observer observer0;
        try {
            observer0 = this.a;
            iterator0 = ((Iterable)this.b.apply(object0)).iterator();
            if(!iterator0.hasNext()) {
                goto label_8;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            observer0.onError(throwable0);
            return;
        }
    label_8:
        observer0.onComplete();
        return;
    label_10:
        this.d = iterator0;
        if(this.f) {
            observer0.onNext(null);
            observer0.onComplete();
            return;
        }
        while(true) {
            if(this.e) {
                return;
            }
            try {
                object1 = iterator0.next();
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                observer0.onError(throwable1);
                return;
            }
            observer0.onNext(object1);
            if(this.e) {
                return;
            }
            try {
                if(iterator0.hasNext()) {
                    continue;
                }
                goto label_32;
            }
            catch(Throwable throwable2) {
            }
            break;
        }
        Exceptions.throwIfFatal(throwable2);
        observer0.onError(throwable2);
        return;
    label_32:
        observer0.onComplete();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Iterator iterator0 = this.d;
        if(iterator0 != null) {
            Object object0 = iterator0.next();
            Object object1 = ObjectHelper.requireNonNull(object0, "The iterator returned a null value");
            if(!iterator0.hasNext()) {
                this.d = null;
            }
            return object1;
        }
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.f = true;
            return 2;
        }
        return 0;
    }
}

