package com.google.firebase.crashlytics.internal.common;

public final class p extends BackgroundPriorityRunnable {
    public final Runnable a;

    public p(Runnable runnable0) {
        this.a = runnable0;
        super();
    }

    @Override  // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
    public final void onRun() {
        this.a.run();
    }
}

