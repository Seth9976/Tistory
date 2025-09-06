package gd;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class n extends AtomicReference implements SingleObserver, Disposable {
    public final int a;
    public final SingleObserver b;
    public final Function c;

    public n(int v, SingleObserver singleObserver0, Function function0) {
        this.a = v;
        super();
        this.b = singleObserver0;
        this.c = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(this);
            return;
        }
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        SingleSource singleSource0;
        SingleObserver singleObserver0;
        if(this.a != 0) {
            try {
                singleObserver0 = this.b;
                singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.c.apply(throwable0), "The nextFunction returned a null SingleSource.");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                singleObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
            singleSource0.subscribe(new ResumeSingleObserver(this, singleObserver0));
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.setOnce(this, disposable0)) {
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.b.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        SingleSource singleSource0;
        SingleObserver singleObserver0;
        if(this.a != 0) {
            this.b.onSuccess(object0);
            return;
        }
        try {
            singleObserver0 = this.b;
            singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.c.apply(object0), "The single returned by the mapper is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            singleObserver0.onError(throwable0);
            return;
        }
        if(!this.isDisposed()) {
            singleSource0.subscribe(new c(5, singleObserver0, this));
        }
    }
}

