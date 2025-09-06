package io.reactivex.plugins;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;

public final class RxJavaPlugins {
    public static volatile Consumer a;
    public static volatile Function b;
    public static volatile Function c;
    public static volatile Function d;
    public static volatile Function e;
    public static volatile Function f;
    public static volatile Function g;
    public static volatile Function h;
    public static volatile Function i;
    public static volatile Function j;
    public static volatile Function k;
    public static volatile Function l;
    public static volatile Function m;
    public static volatile Function n;
    public static volatile Function o;
    public static volatile Function p;
    public static volatile Function q;
    public static volatile Function r;
    public static volatile BiFunction s;
    public static volatile BiFunction t;
    public static volatile BiFunction u;
    public static volatile BiFunction v;
    public static volatile BiFunction w;
    public static volatile BooleanSupplier x;
    public static volatile boolean y;
    public static volatile boolean z;

    public static Object a(Object object0, Function function0) {
        try {
            return function0.apply(object0);
        }
        catch(Throwable throwable0) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    public static Scheduler b(Callable callable0) {
        try {
            return (Scheduler)ObjectHelper.requireNonNull(callable0.call(), "Scheduler Callable result can\'t be null");
        }
        catch(Throwable throwable0) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @NonNull
    public static Scheduler createComputationScheduler(@NonNull ThreadFactory threadFactory0) {
        return new ComputationScheduler(((ThreadFactory)ObjectHelper.requireNonNull(threadFactory0, "threadFactory is null")));
    }

    @NonNull
    public static Scheduler createIoScheduler(@NonNull ThreadFactory threadFactory0) {
        return new IoScheduler(((ThreadFactory)ObjectHelper.requireNonNull(threadFactory0, "threadFactory is null")));
    }

    @NonNull
    public static Scheduler createNewThreadScheduler(@NonNull ThreadFactory threadFactory0) {
        return new NewThreadScheduler(((ThreadFactory)ObjectHelper.requireNonNull(threadFactory0, "threadFactory is null")));
    }

    @NonNull
    public static Scheduler createSingleScheduler(@NonNull ThreadFactory threadFactory0) {
        return new SingleScheduler(((ThreadFactory)ObjectHelper.requireNonNull(threadFactory0, "threadFactory is null")));
    }

    @Nullable
    public static Function getComputationSchedulerHandler() {
        return RxJavaPlugins.g;
    }

    @Nullable
    public static Consumer getErrorHandler() {
        return RxJavaPlugins.a;
    }

    @Nullable
    public static Function getInitComputationSchedulerHandler() {
        return RxJavaPlugins.c;
    }

    @Nullable
    public static Function getInitIoSchedulerHandler() {
        return RxJavaPlugins.e;
    }

    @Nullable
    public static Function getInitNewThreadSchedulerHandler() {
        return RxJavaPlugins.f;
    }

    @Nullable
    public static Function getInitSingleSchedulerHandler() {
        return RxJavaPlugins.d;
    }

    @Nullable
    public static Function getIoSchedulerHandler() {
        return RxJavaPlugins.i;
    }

    @Nullable
    public static Function getNewThreadSchedulerHandler() {
        return RxJavaPlugins.j;
    }

    @Nullable
    public static BooleanSupplier getOnBeforeBlocking() {
        return RxJavaPlugins.x;
    }

    @Nullable
    public static Function getOnCompletableAssembly() {
        return RxJavaPlugins.q;
    }

    @Nullable
    public static BiFunction getOnCompletableSubscribe() {
        return RxJavaPlugins.w;
    }

    @Nullable
    public static Function getOnConnectableFlowableAssembly() {
        return RxJavaPlugins.l;
    }

    @Nullable
    public static Function getOnConnectableObservableAssembly() {
        return RxJavaPlugins.n;
    }

    @Nullable
    public static Function getOnFlowableAssembly() {
        return RxJavaPlugins.k;
    }

    @Nullable
    public static BiFunction getOnFlowableSubscribe() {
        return RxJavaPlugins.s;
    }

    @Nullable
    public static Function getOnMaybeAssembly() {
        return RxJavaPlugins.o;
    }

    @Nullable
    public static BiFunction getOnMaybeSubscribe() {
        return RxJavaPlugins.t;
    }

    @Nullable
    public static Function getOnObservableAssembly() {
        return RxJavaPlugins.m;
    }

    @Nullable
    public static BiFunction getOnObservableSubscribe() {
        return RxJavaPlugins.u;
    }

    @Nullable
    public static Function getOnParallelAssembly() {
        return RxJavaPlugins.r;
    }

    @Nullable
    public static Function getOnSingleAssembly() {
        return RxJavaPlugins.p;
    }

    @Nullable
    public static BiFunction getOnSingleSubscribe() {
        return RxJavaPlugins.v;
    }

    @Nullable
    public static Function getScheduleHandler() {
        return RxJavaPlugins.b;
    }

    @Nullable
    public static Function getSingleSchedulerHandler() {
        return RxJavaPlugins.h;
    }

    @NonNull
    public static Scheduler initComputationScheduler(@NonNull Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "Scheduler Callable can\'t be null");
        return RxJavaPlugins.c == null ? RxJavaPlugins.b(callable0) : ((Scheduler)ObjectHelper.requireNonNull(RxJavaPlugins.a(callable0, RxJavaPlugins.c), "Scheduler Callable result can\'t be null"));
    }

    @NonNull
    public static Scheduler initIoScheduler(@NonNull Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "Scheduler Callable can\'t be null");
        return RxJavaPlugins.e == null ? RxJavaPlugins.b(callable0) : ((Scheduler)ObjectHelper.requireNonNull(RxJavaPlugins.a(callable0, RxJavaPlugins.e), "Scheduler Callable result can\'t be null"));
    }

