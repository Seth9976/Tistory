package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.annotations.NonNull;

public interface SchedulerMultiWorkerSupport {
    public interface WorkerCallback {
        void onWorker(int arg1, @NonNull Worker arg2);
    }

    void createWorkers(int arg1, @NonNull WorkerCallback arg2);
}

