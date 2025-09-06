package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

public final class f implements Runnable {
    public final AbstractFuture a;
    public final ListenableFuture b;

    public f(AbstractFuture abstractFuture0, ListenableFuture listenableFuture0) {
        this.a = abstractFuture0;
        this.b = listenableFuture0;
    }

    @Override
    public final void run() {
        if(this.a.a != this) {
            return;
        }
        Object object0 = AbstractFuture.e(this.b);
        if(AbstractFuture.f.e(this.a, this, object0)) {
            AbstractFuture.b(this.a);
        }
    }
}

