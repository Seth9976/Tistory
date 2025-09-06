package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Function;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.BlockingFlowableIterable;
import io.reactivex.internal.operators.flowable.BlockingFlowableLatest;
import io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent;
import io.reactivex.internal.operators.flowable.BlockingFlowableNext;
import io.reactivex.internal.operators.flowable.FlowableAllSingle;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import io.reactivex.internal.operators.flowable.FlowableAnySingle;
import io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier;
import io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary;
import io.reactivex.internal.operators.flowable.FlowableBufferTimed;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.operators.flowable.FlowableCollectSingle;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEagerPublisher;
import io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.internal.operators.flowable.FlowableCountSingle;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDefer;
import io.reactivex.internal.operators.flowable.FlowableDelay;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.internal.operators.flowable.FlowableDematerialize;
import io.reactivex.internal.operators.flowable.FlowableDetach;
import io.reactivex.internal.operators.flowable.FlowableDistinct;
import io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.internal.operators.flowable.FlowableDoAfterNext;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.internal.operators.flowable.FlowableEmpty;
import io.reactivex.internal.operators.flowable.FlowableError;
import io.reactivex.internal.operators.flowable.FlowableFilter;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.internal.operators.flowable.FlowableFromFuture;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.flowable.FlowableGenerate;
import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.operators.flowable.FlowableHide;
import io.reactivex.internal.operators.flowable.FlowableIgnoreElements;
import io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.internal.operators.flowable.FlowableJoin;
import io.reactivex.internal.operators.flowable.FlowableJust;
import io.reactivex.internal.operators.flowable.FlowableLastMaybe;
import io.reactivex.internal.operators.flowable.FlowableLastSingle;
import io.reactivex.internal.operators.flowable.FlowableLift;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import io.reactivex.internal.operators.flowable.FlowableMaterialize;
import io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableMergeWithSingle;
import io.reactivex.internal.operators.flowable.FlowableNever;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.internal.operators.flowable.FlowableReduceMaybe;
import io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle;
import io.reactivex.internal.operators.flowable.FlowableReduceWithSingle;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.internal.operators.flowable.FlowableScan;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.internal.operators.flowable.FlowableSerialized;
import io.reactivex.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.flowable.FlowableSkip;
import io.reactivex.internal.operators.flowable.FlowableSkipLast;
import io.reactivex.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.internal.operators.flowable.FlowableSkipWhile;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import io.reactivex.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.internal.operators.flowable.FlowableTakeWhile;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableTimeInterval;
import io.reactivex.internal.operators.flowable.FlowableTimeout;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableToListSingle;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableWindow;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import io.reactivex.internal.operators.flowable.FlowableWindowTimed;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.FlowableZipIterable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.schedulers.ImmediateThinScheduler;
import io.reactivex.internal.subscribers.BlockingFirstSubscriber;
import io.reactivex.internal.subscribers.BlockingLastSubscriber;
import io.reactivex.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.internal.subscribers.FutureSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.SafeSubscriber;
import io.reactivex.subscribers.TestSubscriber;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.text.q;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public abstract class Flowable implements Publisher {
    public static final int a;

    static {
        Flowable.a = 0x80;
    }

    public final Flowable a(Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.requireNonNull(action1, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnEach(this, consumer0, consumer1, action0, action1));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single all(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAllSingle(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable amb(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableAmb(null, iterable0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable ambArray(Publisher[] arr_publisher) {
        ObjectHelper.requireNonNull(arr_publisher, "sources is null");
        if(arr_publisher.length == 0) {
            return Flowable.empty();
        }
        return arr_publisher.length == 1 ? Flowable.fromPublisher(arr_publisher[0]) : RxJavaPlugins.onAssembly(new FlowableAmb(arr_publisher, null));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable ambWith(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return Flowable.ambArray(new Publisher[]{this, publisher0});
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single any(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAnySingle(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object as(@NonNull FlowableConverter flowableConverter0) {
        return ((FlowableConverter)ObjectHelper.requireNonNull(flowableConverter0, "converter is null")).apply(this);
    }

    public final Flowable b(Function function0, int v, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Flowable.empty() : FlowableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new FlowableSwitchMap(this, function0, v, z));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingFirst() {
        BlockingFirstSubscriber blockingFirstSubscriber0 = new BlockingFirstSubscriber();
        this.subscribe(blockingFirstSubscriber0);
        Object object0 = blockingFirstSubscriber0.blockingGet();
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        return object0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingFirst(Object object0) {
        BlockingFirstSubscriber blockingFirstSubscriber0 = new BlockingFirstSubscriber();
        this.subscribe(blockingFirstSubscriber0);
        Object object1 = blockingFirstSubscriber0.blockingGet();
        return object1 == null ? object0 : object1;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingForEach(Consumer consumer0) {
        Iterator iterator0 = this.blockingIterable().iterator();
        while(iterator0.hasNext()) {
            try {
                Object object0 = iterator0.next();
                consumer0.accept(object0);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Disposable)iterator0).dispose();
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingIterable() {
        return this.blockingIterable(0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingIterable(int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return new BlockingFlowableIterable(this, v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingLast() {
        BlockingLastSubscriber blockingLastSubscriber0 = new BlockingLastSubscriber();
        this.subscribe(blockingLastSubscriber0);
        Object object0 = blockingLastSubscriber0.blockingGet();
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        return object0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingLast(Object object0) {
        BlockingLastSubscriber blockingLastSubscriber0 = new BlockingLastSubscriber();
        this.subscribe(blockingLastSubscriber0);
        Object object1 = blockingLastSubscriber0.blockingGet();
        return object1 == null ? object0 : object1;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingLatest() {
        return new BlockingFlowableLatest(this);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingMostRecent(Object object0) {
        return new BlockingFlowableMostRecent(this, object0);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingNext() {
        return new BlockingFlowableNext(this);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingSingle() {
        return this.singleOrError().blockingGet();
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingSingle(Object object0) {
        return this.single(object0).blockingGet();
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        FlowableBlockingSubscribe.subscribe(this);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, int v) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, consumer1, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1, int v) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, consumer1, Functions.EMPTY_ACTION, v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1, Action action0) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, consumer1, action0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1, Action action0, int v) {
        FlowableBlockingSubscribe.subscribe(this, consumer0, consumer1, action0, v);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(Subscriber subscriber0) {
        FlowableBlockingSubscribe.subscribe(this, subscriber0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(int v) {
        return this.buffer(v, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(int v, int v1) {
        return this.buffer(v, v1, ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable buffer(int v, int v1, Callable callable0) {
        ObjectHelper.verifyPositive(v, "count");
        ObjectHelper.verifyPositive(v1, "skip");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBuffer(this, v, v1, callable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(int v, Callable callable0) {
        return this.buffer(v, v, callable0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable buffer(long v, long v1, TimeUnit timeUnit0) {
        return this.buffer(v, v1, timeUnit0, Schedulers.computation(), ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable buffer(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.buffer(v, v1, timeUnit0, scheduler0, ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable buffer(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, Callable callable0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, v, v1, timeUnit0, scheduler0, callable0, 0x7FFFFFFF, false));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable buffer(long v, TimeUnit timeUnit0) {
        return this.buffer(v, timeUnit0, Schedulers.computation(), 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable buffer(long v, TimeUnit timeUnit0, int v1) {
        return this.buffer(v, timeUnit0, Schedulers.computation(), v1);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.buffer(v, timeUnit0, scheduler0, 0x7FFFFFFF, ArrayListSupplier.asCallable(), false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return this.buffer(v, timeUnit0, scheduler0, v1, ArrayListSupplier.asCallable(), false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, Callable callable0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        ObjectHelper.verifyPositive(v1, "count");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, v, v, timeUnit0, scheduler0, callable0, v1, z));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Flowable flowable0, Function function0) {
        return this.buffer(flowable0, function0, ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Flowable flowable0, Function function0, Callable callable0) {
        ObjectHelper.requireNonNull(flowable0, "openingIndicator is null");
        ObjectHelper.requireNonNull(function0, "closingIndicator is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferBoundary(this, flowable0, function0, callable0));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Callable callable0) {
        return this.buffer(callable0, ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Callable callable0, Callable callable1) {
        ObjectHelper.requireNonNull(callable0, "boundaryIndicatorSupplier is null");
        ObjectHelper.requireNonNull(callable1, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferBoundarySupplier(this, callable0, callable1));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Publisher publisher0) {
        return this.buffer(publisher0, ArrayListSupplier.asCallable());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Publisher publisher0, int v) {
        ObjectHelper.verifyPositive(v, "initialCapacity");
        return this.buffer(publisher0, Functions.createArrayList(v));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable buffer(Publisher publisher0, Callable callable0) {
        ObjectHelper.requireNonNull(publisher0, "boundaryIndicator is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferExactBoundary(this, publisher0, callable0));
    }

    public static int bufferSize() [...] // 潜在的解密器

    public final Flowable c(long v, TimeUnit timeUnit0, Scheduler scheduler0, Publisher publisher0) {
        ObjectHelper.requireNonNull(timeUnit0, "timeUnit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeoutTimed(this, v, timeUnit0, scheduler0, publisher0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable cache() {
        return this.cacheWithInitialCapacity(16);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable cacheWithInitialCapacity(int v) {
        ObjectHelper.verifyPositive(v, "initialCapacity");
        return RxJavaPlugins.onAssembly(new FlowableCache(this, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable cast(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.map(Functions.castFunction(class0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single collect(Callable callable0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(callable0, "initialItemSupplier is null");
        ObjectHelper.requireNonNull(biConsumer0, "collector is null");
        return RxJavaPlugins.onAssembly(new FlowableCollectSingle(this, callable0, biConsumer0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single collectInto(Object object0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(object0, "initialItem is null");
        return this.collect(Functions.justCallable(object0), biConsumer0);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatest(Function function0, Publisher[] arr_publisher) {
        return Flowable.combineLatest(arr_publisher, function0, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatest(Iterable iterable0, Function function0) {
        return Flowable.combineLatest(iterable0, function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Iterable iterable0, Function function0, int v) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest(iterable0, function0, v, false));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.combineLatest(Functions.toFunction(biFunction0), new Publisher[]{publisher0, publisher1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Function3 function30) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        return Flowable.combineLatest(Functions.toFunction(function30), new Publisher[]{publisher0, publisher1, publisher2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Function4 function40) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        return Flowable.combineLatest(Functions.toFunction(function40), new Publisher[]{publisher0, publisher1, publisher2, publisher3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Function5 function50) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        return Flowable.combineLatest(Functions.toFunction(function50), new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Function6 function60) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        return Flowable.combineLatest(Functions.toFunction(function60), new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Function7 function70) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        return Flowable.combineLatest(Functions.toFunction(function70), new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Publisher publisher7, Function8 function80) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        ObjectHelper.requireNonNull(publisher7, "source8 is null");
        return Flowable.combineLatest(Functions.toFunction(function80), new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Publisher publisher7, Publisher publisher8, Function9 function90) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        ObjectHelper.requireNonNull(publisher7, "source8 is null");
        ObjectHelper.requireNonNull(publisher8, "source9 is null");
        return Flowable.combineLatest(Functions.toFunction(function90), new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8});
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher[] arr_publisher, Function function0) {
        return Flowable.combineLatest(arr_publisher, function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatest(Publisher[] arr_publisher, Function function0, int v) {
        ObjectHelper.requireNonNull(arr_publisher, "sources is null");
        if(arr_publisher.length == 0) {
            return Flowable.empty();
        }
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest(arr_publisher, function0, v, false));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Function function0, int v, Publisher[] arr_publisher) {
        return Flowable.combineLatestDelayError(arr_publisher, function0, v);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Function function0, Publisher[] arr_publisher) {
        return Flowable.combineLatestDelayError(arr_publisher, function0, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Iterable iterable0, Function function0) {
        return Flowable.combineLatestDelayError(iterable0, function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Iterable iterable0, Function function0, int v) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest(iterable0, function0, v, true));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Publisher[] arr_publisher, Function function0) {
        return Flowable.combineLatestDelayError(arr_publisher, function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable combineLatestDelayError(Publisher[] arr_publisher, Function function0, int v) {
        ObjectHelper.requireNonNull(arr_publisher, "sources is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return arr_publisher.length == 0 ? Flowable.empty() : RxJavaPlugins.onAssembly(new FlowableCombineLatest(arr_publisher, function0, v, true));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable compose(FlowableTransformer flowableTransformer0) {
        return Flowable.fromPublisher(((FlowableTransformer)ObjectHelper.requireNonNull(flowableTransformer0, "composer is null")).apply(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return Flowable.fromIterable(iterable0).concatMapDelayError(Functions.identity(), 2, false);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0) {
        return Flowable.concat(publisher0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, int v) {
        return Flowable.fromPublisher(publisher0).concatMap(Functions.identity(), v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, Publisher publisher1) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.concatArray(new Publisher[]{publisher0, publisher1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, Publisher publisher1, Publisher publisher2) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        return Flowable.concatArray(new Publisher[]{publisher0, publisher1, publisher2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        return Flowable.concatArray(new Publisher[]{publisher0, publisher1, publisher2, publisher3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArray(Publisher[] arr_publisher) {
        switch(arr_publisher.length) {
            case 0: {
                return Flowable.empty();
            }
            case 1: {
                return Flowable.fromPublisher(arr_publisher[0]);
            }
            default: {
                return RxJavaPlugins.onAssembly(new FlowableConcatArray(arr_publisher, false));
            }
        }
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayDelayError(Publisher[] arr_publisher) {
        switch(arr_publisher.length) {
            case 0: {
                return Flowable.empty();
            }
            case 1: {
                return Flowable.fromPublisher(arr_publisher[0]);
            }
            default: {
                return RxJavaPlugins.onAssembly(new FlowableConcatArray(arr_publisher, true));
            }
        }
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatArrayEager(int v, int v1, Publisher[] arr_publisher) {
        ObjectHelper.requireNonNull(arr_publisher, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromArray(arr_publisher), Functions.identity(), v, v1, ErrorMode.IMMEDIATE));
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayEager(Publisher[] arr_publisher) {
        return Flowable.concatArrayEager(0x80, 0x80, arr_publisher);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayEagerDelayError(int v, int v1, Publisher[] arr_publisher) {
        return Flowable.fromArray(arr_publisher).concatMapEagerDelayError(Functions.identity(), v, v1, true);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayEagerDelayError(Publisher[] arr_publisher) {
        return Flowable.concatArrayEagerDelayError(0x80, 0x80, arr_publisher);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatDelayError(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return Flowable.fromIterable(iterable0).concatMapDelayError(Functions.identity());
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatDelayError(Publisher publisher0) {
        return Flowable.concatDelayError(publisher0, 0x80, true);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatDelayError(Publisher publisher0, int v, boolean z) {
        return Flowable.fromPublisher(publisher0).concatMapDelayError(Functions.identity(), v, z);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatEager(Iterable iterable0) {
        return Flowable.concatEager(iterable0, 0x80, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatEager(Iterable iterable0, int v, int v1) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromIterable(iterable0), Functions.identity(), v, v1, ErrorMode.IMMEDIATE));
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatEager(Publisher publisher0) {
        return Flowable.concatEager(publisher0, 0x80, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatEager(Publisher publisher0, int v, int v1) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEagerPublisher(publisher0, Functions.identity(), v, v1, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMap(Function function0) {
        return this.concatMap(function0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMap(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Flowable.empty() : FlowableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function0, v, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function function0) {
        return this.concatMapCompletable(function0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0) {
        return this.concatMapCompletableDelayError(function0, true, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0, boolean z) {
        return this.concatMapCompletableDelayError(function0, z, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function0, ErrorMode.BOUNDARY, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapDelayError(Function function0) {
        return this.concatMapDelayError(function0, 2, true);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapDelayError(Function function0, int v, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Flowable.empty() : FlowableScalarXMap.scalarXMap(object0, function0);
        }
        return z ? RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function0, v, ErrorMode.END)) : RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function0, v, ErrorMode.BOUNDARY));
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapEager(Function function0) {
        return this.concatMapEager(function0, 0x80, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapEager(Function function0, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function0, v, v1, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapEagerDelayError(Function function0, int v, int v1, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function0, v, v1, ErrorMode.END)) : RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function0, v, v1, ErrorMode.BOUNDARY));
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapEagerDelayError(Function function0, boolean z) {
        return this.concatMapEagerDelayError(function0, 0x80, 0x80, z);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapIterable(Function function0) {
        return this.concatMapIterable(function0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapIterable(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function0, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapMaybe(Function function0) {
        return this.concatMapMaybe(function0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapMaybe(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapMaybeDelayError(Function function0) {
        return this.concatMapMaybeDelayError(function0, true, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapMaybeDelayError(Function function0, boolean z) {
        return this.concatMapMaybeDelayError(function0, z, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapMaybeDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function0, ErrorMode.BOUNDARY, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapSingle(Function function0) {
        return this.concatMapSingle(function0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapSingle(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapSingleDelayError(Function function0) {
        return this.concatMapSingleDelayError(function0, true, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatMapSingleDelayError(Function function0, boolean z) {
        return this.concatMapSingleDelayError(function0, z, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatMapSingleDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function0, ErrorMode.BOUNDARY, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatWith(@NonNull CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithCompletable(this, completableSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatWith(@NonNull MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithMaybe(this, maybeSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatWith(@NonNull SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithSingle(this, singleSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatWith(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return Flowable.concat(this, publisher0);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single contains(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return this.any(Functions.equalsWith(object0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single count() {
        return RxJavaPlugins.onAssembly(new FlowableCountSingle(this));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable create(FlowableOnSubscribe flowableOnSubscribe0, BackpressureStrategy backpressureStrategy0) {
        ObjectHelper.requireNonNull(flowableOnSubscribe0, "source is null");
        ObjectHelper.requireNonNull(backpressureStrategy0, "mode is null");
        return RxJavaPlugins.onAssembly(new FlowableCreate(flowableOnSubscribe0, backpressureStrategy0));
    }

    public final Flowable d(Publisher publisher0, Function function0, Publisher publisher1) {
        ObjectHelper.requireNonNull(function0, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeout(this, publisher0, function0, publisher1));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable debounce(long v, TimeUnit timeUnit0) {
        return this.debounce(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable debounce(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounceTimed(this, v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable debounce(Function function0) {
        ObjectHelper.requireNonNull(function0, "debounceIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounce(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable defaultIfEmpty(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return this.switchIfEmpty(Flowable.just(object0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable defer(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDefer(callable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable delay(long v, TimeUnit timeUnit0) {
        return this.delay(v, timeUnit0, Schedulers.computation(), false);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delay(v, timeUnit0, scheduler0, false);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDelay(this, Math.max(0L, v), timeUnit0, scheduler0, z));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable delay(long v, TimeUnit timeUnit0, boolean z) {
        return this.delay(v, timeUnit0, Schedulers.computation(), z);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable delay(Function function0) {
        ObjectHelper.requireNonNull(function0, "itemDelayIndicator is null");
        return this.flatMap(FlowableInternalHelper.itemDelay(function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable delay(Publisher publisher0, Function function0) {
        return this.delaySubscription(publisher0).delay(function0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable delaySubscription(long v, TimeUnit timeUnit0) {
        return this.delaySubscription(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable delaySubscription(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delaySubscription(Flowable.timer(v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable delaySubscription(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDelaySubscriptionOther(this, publisher0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    @Deprecated
    public final Flowable dematerialize() {
        return RxJavaPlugins.onAssembly(new FlowableDematerialize(this, Functions.identity()));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final Flowable dematerialize(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return RxJavaPlugins.onAssembly(new FlowableDematerialize(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinct() {
        return this.distinct(Functions.identity(), Functions.createHashSet());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinct(Function function0) {
        return this.distinct(function0, Functions.createHashSet());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinct(Function function0, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(callable0, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinct(this, function0, callable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinctUntilChanged() {
        return this.distinctUntilChanged(Functions.identity());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinctUntilChanged(BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(biPredicate0, "comparer is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, Functions.identity(), biPredicate0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable distinctUntilChanged(Function function0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, function0, ObjectHelper.equalsPredicate()));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doAfterNext(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new FlowableDoAfterNext(this, consumer0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doAfterTerminate(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doFinally(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return RxJavaPlugins.onAssembly(new FlowableDoFinally(this, action0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnCancel(Action action0) {
        return this.doOnLifecycle(Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnComplete(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), action0, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable doOnEach(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onNotification is null");
        return this.a(Functions.notificationOnNext(consumer0), Functions.notificationOnError(consumer0), Functions.notificationOnComplete(consumer0), Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable doOnEach(Subscriber subscriber0) {
        ObjectHelper.requireNonNull(subscriber0, "subscriber is null");
        return this.a(FlowableInternalHelper.subscriberOnNext(subscriber0), FlowableInternalHelper.subscriberOnError(subscriber0), FlowableInternalHelper.subscriberOnComplete(subscriber0), Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnError(Consumer consumer0) {
        return this.a(Functions.emptyConsumer(), consumer0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable doOnLifecycle(Consumer consumer0, LongConsumer longConsumer0, Action action0) {
        ObjectHelper.requireNonNull(consumer0, "onSubscribe is null");
        ObjectHelper.requireNonNull(longConsumer0, "onRequest is null");
        ObjectHelper.requireNonNull(action0, "onCancel is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnLifecycle(this, consumer0, longConsumer0, action0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnNext(Consumer consumer0) {
        return this.a(consumer0, Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnRequest(LongConsumer longConsumer0) {
        return this.doOnLifecycle(Functions.emptyConsumer(), longConsumer0, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnSubscribe(Consumer consumer0) {
        return this.doOnLifecycle(consumer0, Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable doOnTerminate(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.actionConsumer(action0), action0, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe elementAt(long v) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new FlowableElementAtMaybe(this, v));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single elementAt(long v, Object object0) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, v, object0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single elementAtOrError(long v) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, v, null));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable empty() {
        return RxJavaPlugins.onAssembly(FlowableEmpty.INSTANCE);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable error(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "throwable is null");
        return Flowable.error(Functions.justCallable(throwable0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable error(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableError(callable0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable filter(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableFilter(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single first(Object object0) {
        return this.elementAt(0L, object0);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe firstElement() {
        return this.elementAt(0L);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single firstOrError() {
        return this.elementAtOrError(0L);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0) {
        return this.flatMap(function0, false, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, int v) {
        return this.flatMap(function0, false, v, 0x80);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, BiFunction biFunction0) {
        return this.flatMap(function0, biFunction0, false, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, BiFunction biFunction0, int v) {
        return this.flatMap(function0, biFunction0, false, v, 0x80);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, BiFunction biFunction0, boolean z) {
        return this.flatMap(function0, biFunction0, z, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, BiFunction biFunction0, boolean z, int v) {
        return this.flatMap(function0, biFunction0, z, v, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, BiFunction biFunction0, boolean z, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "combiner is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "bufferSize");
        return this.flatMap(FlowableInternalHelper.flatMapWithCombiner(function0, biFunction0), z, v, v1);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, Function function1, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "onNextMapper is null");
        ObjectHelper.requireNonNull(function1, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable0, "onCompleteSupplier is null");
        return Flowable.merge(new FlowableMapNotification(this, function0, function1, callable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, Function function1, Callable callable0, int v) {
        ObjectHelper.requireNonNull(function0, "onNextMapper is null");
        ObjectHelper.requireNonNull(function1, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable0, "onCompleteSupplier is null");
        return Flowable.merge(new FlowableMapNotification(this, function0, function1, callable0), v);
    }

    // 去混淆评级： 低(40)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, boolean z) {
        return this.flatMap(function0, z, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, boolean z, int v) {
        return this.flatMap(function0, z, v, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMap(Function function0, boolean z, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "bufferSize");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Flowable.empty() : FlowableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new FlowableFlatMap(this, function0, z, v, v1));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0) {
        return this.flatMapCompletable(function0, false, 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletableCompletable(this, function0, z, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMapIterable(Function function0) {
        return this.flatMapIterable(function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapIterable(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function0, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapIterable(Function function0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return this.flatMap(FlowableInternalHelper.flatMapIntoIterable(function0), biFunction0, false, 0x80, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapIterable(Function function0, BiFunction biFunction0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return this.flatMap(FlowableInternalHelper.flatMapIntoIterable(function0), biFunction0, false, 0x80, v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMapMaybe(Function function0) {
        return this.flatMapMaybe(function0, false, 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapMaybe(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapMaybe(this, function0, z, v));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable flatMapSingle(Function function0) {
        return this.flatMapSingle(function0, false, 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapSingle(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapSingle(this, function0, z, v));
    }

    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEach(Consumer consumer0) {
        return this.subscribe(consumer0);
    }

    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0) {
        return this.forEachWhile(predicate0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0, Consumer consumer0) {
        return this.forEachWhile(predicate0, consumer0, Functions.EMPTY_ACTION);
    }

    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0, Consumer consumer0, Action action0) {
        ObjectHelper.requireNonNull(predicate0, "onNext is null");
        ObjectHelper.requireNonNull(consumer0, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        Disposable disposable0 = new ForEachWhileSubscriber(predicate0, consumer0, action0);
        this.subscribe(((FlowableSubscriber)disposable0));
        return disposable0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromArray(Object[] arr_object) {
        ObjectHelper.requireNonNull(arr_object, "items is null");
        if(arr_object.length == 0) {
            return Flowable.empty();
        }
        return arr_object.length == 1 ? Flowable.just(arr_object[0]) : RxJavaPlugins.onAssembly(new FlowableFromArray(arr_object));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromCallable(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableFromCallable(callable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromFuture(Future future0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future0, 0L, null));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromFuture(Future future0, long v, TimeUnit timeUnit0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future0, v, timeUnit0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Flowable fromFuture(Future future0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return Flowable.fromFuture(future0, v, timeUnit0).subscribeOn(scheduler0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Flowable fromFuture(Future future0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return Flowable.fromFuture(future0).subscribeOn(scheduler0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromIterable(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "source is null");
        return RxJavaPlugins.onAssembly(new FlowableFromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable fromPublisher(Publisher publisher0) {
        if(publisher0 instanceof Flowable) {
            return RxJavaPlugins.onAssembly(((Flowable)publisher0));
        }
        ObjectHelper.requireNonNull(publisher0, "source is null");
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(publisher0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable generate(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "generator is null");
        return Flowable.generate(Functions.nullSupplier(), FlowableInternalHelper.simpleGenerator(consumer0), Functions.emptyConsumer());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable generate(Callable callable0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "generator is null");
        return Flowable.generate(callable0, FlowableInternalHelper.simpleBiGenerator(biConsumer0), Functions.emptyConsumer());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable generate(Callable callable0, BiConsumer biConsumer0, Consumer consumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "generator is null");
        return Flowable.generate(callable0, FlowableInternalHelper.simpleBiGenerator(biConsumer0), consumer0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable generate(Callable callable0, BiFunction biFunction0) {
        return Flowable.generate(callable0, biFunction0, Functions.emptyConsumer());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable generate(Callable callable0, BiFunction biFunction0, Consumer consumer0) {
        ObjectHelper.requireNonNull(callable0, "initialState is null");
        ObjectHelper.requireNonNull(biFunction0, "generator is null");
        ObjectHelper.requireNonNull(consumer0, "disposeState is null");
        return RxJavaPlugins.onAssembly(new FlowableGenerate(callable0, biFunction0, consumer0));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0) {
        return this.groupBy(function0, Functions.identity(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0, Function function1) {
        return this.groupBy(function0, function1, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0, Function function1, boolean z) {
        return this.groupBy(function0, function1, z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0, Function function1, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function0, function1, v, z, null));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0, Function function1, boolean z, int v, Function function2) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(function2, "evictingMapFactory is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function0, function1, v, z, function2));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable groupBy(Function function0, boolean z) {
        return this.groupBy(function0, Functions.identity(), z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable groupJoin(Publisher publisher0, Function function0, Function function1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        ObjectHelper.requireNonNull(function0, "leftEnd is null");
        ObjectHelper.requireNonNull(function1, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupJoin(this, publisher0, function0, function1, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable hide() {
        return RxJavaPlugins.onAssembly(new FlowableHide(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElementsCompletable(this));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable interval(long v, long v1, TimeUnit timeUnit0) {
        return Flowable.interval(v, v1, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Flowable interval(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableInterval(Math.max(0L, v), Math.max(0L, v1), timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable interval(long v, TimeUnit timeUnit0) {
        return Flowable.interval(v, v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Flowable interval(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return Flowable.interval(v, v, timeUnit0, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable intervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0) {
        return Flowable.intervalRange(v, v1, v2, v3, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Flowable intervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0, Scheduler scheduler0) {
        int v4 = Long.compare(v1, 0L);
        if(v4 < 0) {
            throw new IllegalArgumentException(q.n(v1, "count >= 0 required but it was "));
        }
        if(v4 == 0) {
            return Flowable.empty().delay(v2, timeUnit0, scheduler0);
        }
        long v5 = v1 - 1L + v;
        if(v > 0L && v5 < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableIntervalRange(v, v5, Math.max(0L, v2), Math.max(0L, v3), timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single isEmpty() {
        return this.all(Functions.alwaysFalse());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable join(Publisher publisher0, Function function0, Function function1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        ObjectHelper.requireNonNull(function0, "leftEnd is null");
        ObjectHelper.requireNonNull(function1, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableJoin(this, publisher0, function0, function1, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return RxJavaPlugins.onAssembly(new FlowableJust(object0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        return Flowable.fromArray(new Object[]{object0, object1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        ObjectHelper.requireNonNull(object7, "item8 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        ObjectHelper.requireNonNull(object7, "item8 is null");
        ObjectHelper.requireNonNull(object8, "item9 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        ObjectHelper.requireNonNull(object7, "item8 is null");
        ObjectHelper.requireNonNull(object8, "item9 is null");
        ObjectHelper.requireNonNull(object9, "item10 is null");
        return Flowable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9});
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single last(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem");
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, object0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe lastElement() {
        return RxJavaPlugins.onAssembly(new FlowableLastMaybe(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single lastOrError() {
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, null));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable lift(FlowableOperator flowableOperator0) {
        ObjectHelper.requireNonNull(flowableOperator0, "lifter is null");
        return RxJavaPlugins.onAssembly(new FlowableLift(this, flowableOperator0));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable limit(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "count >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new FlowableLimit(this, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable map(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableMap(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable materialize() {
        return RxJavaPlugins.onAssembly(new FlowableMaterialize(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Iterable iterable0) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Iterable iterable0, int v) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity(), v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Iterable iterable0, int v, int v1) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity(), false, v, v1);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0) {
        return Flowable.merge(publisher0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0, int v) {
        return Flowable.fromPublisher(publisher0).flatMap(Functions.identity(), v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0, Publisher publisher1) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1}).flatMap(Functions.identity(), false, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0, Publisher publisher1, Publisher publisher2) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1, publisher2}).flatMap(Functions.identity(), false, 3);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1, publisher2, publisher3}).flatMap(Functions.identity(), false, 4);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeArray(int v, int v1, Publisher[] arr_publisher) {
        return Flowable.fromArray(arr_publisher).flatMap(Functions.identity(), false, v, v1);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeArray(Publisher[] arr_publisher) {
        return Flowable.fromArray(arr_publisher).flatMap(Functions.identity(), arr_publisher.length);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeArrayDelayError(int v, int v1, Publisher[] arr_publisher) {
        return Flowable.fromArray(arr_publisher).flatMap(Functions.identity(), true, v, v1);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeArrayDelayError(Publisher[] arr_publisher) {
        return Flowable.fromArray(arr_publisher).flatMap(Functions.identity(), true, arr_publisher.length);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Iterable iterable0) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity(), true);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Iterable iterable0, int v) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity(), true, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Iterable iterable0, int v, int v1) {
        return Flowable.fromIterable(iterable0).flatMap(Functions.identity(), true, v, v1);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0) {
        return Flowable.mergeDelayError(publisher0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0, int v) {
        return Flowable.fromPublisher(publisher0).flatMap(Functions.identity(), true, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0, Publisher publisher1) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1}).flatMap(Functions.identity(), true, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0, Publisher publisher1, Publisher publisher2) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1, publisher2}).flatMap(Functions.identity(), true, 3);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        return Flowable.fromArray(new Publisher[]{publisher0, publisher1, publisher2, publisher3}).flatMap(Functions.identity(), true, 4);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable mergeWith(@NonNull CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithCompletable(this, completableSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable mergeWith(@NonNull MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithMaybe(this, maybeSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable mergeWith(@NonNull SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithSingle(this, singleSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable mergeWith(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return Flowable.merge(this, publisher0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable never() {
        return RxJavaPlugins.onAssembly(FlowableNever.INSTANCE);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable observeOn(Scheduler scheduler0) {
        return this.observeOn(scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable observeOn(Scheduler scheduler0, boolean z) {
        return this.observeOn(scheduler0, z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable observeOn(Scheduler scheduler0, boolean z, int v) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableObserveOn(this, scheduler0, z, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable ofType(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.filter(Functions.isInstanceOf(class0)).cast(class0);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer() {
        return this.onBackpressureBuffer(0x80, false, true);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(int v) {
        return this.onBackpressureBuffer(v, false, false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(int v, Action action0) {
        return this.onBackpressureBuffer(v, false, false, action0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(int v, boolean z) {
        return this.onBackpressureBuffer(v, z, false);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(int v, boolean z, boolean z1) {
        ObjectHelper.verifyPositive(v, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, v, z1, z, Functions.EMPTY_ACTION));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(int v, boolean z, boolean z1, Action action0) {
        ObjectHelper.requireNonNull(action0, "onOverflow is null");
        ObjectHelper.verifyPositive(v, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, v, z1, z, action0));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(long v, Action action0, BackpressureOverflowStrategy backpressureOverflowStrategy0) {
        ObjectHelper.requireNonNull(backpressureOverflowStrategy0, "overflowStrategy is null");
        ObjectHelper.verifyPositive(v, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBufferStrategy(this, v, action0, backpressureOverflowStrategy0));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureBuffer(boolean z) {
        return this.onBackpressureBuffer(0x80, z, true);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureDrop() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onBackpressureDrop(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onDrop is null");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this, consumer0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onBackpressureLatest() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureLatest(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onErrorResumeNext(Function function0) {
        ObjectHelper.requireNonNull(function0, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorNext(this, function0, false));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onErrorResumeNext(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "next is null");
        return this.onErrorResumeNext(Functions.justFunction(publisher0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onErrorReturn(Function function0) {
        ObjectHelper.requireNonNull(function0, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorReturn(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onErrorReturnItem(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return this.onErrorReturn(Functions.justFunction(object0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable onExceptionResumeNext(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "next is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorNext(this, Functions.justFunction(publisher0), true));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new FlowableDetach(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable parallel() {
        return ParallelFlowable.from(this);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable parallel(int v) {
        ObjectHelper.verifyPositive(v, "parallelism");
        return ParallelFlowable.from(this, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable parallel(int v, int v1) {
        ObjectHelper.verifyPositive(v, "parallelism");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return ParallelFlowable.from(this, v, v1);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable publish(Function function0) {
        return this.publish(function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable publish(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowablePublishMulticast(this, function0, v, false));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableFlowable publish() {
        return this.publish(0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableFlowable publish(int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return FlowablePublish.create(this, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable range(int v, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + v1);
        }
        if(v1 == 0) {
            return Flowable.empty();
        }
        if(v1 == 1) {
            return Flowable.just(v);
        }
        if(((long)v) + ((long)(v1 - 1)) > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("Integer overflow");
        }
        return RxJavaPlugins.onAssembly(new FlowableRange(v, v1));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable rangeLong(long v, long v1) {
        int v2 = Long.compare(v1, 0L);
        if(v2 < 0) {
            throw new IllegalArgumentException(q.n(v1, "count >= 0 required but it was "));
        }
        if(v2 == 0) {
            return Flowable.empty();
        }
        if(v1 == 1L) {
            return Flowable.just(v);
        }
        if(v > 0L && v1 - 1L + v < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return RxJavaPlugins.onAssembly(new FlowableRangeLong(v, v1));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable rebatchRequests(int v) {
        return this.observeOn(ImmediateThinScheduler.INSTANCE, true, v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe reduce(BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceMaybe(this, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single reduce(Object object0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(object0, "seed is null");
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceSeedSingle(this, object0, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single reduceWith(Callable callable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(callable0, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceWithSingle(this, callable0, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeat() {
        return this.repeat(0x7FFFFFFFFFFFFFFFL);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeat(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "times >= 0 required but it was "));
        }
        return v1 == 0 ? Flowable.empty() : RxJavaPlugins.onAssembly(new FlowableRepeat(this, v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable repeatUntil(BooleanSupplier booleanSupplier0) {
        ObjectHelper.requireNonNull(booleanSupplier0, "stop is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatUntil(this, booleanSupplier0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable repeatWhen(Function function0) {
        ObjectHelper.requireNonNull(function0, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatWhen(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable replay(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this), function0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable replay(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, v), function0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable replay(Function function0, int v, long v1, TimeUnit timeUnit0) {
        return this.replay(function0, v, v1, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable replay(Function function0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, v, v1, timeUnit0, scheduler0), function0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable replay(Function function0, int v, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, v), FlowableInternalHelper.replayFunction(function0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable replay(Function function0, long v, TimeUnit timeUnit0) {
        return this.replay(function0, v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable replay(Function function0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, v, timeUnit0, scheduler0), function0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable replay(Function function0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this), FlowableInternalHelper.replayFunction(function0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableFlowable replay() {
        return FlowableReplay.createFrom(this);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableFlowable replay(int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return FlowableReplay.create(this, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableFlowable replay(int v, long v1, TimeUnit timeUnit0) {
        return this.replay(v, v1, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableFlowable replay(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return FlowableReplay.create(this, v1, timeUnit0, scheduler0, v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableFlowable replay(int v, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.observeOn(this.replay(v), scheduler0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableFlowable replay(long v, TimeUnit timeUnit0) {
        return this.replay(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableFlowable replay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.create(this, v, timeUnit0, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableFlowable replay(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return FlowableReplay.observeOn(this.replay(), scheduler0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable retry() {
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.alwaysTrue());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable retry(long v) {
        return this.retry(v, Functions.alwaysTrue());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable retry(long v, Predicate predicate0) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "times >= 0 required but it was "));
        }
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryPredicate(this, v, predicate0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable retry(BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(biPredicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryBiPredicate(this, biPredicate0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable retry(Predicate predicate0) {
        return this.retry(0x7FFFFFFFFFFFFFFFL, predicate0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable retryUntil(BooleanSupplier booleanSupplier0) {
        ObjectHelper.requireNonNull(booleanSupplier0, "stop is null");
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.predicateReverseFor(booleanSupplier0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable retryWhen(Function function0) {
        ObjectHelper.requireNonNull(function0, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryWhen(this, function0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final void safeSubscribe(Subscriber subscriber0) {
        ObjectHelper.requireNonNull(subscriber0, "s is null");
        if(subscriber0 instanceof SafeSubscriber) {
            this.subscribe(((SafeSubscriber)subscriber0));
            return;
        }
        this.subscribe(new SafeSubscriber(subscriber0));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable sample(long v, TimeUnit timeUnit0) {
        return this.sample(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable sample(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, v, timeUnit0, scheduler0, false));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable sample(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, v, timeUnit0, scheduler0, z));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable sample(long v, TimeUnit timeUnit0, boolean z) {
        return this.sample(v, timeUnit0, Schedulers.computation(), z);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sample(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, publisher0, false));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sample(Publisher publisher0, boolean z) {
        ObjectHelper.requireNonNull(publisher0, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, publisher0, z));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable scan(BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScan(this, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable scan(Object object0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(object0, "initialValue is null");
        return this.scanWith(Functions.justCallable(object0), biFunction0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable scanWith(Callable callable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(callable0, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction0, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScanSeed(this, callable0, biFunction0));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(Publisher publisher0, Publisher publisher1) {
        return Flowable.sequenceEqual(publisher0, publisher1, ObjectHelper.equalsPredicate(), 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(Publisher publisher0, Publisher publisher1, int v) {
        return Flowable.sequenceEqual(publisher0, publisher1, ObjectHelper.equalsPredicate(), v);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(Publisher publisher0, Publisher publisher1, BiPredicate biPredicate0) {
        return Flowable.sequenceEqual(publisher0, publisher1, biPredicate0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single sequenceEqual(Publisher publisher0, Publisher publisher1, BiPredicate biPredicate0, int v) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(biPredicate0, "isEqual is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqualSingle(publisher0, publisher1, biPredicate0, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable serialize() {
        return RxJavaPlugins.onAssembly(new FlowableSerialized(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable share() {
        return this.publish().refCount();
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single single(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, object0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe singleElement() {
        return RxJavaPlugins.onAssembly(new FlowableSingleMaybe(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single singleOrError() {
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, null));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable skip(long v) {
        return v > 0L ? RxJavaPlugins.onAssembly(new FlowableSkip(this, v)) : RxJavaPlugins.onAssembly(this);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable skip(long v, TimeUnit timeUnit0) {
        return this.skipUntil(Flowable.timer(v, timeUnit0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable skip(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.skipUntil(Flowable.timer(v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable skipLast(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + v);
        }
        return v == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new FlowableSkipLast(this, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable skipLast(long v, TimeUnit timeUnit0) {
        return this.skipLast(v, timeUnit0, Schedulers.computation(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.skipLast(v, timeUnit0, scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        return this.skipLast(v, timeUnit0, scheduler0, z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v1) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v1, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSkipLastTimed(this, v, timeUnit0, scheduler0, v1 << 1, z));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable skipLast(long v, TimeUnit timeUnit0, boolean z) {
        return this.skipLast(v, timeUnit0, Schedulers.computation(), z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable skipUntil(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipUntil(this, publisher0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable skipWhile(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipWhile(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable sorted() {
        return this.toList().toFlowable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable sorted(Comparator comparator0) {
        ObjectHelper.requireNonNull(comparator0, "sortFunction");
        return this.toList().toFlowable().map(Functions.listSorter(comparator0)).flatMapIterable(Functions.identity());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable startWith(Iterable iterable0) {
        return Flowable.concatArray(new Publisher[]{Flowable.fromIterable(iterable0), this});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable startWith(Object object0) {
        ObjectHelper.requireNonNull(object0, "value is null");
        return Flowable.concatArray(new Publisher[]{Flowable.just(object0), this});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable startWith(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return Flowable.concatArray(new Publisher[]{publisher0, this});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable startWithArray(Object[] arr_object) {
        Flowable flowable0 = Flowable.fromArray(arr_object);
        return flowable0 == Flowable.empty() ? RxJavaPlugins.onAssembly(this) : Flowable.concatArray(new Publisher[]{flowable0, this});
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return this.subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, RequestMax.INSTANCE);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0) {
        return this.subscribe(consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, RequestMax.INSTANCE);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1) {
        return this.subscribe(consumer0, consumer1, Functions.EMPTY_ACTION, RequestMax.INSTANCE);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1, Action action0) {
        return this.subscribe(consumer0, consumer1, action0, RequestMax.INSTANCE);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1, Action action0, Consumer consumer2) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.requireNonNull(consumer2, "onSubscribe is null");
        Disposable disposable0 = new LambdaSubscriber(consumer0, consumer1, action0, consumer2);
        this.subscribe(((FlowableSubscriber)disposable0));
        return disposable0;
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void subscribe(FlowableSubscriber flowableSubscriber0) {
        ObjectHelper.requireNonNull(flowableSubscriber0, "s is null");
        try {
            Subscriber subscriber0 = RxJavaPlugins.onSubscribe(this, flowableSubscriber0);
            ObjectHelper.requireNonNull(subscriber0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.subscribeActual(subscriber0);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("Actually not, but can\'t throw other exceptions due to RS");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
    }

    @Override  // org.reactivestreams.Publisher
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void subscribe(Subscriber subscriber0) {
        if(subscriber0 instanceof FlowableSubscriber) {
            this.subscribe(((FlowableSubscriber)subscriber0));
            return;
        }
        ObjectHelper.requireNonNull(subscriber0, "s is null");
        this.subscribe(new StrictSubscriber(subscriber0));
    }

    public abstract void subscribeActual(Subscriber arg1);

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable subscribeOn(@NonNull Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return this.subscribeOn(scheduler0, !(this instanceof FlowableCreate));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable subscribeOn(@NonNull Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSubscribeOn(this, scheduler0, z));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Subscriber subscribeWith(Subscriber subscriber0) {
        this.subscribe(subscriber0);
        return subscriber0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable switchIfEmpty(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchIfEmpty(this, publisher0));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable switchMap(Function function0) {
        return this.switchMap(function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable switchMap(Function function0, int v) {
        return this.b(function0, v, false);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable switchMapCompletable(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function0, false));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable switchMapCompletableDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function0, true));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable switchMapDelayError(Function function0) {
        return this.switchMapDelayError(function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable switchMapDelayError(Function function0, int v) {
        return this.b(function0, v, true);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable switchMapMaybe(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function0, false));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable switchMapMaybeDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function0, true));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable switchMapSingle(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function0, false));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable switchMapSingleDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function0, true));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable switchOnNext(Publisher publisher0) {
        return Flowable.fromPublisher(publisher0).switchMap(Functions.identity());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable switchOnNext(Publisher publisher0, int v) {
        return Flowable.fromPublisher(publisher0).switchMap(Functions.identity(), v);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable switchOnNextDelayError(Publisher publisher0) {
        return Flowable.switchOnNextDelayError(publisher0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable switchOnNextDelayError(Publisher publisher0, int v) {
        return Flowable.fromPublisher(publisher0).switchMapDelayError(Functions.identity(), v);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable take(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "count >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new FlowableTake(this, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable take(long v, TimeUnit timeUnit0) {
        return this.takeUntil(Flowable.timer(v, timeUnit0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable take(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeUntil(Flowable.timer(v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable takeLast(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + v);
        }
        if(v == 0) {
            return RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this));
        }
        return v == 1 ? RxJavaPlugins.onAssembly(new FlowableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new FlowableTakeLast(this, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable takeLast(long v, long v1, TimeUnit timeUnit0) {
        return this.takeLast(v, v1, timeUnit0, Schedulers.computation(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable takeLast(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeLast(v, v1, timeUnit0, scheduler0, false, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable takeLast(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v2) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v2, "bufferSize");
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "count >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new FlowableTakeLastTimed(this, v, v1, timeUnit0, scheduler0, v2, z));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable takeLast(long v, TimeUnit timeUnit0) {
        return this.takeLast(v, timeUnit0, Schedulers.computation(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeLast(v, timeUnit0, scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        return this.takeLast(v, timeUnit0, scheduler0, z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v1) {
        return this.takeLast(0x7FFFFFFFFFFFFFFFL, v, timeUnit0, scheduler0, z, v1);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable takeLast(long v, TimeUnit timeUnit0, boolean z) {
        return this.takeLast(v, timeUnit0, Schedulers.computation(), z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable takeUntil(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntilPredicate(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable takeUntil(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntil(this, publisher0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable takeWhile(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeWhile(this, predicate0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestSubscriber test() {
        TestSubscriber testSubscriber0 = new TestSubscriber();
        this.subscribe(testSubscriber0);
        return testSubscriber0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestSubscriber test(long v) {
        TestSubscriber testSubscriber0 = new TestSubscriber(v);
        this.subscribe(testSubscriber0);
        return testSubscriber0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestSubscriber test(long v, boolean z) {
        TestSubscriber testSubscriber0 = new TestSubscriber(v);
        if(z) {
            testSubscriber0.cancel();
        }
        this.subscribe(testSubscriber0);
        return testSubscriber0;
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable throttleFirst(long v, TimeUnit timeUnit0) {
        return this.throttleFirst(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable throttleFirst(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleFirstTimed(this, v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable throttleLast(long v, TimeUnit timeUnit0) {
        return this.sample(v, timeUnit0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable throttleLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.sample(v, timeUnit0, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable throttleLatest(long v, TimeUnit timeUnit0) {
        return this.throttleLatest(v, timeUnit0, Schedulers.computation(), false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable throttleLatest(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.throttleLatest(v, timeUnit0, scheduler0, false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable throttleLatest(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleLatest(this, v, timeUnit0, scheduler0, z));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable throttleLatest(long v, TimeUnit timeUnit0, boolean z) {
        return this.throttleLatest(v, timeUnit0, Schedulers.computation(), z);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable throttleWithTimeout(long v, TimeUnit timeUnit0) {
        return this.debounce(v, timeUnit0);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable throttleWithTimeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.debounce(v, timeUnit0, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timeInterval() {
        return this.timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timeInterval(Scheduler scheduler0) {
        return this.timeInterval(TimeUnit.MILLISECONDS, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timeInterval(TimeUnit timeUnit0) {
        return this.timeInterval(timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timeInterval(TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeInterval(this, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable timeout(long v, TimeUnit timeUnit0) {
        return this.c(v, timeUnit0, Schedulers.computation(), null);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.c(v, timeUnit0, scheduler0, null);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0, Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return this.c(v, timeUnit0, scheduler0, publisher0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable timeout(long v, TimeUnit timeUnit0, Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return this.c(v, timeUnit0, Schedulers.computation(), publisher0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timeout(Function function0) {
        return this.d(null, function0, null);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable timeout(Function function0, Flowable flowable0) {
        ObjectHelper.requireNonNull(flowable0, "other is null");
        return this.d(null, function0, flowable0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable timeout(Publisher publisher0, Function function0) {
        ObjectHelper.requireNonNull(publisher0, "firstTimeoutIndicator is null");
        return this.d(publisher0, function0, null);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable timeout(Publisher publisher0, Function function0, Publisher publisher1) {
        ObjectHelper.requireNonNull(publisher0, "firstTimeoutSelector is null");
        ObjectHelper.requireNonNull(publisher1, "other is null");
        return this.d(publisher0, function0, publisher1);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable timer(long v, TimeUnit timeUnit0) {
        return Flowable.timer(v, timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Flowable timer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimer(Math.max(0L, v), timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timestamp() {
        return this.timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timestamp(Scheduler scheduler0) {
        return this.timestamp(TimeUnit.MILLISECONDS, scheduler0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable timestamp(TimeUnit timeUnit0) {
        return this.timestamp(timeUnit0, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable timestamp(TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return this.map(Functions.timestampWith(timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object to(Function function0) {
        try {
            return ((Function)ObjectHelper.requireNonNull(function0, "converter is null")).apply(this);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Future toFuture() {
        return (Future)this.subscribeWith(new FutureSubscriber());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList() {
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList(int v) {
        ObjectHelper.verifyPositive(v, "capacityHint");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, Functions.createArrayList(v)));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, callable0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toMap(Function function0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        return this.collect(HashMapSupplier.asCallable(), Functions.toMapKeySelector(function0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toMap(Function function0, Function function1) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        return this.collect(HashMapSupplier.asCallable(), Functions.toMapKeyValueSelector(function0, function1));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toMap(Function function0, Function function1, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        return this.collect(callable0, Functions.toMapKeyValueSelector(function0, function1));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0) {
        return this.toMultimap(function0, Functions.identity(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1) {
        return this.toMultimap(function0, function1, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1, Callable callable0) {
        return this.toMultimap(function0, function1, callable0, ArrayListSupplier.asFunction());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1, Callable callable0, Function function2) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.requireNonNull(callable0, "mapSupplier is null");
        ObjectHelper.requireNonNull(function2, "collectionFactory is null");
        return this.collect(callable0, Functions.toMultimapKeyValueSelector(function0, function1, function2));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable toObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(this));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList() {
        return this.toSortedList(Functions.naturalComparator());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList(int v) {
        return this.toSortedList(Functions.naturalComparator(), v);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toSortedList(Comparator comparator0) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        return this.toList().map(Functions.listSorter(comparator0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toSortedList(Comparator comparator0, int v) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        return this.toList(v).map(Functions.listSorter(comparator0));
    }

    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable unsafeCreate(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "onSubscribe is null");
        if(publisher0 instanceof Flowable) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(publisher0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable unsubscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableUnsubscribeOn(this, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable using(Callable callable0, Function function0, Consumer consumer0) {
        return Flowable.using(callable0, function0, consumer0, true);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable using(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        ObjectHelper.requireNonNull(callable0, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function0, "sourceSupplier is null");
        ObjectHelper.requireNonNull(consumer0, "resourceDisposer is null");
        return RxJavaPlugins.onAssembly(new FlowableUsing(callable0, function0, consumer0, z));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(long v) {
        return this.window(v, v, 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(long v, long v1) {
        return this.window(v, v1, 0x80);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(long v, long v1, int v2) {
        ObjectHelper.verifyPositive(v1, "skip");
        ObjectHelper.verifyPositive(v, "count");
        ObjectHelper.verifyPositive(v2, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindow(this, v, v1, v2));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable window(long v, long v1, TimeUnit timeUnit0) {
        return this.window(v, v1, timeUnit0, Schedulers.computation(), 0x80);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable window(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.window(v, v1, timeUnit0, scheduler0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable window(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2) {
        ObjectHelper.verifyPositive(v2, "bufferSize");
        ObjectHelper.verifyPositive(v, "timespan");
        ObjectHelper.verifyPositive(v1, "timeskip");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, v, v1, timeUnit0, scheduler0, 0x7FFFFFFFFFFFFFFFL, v2, false));
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable window(long v, TimeUnit timeUnit0) {
        return this.window(v, timeUnit0, Schedulers.computation(), 0x7FFFFFFFFFFFFFFFL, false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable window(long v, TimeUnit timeUnit0, long v1) {
        return this.window(v, timeUnit0, Schedulers.computation(), v1, false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable window(long v, TimeUnit timeUnit0, long v1, boolean z) {
        return this.window(v, timeUnit0, Schedulers.computation(), v1, z);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable window(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.window(v, timeUnit0, scheduler0, 0x7FFFFFFFFFFFFFFFL, false);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1) {
        return this.window(v, timeUnit0, scheduler0, v1, false);
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Flowable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1, boolean z) {
        return this.window(v, timeUnit0, scheduler0, v1, z, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Flowable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1, boolean z, int v2) {
        ObjectHelper.verifyPositive(v2, "bufferSize");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.verifyPositive(v1, "count");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, v, v, timeUnit0, scheduler0, v1, v2, z));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(Callable callable0) {
        return this.window(callable0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable window(Callable callable0, int v) {
        ObjectHelper.requireNonNull(callable0, "boundaryIndicatorSupplier is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundarySupplier(this, callable0, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(Publisher publisher0) {
        return this.window(publisher0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable window(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "boundaryIndicator is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundary(this, publisher0, v));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable window(Publisher publisher0, Function function0) {
        return this.window(publisher0, function0, 0x80);
    }

    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable window(Publisher publisher0, Function function0, int v) {
        ObjectHelper.requireNonNull(publisher0, "openingIndicator is null");
        ObjectHelper.requireNonNull(function0, "closingIndicator is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundarySelector(this, publisher0, function0, v));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(iterable0, "others is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, iterable0, function0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Publisher publisher0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        ObjectHelper.requireNonNull(biFunction0, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFrom(this, biFunction0, publisher0));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Publisher publisher0, Publisher publisher1, Function3 function30) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        Function function0 = Functions.toFunction(function30);
        return this.withLatestFrom(new Publisher[]{publisher0, publisher1}, function0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Publisher publisher0, Publisher publisher1, Publisher publisher2, Function4 function40) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        Function function0 = Functions.toFunction(function40);
        return this.withLatestFrom(new Publisher[]{publisher0, publisher1, publisher2}, function0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Function5 function50) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        Function function0 = Functions.toFunction(function50);
        return this.withLatestFrom(new Publisher[]{publisher0, publisher1, publisher2, publisher3}, function0);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable withLatestFrom(Publisher[] arr_publisher, Function function0) {
        ObjectHelper.requireNonNull(arr_publisher, "others is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, arr_publisher, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable0, function0, 0x80, false));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        return Flowable.fromPublisher(publisher0).toList().flatMapPublisher(FlowableInternalHelper.zipIterable(function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.zipArray(Functions.toFunction(biFunction0), false, 0x80, new Publisher[]{publisher0, publisher1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, BiFunction biFunction0, boolean z) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.zipArray(Functions.toFunction(biFunction0), z, 0x80, new Publisher[]{publisher0, publisher1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, BiFunction biFunction0, boolean z, int v) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        return Flowable.zipArray(Functions.toFunction(biFunction0), z, v, new Publisher[]{publisher0, publisher1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Function3 function30) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        return Flowable.zipArray(Functions.toFunction(function30), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Function4 function40) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        return Flowable.zipArray(Functions.toFunction(function40), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Function5 function50) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        return Flowable.zipArray(Functions.toFunction(function50), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Function6 function60) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        return Flowable.zipArray(Functions.toFunction(function60), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Function7 function70) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        return Flowable.zipArray(Functions.toFunction(function70), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Publisher publisher7, Function8 function80) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        ObjectHelper.requireNonNull(publisher7, "source8 is null");
        return Flowable.zipArray(Functions.toFunction(function80), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zip(Publisher publisher0, Publisher publisher1, Publisher publisher2, Publisher publisher3, Publisher publisher4, Publisher publisher5, Publisher publisher6, Publisher publisher7, Publisher publisher8, Function9 function90) {
        ObjectHelper.requireNonNull(publisher0, "source1 is null");
        ObjectHelper.requireNonNull(publisher1, "source2 is null");
        ObjectHelper.requireNonNull(publisher2, "source3 is null");
        ObjectHelper.requireNonNull(publisher3, "source4 is null");
        ObjectHelper.requireNonNull(publisher4, "source5 is null");
        ObjectHelper.requireNonNull(publisher5, "source6 is null");
        ObjectHelper.requireNonNull(publisher6, "source7 is null");
        ObjectHelper.requireNonNull(publisher7, "source8 is null");
        ObjectHelper.requireNonNull(publisher8, "source9 is null");
        return Flowable.zipArray(Functions.toFunction(function90), false, 0x80, new Publisher[]{publisher0, publisher1, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zipArray(Function function0, boolean z, int v, Publisher[] arr_publisher) {
        if(arr_publisher.length == 0) {
            return Flowable.empty();
        }
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(arr_publisher, null, function0, v, z));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable zipIterable(Iterable iterable0, Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable0, function0, v, z));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable zipWith(Iterable iterable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(iterable0, "other is null");
        ObjectHelper.requireNonNull(biFunction0, "zipper is null");
        return RxJavaPlugins.onAssembly(new FlowableZipIterable(this, iterable0, biFunction0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable zipWith(Publisher publisher0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return Flowable.zip(this, publisher0, biFunction0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable zipWith(Publisher publisher0, BiFunction biFunction0, boolean z) {
        return Flowable.zip(this, publisher0, biFunction0, z);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable zipWith(Publisher publisher0, BiFunction biFunction0, boolean z, int v) {
        return Flowable.zip(this, publisher0, biFunction0, z, v);
    }
}

