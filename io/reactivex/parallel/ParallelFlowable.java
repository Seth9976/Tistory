package io.reactivex.parallel;

import a5.b;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.parallel.ParallelCollect;
import io.reactivex.internal.operators.parallel.ParallelConcatMap;
import io.reactivex.internal.operators.parallel.ParallelDoOnNextTry;
import io.reactivex.internal.operators.parallel.ParallelFilter;
import io.reactivex.internal.operators.parallel.ParallelFilterTry;
import io.reactivex.internal.operators.parallel.ParallelFlatMap;
import io.reactivex.internal.operators.parallel.ParallelFromArray;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.internal.operators.parallel.ParallelJoin;
import io.reactivex.internal.operators.parallel.ParallelMap;
import io.reactivex.internal.operators.parallel.ParallelMapTry;
import io.reactivex.internal.operators.parallel.ParallelPeek;
import io.reactivex.internal.operators.parallel.ParallelReduce;
import io.reactivex.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.ListAddBiConsumer;
import io.reactivex.internal.util.MergerBiFunction;
import io.reactivex.internal.util.SorterFunction;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Comparator;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public abstract class ParallelFlowable {
    @CheckReturnValue
    @NonNull
    public final Object as(@NonNull ParallelFlowableConverter parallelFlowableConverter0) {
        return ((ParallelFlowableConverter)ObjectHelper.requireNonNull(parallelFlowableConverter0, "converter is null")).apply(this);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable collect(@NonNull Callable callable0, @NonNull BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(callable0, "collectionSupplier is null");
        ObjectHelper.requireNonNull(biConsumer0, "collector is null");
        return RxJavaPlugins.onAssembly(new ParallelCollect(this, callable0, biConsumer0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable compose(@NonNull ParallelTransformer parallelTransformer0) {
        return RxJavaPlugins.onAssembly(((ParallelTransformer)ObjectHelper.requireNonNull(parallelTransformer0, "composer is null")).apply(this));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable concatMap(@NonNull Function function0) {
        return this.concatMap(function0, 2);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable concatMap(@NonNull Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelConcatMap(this, function0, v, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable concatMapDelayError(@NonNull Function function0, int v, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new ParallelConcatMap(this, function0, v, ErrorMode.END)) : RxJavaPlugins.onAssembly(new ParallelConcatMap(this, function0, v, ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable concatMapDelayError(@NonNull Function function0, boolean z) {
        return this.concatMapDelayError(function0, 2, z);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doAfterNext(@NonNull Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), consumer0, Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doAfterTerminated(@NonNull Action action0) {
        ObjectHelper.requireNonNull(action0, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action0, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnCancel(@NonNull Action action0) {
        ObjectHelper.requireNonNull(action0, "onCancel is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnComplete(@NonNull Action action0) {
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), action0, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnError(@NonNull Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onError is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), consumer0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnNext(@NonNull Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumer0, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnNext(@NonNull Consumer consumer0, @NonNull BiFunction biFunction0) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(biFunction0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelDoOnNextTry(this, consumer0, biFunction0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnNext(@NonNull Consumer consumer0, @NonNull ParallelFailureHandling parallelFailureHandling0) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(parallelFailureHandling0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelDoOnNextTry(this, consumer0, parallelFailureHandling0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnRequest(@NonNull LongConsumer longConsumer0) {
        ObjectHelper.requireNonNull(longConsumer0, "onRequest is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.emptyConsumer(), longConsumer0, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable doOnSubscribe(@NonNull Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, consumer0, Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    public final ParallelFlowable filter(@NonNull Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate");
        return RxJavaPlugins.onAssembly(new ParallelFilter(this, predicate0));
    }

    @CheckReturnValue
    public final ParallelFlowable filter(@NonNull Predicate predicate0, @NonNull BiFunction biFunction0) {
        ObjectHelper.requireNonNull(predicate0, "predicate");
        ObjectHelper.requireNonNull(biFunction0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelFilterTry(this, predicate0, biFunction0));
    }

    @CheckReturnValue
    public final ParallelFlowable filter(@NonNull Predicate predicate0, @NonNull ParallelFailureHandling parallelFailureHandling0) {
        ObjectHelper.requireNonNull(predicate0, "predicate");
        ObjectHelper.requireNonNull(parallelFailureHandling0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelFilterTry(this, predicate0, parallelFailureHandling0));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public final ParallelFlowable flatMap(@NonNull Function function0) {
        return this.flatMap(function0, false, 0x7FFFFFFF, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public final ParallelFlowable flatMap(@NonNull Function function0, boolean z) {
        return this.flatMap(function0, z, 0x7FFFFFFF, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public final ParallelFlowable flatMap(@NonNull Function function0, boolean z, int v) {
        return this.flatMap(function0, z, v, 0x80);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable flatMap(@NonNull Function function0, boolean z, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelFlatMap(this, function0, z, v, v1));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    public static ParallelFlowable from(@NonNull Publisher publisher0) {
        return ParallelFlowable.from(publisher0, Runtime.getRuntime().availableProcessors(), 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    public static ParallelFlowable from(@NonNull Publisher publisher0, int v) {
        return ParallelFlowable.from(publisher0, v, 0x80);
    }

    @CheckReturnValue
    @NonNull
    public static ParallelFlowable from(@NonNull Publisher publisher0, int v, int v1) {
        ObjectHelper.requireNonNull(publisher0, "source");
        ObjectHelper.verifyPositive(v, "parallelism");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelFromPublisher(publisher0, v, v1));
    }

    @CheckReturnValue
    @NonNull
    public static ParallelFlowable fromArray(@NonNull Publisher[] arr_publisher) {
        if(arr_publisher.length == 0) {
            throw new IllegalArgumentException("Zero publishers not supported");
        }
        return RxJavaPlugins.onAssembly(new ParallelFromArray(arr_publisher));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable map(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper");
        return RxJavaPlugins.onAssembly(new ParallelMap(this, function0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable map(@NonNull Function function0, @NonNull BiFunction biFunction0) {
        ObjectHelper.requireNonNull(function0, "mapper");
        ObjectHelper.requireNonNull(biFunction0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTry(this, function0, biFunction0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable map(@NonNull Function function0, @NonNull ParallelFailureHandling parallelFailureHandling0) {
        ObjectHelper.requireNonNull(function0, "mapper");
        ObjectHelper.requireNonNull(parallelFailureHandling0, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTry(this, function0, parallelFailureHandling0));
    }

    public abstract int parallelism();

    @CheckReturnValue
    @NonNull
    public final Flowable reduce(@NonNull BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "reducer");
        return RxJavaPlugins.onAssembly(new ParallelReduceFull(this, biFunction0));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable reduce(@NonNull Callable callable0, @NonNull BiFunction biFunction0) {
        ObjectHelper.requireNonNull(callable0, "initialSupplier");
        ObjectHelper.requireNonNull(biFunction0, "reducer");
        return RxJavaPlugins.onAssembly(new ParallelReduce(this, callable0, biFunction0));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public final ParallelFlowable runOn(@NonNull Scheduler scheduler0) {
        return this.runOn(scheduler0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable runOn(@NonNull Scheduler scheduler0, int v) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelRunOn(this, scheduler0, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable sequential() {
        return this.sequential(0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sequential(int v) {
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelJoin(this, v, false));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sequentialDelayError() {
        return this.sequentialDelayError(0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sequentialDelayError(int v) {
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelJoin(this, v, true));
    }

    @CheckReturnValue
    @NonNull
    public final Flowable sorted(@NonNull Comparator comparator0) {
        return this.sorted(comparator0, 16);
    }

    @CheckReturnValue
    @NonNull
    public final Flowable sorted(@NonNull Comparator comparator0, int v) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        ObjectHelper.verifyPositive(v, "capacityHint");
        return RxJavaPlugins.onAssembly(new ParallelSortedJoin(this.reduce(Functions.createArrayList(v / this.parallelism() + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator0)), comparator0));
    }

    public abstract void subscribe(@NonNull Subscriber[] arg1);

    @CheckReturnValue
    @NonNull
    public final Object to(@NonNull Function function0) {
        try {
            return ((Function)ObjectHelper.requireNonNull(function0, "converter is null")).apply(this);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @CheckReturnValue
    @NonNull
    public final Flowable toSortedList(@NonNull Comparator comparator0) {
        return this.toSortedList(comparator0, 16);
    }

    @CheckReturnValue
    @NonNull
    public final Flowable toSortedList(@NonNull Comparator comparator0, int v) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        ObjectHelper.verifyPositive(v, "capacityHint");
        return RxJavaPlugins.onAssembly(this.reduce(Functions.createArrayList(v / this.parallelism() + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator0)).reduce(new MergerBiFunction(comparator0)));
    }

    public final boolean validate(@NonNull Subscriber[] arr_subscriber) {
        int v = this.parallelism();
        if(arr_subscriber.length != v) {
            StringBuilder stringBuilder0 = b.s(v, "parallelism = ", ", subscribers = ");
            stringBuilder0.append(arr_subscriber.length);
            IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(stringBuilder0.toString());
            for(int v1 = 0; v1 < arr_subscriber.length; ++v1) {
                EmptySubscription.error(illegalArgumentException0, arr_subscriber[v1]);
            }
            return false;
        }
        return true;
    }
}

