package fd;

import java.util.concurrent.atomic.AtomicInteger;

public final class p extends AtomicInteger {
    public Object a;
    public Object b;
    public final AtomicInteger c;

    public p() {
        this.c = new AtomicInteger();
    }
}

