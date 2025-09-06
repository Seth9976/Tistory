package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;

public final class c implements SchedulerMultiWorkerSupport {
    public final int a;
    public final d[] b;
    public long c;

    public c(ThreadFactory threadFactory0, int v) {
        this.a = v;
        this.b = new d[v];
        for(int v1 = 0; v1 < v; ++v1) {
            this.b[v1] = new d(threadFactory0);  // 初始化器: Lio/reactivex/internal/schedulers/NewThreadWorker;-><init>(Ljava/util/concurrent/ThreadFactory;)V
        }
    }

    public final d a() {
        int v = this.a;
        if(v == 0) {
            return ComputationScheduler.h;
        }
        long v1 = this.c;
        this.c = v1 + 1L;
        return this.b[((int)(v1 % ((long)v)))];
    }

    public final void b() {
        d[] arr_d = this.b;
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d[v].dispose();
        }
    }

    @Override  // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public final void createWorkers(int v, WorkerCallback schedulerMultiWorkerSupport$WorkerCallback0) {
        int v2 = this.a;
        if(v2 == 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                schedulerMultiWorkerSupport$WorkerCallback0.onWorker(v1, ComputationScheduler.h);
            }
            return;
        }
        int v3 = ((int)this.c) % v2;
        for(int v4 = 0; v4 < v; ++v4) {
            schedulerMultiWorkerSupport$WorkerCallback0.onWorker(v4, new b(this.b[v3]));
            ++v3;
            v3 = v3 == v2 ? 0 : v3 + 1;
        }
        this.c = (long)v3;
    }
}

