package androidx.core.provider;

import android.os.Process;

public final class n extends Thread {
    public final int a;

    public n(Runnable runnable0, String s, int v) {
        super(runnable0, s);
        this.a = v;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}

