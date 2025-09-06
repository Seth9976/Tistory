package fd;

import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback;
import org.reactivestreams.Subscriber;

public final class r implements WorkerCallback {
    public final Subscriber[] a;
    public final Subscriber[] b;
    public final ParallelRunOn c;

    public r(ParallelRunOn parallelRunOn0, Subscriber[] arr_subscriber, Subscriber[] arr_subscriber1) {
        this.c = parallelRunOn0;
        this.a = arr_subscriber;
        this.b = arr_subscriber1;
    }

    @Override  // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport$WorkerCallback
    public final void onWorker(int v, Worker scheduler$Worker0) {
        this.c.a(v, this.a, this.b, scheduler$Worker0);
    }
}

