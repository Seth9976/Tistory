package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import r0.a;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public RxThreadFactory(String s) {
        this(s, 5, false);
    }

    public RxThreadFactory(String s, int v) {
        this(s, v, false);
    }

    public RxThreadFactory(String s, int v, boolean z) {
        this.a = s;
        this.b = v;
        this.c = z;
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        String s = this.a + '-' + this.incrementAndGet();
        Thread thread0 = this.c ? new o(runnable0, s) : new Thread(runnable0, s);  // 初始化器: Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
        thread0.setPriority(this.b);
        thread0.setDaemon(true);
        return thread0;
    }

    @Override
    public String toString() {
        return a.o(new StringBuilder("RxThreadFactory["), this.a, "]");
    }
}

