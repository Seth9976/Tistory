package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;

public class SchedulerWhen extends Scheduler implements Disposable {
    public final Scheduler c;
    public final FlowableProcessor d;
    public final Disposable e;
    public static final v f;
    public static final Disposable g;

    static {
        SchedulerWhen.f = new v();  // 初始化器: Ljava/lang/Object;-><init>()V
        SchedulerWhen.g = Disposables.disposed();
    }

    public SchedulerWhen(Function function0, Scheduler scheduler0) {
        this.c = scheduler0;
        FlowableProcessor flowableProcessor0 = UnicastProcessor.create().toSerialized();
        this.d = flowableProcessor0;
        try {
            this.e = ((Completable)function0.apply(flowableProcessor0)).subscribe();
        }
        catch(Throwable throwable0) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        Worker scheduler$Worker0 = this.c.createWorker();
        FlowableProcessor flowableProcessor0 = UnicastProcessor.create().toSerialized();
        Flowable flowable0 = flowableProcessor0.map(new q(scheduler$Worker0));
        Worker scheduler$Worker1 = new t(flowableProcessor0, scheduler$Worker0);
        this.d.onNext(flowable0);
        return scheduler$Worker1;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.e.isDisposed();
    }
}

