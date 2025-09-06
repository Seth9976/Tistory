package w2;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public final class e implements Runnable {
    public final AbstractResolvableFuture a;
    public final ListenableFuture b;

    public e(AbstractResolvableFuture abstractResolvableFuture0, ListenableFuture listenableFuture0) {
        this.a = abstractResolvableFuture0;
        this.b = listenableFuture0;
    }

    @Override
    public final void run() {
        if(this.a.a != this) {
            return;
        }
        Object object0 = AbstractResolvableFuture.e(this.b);
        if(AbstractResolvableFuture.f.g(this.a, this, object0)) {
            AbstractResolvableFuture.b(this.a);
        }
    }
}

