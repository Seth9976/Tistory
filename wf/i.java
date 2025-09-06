package wf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.Volatile;

public final class i {
    public static final AtomicLongFieldUpdater a;
    @Volatile
    private volatile long sequenceNumber;

    static {
        i.a = AtomicLongFieldUpdater.newUpdater(i.class, "sequenceNumber");
    }
}

