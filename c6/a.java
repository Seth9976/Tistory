package c6;

import android.os.Process;

public final class a extends Thread {
    public final int a;

    public a(Runnable runnable0) {
        this.a = 0;
        super(runnable0);
    }

    public a(ThreadGroup threadGroup0, String s) {
        this.a = 1;
        super(threadGroup0, s);
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Process.setThreadPriority(19);
            synchronized(this) {
                try {
                    while(true) {
                        this.wait();
                    }
                }
                catch(InterruptedException unused_ex) {
                    return;
                }
            }
        }
        Process.setThreadPriority(9);
        super.run();
    }
}

