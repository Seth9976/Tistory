package com.google.firebase.crashlytics.internal.common;

public final class e implements Runnable {
    public final CrashlyticsBackgroundWorker a;

    public e(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0) {
        this.a = crashlyticsBackgroundWorker0;
    }

    @Override
    public final void run() {
        this.a.d.set(Boolean.TRUE);
    }
}

