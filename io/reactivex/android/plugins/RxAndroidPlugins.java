package io.reactivex.android.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class RxAndroidPlugins {
    public static volatile Function a;
    public static volatile Function b;

    public static Function getInitMainThreadSchedulerHandler() {
        return RxAndroidPlugins.a;
    }

    public static Function getOnMainThreadSchedulerHandler() {
        return RxAndroidPlugins.b;
    }

    public static Scheduler initMainThreadScheduler(Callable callable0) {
        Object object0;
        if(callable0 == null) {
            throw new NullPointerException("scheduler == null");
        }
        Function function0 = RxAndroidPlugins.a;
        if(function0 == null) {
            try {
                Scheduler scheduler0 = (Scheduler)callable0.call();
                if(scheduler0 == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
                return scheduler0;
            }
            catch(Throwable throwable0) {
                throw Exceptions.propagate(throwable0);
            }
        }
        try {
            object0 = function0.apply(callable0);
        }
        catch(Throwable throwable1) {
            throw Exceptions.propagate(throwable1);
        }
        if(((Scheduler)object0) == null) {
            throw new NullPointerException("Scheduler Callable returned null");
        }
        return (Scheduler)object0;
    }

    public static Scheduler onMainThreadScheduler(Scheduler scheduler0) {
        if(scheduler0 != null) {
            Function function0 = RxAndroidPlugins.b;
            if(function0 == null) {
                return scheduler0;
            }
            try {
                return (Scheduler)function0.apply(scheduler0);
            }
            catch(Throwable throwable0) {
                throw Exceptions.propagate(throwable0);
            }
        }
        throw new NullPointerException("scheduler == null");
    }

    public static void reset() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(null);
        RxAndroidPlugins.setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(Function function0) {
        RxAndroidPlugins.a = function0;
    }

    public static void setMainThreadSchedulerHandler(Function function0) {
        RxAndroidPlugins.b = function0;
    }
}

