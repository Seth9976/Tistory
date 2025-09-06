package sf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class n0 implements ThreadFactory {
    public final int a;
    public final String b;
    public final AtomicInteger c;

    public n0(int v, String s, AtomicInteger atomicInteger0) {
        this.a = v;
        this.b = s;
        this.c = atomicInteger0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(runnable0, (this.a == 1 ? this.b : this.b + '-' + this.c.incrementAndGet()));
        thread0.setDaemon(true);
        return thread0;
    }
}

