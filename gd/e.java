package gd;

import androidx.core.app.o;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.single.SingleDelay;

public final class e implements SingleObserver {
    public final SequentialDisposable a;
    public final SingleObserver b;
    public final SingleDelay c;

    public e(SingleDelay singleDelay0, SequentialDisposable sequentialDisposable0, SingleObserver singleObserver0) {
        this.c = singleDelay0;
        this.a = sequentialDisposable0;
        this.b = singleObserver0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        o o0 = new o(this, throwable0, false, 20);
        Disposable disposable0 = this.c.d.scheduleDirect(o0, (this.c.e ? this.c.b : 0L), this.c.c);
        this.a.replace(disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        this.a.replace(disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        o o0 = new o(21, this, object0);
        Disposable disposable0 = this.c.d.scheduleDirect(o0, this.c.b, this.c.c);
        this.a.replace(disposable0);
    }
}

