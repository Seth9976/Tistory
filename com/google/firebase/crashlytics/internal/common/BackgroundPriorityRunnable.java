package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

public abstract class BackgroundPriorityRunnable implements Runnable {
    public abstract void onRun();

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.onRun();
    }
}

