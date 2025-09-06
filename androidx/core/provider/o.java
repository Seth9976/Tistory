package androidx.core.provider;

import java.util.concurrent.ThreadFactory;

public final class o implements ThreadFactory {
    public String a;
    public int b;

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new n(runnable0, this.a, this.b);
    }
}

