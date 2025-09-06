package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class v extends AtomicReference implements CompletableObserver, Disposable {
    public final CompletableObserver a;
    public final Function b;
    public boolean c;

    public v(CompletableObserver completableObserver0, Function function0) {
        this.a = completableObserver0;
        this.b = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        CompletableSource completableSource0;
        CompletableObserver completableObserver0 = this.a;
        if(this.c) {
            completableObserver0.onError(throwable0);
            return;
        }
        try {
            this.c = true;
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(throwable0), "The errorMapper returned a null CompletableSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            completableObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
        completableSource0.subscribe(this);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.replace(this, disposable0);
    }
}

