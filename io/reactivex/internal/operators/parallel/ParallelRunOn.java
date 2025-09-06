package io.reactivex.internal.operators.parallel;

import fd.r;
import fd.s;
import fd.t;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelRunOn extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Scheduler b;
    public final int c;

    public ParallelRunOn(ParallelFlowable parallelFlowable0, Scheduler scheduler0, int v) {
        this.a = parallelFlowable0;
        this.b = scheduler0;
        this.c = v;
    }

    // 检测为 Lambda 实现
    public final void a(int v, Subscriber[] arr_subscriber, Subscriber[] arr_subscriber1, Worker scheduler$Worker0) [...]

    @Override  // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.a.parallelism();
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber[] arr_subscriber) {
        if(!this.validate(arr_subscriber)) {
            return;
        }
        Subscriber[] arr_subscriber1 = new Subscriber[arr_subscriber.length];
        Scheduler scheduler0 = this.b;
        if(scheduler0 instanceof SchedulerMultiWorkerSupport) {
            r r0 = (int v, Worker scheduler$Worker0) -> {
                Subscriber subscriber0 = arr_subscriber[v];
                int v1 = this.c;
                SpscArrayQueue spscArrayQueue0 = new SpscArrayQueue(v1);
                if(subscriber0 instanceof ConditionalSubscriber) {
                    arr_subscriber1[v] = new s(((ConditionalSubscriber)subscriber0), v1, spscArrayQueue0, scheduler$Worker0);
                    return;
                }
                arr_subscriber1[v] = new t(subscriber0, v1, spscArrayQueue0, scheduler$Worker0);
            };
            ((SchedulerMultiWorkerSupport)scheduler0).createWorkers(arr_subscriber.length, r0);
        }
        else {
            for(int v = 0; v < arr_subscriber.length; ++v) {
                this.a(v, arr_subscriber, arr_subscriber1, scheduler0.createWorker());
            }
        }
        this.a.subscribe(arr_subscriber1);
    }
}

