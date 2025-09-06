package kd;

import io.reactivex.internal.schedulers.IoScheduler;

public abstract class b {
    public static final IoScheduler a;

    static {
        b.a = new IoScheduler();
    }
}

