package l4;

import androidx.loader.content.AsyncTaskLoader;
import java.util.concurrent.CountDownLatch;

public final class a extends g implements Runnable {
    public final CountDownLatch i;
    public boolean j;
    public final AsyncTaskLoader k;

    public a(AsyncTaskLoader asyncTaskLoader0) {
        this.k = asyncTaskLoader0;
        super();
        this.i = new CountDownLatch(1);
    }

    @Override
    public final void run() {
        this.j = false;
        this.k.a();
    }
}

