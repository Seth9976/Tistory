package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public final class x implements Runnable {
    public final Runnable a;
    public final z b;
    public final long c;

    public x(Runnable runnable0, z z0, long v) {
        this.a = runnable0;
        this.b = z0;
        this.c = v;
    }

    @Override
    public final void run() {
        if(!this.b.d) {
            long v = this.b.now(TimeUnit.MILLISECONDS);
            long v1 = this.c;
            if(v1 > v) {
                try {
                    Thread.sleep(v1 - v);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onError(interruptedException0);
                    return;
                }
            }
            if(!this.b.d) {
                this.a.run();
            }
        }
    }
}

