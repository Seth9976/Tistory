package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

public final class NewThreadScheduler extends Scheduler {
    public final ThreadFactory c;
    public static final RxThreadFactory d;

    static {
        NewThreadScheduler.d = new RxThreadFactory("RxNewThreadScheduler", 5);
    }

    public NewThreadScheduler() {
        this(NewThreadScheduler.d);
    }

    public NewThreadScheduler(ThreadFactory threadFactory0) {
        this.c = threadFactory0;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new NewThreadWorker(this.c);
    }
}

