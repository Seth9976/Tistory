package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
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
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.observers.BlockingFirstObserver;
import io.reactivex.internal.observers.BlockingLastObserver;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.FutureObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.internal.operators.observable.BlockingObservableMostRecent;
import io.reactivex.internal.operators.observable.BlockingObservableNext;
import io.reactivex.internal.operators.observable.ObservableAllSingle;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableAnySingle;
import io.reactivex.internal.operators.observable.ObservableBlockingSubscribe;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableBufferExactBoundary;
import io.reactivex.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCountSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounce;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.internal.operators.observable.ObservableDelay;
import io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.internal.operators.observable.ObservableDematerialize;
import io.reactivex.internal.operators.observable.ObservableDetach;
import io.reactivex.internal.operators.observable.ObservableDistinct;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableDoAfterNext;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableError;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.internal.operators.observable.ObservableFromArray;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import io.reactivex.internal.operators.observable.ObservableFromFuture;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.internal.operators.observable.ObservableGenerate;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableHide;
import io.reactivex.internal.operators.observable.ObservableIgnoreElements;
import io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableLastMaybe;
import io.reactivex.internal.operators.observable.ObservableLastSingle;
import io.reactivex.internal.operators.observable.ObservableLift;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableMapNotification;
import io.reactivex.internal.operators.observable.ObservableMaterialize;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableNever;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableReduceMaybe;
import io.reactivex.internal.operators.observable.ObservableReduceSeedSingle;
import io.reactivex.internal.operators.observable.ObservableReduceWithSingle;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableScan;
import io.reactivex.internal.operators.observable.ObservableScanSeed;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSerialized;
import io.reactivex.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.observable.ObservableSkip;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTake;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastOne;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeInterval;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableToList;
import io.reactivex.internal.operators.observable.ObservableToListSingle;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.observable.ObservableZipIterable;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.observers.SafeObserver;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.text.q;
import org.reactivestreams.Publisher;
import xc.a;

