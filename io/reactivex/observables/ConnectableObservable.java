package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservablePublishClassic;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public abstract class ConnectableObservable extends Observable {
    @NonNull
    public Observable autoConnect() {
        return this.autoConnect(1);
    }

    @NonNull
    public Observable autoConnect(int v) {
        return this.autoConnect(v, Functions.emptyConsumer());
    }

    @NonNull
    public Observable autoConnect(int v, @NonNull Consumer consumer0) {
        if(v <= 0) {
            this.connect(consumer0);
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, v, consumer0));
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer0 = new ConnectConsumer();
        this.connect(connectConsumer0);
        return connectConsumer0.disposable;
    }

    public abstract void connect(@NonNull Consumer arg1);

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public Observable refCount() {
        return this instanceof ObservablePublishClassic ? RxJavaPlugins.onAssembly(new ObservableRefCount(RxJavaPlugins.onAssembly(new ObservablePublishAlt(((ObservablePublishClassic)this).publishSource())))) : RxJavaPlugins.onAssembly(new ObservableRefCount(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable refCount(int v) {
        return this.refCount(v, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable refCount(int v, long v1, TimeUnit timeUnit0) {
        return this.refCount(v, v1, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable refCount(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.verifyPositive(v, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return this instanceof ObservablePublishClassic ? RxJavaPlugins.onAssembly(new ObservableRefCount(RxJavaPlugins.onAssembly(new ObservablePublishAlt(((ObservablePublishClassic)this).publishSource())), v, v1, timeUnit0, scheduler0)) : RxJavaPlugins.onAssembly(new ObservableRefCount(this, v, v1, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable refCount(long v, TimeUnit timeUnit0) {
        return this.refCount(1, v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable refCount(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.refCount(1, v, timeUnit0, scheduler0);
    }
}

