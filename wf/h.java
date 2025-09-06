package wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

public final class h {
    public static final AtomicIntegerFieldUpdater a;
    @Volatile
    private volatile int installations;

    static {
        h.a = AtomicIntegerFieldUpdater.newUpdater(h.class, "installations");
    }
}

