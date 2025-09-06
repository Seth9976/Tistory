package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.completable.CompletableCache;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d extends AtomicBoolean implements Disposable {
    public final CompletableObserver a;
    public final CompletableCache b;

    public d(CompletableCache completableCache0, CompletableObserver completableObserver0) {
        this.b = completableCache0;
        super();
        this.a = completableObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.compareAndSet(false, true)) {
            this.b.d(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }
}

