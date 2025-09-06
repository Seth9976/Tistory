package a6;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        synchronized(this) {
            Thread thread0 = new Thread(runnable0, "glide-disk-lru-cache-thread");
            thread0.setPriority(1);
            return thread0;
        }
    }
}