public abstract class Observable implements ObservableSource {
    public final Observable a(Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.requireNonNull(action1, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnEach(this, consumer0, consumer1, action0, action1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single all(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAllSingle(this, predicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable amb(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableAmb(null, iterable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable ambArray(ObservableSource[] arr_observableSource) {
        ObjectHelper.requireNonNull(arr_observableSource, "sources is null");
        if(arr_observableSource.length == 0) {
            return Observable.empty();
        }
        return arr_observableSource.length == 1 ? Observable.wrap(arr_observableSource[0]) : RxJavaPlugins.onAssembly(new ObservableAmb(arr_observableSource, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable ambWith(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return Observable.ambArray(new ObservableSource[]{this, observableSource0});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single any(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAnySingle(this, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object as(@NonNull ObservableConverter observableConverter0) {
        return ((ObservableConverter)ObjectHelper.requireNonNull(observableConverter0, "converter is null")).apply(this);
    }

    public final Observable b(long v, TimeUnit timeUnit0, Scheduler scheduler0, ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(timeUnit0, "timeUnit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeoutTimed(this, v, timeUnit0, scheduler0, observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingFirst() {
        BlockingFirstObserver blockingFirstObserver0 = new BlockingFirstObserver();
        this.subscribe(blockingFirstObserver0);
        Object object0 = blockingFirstObserver0.blockingGet();
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        return object0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingFirst(Object object0) {
        BlockingFirstObserver blockingFirstObserver0 = new BlockingFirstObserver();
        this.subscribe(blockingFirstObserver0);
        Object object1 = blockingFirstObserver0.blockingGet();
        return object1 == null ? object0 : object1;
    }

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
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingIterable() {
        return this.blockingIterable(0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingIterable(int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return new BlockingObservableIterable(this, v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingLast() {
        BlockingLastObserver blockingLastObserver0 = new BlockingLastObserver();
        this.subscribe(blockingLastObserver0);
        Object object0 = blockingLastObserver0.blockingGet();
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        return object0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingLast(Object object0) {
        BlockingLastObserver blockingLastObserver0 = new BlockingLastObserver();
        this.subscribe(blockingLastObserver0);
        Object object1 = blockingLastObserver0.blockingGet();
        return object1 == null ? object0 : object1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingLatest() {
        return new BlockingObservableLatest(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingMostRecent(Object object0) {
        return new BlockingObservableMostRecent(this, object0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable blockingNext() {
        return new BlockingObservableNext(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingSingle() {
        Object object0 = this.singleElement().blockingGet();
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        return object0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingSingle(Object object0) {
        return this.single(object0).blockingGet();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        ObservableBlockingSubscribe.subscribe(this);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Observer observer0) {
        ObservableBlockingSubscribe.subscribe(this, observer0);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0) {
        ObservableBlockingSubscribe.subscribe(this, consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1) {
        ObservableBlockingSubscribe.subscribe(this, consumer0, consumer1, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer consumer0, Consumer consumer1, Action action0) {
        ObservableBlockingSubscribe.subscribe(this, consumer0, consumer1, action0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(int v) {
        return this.buffer(v, v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(int v, int v1) {
        return this.buffer(v, v1, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(int v, int v1, Callable callable0) {
        ObjectHelper.verifyPositive(v, "count");
        ObjectHelper.verifyPositive(v1, "skip");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBuffer(this, v, v1, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(int v, Callable callable0) {
        return this.buffer(v, v, callable0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable buffer(long v, long v1, TimeUnit timeUnit0) {
        return this.buffer(v, v1, timeUnit0, Schedulers.computation(), ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable buffer(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.buffer(v, v1, timeUnit0, scheduler0, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable buffer(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, Callable callable0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, v, v1, timeUnit0, scheduler0, callable0, 0x7FFFFFFF, false));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable buffer(long v, TimeUnit timeUnit0) {
        return this.buffer(v, timeUnit0, Schedulers.computation(), 0x7FFFFFFF);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable buffer(long v, TimeUnit timeUnit0, int v1) {
        return this.buffer(v, timeUnit0, Schedulers.computation(), v1);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.buffer(v, timeUnit0, scheduler0, 0x7FFFFFFF, ArrayListSupplier.asCallable(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return this.buffer(v, timeUnit0, scheduler0, v1, ArrayListSupplier.asCallable(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable buffer(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, Callable callable0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        ObjectHelper.verifyPositive(v1, "count");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, v, v, timeUnit0, scheduler0, callable0, v1, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(ObservableSource observableSource0) {
        return this.buffer(observableSource0, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(ObservableSource observableSource0, int v) {
        ObjectHelper.verifyPositive(v, "initialCapacity");
        return this.buffer(observableSource0, Functions.createArrayList(v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(ObservableSource observableSource0, Function function0) {
        return this.buffer(observableSource0, function0, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(ObservableSource observableSource0, Function function0, Callable callable0) {
        ObjectHelper.requireNonNull(observableSource0, "openingIndicator is null");
        ObjectHelper.requireNonNull(function0, "closingIndicator is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundary(this, observableSource0, function0, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(ObservableSource observableSource0, Callable callable0) {
        ObjectHelper.requireNonNull(observableSource0, "boundary is null");
        ObjectHelper.requireNonNull(callable0, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferExactBoundary(this, observableSource0, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(Callable callable0) {
        return this.buffer(callable0, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable buffer(Callable callable0, Callable callable1) {
        ObjectHelper.requireNonNull(callable0, "boundarySupplier is null");
        ObjectHelper.requireNonNull(callable1, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundarySupplier(this, callable0, callable1));
    }

    // 去混淆评级： 低(20)
    public static int bufferSize() [...] // 潜在的解密器

    public final Observable c(ObservableSource observableSource0, Function function0, ObservableSource observableSource1) {
        ObjectHelper.requireNonNull(function0, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeout(this, observableSource0, function0, observableSource1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable cache() {
        return this.cacheWithInitialCapacity(16);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable cacheWithInitialCapacity(int v) {
        ObjectHelper.verifyPositive(v, "initialCapacity");
        return RxJavaPlugins.onAssembly(new ObservableCache(this, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable cast(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.map(Functions.castFunction(class0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single collect(Callable callable0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(callable0, "initialValueSupplier is null");
        ObjectHelper.requireNonNull(biConsumer0, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectSingle(this, callable0, biConsumer0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single collectInto(Object object0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(object0, "initialValue is null");
        return this.collect(Functions.justCallable(object0), biConsumer0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, Function9 function90) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        ObjectHelper.requireNonNull(observableSource7, "source8 is null");
        ObjectHelper.requireNonNull(observableSource8, "source9 is null");
        return Observable.combineLatest(Functions.toFunction(function90), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, Function8 function80) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        ObjectHelper.requireNonNull(observableSource7, "source8 is null");
        return Observable.combineLatest(Functions.toFunction(function80), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, Function7 function70) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        return Observable.combineLatest(Functions.toFunction(function70), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, Function6 function60) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        return Observable.combineLatest(Functions.toFunction(function60), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, Function5 function50) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        return Observable.combineLatest(Functions.toFunction(function50), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, Function4 function40) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        return Observable.combineLatest(Functions.toFunction(function40), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, Function3 function30) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        return Observable.combineLatest(Functions.toFunction(function30), 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource observableSource0, ObservableSource observableSource1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.combineLatest(Functions.toFunction(biFunction0), 0x80, new ObservableSource[]{observableSource0, observableSource1});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatest(Function function0, int v, ObservableSource[] arr_observableSource) {
        return Observable.combineLatest(arr_observableSource, function0, v);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatest(Iterable iterable0, Function function0) {
        return Observable.combineLatest(iterable0, function0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(Iterable iterable0, Function function0, int v) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable0, function0, v << 1, false));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource[] arr_observableSource, Function function0) {
        return Observable.combineLatest(arr_observableSource, function0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatest(ObservableSource[] arr_observableSource, Function function0, int v) {
        ObjectHelper.requireNonNull(arr_observableSource, "sources is null");
        if(arr_observableSource.length == 0) {
            return Observable.empty();
        }
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(arr_observableSource, null, function0, v << 1, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatestDelayError(Function function0, int v, ObservableSource[] arr_observableSource) {
        return Observable.combineLatestDelayError(arr_observableSource, function0, v);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatestDelayError(Iterable iterable0, Function function0) {
        return Observable.combineLatestDelayError(iterable0, function0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatestDelayError(Iterable iterable0, Function function0, int v) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable0, function0, v << 1, true));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable combineLatestDelayError(ObservableSource[] arr_observableSource, Function function0) {
        return Observable.combineLatestDelayError(arr_observableSource, function0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable combineLatestDelayError(ObservableSource[] arr_observableSource, Function function0, int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        return arr_observableSource.length == 0 ? Observable.empty() : RxJavaPlugins.onAssembly(new ObservableCombineLatest(arr_observableSource, null, function0, v << 1, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable compose(ObservableTransformer observableTransformer0) {
        return Observable.wrap(((ObservableTransformer)ObjectHelper.requireNonNull(observableTransformer0, "composer is null")).apply(this));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0) {
        return Observable.concat(observableSource0, 0x80);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource0, Functions.identity(), v, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0, ObservableSource observableSource1) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.concatArray(new ObservableSource[]{observableSource0, observableSource1});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        return Observable.concatArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        return Observable.concatArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return Observable.fromIterable(iterable0).concatMapDelayError(Functions.identity(), 0x80, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArray(ObservableSource[] arr_observableSource) {
        switch(arr_observableSource.length) {
            case 0: {
                return Observable.empty();
            }
            case 1: {
                return Observable.wrap(arr_observableSource[0]);
            }
            default: {
                return RxJavaPlugins.onAssembly(new ObservableConcatMap(Observable.fromArray(arr_observableSource), Functions.identity(), 0x80, ErrorMode.BOUNDARY));
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArrayDelayError(ObservableSource[] arr_observableSource) {
        switch(arr_observableSource.length) {
            case 0: {
                return Observable.empty();
            }
            case 1: {
                return Observable.wrap(arr_observableSource[0]);
            }
            default: {
                return Observable.concatDelayError(Observable.fromArray(arr_observableSource));
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArrayEager(int v, int v1, ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).concatMapEagerDelayError(Functions.identity(), v, v1, false);
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArrayEager(ObservableSource[] arr_observableSource) {
        return Observable.concatArrayEager(0x80, 0x80, arr_observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArrayEagerDelayError(int v, int v1, ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).concatMapEagerDelayError(Functions.identity(), v, v1, true);
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatArrayEagerDelayError(ObservableSource[] arr_observableSource) {
        return Observable.concatArrayEagerDelayError(0x80, 0x80, arr_observableSource);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatDelayError(ObservableSource observableSource0) {
        return Observable.concatDelayError(observableSource0, 0x80, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concatDelayError(ObservableSource observableSource0, int v, boolean z) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch is null");
        Function function0 = Functions.identity();
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource0, function0, v, ErrorMode.END)) : RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource0, function0, v, ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concatDelayError(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return Observable.concatDelayError(Observable.fromIterable(iterable0));
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatEager(ObservableSource observableSource0) {
        return Observable.concatEager(observableSource0, 0x80, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatEager(ObservableSource observableSource0, int v, int v1) {
        return Observable.wrap(observableSource0).concatMapEager(Functions.identity(), v, v1);
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatEager(Iterable iterable0) {
        return Observable.concatEager(iterable0, 0x80, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable concatEager(Iterable iterable0, int v, int v1) {
        return Observable.fromIterable(iterable0).concatMapEagerDelayError(Functions.identity(), v, v1, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMap(Function function0) {
        return this.concatMap(function0, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMap(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Observable.empty() : ObservableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function0, v, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function function0) {
        return this.concatMapCompletable(function0, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0) {
        return this.concatMapCompletableDelayError(function0, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0, boolean z) {
        return this.concatMapCompletableDelayError(function0, z, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function0, ErrorMode.BOUNDARY, v));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapDelayError(Function function0) {
        return this.concatMapDelayError(function0, 0x80, true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapDelayError(Function function0, int v, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Observable.empty() : ObservableScalarXMap.scalarXMap(object0, function0);
        }
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function0, v, ErrorMode.END)) : RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function0, v, ErrorMode.BOUNDARY));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapEager(Function function0) {
        return this.concatMapEager(function0, 0x7FFFFFFF, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapEager(Function function0, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function0, ErrorMode.IMMEDIATE, v, v1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapEagerDelayError(Function function0, int v, int v1, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function0, ErrorMode.END, v, v1)) : RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function0, ErrorMode.BOUNDARY, v, v1));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapEagerDelayError(Function function0, boolean z) {
        return this.concatMapEagerDelayError(function0, 0x7FFFFFFF, 0x80, z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapIterable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapIterable(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return this.concatMap(ObservableInternalHelper.flatMapIntoIterable(function0), v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapMaybe(Function function0) {
        return this.concatMapMaybe(function0, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapMaybe(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapMaybeDelayError(Function function0) {
        return this.concatMapMaybeDelayError(function0, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapMaybeDelayError(Function function0, boolean z) {
        return this.concatMapMaybeDelayError(function0, z, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapMaybeDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function0, ErrorMode.BOUNDARY, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapSingle(Function function0) {
        return this.concatMapSingle(function0, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapSingle(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function0, ErrorMode.IMMEDIATE, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapSingleDelayError(Function function0) {
        return this.concatMapSingleDelayError(function0, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapSingleDelayError(Function function0, boolean z) {
        return this.concatMapSingleDelayError(function0, z, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatMapSingleDelayError(Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return z ? RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function0, ErrorMode.END, v)) : RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function0, ErrorMode.BOUNDARY, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatWith(@NonNull CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithCompletable(this, completableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatWith(@NonNull MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithMaybe(this, maybeSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatWith(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return Observable.concat(this, observableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable concatWith(@NonNull SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithSingle(this, singleSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single contains(Object object0) {
        ObjectHelper.requireNonNull(object0, "element is null");
        return this.any(Functions.equalsWith(object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single count() {
        return RxJavaPlugins.onAssembly(new ObservableCountSingle(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable create(ObservableOnSubscribe observableOnSubscribe0) {
        ObjectHelper.requireNonNull(observableOnSubscribe0, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableCreate(observableOnSubscribe0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable debounce(long v, TimeUnit timeUnit0) {
        return this.debounce(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable debounce(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounceTimed(this, v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable debounce(Function function0) {
        ObjectHelper.requireNonNull(function0, "debounceSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounce(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable defaultIfEmpty(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return this.switchIfEmpty(Observable.just(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable defer(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDefer(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable delay(long v, TimeUnit timeUnit0) {
        return this.delay(v, timeUnit0, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delay(v, timeUnit0, scheduler0, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDelay(this, v, timeUnit0, scheduler0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable delay(long v, TimeUnit timeUnit0, boolean z) {
        return this.delay(v, timeUnit0, Schedulers.computation(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable delay(ObservableSource observableSource0, Function function0) {
        return this.delaySubscription(observableSource0).delay(function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable delay(Function function0) {
        ObjectHelper.requireNonNull(function0, "itemDelay is null");
        return this.flatMap(ObservableInternalHelper.itemDelay(function0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable delaySubscription(long v, TimeUnit timeUnit0) {
        return this.delaySubscription(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable delaySubscription(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delaySubscription(Observable.timer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable delaySubscription(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableDelaySubscriptionOther(this, observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @Deprecated
    public final Observable dematerialize() {
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, Functions.identity()));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final Observable dematerialize(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinct() {
        return this.distinct(Functions.identity(), Functions.createHashSet());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinct(Function function0) {
        return this.distinct(function0, Functions.createHashSet());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinct(Function function0, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(callable0, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinct(this, function0, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinctUntilChanged() {
        return this.distinctUntilChanged(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinctUntilChanged(BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(biPredicate0, "comparer is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, Functions.identity(), biPredicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable distinctUntilChanged(Function function0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, function0, ObjectHelper.equalsPredicate()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doAfterNext(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new ObservableDoAfterNext(this, consumer0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doAfterTerminate(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doFinally(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return RxJavaPlugins.onAssembly(new ObservableDoFinally(this, action0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnComplete(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), action0, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnDispose(Action action0) {
        return this.doOnLifecycle(Functions.emptyConsumer(), action0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnEach(Observer observer0) {
        ObjectHelper.requireNonNull(observer0, "observer is null");
        return this.a(ObservableInternalHelper.observerOnNext(observer0), ObservableInternalHelper.observerOnError(observer0), ObservableInternalHelper.observerOnComplete(observer0), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnEach(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onNotification is null");
        return this.a(Functions.notificationOnNext(consumer0), Functions.notificationOnError(consumer0), Functions.notificationOnComplete(consumer0), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnError(Consumer consumer0) {
        return this.a(Functions.emptyConsumer(), consumer0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnLifecycle(Consumer consumer0, Action action0) {
        ObjectHelper.requireNonNull(consumer0, "onSubscribe is null");
        ObjectHelper.requireNonNull(action0, "onDispose is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnLifecycle(this, consumer0, action0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnNext(Consumer consumer0) {
        return this.a(consumer0, Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnSubscribe(Consumer consumer0) {
        return this.doOnLifecycle(consumer0, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable doOnTerminate(Action action0) {
        ObjectHelper.requireNonNull(action0, "onTerminate is null");
        return this.a(Functions.emptyConsumer(), Functions.actionConsumer(action0), action0, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe elementAt(long v) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new ObservableElementAtMaybe(this, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single elementAt(long v, Object object0) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, v, object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single elementAtOrError(long v) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "index >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, v, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable empty() {
        return RxJavaPlugins.onAssembly(ObservableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable error(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "exception is null");
        return Observable.error(Functions.justCallable(throwable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable error(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableError(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable filter(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableFilter(this, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single first(Object object0) {
        return this.elementAt(0L, object0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe firstElement() {
        return this.elementAt(0L);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single firstOrError() {
        return this.elementAtOrError(0L);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0) {
        return this.flatMap(function0, false);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, int v) {
        return this.flatMap(function0, false, v, 0x80);
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, BiFunction biFunction0) {
        return this.flatMap(function0, biFunction0, false, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, BiFunction biFunction0, int v) {
        return this.flatMap(function0, biFunction0, false, v, 0x80);
    }

    // 去混淆评级： 低(40)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, BiFunction biFunction0, boolean z) {
        return this.flatMap(function0, biFunction0, z, 0x80, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, BiFunction biFunction0, boolean z, int v) {
        return this.flatMap(function0, biFunction0, z, v, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, BiFunction biFunction0, boolean z, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "combiner is null");
        return this.flatMap(ObservableInternalHelper.flatMapWithCombiner(function0, biFunction0), z, v, v1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, Function function1, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "onNextMapper is null");
        ObjectHelper.requireNonNull(function1, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable0, "onCompleteSupplier is null");
        return Observable.merge(new ObservableMapNotification(this, function0, function1, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, Function function1, Callable callable0, int v) {
        ObjectHelper.requireNonNull(function0, "onNextMapper is null");
        ObjectHelper.requireNonNull(function1, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable0, "onCompleteSupplier is null");
        return Observable.merge(new ObservableMapNotification(this, function0, function1, callable0), v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, boolean z) {
        return this.flatMap(function0, z, 0x7FFFFFFF);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, boolean z, int v) {
        return this.flatMap(function0, z, v, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMap(Function function0, boolean z, int v, int v1) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        ObjectHelper.verifyPositive(v1, "bufferSize");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Observable.empty() : ObservableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(this, function0, z, v, v1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0) {
        return this.flatMapCompletable(function0, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletableCompletable(this, function0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapIterable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapIterable(Function function0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return this.flatMap(ObservableInternalHelper.flatMapIntoIterable(function0), biFunction0, false, 0x80, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapMaybe(Function function0) {
        return this.flatMapMaybe(function0, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapMaybe(Function function0, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapMaybe(this, function0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapSingle(Function function0) {
        return this.flatMapSingle(function0, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable flatMapSingle(Function function0, boolean z) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapSingle(this, function0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEach(Consumer consumer0) {
        return this.subscribe(consumer0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0) {
        return this.forEachWhile(predicate0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0, Consumer consumer0) {
        return this.forEachWhile(predicate0, consumer0, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate predicate0, Consumer consumer0, Action action0) {
        ObjectHelper.requireNonNull(predicate0, "onNext is null");
        ObjectHelper.requireNonNull(consumer0, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        Disposable disposable0 = new ForEachWhileObserver(predicate0, consumer0, action0);
        this.subscribe(((Observer)disposable0));
        return disposable0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromArray(Object[] arr_object) {
        ObjectHelper.requireNonNull(arr_object, "items is null");
        if(arr_object.length == 0) {
            return Observable.empty();
        }
        return arr_object.length == 1 ? Observable.just(arr_object[0]) : RxJavaPlugins.onAssembly(new ObservableFromArray(arr_object));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromCallable(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCallable(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromFuture(Future future0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future0, 0L, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromFuture(Future future0, long v, TimeUnit timeUnit0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future0, v, timeUnit0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable fromFuture(Future future0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return Observable.fromFuture(future0, v, timeUnit0).subscribeOn(scheduler0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable fromFuture(Future future0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return Observable.fromFuture(future0).subscribeOn(scheduler0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromIterable(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableFromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable fromPublisher(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "publisher is null");
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(publisher0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable generate(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "generator is null");
        return Observable.generate(Functions.nullSupplier(), ObservableInternalHelper.simpleGenerator(consumer0), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable generate(Callable callable0, BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "generator is null");
        return Observable.generate(callable0, ObservableInternalHelper.simpleBiGenerator(biConsumer0), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable generate(Callable callable0, BiConsumer biConsumer0, Consumer consumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "generator is null");
        return Observable.generate(callable0, ObservableInternalHelper.simpleBiGenerator(biConsumer0), consumer0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable generate(Callable callable0, BiFunction biFunction0) {
        return Observable.generate(callable0, biFunction0, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable generate(Callable callable0, BiFunction biFunction0, Consumer consumer0) {
        ObjectHelper.requireNonNull(callable0, "initialState is null");
        ObjectHelper.requireNonNull(biFunction0, "generator is null");
        ObjectHelper.requireNonNull(consumer0, "disposeState is null");
        return RxJavaPlugins.onAssembly(new ObservableGenerate(callable0, biFunction0, consumer0));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupBy(Function function0) {
        return this.groupBy(function0, Functions.identity(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupBy(Function function0, Function function1) {
        return this.groupBy(function0, function1, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupBy(Function function0, Function function1, boolean z) {
        return this.groupBy(function0, function1, z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupBy(Function function0, Function function1, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableGroupBy(this, function0, function1, v, z));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupBy(Function function0, boolean z) {
        return this.groupBy(function0, Functions.identity(), z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable groupJoin(ObservableSource observableSource0, Function function0, Function function1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        ObjectHelper.requireNonNull(function0, "leftEnd is null");
        ObjectHelper.requireNonNull(function1, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableGroupJoin(this, observableSource0, function0, function1, biFunction0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable hide() {
        return RxJavaPlugins.onAssembly(new ObservableHide(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElementsCompletable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable interval(long v, long v1, TimeUnit timeUnit0) {
        return Observable.interval(v, v1, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable interval(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableInterval(Math.max(0L, v), Math.max(0L, v1), timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable interval(long v, TimeUnit timeUnit0) {
        return Observable.interval(v, v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable interval(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return Observable.interval(v, v, timeUnit0, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable intervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0) {
        return Observable.intervalRange(v, v1, v2, v3, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable intervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0, Scheduler scheduler0) {
        int v4 = Long.compare(v1, 0L);
        if(v4 < 0) {
            throw new IllegalArgumentException(q.n(v1, "count >= 0 required but it was "));
        }
        if(v4 == 0) {
            return Observable.empty().delay(v2, timeUnit0, scheduler0);
        }
        long v5 = v1 - 1L + v;
        if(v > 0L && v5 < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableIntervalRange(v, v5, Math.max(0L, v2), Math.max(0L, v3), timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single isEmpty() {
        return this.all(Functions.alwaysFalse());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable join(ObservableSource observableSource0, Function function0, Function function1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        ObjectHelper.requireNonNull(function0, "leftEnd is null");
        ObjectHelper.requireNonNull(function1, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableJoin(this, observableSource0, function0, function1, biFunction0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return RxJavaPlugins.onAssembly(new ObservableJust(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        return Observable.fromArray(new Object[]{object0, object1});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        ObjectHelper.requireNonNull(object7, "item8 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        ObjectHelper.requireNonNull(object0, "item1 is null");
        ObjectHelper.requireNonNull(object1, "item2 is null");
        ObjectHelper.requireNonNull(object2, "item3 is null");
        ObjectHelper.requireNonNull(object3, "item4 is null");
        ObjectHelper.requireNonNull(object4, "item5 is null");
        ObjectHelper.requireNonNull(object5, "item6 is null");
        ObjectHelper.requireNonNull(object6, "item7 is null");
        ObjectHelper.requireNonNull(object7, "item8 is null");
        ObjectHelper.requireNonNull(object8, "item9 is null");
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable just(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
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
        return Observable.fromArray(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single last(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe lastElement() {
        return RxJavaPlugins.onAssembly(new ObservableLastMaybe(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single lastOrError() {
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable lift(ObservableOperator observableOperator0) {
        ObjectHelper.requireNonNull(observableOperator0, "lifter is null");
        return RxJavaPlugins.onAssembly(new ObservableLift(this, observableOperator0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable map(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMap(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable materialize() {
        return RxJavaPlugins.onAssembly(new ObservableMaterialize(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource0, Functions.identity(), false, 0x7FFFFFFF, 0x80));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource0, Functions.identity(), false, v, 0x80));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(ObservableSource observableSource0, ObservableSource observableSource1) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1}).flatMap(Functions.identity(), false, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2}).flatMap(Functions.identity(), false, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3}).flatMap(Functions.identity(), false, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(Iterable iterable0) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(Iterable iterable0, int v) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity(), v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable merge(Iterable iterable0, int v, int v1) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity(), false, v, v1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeArray(int v, int v1, ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).flatMap(Functions.identity(), false, v, v1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeArray(ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).flatMap(Functions.identity(), arr_observableSource.length);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeArrayDelayError(int v, int v1, ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).flatMap(Functions.identity(), true, v, v1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeArrayDelayError(ObservableSource[] arr_observableSource) {
        return Observable.fromArray(arr_observableSource).flatMap(Functions.identity(), true, arr_observableSource.length);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource0, Functions.identity(), true, 0x7FFFFFFF, 0x80));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource0, Functions.identity(), true, v, 0x80));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(ObservableSource observableSource0, ObservableSource observableSource1) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1}).flatMap(Functions.identity(), true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2}).flatMap(Functions.identity(), true, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        return Observable.fromArray(new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3}).flatMap(Functions.identity(), true, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(Iterable iterable0) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(Iterable iterable0, int v) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity(), true, v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable mergeDelayError(Iterable iterable0, int v, int v1) {
        return Observable.fromIterable(iterable0).flatMap(Functions.identity(), true, v, v1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable mergeWith(@NonNull CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithCompletable(this, completableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable mergeWith(@NonNull MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithMaybe(this, maybeSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable mergeWith(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return Observable.merge(this, observableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable mergeWith(@NonNull SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithSingle(this, singleSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable never() {
        return RxJavaPlugins.onAssembly(ObservableNever.INSTANCE);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable observeOn(Scheduler scheduler0) {
        return this.observeOn(scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable observeOn(Scheduler scheduler0, boolean z) {
        return this.observeOn(scheduler0, z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable observeOn(Scheduler scheduler0, boolean z, int v) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableObserveOn(this, scheduler0, z, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable ofType(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.filter(Functions.isInstanceOf(class0)).cast(class0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onErrorResumeNext(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "next is null");
        return this.onErrorResumeNext(Functions.justFunction(observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onErrorResumeNext(Function function0) {
        ObjectHelper.requireNonNull(function0, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, function0, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onErrorReturn(Function function0) {
        ObjectHelper.requireNonNull(function0, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorReturn(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onErrorReturnItem(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return this.onErrorReturn(Functions.justFunction(object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onExceptionResumeNext(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "next is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, Functions.justFunction(observableSource0), true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new ObservableDetach(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable publish(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservablePublishSelector(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable publish() {
        return ObservablePublish.create(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable range(int v, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + v1);
        }
        if(v1 == 0) {
            return Observable.empty();
        }
        if(v1 == 1) {
            return Observable.just(v);
        }
        if(((long)v) + ((long)(v1 - 1)) > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("Integer overflow");
        }
        return RxJavaPlugins.onAssembly(new ObservableRange(v, v1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable rangeLong(long v, long v1) {
        int v2 = Long.compare(v1, 0L);
        if(v2 < 0) {
            throw new IllegalArgumentException(q.n(v1, "count >= 0 required but it was "));
        }
        if(v2 == 0) {
            return Observable.empty();
        }
        if(v1 == 1L) {
            return Observable.just(v);
        }
        if(v > 0L && v1 - 1L + v < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return RxJavaPlugins.onAssembly(new ObservableRangeLong(v, v1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe reduce(BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceMaybe(this, biFunction0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single reduce(Object object0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(object0, "seed is null");
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceSeedSingle(this, object0, biFunction0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single reduceWith(Callable callable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(callable0, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction0, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceWithSingle(this, callable0, biFunction0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable repeat() {
        return this.repeat(0x7FFFFFFFFFFFFFFFL);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable repeat(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "times >= 0 required but it was "));
        }
        return v1 == 0 ? Observable.empty() : RxJavaPlugins.onAssembly(new ObservableRepeat(this, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable repeatUntil(BooleanSupplier booleanSupplier0) {
        ObjectHelper.requireNonNull(booleanSupplier0, "stop is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatUntil(this, booleanSupplier0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable repeatWhen(Function function0) {
        ObjectHelper.requireNonNull(function0, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatWhen(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable replay(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this), function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable replay(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, v), function0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable replay(Function function0, int v, long v1, TimeUnit timeUnit0) {
        return this.replay(function0, v, v1, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable replay(Function function0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, v, v1, timeUnit0, scheduler0), function0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable replay(Function function0, int v, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, v), ObservableInternalHelper.replayFunction(function0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable replay(Function function0, long v, TimeUnit timeUnit0) {
        return this.replay(function0, v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable replay(Function function0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, v, timeUnit0, scheduler0), function0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable replay(Function function0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this), ObservableInternalHelper.replayFunction(function0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable replay() {
        return ObservableReplay.createFrom(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable replay(int v) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return ObservableReplay.create(this, v);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable replay(int v, long v1, TimeUnit timeUnit0) {
        return this.replay(v, v1, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable replay(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.create(this, v1, timeUnit0, scheduler0, v);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable replay(int v, Scheduler scheduler0) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        return ObservableReplay.observeOn(this.replay(v), scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable replay(long v, TimeUnit timeUnit0) {
        return this.replay(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable replay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.create(this, v, timeUnit0, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable replay(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return ObservableReplay.observeOn(this.replay(), scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retry() {
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retry(long v) {
        return this.retry(v, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retry(long v, Predicate predicate0) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "times >= 0 required but it was "));
        }
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryPredicate(this, v, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retry(BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(biPredicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryBiPredicate(this, biPredicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retry(Predicate predicate0) {
        return this.retry(0x7FFFFFFFFFFFFFFFL, predicate0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retryUntil(BooleanSupplier booleanSupplier0) {
        ObjectHelper.requireNonNull(booleanSupplier0, "stop is null");
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.predicateReverseFor(booleanSupplier0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable retryWhen(Function function0) {
        ObjectHelper.requireNonNull(function0, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryWhen(this, function0));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(Observer observer0) {
        ObjectHelper.requireNonNull(observer0, "observer is null");
        if(observer0 instanceof SafeObserver) {
            this.subscribe(observer0);
            return;
        }
        this.subscribe(new SafeObserver(observer0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable sample(long v, TimeUnit timeUnit0) {
        return this.sample(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable sample(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, v, timeUnit0, scheduler0, false));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable sample(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, v, timeUnit0, scheduler0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable sample(long v, TimeUnit timeUnit0, boolean z) {
        return this.sample(v, timeUnit0, Schedulers.computation(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable sample(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource0, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable sample(ObservableSource observableSource0, boolean z) {
        ObjectHelper.requireNonNull(observableSource0, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable scan(BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScan(this, biFunction0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable scan(Object object0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(object0, "initialValue is null");
        return this.scanWith(Functions.justCallable(object0), biFunction0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable scanWith(Callable callable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(callable0, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction0, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScanSeed(this, callable0, biFunction0));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(ObservableSource observableSource0, ObservableSource observableSource1) {
        return Observable.sequenceEqual(observableSource0, observableSource1, ObjectHelper.equalsPredicate(), 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(ObservableSource observableSource0, ObservableSource observableSource1, int v) {
        return Observable.sequenceEqual(observableSource0, observableSource1, ObjectHelper.equalsPredicate(), v);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0) {
        return Observable.sequenceEqual(observableSource0, observableSource1, biPredicate0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(biPredicate0, "isEqual is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqualSingle(observableSource0, observableSource1, biPredicate0, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable serialize() {
        return RxJavaPlugins.onAssembly(new ObservableSerialized(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable share() {
        return this.publish().refCount();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single single(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe singleElement() {
        return RxJavaPlugins.onAssembly(new ObservableSingleMaybe(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single singleOrError() {
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable skip(long v) {
        return v > 0L ? RxJavaPlugins.onAssembly(new ObservableSkip(this, v)) : RxJavaPlugins.onAssembly(this);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable skip(long v, TimeUnit timeUnit0) {
        return this.skipUntil(Observable.timer(v, timeUnit0));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable skip(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.skipUntil(Observable.timer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable skipLast(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + v);
        }
        return v == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkipLast(this, v));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable skipLast(long v, TimeUnit timeUnit0) {
        return this.skipLast(v, timeUnit0, Schedulers.trampoline(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.skipLast(v, timeUnit0, scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        return this.skipLast(v, timeUnit0, scheduler0, z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable skipLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v1) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v1, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSkipLastTimed(this, v, timeUnit0, scheduler0, v1 << 1, z));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable skipLast(long v, TimeUnit timeUnit0, boolean z) {
        return this.skipLast(v, timeUnit0, Schedulers.trampoline(), z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable skipUntil(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipUntil(this, observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable skipWhile(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipWhile(this, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable sorted() {
        return this.toList().toObservable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable sorted(Comparator comparator0) {
        ObjectHelper.requireNonNull(comparator0, "sortFunction is null");
        return this.toList().toObservable().map(Functions.listSorter(comparator0)).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable startWith(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return Observable.concatArray(new ObservableSource[]{observableSource0, this});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable startWith(Iterable iterable0) {
        return Observable.concatArray(new ObservableSource[]{Observable.fromIterable(iterable0), this});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable startWith(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return Observable.concatArray(new ObservableSource[]{Observable.just(object0), this});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable startWithArray(Object[] arr_object) {
        Observable observable0 = Observable.fromArray(arr_object);
        return observable0 == Observable.empty() ? RxJavaPlugins.onAssembly(this) : Observable.concatArray(new ObservableSource[]{observable0, this});
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return this.subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0) {
        return this.subscribe(consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1) {
        return this.subscribe(consumer0, consumer1, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1, Action action0) {
        return this.subscribe(consumer0, consumer1, action0, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1, Action action0, Consumer consumer2) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.requireNonNull(consumer2, "onSubscribe is null");
        Disposable disposable0 = new LambdaObserver(consumer0, consumer1, action0, consumer2);
        this.subscribe(((Observer)disposable0));
        return disposable0;
    }

    @Override  // io.reactivex.ObservableSource
    @SchedulerSupport("none")
    public final void subscribe(Observer observer0) {
        ObjectHelper.requireNonNull(observer0, "observer is null");
        try {
            Observer observer1 = RxJavaPlugins.onSubscribe(this, observer0);
            ObjectHelper.requireNonNull(observer1, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.subscribeActual(observer1);
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

    public abstract void subscribeActual(Observer arg1);

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable subscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observer subscribeWith(Observer observer0) {
        this.subscribe(observer0);
        return observer0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchIfEmpty(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchIfEmpty(this, observableSource0));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMap(Function function0) {
        return this.switchMap(function0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMap(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Observable.empty() : ObservableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function0, v, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable switchMapCompletable(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function0, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable switchMapCompletableDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function0, true));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMapDelayError(Function function0) {
        return this.switchMapDelayError(function0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMapDelayError(Function function0, int v) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        if(this instanceof ScalarCallable) {
            Object object0 = ((ScalarCallable)this).call();
            return object0 == null ? Observable.empty() : ObservableScalarXMap.scalarXMap(object0, function0);
        }
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function0, v, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMapMaybe(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function0, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable switchMapMaybeDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function0, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable switchMapSingle(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function0, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable switchMapSingleDelayError(@NonNull Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function0, true));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable switchOnNext(ObservableSource observableSource0) {
        return Observable.switchOnNext(observableSource0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable switchOnNext(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource0, Functions.identity(), v, false));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable switchOnNextDelayError(ObservableSource observableSource0) {
        return Observable.switchOnNextDelayError(observableSource0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable switchOnNextDelayError(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource0, Functions.identity(), v, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable take(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "count >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new ObservableTake(this, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable take(long v, TimeUnit timeUnit0) {
        return this.takeUntil(Observable.timer(v, timeUnit0));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable take(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeUntil(Observable.timer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable takeLast(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + v);
        }
        if(v == 0) {
            return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this));
        }
        return v == 1 ? RxJavaPlugins.onAssembly(new ObservableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new ObservableTakeLast(this, v));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable takeLast(long v, long v1, TimeUnit timeUnit0) {
        return this.takeLast(v, v1, timeUnit0, Schedulers.trampoline(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable takeLast(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeLast(v, v1, timeUnit0, scheduler0, false, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable takeLast(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v2) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.verifyPositive(v2, "bufferSize");
        if(v < 0L) {
            throw new IndexOutOfBoundsException(q.n(v, "count >= 0 required but it was "));
        }
        return RxJavaPlugins.onAssembly(new ObservableTakeLastTimed(this, v, v1, timeUnit0, scheduler0, v2, z));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable takeLast(long v, TimeUnit timeUnit0) {
        return this.takeLast(v, timeUnit0, Schedulers.trampoline(), false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.takeLast(v, timeUnit0, scheduler0, false, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        return this.takeLast(v, timeUnit0, scheduler0, z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable takeLast(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z, int v1) {
        return this.takeLast(0x7FFFFFFFFFFFFFFFL, v, timeUnit0, scheduler0, z, v1);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable takeLast(long v, TimeUnit timeUnit0, boolean z) {
        return this.takeLast(v, timeUnit0, Schedulers.trampoline(), z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable takeUntil(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntil(this, observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable takeUntil(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntilPredicate(this, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable takeWhile(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeWhile(this, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver test() {
        TestObserver testObserver0 = new TestObserver();
        this.subscribe(testObserver0);
        return testObserver0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver test(boolean z) {
        TestObserver testObserver0 = new TestObserver();
        if(z) {
            testObserver0.dispose();
        }
        this.subscribe(testObserver0);
        return testObserver0;
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable throttleFirst(long v, TimeUnit timeUnit0) {
        return this.throttleFirst(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable throttleFirst(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleFirstTimed(this, v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable throttleLast(long v, TimeUnit timeUnit0) {
        return this.sample(v, timeUnit0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable throttleLast(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.sample(v, timeUnit0, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable throttleLatest(long v, TimeUnit timeUnit0) {
        return this.throttleLatest(v, timeUnit0, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable throttleLatest(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.throttleLatest(v, timeUnit0, scheduler0, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable throttleLatest(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleLatest(this, v, timeUnit0, scheduler0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable throttleLatest(long v, TimeUnit timeUnit0, boolean z) {
        return this.throttleLatest(v, timeUnit0, Schedulers.computation(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable throttleWithTimeout(long v, TimeUnit timeUnit0) {
        return this.debounce(v, timeUnit0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable throttleWithTimeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.debounce(v, timeUnit0, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeInterval() {
        return this.timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeInterval(Scheduler scheduler0) {
        return this.timeInterval(TimeUnit.MILLISECONDS, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeInterval(TimeUnit timeUnit0) {
        return this.timeInterval(timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeInterval(TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeInterval(this, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable timeout(long v, TimeUnit timeUnit0) {
        return this.b(v, timeUnit0, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable timeout(long v, TimeUnit timeUnit0, ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return this.b(v, timeUnit0, Schedulers.computation(), observableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.b(v, timeUnit0, scheduler0, null);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0, ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return this.b(v, timeUnit0, scheduler0, observableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeout(ObservableSource observableSource0, Function function0) {
        ObjectHelper.requireNonNull(observableSource0, "firstTimeoutIndicator is null");
        return this.c(observableSource0, function0, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeout(ObservableSource observableSource0, Function function0, ObservableSource observableSource1) {
        ObjectHelper.requireNonNull(observableSource0, "firstTimeoutIndicator is null");
        ObjectHelper.requireNonNull(observableSource1, "other is null");
        return this.c(observableSource0, function0, observableSource1);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeout(Function function0) {
        return this.c(null, function0, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timeout(Function function0, ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return this.c(null, function0, observableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable timer(long v, TimeUnit timeUnit0) {
        return Observable.timer(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable timer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimer(Math.max(v, 0L), timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timestamp() {
        return this.timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timestamp(Scheduler scheduler0) {
        return this.timestamp(TimeUnit.MILLISECONDS, scheduler0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timestamp(TimeUnit timeUnit0) {
        return this.timestamp(timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable timestamp(TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return this.map(Functions.timestampWith(timeUnit0, scheduler0));
    }

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

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable toFlowable(BackpressureStrategy backpressureStrategy0) {
        Flowable flowable0 = new FlowableFromObservable(this);
        switch(a.a[backpressureStrategy0.ordinal()]) {
            case 1: {
                return flowable0.onBackpressureDrop();
            }
            case 2: {
                return flowable0.onBackpressureLatest();
            }
            case 3: {
                return flowable0;
            }
            case 4: {
                return RxJavaPlugins.onAssembly(new FlowableOnBackpressureError(flowable0));
            }
            default: {
                return flowable0.onBackpressureBuffer();
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Future toFuture() {
        return (Future)this.subscribeWith(new FutureObserver());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList() {
        return this.toList(16);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList(int v) {
        ObjectHelper.verifyPositive(v, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toList(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMap(Function function0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        return this.collect(HashMapSupplier.asCallable(), Functions.toMapKeySelector(function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMap(Function function0, Function function1) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        return this.collect(HashMapSupplier.asCallable(), Functions.toMapKeyValueSelector(function0, function1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMap(Function function0, Function function1, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.requireNonNull(callable0, "mapSupplier is null");
        return this.collect(callable0, Functions.toMapKeyValueSelector(function0, function1));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0) {
        return this.toMultimap(function0, Functions.identity(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1) {
        return this.toMultimap(function0, function1, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1, Callable callable0) {
        return this.toMultimap(function0, function1, callable0, ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toMultimap(Function function0, Function function1, Callable callable0, Function function2) {
        ObjectHelper.requireNonNull(function0, "keySelector is null");
        ObjectHelper.requireNonNull(function1, "valueSelector is null");
        ObjectHelper.requireNonNull(callable0, "mapSupplier is null");
        ObjectHelper.requireNonNull(function2, "collectionFactory is null");
        return this.collect(callable0, Functions.toMultimapKeyValueSelector(function0, function1, function2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList() {
        return this.toSortedList(Functions.naturalOrder());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList(int v) {
        return this.toSortedList(Functions.naturalOrder(), v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList(Comparator comparator0) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        return this.toList().map(Functions.listSorter(comparator0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSortedList(Comparator comparator0, int v) {
        ObjectHelper.requireNonNull(comparator0, "comparator is null");
        return this.toList(v).map(Functions.listSorter(comparator0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable unsafeCreate(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "onSubscribe is null");
        if(observableSource0 instanceof Observable) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable unsubscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableUnsubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable using(Callable callable0, Function function0, Consumer consumer0) {
        return Observable.using(callable0, function0, consumer0, true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable using(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        ObjectHelper.requireNonNull(callable0, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function0, "sourceSupplier is null");
        ObjectHelper.requireNonNull(consumer0, "disposer is null");
        return RxJavaPlugins.onAssembly(new ObservableUsing(callable0, function0, consumer0, z));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(long v) {
        return this.window(v, v, 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(long v, long v1) {
        return this.window(v, v1, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(long v, long v1, int v2) {
        ObjectHelper.verifyPositive(v, "count");
        ObjectHelper.verifyPositive(v1, "skip");
        ObjectHelper.verifyPositive(v2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindow(this, v, v1, v2));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable window(long v, long v1, TimeUnit timeUnit0) {
        return this.window(v, v1, timeUnit0, Schedulers.computation(), 0x80);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.window(v, v1, timeUnit0, scheduler0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2) {
        ObjectHelper.verifyPositive(v, "timespan");
        ObjectHelper.verifyPositive(v1, "timeskip");
        ObjectHelper.verifyPositive(v2, "bufferSize");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, v, v1, timeUnit0, scheduler0, 0x7FFFFFFFFFFFFFFFL, v2, false));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable window(long v, TimeUnit timeUnit0) {
        return this.window(v, timeUnit0, Schedulers.computation(), 0x7FFFFFFFFFFFFFFFL, false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable window(long v, TimeUnit timeUnit0, long v1) {
        return this.window(v, timeUnit0, Schedulers.computation(), v1, false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable window(long v, TimeUnit timeUnit0, long v1, boolean z) {
        return this.window(v, timeUnit0, Schedulers.computation(), v1, z);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.window(v, timeUnit0, scheduler0, 0x7FFFFFFFFFFFFFFFL, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1) {
        return this.window(v, timeUnit0, scheduler0, v1, false);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1, boolean z) {
        return this.window(v, timeUnit0, scheduler0, v1, z, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable window(long v, TimeUnit timeUnit0, Scheduler scheduler0, long v1, boolean z, int v2) {
        ObjectHelper.verifyPositive(v2, "bufferSize");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.verifyPositive(v1, "count");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, v, v, timeUnit0, scheduler0, v1, v2, z));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(ObservableSource observableSource0) {
        return this.window(observableSource0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(ObservableSource observableSource0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "boundary is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundary(this, observableSource0, v));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(ObservableSource observableSource0, Function function0) {
        return this.window(observableSource0, function0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(ObservableSource observableSource0, Function function0, int v) {
        ObjectHelper.requireNonNull(observableSource0, "openingIndicator is null");
        ObjectHelper.requireNonNull(function0, "closingIndicator is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySelector(this, observableSource0, function0, v));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(Callable callable0) {
        return this.window(callable0, 0x80);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable window(Callable callable0, int v) {
        ObjectHelper.requireNonNull(callable0, "boundary is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySupplier(this, callable0, v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, Function5 function50) {
        ObjectHelper.requireNonNull(observableSource0, "o1 is null");
        ObjectHelper.requireNonNull(observableSource1, "o2 is null");
        ObjectHelper.requireNonNull(observableSource2, "o3 is null");
        ObjectHelper.requireNonNull(observableSource3, "o4 is null");
        ObjectHelper.requireNonNull(function50, "combiner is null");
        Function function0 = Functions.toFunction(function50);
        return this.withLatestFrom(new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3}, function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, Function4 function40) {
        ObjectHelper.requireNonNull(observableSource0, "o1 is null");
        ObjectHelper.requireNonNull(observableSource1, "o2 is null");
        ObjectHelper.requireNonNull(observableSource2, "o3 is null");
        ObjectHelper.requireNonNull(function40, "combiner is null");
        Function function0 = Functions.toFunction(function40);
        return this.withLatestFrom(new ObservableSource[]{observableSource0, observableSource1, observableSource2}, function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(ObservableSource observableSource0, ObservableSource observableSource1, Function3 function30) {
        ObjectHelper.requireNonNull(observableSource0, "o1 is null");
        ObjectHelper.requireNonNull(observableSource1, "o2 is null");
        ObjectHelper.requireNonNull(function30, "combiner is null");
        Function function0 = Functions.toFunction(function30);
        return this.withLatestFrom(new ObservableSource[]{observableSource0, observableSource1}, function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(ObservableSource observableSource0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        ObjectHelper.requireNonNull(biFunction0, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFrom(this, biFunction0, observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(iterable0, "others is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, iterable0, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable withLatestFrom(ObservableSource[] arr_observableSource, Function function0) {
        ObjectHelper.requireNonNull(arr_observableSource, "others is null");
        ObjectHelper.requireNonNull(function0, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, arr_observableSource, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable wrap(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "source is null");
        return observableSource0 instanceof Observable ? RxJavaPlugins.onAssembly(((Observable)observableSource0)) : RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, Function9 function90) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        ObjectHelper.requireNonNull(observableSource7, "source8 is null");
        ObjectHelper.requireNonNull(observableSource8, "source9 is null");
        return Observable.zipArray(Functions.toFunction(function90), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, Function8 function80) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        ObjectHelper.requireNonNull(observableSource7, "source8 is null");
        return Observable.zipArray(Functions.toFunction(function80), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, Function7 function70) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        ObjectHelper.requireNonNull(observableSource6, "source7 is null");
        return Observable.zipArray(Functions.toFunction(function70), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, Function6 function60) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        ObjectHelper.requireNonNull(observableSource5, "source6 is null");
        return Observable.zipArray(Functions.toFunction(function60), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4, observableSource5});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, Function5 function50) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        ObjectHelper.requireNonNull(observableSource4, "source5 is null");
        return Observable.zipArray(Functions.toFunction(function50), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3, observableSource4});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, ObservableSource observableSource3, Function4 function40) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        ObjectHelper.requireNonNull(observableSource3, "source4 is null");
        return Observable.zipArray(Functions.toFunction(function40), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2, observableSource3});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, ObservableSource observableSource2, Function3 function30) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        ObjectHelper.requireNonNull(observableSource2, "source3 is null");
        return Observable.zipArray(Functions.toFunction(function30), false, 0x80, new ObservableSource[]{observableSource0, observableSource1, observableSource2});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.zipArray(Functions.toFunction(biFunction0), false, 0x80, new ObservableSource[]{observableSource0, observableSource1});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, BiFunction biFunction0, boolean z) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.zipArray(Functions.toFunction(biFunction0), z, 0x80, new ObservableSource[]{observableSource0, observableSource1});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, ObservableSource observableSource1, BiFunction biFunction0, boolean z, int v) {
        ObjectHelper.requireNonNull(observableSource0, "source1 is null");
        ObjectHelper.requireNonNull(observableSource1, "source2 is null");
        return Observable.zipArray(Functions.toFunction(biFunction0), z, v, new ObservableSource[]{observableSource0, observableSource1});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(ObservableSource observableSource0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableToList(observableSource0, 16).flatMap(ObservableInternalHelper.zipIterable(function0)));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zip(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable0, function0, 0x80, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zipArray(Function function0, boolean z, int v, ObservableSource[] arr_observableSource) {
        if(arr_observableSource.length == 0) {
            return Observable.empty();
        }
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(arr_observableSource, null, function0, v, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable zipIterable(Iterable iterable0, Function function0, boolean z, int v) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        ObjectHelper.verifyPositive(v, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable0, function0, v, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable zipWith(ObservableSource observableSource0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return Observable.zip(this, observableSource0, biFunction0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable zipWith(ObservableSource observableSource0, BiFunction biFunction0, boolean z) {
        return Observable.zip(this, observableSource0, biFunction0, z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable zipWith(ObservableSource observableSource0, BiFunction biFunction0, boolean z, int v) {
        return Observable.zip(this, observableSource0, biFunction0, z, v);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable zipWith(Iterable iterable0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(iterable0, "other is null");
        ObjectHelper.requireNonNull(biFunction0, "zipper is null");
        return RxJavaPlugins.onAssembly(new ObservableZipIterable(this, iterable0, biFunction0));
    }
}

