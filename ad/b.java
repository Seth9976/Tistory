package ad;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends AtomicReference implements Disposable {
    public final boolean a;

    public b(Future future0, boolean z) {
        super(future0);
        this.a = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Future future0 = (Future)this.getAndSet(null);
        if(future0 != null) {
            future0.cancel(this.a);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future future0 = (Future)this.get();
        return future0 == null || future0.isDone();
    }
}

