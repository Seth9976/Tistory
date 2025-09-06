package com.bumptech.glide.load.engine;

import android.os.Process;

public final class a implements Runnable {
    public final int a;
    public final Runnable b;

    public a(int v, Runnable runnable0) {
        this.a = v;
        this.b = runnable0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Process.setThreadPriority(0);
            this.b.run();
            return;
        }
        Process.setThreadPriority(10);
        this.b.run();
    }
}

