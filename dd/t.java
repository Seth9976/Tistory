package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class t extends AtomicReference implements CompletableObserver, Disposable, Runnable {
    public final int a;
    public final CompletableObserver b;
    public final Object c;
    public Object d;

    public t(CompletableObserver completableObserver0, CompletableSource completableSource0) {
        this.a = 1;
        super();
        this.b = completableObserver0;
        this.d = completableSource0;
        this.c = new SequentialDisposable();
    }

    public t(CompletableObserver completableObserver0, Scheduler scheduler0) {
        this.a = 0;
        super();
        this.b = completableObserver0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(this);
            ((SequentialDisposable)this.c).dispose();
            return;
        }
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        DisposableHelper.replace(this, ((Scheduler)this.c).scheduleDirect(this));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        this.d = throwable0;
        DisposableHelper.replace(this, ((Scheduler)this.c).scheduleDirect(this));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(this, disposable0);
            return;
        }
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.b.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ((CompletableSource)this.d).subscribe(this);
            return;
        }
        Throwable throwable0 = (Throwable)this.d;
        CompletableObserver completableObserver0 = this.b;
        if(throwable0 != null) {
            this.d = null;
            completableObserver0.onError(throwable0);
            return;
        }
        completableObserver0.onComplete();
    }
}

