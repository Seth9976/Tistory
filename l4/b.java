package l4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {
    public final int a;
    public final AtomicInteger b;

    public b(int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = new AtomicInteger(1);
            return;
        }
        super();
        this.b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        if(this.a != 0) {
            Thread thread0 = new Thread(runnable0);
            thread0.setName("arch_disk_io_" + this.b.getAndIncrement());
            return thread0;
        }
        return new Thread(runnable0, "ModernAsyncTask #" + this.b.getAndIncrement());
    }
}

