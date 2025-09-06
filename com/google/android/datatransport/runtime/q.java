package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;

public final class q implements Runnable {
    public final Runnable a;

    public q(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override
    public final void run() {
        try {
            this.a.run();
        }
        catch(Exception exception0) {
            Logging.e("Executor", "Background execution failure.", exception0);
        }
    }
}

