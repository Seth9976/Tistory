package io.reactivex.internal.schedulers;

import androidx.emoji2.text.n;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;
    public static final AtomicReference a;
    public static final ConcurrentHashMap b;

    static {
        boolean z;
        SchedulerPoolFactory.a = new AtomicReference();
        SchedulerPoolFactory.b = new ConcurrentHashMap();
        int v = 1;
        try {
            String s = System.getProperty("rx2.purge-enabled");
            if(s == null) {
            label_7:
                z = true;
            }
            else {
                z = "true".equals(s);
            }
        }
        catch(Throwable unused_ex) {
            goto label_7;
        }
        SchedulerPoolFactory.PURGE_ENABLED = z;
        if(z) {
            try {
                String s1 = System.getProperty("rx2.purge-period-seconds");
                if(s1 != null) {
                    v = Integer.parseInt(s1);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        SchedulerPoolFactory.PURGE_PERIOD_SECONDS = v;
        SchedulerPoolFactory.start();
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory0) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, threadFactory0);
        if(SchedulerPoolFactory.PURGE_ENABLED && scheduledExecutorService0 instanceof ScheduledThreadPoolExecutor) {
            SchedulerPoolFactory.b.put(((ScheduledThreadPoolExecutor)scheduledExecutorService0), scheduledExecutorService0);
        }
        return scheduledExecutorService0;
    }

    public static void shutdown() {
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)SchedulerPoolFactory.a.getAndSet(null);
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
        }
        SchedulerPoolFactory.b.clear();
    }

    public static void start() {
        if(SchedulerPoolFactory.PURGE_ENABLED) {
            while(true) {
                AtomicReference atomicReference0 = SchedulerPoolFactory.a;
                if(((ScheduledExecutorService)atomicReference0.get()) != null) {
                    break;
                }
                ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                do {
                    if(atomicReference0.compareAndSet(null, scheduledExecutorService0)) {
                        scheduledExecutorService0.scheduleAtFixedRate(new n(2), ((long)SchedulerPoolFactory.PURGE_PERIOD_SECONDS), ((long)SchedulerPoolFactory.PURGE_PERIOD_SECONDS), TimeUnit.SECONDS);
                        return;
                    }
                }
                while(atomicReference0.get() == null);
                scheduledExecutorService0.shutdownNow();
            }
        }
    }
}

