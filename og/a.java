package og;

import java.util.concurrent.CountDownLatch;
import okhttp3.internal.concurrent.Task;

public final class a extends Task {
    public final CountDownLatch e;

    public a() {
        super("null awaitIdle", false);
        this.e = new CountDownLatch(1);
    }

    @Override  // okhttp3.internal.concurrent.Task
    public final long runOnce() {
        this.e.countDown();
        return -1L;
    }
}

