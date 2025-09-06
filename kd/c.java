package kd;

import io.reactivex.internal.schedulers.NewThreadScheduler;

public abstract class c {
    public static final NewThreadScheduler a;

    static {
        c.a = new NewThreadScheduler();
    }
}

