package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class r extends BackgroundPriorityRunnable {
    public final String a;
    public final ExecutorService b;
    public final TimeUnit c;

    public r(String s, ExecutorService executorService0, TimeUnit timeUnit0) {
        this.a = s;
        this.b = executorService0;
        this.c = timeUnit0;
        super();
    }

    @Override  // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
    public final void onRun() {
        ExecutorService executorService0;
        String s;
        try {
            s = this.a;
            executorService0 = this.b;
            Logger.getLogger().d("Executing shutdown hook for " + s);
            executorService0.shutdown();
            if(!executorService0.awaitTermination(2L, this.c)) {
                Logger.getLogger().d(s + " did not shut down in the allocated time. Requesting immediate shutdown.");
                executorService0.shutdownNow();
            }
        }
        catch(InterruptedException unused_ex) {
            Logger.getLogger().d("Interrupted while waiting for " + s + " to shut down. Requesting immediate shutdown.");
            executorService0.shutdownNow();
        }
    }
}