    @NonNull
    public static Scheduler initNewThreadScheduler(@NonNull Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "Scheduler Callable can\'t be null");
        return RxJavaPlugins.f == null ? RxJavaPlugins.b(callable0) : ((Scheduler)ObjectHelper.requireNonNull(RxJavaPlugins.a(callable0, RxJavaPlugins.f), "Scheduler Callable result can\'t be null"));
    }

    @NonNull
    public static Scheduler initSingleScheduler(@NonNull Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "Scheduler Callable can\'t be null");
        return RxJavaPlugins.d == null ? RxJavaPlugins.b(callable0) : ((Scheduler)ObjectHelper.requireNonNull(RxJavaPlugins.a(callable0, RxJavaPlugins.d), "Scheduler Callable result can\'t be null"));
    }

    public static boolean isFailOnNonBlockingScheduler() [...] // 潜在的解密器

    public static boolean isLockdown() {
        return RxJavaPlugins.y;
    }

    public static void lockdown() {
        RxJavaPlugins.y = true;
    }

    @NonNull
    public static Completable onAssembly(@NonNull Completable completable0) {
        return RxJavaPlugins.q == null ? completable0 : ((Completable)RxJavaPlugins.a(completable0, RxJavaPlugins.q));
    }

    @NonNull
    public static Flowable onAssembly(@NonNull Flowable flowable0) {
        return RxJavaPlugins.k == null ? flowable0 : ((Flowable)RxJavaPlugins.a(flowable0, RxJavaPlugins.k));
    }

    @NonNull
    public static Maybe onAssembly(@NonNull Maybe maybe0) {
        return RxJavaPlugins.o == null ? maybe0 : ((Maybe)RxJavaPlugins.a(maybe0, RxJavaPlugins.o));
    }

    @NonNull
    public static Observable onAssembly(@NonNull Observable observable0) {
        return RxJavaPlugins.m == null ? observable0 : ((Observable)RxJavaPlugins.a(observable0, RxJavaPlugins.m));
    }

    @NonNull
    public static Single onAssembly(@NonNull Single single0) {
        return RxJavaPlugins.p == null ? single0 : ((Single)RxJavaPlugins.a(single0, RxJavaPlugins.p));
    }

    @NonNull
    public static ConnectableFlowable onAssembly(@NonNull ConnectableFlowable connectableFlowable0) {
        return RxJavaPlugins.l == null ? connectableFlowable0 : ((ConnectableFlowable)RxJavaPlugins.a(connectableFlowable0, RxJavaPlugins.l));
    }

    @NonNull
    public static ConnectableObservable onAssembly(@NonNull ConnectableObservable connectableObservable0) {
        return RxJavaPlugins.n == null ? connectableObservable0 : ((ConnectableObservable)RxJavaPlugins.a(connectableObservable0, RxJavaPlugins.n));
    }

    @NonNull
    public static ParallelFlowable onAssembly(@NonNull ParallelFlowable parallelFlowable0) {
        return RxJavaPlugins.r == null ? parallelFlowable0 : ((ParallelFlowable)RxJavaPlugins.a(parallelFlowable0, RxJavaPlugins.r));
    }

    public static boolean onBeforeBlocking() {
        BooleanSupplier booleanSupplier0 = RxJavaPlugins.x;
        if(booleanSupplier0 != null) {
            try {
                return booleanSupplier0.getAsBoolean();
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return false;
    }

    @NonNull
    public static Scheduler onComputationScheduler(@NonNull Scheduler scheduler0) {
        return RxJavaPlugins.g == null ? scheduler0 : ((Scheduler)RxJavaPlugins.a(scheduler0, RxJavaPlugins.g));
    }

    public static void onError(@NonNull Throwable throwable0) {
        Consumer consumer0 = RxJavaPlugins.a;
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else if(!(throwable0 instanceof OnErrorNotImplementedException) && !(throwable0 instanceof MissingBackpressureException) && !(throwable0 instanceof IllegalStateException) && !(throwable0 instanceof NullPointerException) && !(throwable0 instanceof IllegalArgumentException) && !(throwable0 instanceof CompositeException)) {
            throwable0 = new UndeliverableException(throwable0);
        }
        if(consumer0 != null) {
            try {
                consumer0.accept(throwable0);
                return;
            }
            catch(Throwable throwable1) {
                throwable1.printStackTrace();
                Thread thread0 = Thread.currentThread();
                thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable1);
            }
        }
        throwable0.printStackTrace();
        Thread thread1 = Thread.currentThread();
        thread1.getUncaughtExceptionHandler().uncaughtException(thread1, throwable0);
    }

    @NonNull
    public static Scheduler onIoScheduler(@NonNull Scheduler scheduler0) {
        return RxJavaPlugins.i == null ? scheduler0 : ((Scheduler)RxJavaPlugins.a(scheduler0, RxJavaPlugins.i));
    }

    @NonNull
    public static Scheduler onNewThreadScheduler(@NonNull Scheduler scheduler0) {
        return RxJavaPlugins.j == null ? scheduler0 : ((Scheduler)RxJavaPlugins.a(scheduler0, RxJavaPlugins.j));
    }

    @NonNull
    public static Runnable onSchedule(@NonNull Runnable runnable0) {
        ObjectHelper.requireNonNull(runnable0, "run is null");
        return RxJavaPlugins.b == null ? runnable0 : ((Runnable)RxJavaPlugins.a(runnable0, RxJavaPlugins.b));
    }

    @NonNull
    public static Scheduler onSingleScheduler(@NonNull Scheduler scheduler0) {
        return RxJavaPlugins.h == null ? scheduler0 : ((Scheduler)RxJavaPlugins.a(scheduler0, RxJavaPlugins.h));
    }

    @NonNull
    public static CompletableObserver onSubscribe(@NonNull Completable completable0, @NonNull CompletableObserver completableObserver0) {
        BiFunction biFunction0 = RxJavaPlugins.w;
        if(biFunction0 != null) {
            try {
                return (CompletableObserver)biFunction0.apply(completable0, completableObserver0);
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return completableObserver0;
    }

    @NonNull
    public static MaybeObserver onSubscribe(@NonNull Maybe maybe0, @NonNull MaybeObserver maybeObserver0) {
        BiFunction biFunction0 = RxJavaPlugins.t;
        if(biFunction0 != null) {
            try {
                return (MaybeObserver)biFunction0.apply(maybe0, maybeObserver0);
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return maybeObserver0;
    }

    @NonNull
    public static Observer onSubscribe(@NonNull Observable observable0, @NonNull Observer observer0) {
        BiFunction biFunction0 = RxJavaPlugins.u;
        if(biFunction0 != null) {
            try {
                return (Observer)biFunction0.apply(observable0, observer0);
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return observer0;
    }

    @NonNull
    public static SingleObserver onSubscribe(@NonNull Single single0, @NonNull SingleObserver singleObserver0) {
        BiFunction biFunction0 = RxJavaPlugins.v;
        if(biFunction0 != null) {
            try {
                return (SingleObserver)biFunction0.apply(single0, singleObserver0);
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return singleObserver0;
    }

    @NonNull
    public static Subscriber onSubscribe(@NonNull Flowable flowable0, @NonNull Subscriber subscriber0) {
        BiFunction biFunction0 = RxJavaPlugins.s;
        if(biFunction0 != null) {
            try {
                return (Subscriber)biFunction0.apply(flowable0, subscriber0);
            }
            catch(Throwable throwable0) {
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
        return subscriber0;
    }

    public static void reset() {
        RxJavaPlugins.setErrorHandler(null);
        RxJavaPlugins.setScheduleHandler(null);
        RxJavaPlugins.setComputationSchedulerHandler(null);
        RxJavaPlugins.setInitComputationSchedulerHandler(null);
        RxJavaPlugins.setIoSchedulerHandler(null);
        RxJavaPlugins.setInitIoSchedulerHandler(null);
        RxJavaPlugins.setSingleSchedulerHandler(null);
        RxJavaPlugins.setInitSingleSchedulerHandler(null);
        RxJavaPlugins.setNewThreadSchedulerHandler(null);
        RxJavaPlugins.setInitNewThreadSchedulerHandler(null);
        RxJavaPlugins.setOnFlowableAssembly(null);
        RxJavaPlugins.setOnFlowableSubscribe(null);
        RxJavaPlugins.setOnObservableAssembly(null);
        RxJavaPlugins.setOnObservableSubscribe(null);
        RxJavaPlugins.setOnSingleAssembly(null);
        RxJavaPlugins.setOnSingleSubscribe(null);
        RxJavaPlugins.setOnCompletableAssembly(null);
        RxJavaPlugins.setOnCompletableSubscribe(null);
        RxJavaPlugins.setOnConnectableFlowableAssembly(null);
        RxJavaPlugins.setOnConnectableObservableAssembly(null);
        RxJavaPlugins.setOnMaybeAssembly(null);
        RxJavaPlugins.setOnMaybeSubscribe(null);
        RxJavaPlugins.setOnParallelAssembly(null);
        RxJavaPlugins.setFailOnNonBlockingScheduler(false);
        RxJavaPlugins.setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.g = function0;
    }

    public static void setErrorHandler(@Nullable Consumer consumer0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.a = consumer0;
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.z = z;
    }

    public static void setInitComputationSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.c = function0;
    }

    public static void setInitIoSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.e = function0;
    }

    public static void setInitNewThreadSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.f = function0;
    }

    public static void setInitSingleSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.d = function0;
    }

    public static void setIoSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.i = function0;
    }

    public static void setNewThreadSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.j = function0;
    }

    public static void setOnBeforeBlocking(@Nullable BooleanSupplier booleanSupplier0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.x = booleanSupplier0;
    }

    public static void setOnCompletableAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.q = function0;
    }

    public static void setOnCompletableSubscribe(@Nullable BiFunction biFunction0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.w = biFunction0;
    }

    public static void setOnConnectableFlowableAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.l = function0;
    }

    public static void setOnConnectableObservableAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.n = function0;
    }

    public static void setOnFlowableAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.k = function0;
    }

    public static void setOnFlowableSubscribe(@Nullable BiFunction biFunction0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.s = biFunction0;
    }

    public static void setOnMaybeAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.o = function0;
    }

    public static void setOnMaybeSubscribe(@Nullable BiFunction biFunction0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.t = biFunction0;
    }

    public static void setOnObservableAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.m = function0;
    }

    public static void setOnObservableSubscribe(@Nullable BiFunction biFunction0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.u = biFunction0;
    }

    public static void setOnParallelAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.r = function0;
    }

    public static void setOnSingleAssembly(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.p = function0;
    }

    public static void setOnSingleSubscribe(@Nullable BiFunction biFunction0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.v = biFunction0;
    }

    public static void setScheduleHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.b = function0;
    }

    public static void setSingleSchedulerHandler(@Nullable Function function0) {
        if(RxJavaPlugins.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        RxJavaPlugins.h = function0;
    }
}

