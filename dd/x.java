package dd;

import androidx.appcompat.view.menu.e;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public final class x implements CompletableObserver {
    public final e a;

    public x(e e0) {
        this.a = e0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        ((CompositeDisposable)this.a.c).dispose();
        ((CompletableObserver)this.a.d).onComplete();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        ((CompositeDisposable)this.a.c).dispose();
        ((CompletableObserver)this.a.d).onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        ((CompositeDisposable)this.a.c).add(disposable0);
    }
}

