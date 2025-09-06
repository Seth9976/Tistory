package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final String a;

    public b(String s) {
        this.a = s;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(runnable0, this.a);
        thread0.setPriority(10);
        return thread0;
    }
}

