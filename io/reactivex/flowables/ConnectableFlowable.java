package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableAutoConnect;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import io.reactivex.internal.operators.flowable.FlowablePublishClassic;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public abstract class ConnectableFlowable extends Flowable {
    @NonNull
    public Flowable autoConnect() {
        return this.autoConnect(1);
    }

    @NonNull
    public Flowable autoConnect(int v) {
        return this.autoConnect(v, Functions.emptyConsumer());
    }

    @NonNull
    public Flowable autoConnect(int v, @NonNull Consumer consumer0) {
        if(v <= 0) {
            this.connect(consumer0);
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, v, consumer0));
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer0 = new ConnectConsumer();
        this.connect(connectConsumer0);
        return connectConsumer0.disposable;
    }

    public abstract void connect(@NonNull Consumer arg1);

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public Flowable refCount() {
        return this instanceof FlowablePublishClassic ? RxJavaPlugins.onAssembly(new FlowableRefCount(RxJavaPlugins.onAssembly(new FlowablePublishAlt(((FlowablePublishClassic)this).publishSource(), ((FlowablePublishClassic)this).publishBufferSize())))) : RxJavaPlugins.onAssembly(new FlowableRefCount(this));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable refCount(int v) {
        return this.refCount(v, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable refCount(int v, long v1, TimeUnit timeUnit0) {
        return this.refCount(v, v1, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable refCount(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.verifyPositive(v, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return this instanceof FlowablePublishClassic ? RxJavaPlugins.onAssembly(new FlowableRefCount(RxJavaPlugins.onAssembly(new FlowablePublishAlt(((FlowablePublishClassic)this).publishSource(), ((FlowablePublishClassic)this).publishBufferSize())), v, v1, timeUnit0, scheduler0)) : RxJavaPlugins.onAssembly(new FlowableRefCount(this, v, v1, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable refCount(long v, TimeUnit timeUnit0) {
        return this.refCount(1, v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable refCount(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.refCount(1, v, timeUnit0, scheduler0);
    }
}

