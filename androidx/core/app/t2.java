package androidx.core.app;

import android.app.PendingIntent.OnFinished;
import java.io.Closeable;
import java.util.concurrent.CountDownLatch;

public final class t2 implements Closeable {
    public final CountDownLatch a;
    public PendingIntent.OnFinished b;
    public boolean c;

    public t2(PendingIntent.OnFinished pendingIntent$OnFinished0) {
        this.a = new CountDownLatch(1);
        this.b = pendingIntent$OnFinished0;
        this.c = false;
    }

    @Override
    public final void close() {
        if(!this.c) {
            this.b = null;
        }
        this.a.countDown();
    }
}

