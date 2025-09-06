package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class q implements ThreadFactory {
    public final ThreadFactory a;

    public q() {
        this.a = Executors.defaultThreadFactory();
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = this.a.newThread(runnable0);
        thread0.setName("ScionFrontendApi");
        return thread0;
    }
}

