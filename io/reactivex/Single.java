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
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.observers.FutureSingleObserver;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.single.SingleAmb;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleContains;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDefer;
import io.reactivex.internal.operators.single.SingleDelay;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.operators.single.SingleDelayWithObservable;
import io.reactivex.internal.operators.single.SingleDelayWithPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithSingle;
import io.reactivex.internal.operators.single.SingleDematerialize;
import io.reactivex.internal.operators.single.SingleDetach;
import io.reactivex.internal.operators.single.SingleDoAfterSuccess;
import io.reactivex.internal.operators.single.SingleDoAfterTerminate;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnEvent;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleDoOnTerminate;
import io.reactivex.internal.operators.single.SingleEquals;
import io.reactivex.internal.operators.single.SingleError;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleFromCallable;
import io.reactivex.internal.operators.single.SingleFromPublisher;
import io.reactivex.internal.operators.single.SingleFromUnsafeSource;
import io.reactivex.internal.operators.single.SingleHide;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleLift;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleMaterialize;
import io.reactivex.internal.operators.single.SingleNever;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import io.reactivex.internal.operators.single.SingleUsing;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.single.SingleZipIterable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

public abstract class Single implements SingleSource {
    public final Single a(long v, TimeUnit timeUnit0, Scheduler scheduler0, SingleSource singleSource0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleTimeout(this, v, timeUnit0, scheduler0, singleSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single amb(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new SingleAmb(null, iterable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single ambArray(SingleSource[] arr_singleSource) {
        switch(arr_singleSource.length) {
            case 0: {
                return Single.error(SingleInternalHelper.emptyThrower());
            }
            case 1: {
                return Single.wrap(arr_singleSource[0]);
            }
            default: {
                return RxJavaPlugins.onAssembly(new SingleAmb(arr_singleSource, null));
            }
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single ambWith(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return Single.ambArray(new SingleSource[]{this, singleSource0});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object as(@NonNull SingleConverter singleConverter0) {
        return ((SingleConverter)ObjectHelper.requireNonNull(singleConverter0, "converter is null")).apply(this);
    }

    public static Single b(Flowable flowable0) {
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(flowable0, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object blockingGet() {
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        return blockingMultiObserver0.blockingGet();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single cache() {
        return RxJavaPlugins.onAssembly(new SingleCache(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single cast(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.map(Functions.castFunction(class0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single compose(SingleTransformer singleTransformer0) {
        return Single.wrap(((SingleTransformer)ObjectHelper.requireNonNull(singleTransformer0, "transformer is null")).apply(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(SingleSource singleSource0, SingleSource singleSource1) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        return Single.concat(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        return Single.concat(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        return Single.concat(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Iterable iterable0) {
        return Single.concat(Flowable.fromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0) {
        return Single.concat(publisher0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapPublisher(publisher0, SingleInternalHelper.toFlowable(), v, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable concat(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource0, SingleInternalHelper.toObservable(), 2, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatArray(SingleSource[] arr_singleSource) {
        return RxJavaPlugins.onAssembly(new FlowableConcatMap(Flowable.fromArray(arr_singleSource), SingleInternalHelper.toFlowable(), 2, ErrorMode.BOUNDARY));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatArrayEager(SingleSource[] arr_singleSource) {
        return Flowable.fromArray(arr_singleSource).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatEager(Iterable iterable0) {
        return Flowable.fromIterable(iterable0).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatEager(Publisher publisher0) {
        return Flowable.fromPublisher(publisher0).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable concatWith(SingleSource singleSource0) {
        return Single.concat(this, singleSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single contains(Object object0) {
        return this.contains(object0, ObjectHelper.equalsPredicate());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single contains(Object object0, BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(object0, "value is null");
        ObjectHelper.requireNonNull(biPredicate0, "comparer is null");
        return RxJavaPlugins.onAssembly(new SingleContains(this, object0, biPredicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single create(SingleOnSubscribe singleOnSubscribe0) {
        ObjectHelper.requireNonNull(singleOnSubscribe0, "source is null");
        return RxJavaPlugins.onAssembly(new SingleCreate(singleOnSubscribe0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single defer(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "singleSupplier is null");
        return RxJavaPlugins.onAssembly(new SingleDefer(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Single delay(long v, TimeUnit timeUnit0) {
        return this.delay(v, timeUnit0, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Single delay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delay(v, timeUnit0, scheduler0, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Single delay(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleDelay(this, v, timeUnit0, scheduler0, z));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Single delay(long v, TimeUnit timeUnit0, boolean z) {
        return this.delay(v, timeUnit0, Schedulers.computation(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Single delaySubscription(long v, TimeUnit timeUnit0) {
        return this.delaySubscription(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Single delaySubscription(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delaySubscription(Observable.timer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single delaySubscription(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(this, completableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single delaySubscription(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithObservable(this, observableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single delaySubscription(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithSingle(this, singleSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single delaySubscription(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithPublisher(this, publisher0));
    }

    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final Maybe dematerialize(Function function0) {
        ObjectHelper.requireNonNull(function0, "selector is null");
        return RxJavaPlugins.onAssembly(new SingleDematerialize(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doAfterSuccess(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onAfterSuccess is null");
        return RxJavaPlugins.onAssembly(new SingleDoAfterSuccess(this, consumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doAfterTerminate(Action action0) {
        ObjectHelper.requireNonNull(action0, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new SingleDoAfterTerminate(this, action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doFinally(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return RxJavaPlugins.onAssembly(new SingleDoFinally(this, action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnDispose(Action action0) {
        ObjectHelper.requireNonNull(action0, "onDispose is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnDispose(this, action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnError(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onError is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnError(this, consumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnEvent(BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "onEvent is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnEvent(this, biConsumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnSubscribe(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnSubscribe(this, consumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnSuccess(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onSuccess is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnSuccess(this, consumer0));
    }

    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final Single doOnTerminate(Action action0) {
        ObjectHelper.requireNonNull(action0, "onTerminate is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnTerminate(this, action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single equals(SingleSource singleSource0, SingleSource singleSource1) {
        ObjectHelper.requireNonNull(singleSource0, "first is null");
        ObjectHelper.requireNonNull(singleSource1, "second is null");
        return RxJavaPlugins.onAssembly(new SingleEquals(singleSource0, singleSource1));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single error(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "exception is null");
        return Single.error(Functions.justCallable(throwable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single error(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new SingleError(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe filter(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new MaybeFilterSingle(this, predicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single flatMap(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMap(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapCompletable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe flatMapMaybe(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapMaybe(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable flatMapObservable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapObservable(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapPublisher(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapPublisher(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flattenAsFlowable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapIterableFlowable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable flattenAsObservable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapIterableObservable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single fromCallable(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "callable is null");
        return RxJavaPlugins.onAssembly(new SingleFromCallable(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single fromFuture(Future future0) {
        return Single.b(Flowable.fromFuture(future0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single fromFuture(Future future0, long v, TimeUnit timeUnit0) {
        return Single.b(Flowable.fromFuture(future0, v, timeUnit0));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Single fromFuture(Future future0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return Single.b(Flowable.fromFuture(future0, v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Single fromFuture(Future future0, Scheduler scheduler0) {
        return Single.b(Flowable.fromFuture(future0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single fromObservable(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "observableSource is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(observableSource0, null));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single fromPublisher(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "publisher is null");
        return RxJavaPlugins.onAssembly(new SingleFromPublisher(publisher0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single hide() {
        return RxJavaPlugins.onAssembly(new SingleHide(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable ignoreElement() {
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single just(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return RxJavaPlugins.onAssembly(new SingleJust(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single lift(SingleOperator singleOperator0) {
        ObjectHelper.requireNonNull(singleOperator0, "lift is null");
        return RxJavaPlugins.onAssembly(new SingleLift(this, singleOperator0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single map(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleMap(this, function0));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final Single materialize() {
        return RxJavaPlugins.onAssembly(new SingleMaterialize(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(SingleSource singleSource0, SingleSource singleSource1) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        return Single.merge(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        return Single.merge(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        return Single.merge(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Iterable iterable0) {
        return Single.merge(Flowable.fromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(publisher0, SingleInternalHelper.toFlowable(), false, 0x7FFFFFFF, 0x80));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single merge(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "source is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMap(singleSource0, Functions.identity()));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(SingleSource singleSource0, SingleSource singleSource1) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        return Single.mergeDelayError(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        return Single.mergeDelayError(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        return Single.mergeDelayError(Flowable.fromArray(new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3}));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Iterable iterable0) {
        return Single.mergeDelayError(Flowable.fromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(publisher0, SingleInternalHelper.toFlowable(), true, 0x7FFFFFFF, 0x80));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable mergeWith(SingleSource singleSource0) {
        return Single.merge(this, singleSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single never() {
        return RxJavaPlugins.onAssembly(SingleNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Single observeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleObserveOn(this, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single onErrorResumeNext(Single single0) {
        ObjectHelper.requireNonNull(single0, "resumeSingleInCaseOfError is null");
        return this.onErrorResumeNext(Functions.justFunction(single0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single onErrorResumeNext(Function function0) {
        ObjectHelper.requireNonNull(function0, "resumeFunctionInCaseOfError is null");
        return RxJavaPlugins.onAssembly(new SingleResumeNext(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single onErrorReturn(Function function0) {
        ObjectHelper.requireNonNull(function0, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new SingleOnErrorReturn(this, function0, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single onErrorReturnItem(Object object0) {
        ObjectHelper.requireNonNull(object0, "value is null");
        return RxJavaPlugins.onAssembly(new SingleOnErrorReturn(this, null, object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new SingleDetach(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeat() {
        return this.toFlowable().repeat();
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeat(long v) {
        return this.toFlowable().repeat(v);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeatUntil(BooleanSupplier booleanSupplier0) {
        return this.toFlowable().repeatUntil(booleanSupplier0);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable repeatWhen(Function function0) {
        return this.toFlowable().repeatWhen(function0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retry() {
        return Single.b(this.toFlowable().retry());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retry(long v) {
        return Single.b(this.toFlowable().retry(v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retry(long v, Predicate predicate0) {
        return Single.b(this.toFlowable().retry(v, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retry(BiPredicate biPredicate0) {
        return Single.b(this.toFlowable().retry(biPredicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retry(Predicate predicate0) {
        return Single.b(this.toFlowable().retry(predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single retryWhen(Function function0) {
        return Single.b(this.toFlowable().retryWhen(function0));
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return this.subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "onCallback is null");
        Disposable disposable0 = new BiConsumerSingleObserver(biConsumer0);
        this.subscribe(((SingleObserver)disposable0));
        return disposable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0) {
        return this.subscribe(consumer0, Functions.ON_ERROR_MISSING);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1) {
        ObjectHelper.requireNonNull(consumer0, "onSuccess is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        Disposable disposable0 = new ConsumerSingleObserver(consumer0, consumer1);
        this.subscribe(((SingleObserver)disposable0));
        return disposable0;
    }

    @Override  // io.reactivex.SingleSource
    @SchedulerSupport("none")
    public final void subscribe(SingleObserver singleObserver0) {
        ObjectHelper.requireNonNull(singleObserver0, "observer is null");
        SingleObserver singleObserver1 = RxJavaPlugins.onSubscribe(this, singleObserver0);
        ObjectHelper.requireNonNull(singleObserver1, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.subscribeActual(singleObserver1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("subscribeActual failed");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
    }

    public abstract void subscribeActual(@NonNull SingleObserver arg1);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Single subscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleSubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final SingleObserver subscribeWith(SingleObserver singleObserver0) {
        this.subscribe(singleObserver0);
        return singleObserver0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single takeUntil(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return this.takeUntil(new CompletableToFlowable(completableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single takeUntil(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return this.takeUntil(new SingleToFlowable(singleSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single takeUntil(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new SingleTakeUntil(this, publisher0));
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
            testObserver0.cancel();
        }
        this.subscribe(testObserver0);
        return testObserver0;
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Single timeout(long v, TimeUnit timeUnit0) {
        return this.a(v, timeUnit0, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Single timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.a(v, timeUnit0, scheduler0, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Single timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0, SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return this.a(v, timeUnit0, scheduler0, singleSource0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Single timeout(long v, TimeUnit timeUnit0, SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return this.a(v, timeUnit0, Schedulers.computation(), singleSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Single timer(long v, TimeUnit timeUnit0) {
        return Single.timer(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Single timer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleTimer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object to(Function function0) {
        try {
            return ((Function)ObjectHelper.requireNonNull(function0, "convert is null")).apply(this);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @Deprecated
    public final Completable toCompletable() {
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(this));
    }

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable)this).fuseToFlowable() : RxJavaPlugins.onAssembly(new SingleToFlowable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Future toFuture() {
        return (Future)this.subscribeWith(new FutureSingleObserver());
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe)this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromSingle(this));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable)this).fuseToObservable() : RxJavaPlugins.onAssembly(new SingleToObservable(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single unsafeCreate(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "onSubscribe is null");
        if(singleSource0 instanceof Single) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new SingleFromUnsafeSource(singleSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Single unsubscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleUnsubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single using(Callable callable0, Function function0, Consumer consumer0) {
        return Single.using(callable0, function0, consumer0, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single using(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        ObjectHelper.requireNonNull(callable0, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function0, "singleFunction is null");
        ObjectHelper.requireNonNull(consumer0, "disposer is null");
        return RxJavaPlugins.onAssembly(new SingleUsing(callable0, function0, consumer0, z));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single wrap(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "source is null");
        return singleSource0 instanceof Single ? RxJavaPlugins.onAssembly(((Single)singleSource0)) : RxJavaPlugins.onAssembly(new SingleFromUnsafeSource(singleSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, SingleSource singleSource4, SingleSource singleSource5, SingleSource singleSource6, SingleSource singleSource7, SingleSource singleSource8, Function9 function90) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        ObjectHelper.requireNonNull(singleSource4, "source5 is null");
        ObjectHelper.requireNonNull(singleSource5, "source6 is null");
        ObjectHelper.requireNonNull(singleSource6, "source7 is null");
        ObjectHelper.requireNonNull(singleSource7, "source8 is null");
        ObjectHelper.requireNonNull(singleSource8, "source9 is null");
        return Single.zipArray(Functions.toFunction(function90), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, SingleSource singleSource4, SingleSource singleSource5, SingleSource singleSource6, SingleSource singleSource7, Function8 function80) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        ObjectHelper.requireNonNull(singleSource4, "source5 is null");
        ObjectHelper.requireNonNull(singleSource5, "source6 is null");
        ObjectHelper.requireNonNull(singleSource6, "source7 is null");
        ObjectHelper.requireNonNull(singleSource7, "source8 is null");
        return Single.zipArray(Functions.toFunction(function80), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, SingleSource singleSource4, SingleSource singleSource5, SingleSource singleSource6, Function7 function70) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        ObjectHelper.requireNonNull(singleSource4, "source5 is null");
        ObjectHelper.requireNonNull(singleSource5, "source6 is null");
        ObjectHelper.requireNonNull(singleSource6, "source7 is null");
        return Single.zipArray(Functions.toFunction(function70), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, SingleSource singleSource4, SingleSource singleSource5, Function6 function60) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        ObjectHelper.requireNonNull(singleSource4, "source5 is null");
        ObjectHelper.requireNonNull(singleSource5, "source6 is null");
        return Single.zipArray(Functions.toFunction(function60), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3, singleSource4, singleSource5});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, SingleSource singleSource4, Function5 function50) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        ObjectHelper.requireNonNull(singleSource4, "source5 is null");
        return Single.zipArray(Functions.toFunction(function50), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3, singleSource4});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, SingleSource singleSource3, Function4 function40) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        ObjectHelper.requireNonNull(singleSource3, "source4 is null");
        return Single.zipArray(Functions.toFunction(function40), new SingleSource[]{singleSource0, singleSource1, singleSource2, singleSource3});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, SingleSource singleSource2, Function3 function30) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        ObjectHelper.requireNonNull(singleSource2, "source3 is null");
        return Single.zipArray(Functions.toFunction(function30), new SingleSource[]{singleSource0, singleSource1, singleSource2});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(SingleSource singleSource0, SingleSource singleSource1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(singleSource0, "source1 is null");
        ObjectHelper.requireNonNull(singleSource1, "source2 is null");
        return Single.zipArray(Functions.toFunction(biFunction0), new SingleSource[]{singleSource0, singleSource1});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zip(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new SingleZipIterable(iterable0, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single zipArray(Function function0, SingleSource[] arr_singleSource) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(arr_singleSource, "sources is null");
        return arr_singleSource.length == 0 ? Single.error(new NoSuchElementException()) : RxJavaPlugins.onAssembly(new SingleZipArray(arr_singleSource, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single zipWith(SingleSource singleSource0, BiFunction biFunction0) {
        return Single.zip(this, singleSource0, biFunction0);
    }
}

