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
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher;
import io.reactivex.internal.operators.maybe.MaybeAmb;
import io.reactivex.internal.operators.maybe.MaybeCache;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeConcatArray;
import io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError;
import io.reactivex.internal.operators.maybe.MaybeConcatIterable;
import io.reactivex.internal.operators.maybe.MaybeContains;
import io.reactivex.internal.operators.maybe.MaybeCount;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeDefer;
import io.reactivex.internal.operators.maybe.MaybeDelay;
import io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher;
import io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher;
import io.reactivex.internal.operators.maybe.MaybeDetach;
import io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess;
import io.reactivex.internal.operators.maybe.MaybeDoFinally;
import io.reactivex.internal.operators.maybe.MaybeDoOnEvent;
import io.reactivex.internal.operators.maybe.MaybeDoOnTerminate;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeEqualSingle;
import io.reactivex.internal.operators.maybe.MaybeError;
import io.reactivex.internal.operators.maybe.MaybeErrorCallable;
import io.reactivex.internal.operators.maybe.MaybeFilter;
import io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapNotification;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeFromAction;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.internal.operators.maybe.MaybeFromFuture;
import io.reactivex.internal.operators.maybe.MaybeFromRunnable;
import io.reactivex.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.internal.operators.maybe.MaybeHide;
import io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.internal.operators.maybe.MaybeIsEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeJust;
import io.reactivex.internal.operators.maybe.MaybeLift;
import io.reactivex.internal.operators.maybe.MaybeMap;
import io.reactivex.internal.operators.maybe.MaybeMaterialize;
import io.reactivex.internal.operators.maybe.MaybeMergeArray;
import io.reactivex.internal.operators.maybe.MaybeNever;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeOnErrorComplete;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeOnErrorReturn;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher;
import io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher;
import io.reactivex.internal.operators.maybe.MaybeTimer;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.maybe.MaybeToPublisher;
import io.reactivex.internal.operators.maybe.MaybeToSingle;
import io.reactivex.internal.operators.maybe.MaybeUnsafeCreate;
import io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeUsing;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.reactivex.internal.operators.maybe.MaybeZipIterable;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

public abstract class Maybe implements MaybeSource {
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe amb(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new MaybeAmb(null, iterable0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Maybe ambArray(MaybeSource[] arr_maybeSource) {
        switch(arr_maybeSource.length) {
            case 0: {
                return Maybe.empty();
            }
            case 1: {
                return Maybe.wrap(arr_maybeSource[0]);
            }
            default: {
                return RxJavaPlugins.onAssembly(new MaybeAmb(arr_maybeSource, null));
            }
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe ambWith(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return Maybe.ambArray(new MaybeSource[]{this, maybeSource0});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object as(@NonNull MaybeConverter maybeConverter0) {
        return ((MaybeConverter)ObjectHelper.requireNonNull(maybeConverter0, "converter is null")).apply(this);
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
    public final Object blockingGet(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultValue is null");
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        return blockingMultiObserver0.blockingGet(object0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe cache() {
        return RxJavaPlugins.onAssembly(new MaybeCache(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe cast(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.map(Functions.castFunction(class0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe compose(MaybeTransformer maybeTransformer0) {
        return Maybe.wrap(((MaybeTransformer)ObjectHelper.requireNonNull(maybeTransformer0, "transformer is null")).apply(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        return Maybe.concatArray(new MaybeSource[]{maybeSource0, maybeSource1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        return Maybe.concatArray(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        return Maybe.concatArray(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new MaybeConcatIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0) {
        return Maybe.concat(publisher0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concat(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapPublisher(publisher0, MaybeToPublisher.instance(), v, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatArray(MaybeSource[] arr_maybeSource) {
        ObjectHelper.requireNonNull(arr_maybeSource, "sources is null");
        if(arr_maybeSource.length == 0) {
            return Flowable.empty();
        }
        return arr_maybeSource.length == 1 ? RxJavaPlugins.onAssembly(new MaybeToFlowable(arr_maybeSource[0])) : RxJavaPlugins.onAssembly(new MaybeConcatArray(arr_maybeSource));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayDelayError(MaybeSource[] arr_maybeSource) {
        switch(arr_maybeSource.length) {
            case 0: {
                return Flowable.empty();
            }
            case 1: {
                return RxJavaPlugins.onAssembly(new MaybeToFlowable(arr_maybeSource[0]));
            }
            default: {
                return RxJavaPlugins.onAssembly(new MaybeConcatArrayDelayError(arr_maybeSource));
            }
        }
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatArrayEager(MaybeSource[] arr_maybeSource) {
        return Flowable.fromArray(arr_maybeSource).concatMapEager(MaybeToPublisher.instance());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable concatDelayError(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return Flowable.fromIterable(iterable0).concatMapDelayError(MaybeToPublisher.instance());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatDelayError(Publisher publisher0) {
        return Flowable.fromPublisher(publisher0).concatMapDelayError(MaybeToPublisher.instance());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatEager(Iterable iterable0) {
        return Flowable.fromIterable(iterable0).concatMapEager(MaybeToPublisher.instance());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable concatEager(Publisher publisher0) {
        return Flowable.fromPublisher(publisher0).concatMapEager(MaybeToPublisher.instance());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe concatMap(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatten(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable concatWith(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return Maybe.concat(this, maybeSource0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single contains(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return RxJavaPlugins.onAssembly(new MaybeContains(this, object0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single count() {
        return RxJavaPlugins.onAssembly(new MaybeCount(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe create(MaybeOnSubscribe maybeOnSubscribe0) {
        ObjectHelper.requireNonNull(maybeOnSubscribe0, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new MaybeCreate(maybeOnSubscribe0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe defaultIfEmpty(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultItem is null");
        return this.switchIfEmpty(Maybe.just(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe defer(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "maybeSupplier is null");
        return RxJavaPlugins.onAssembly(new MaybeDefer(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Maybe delay(long v, TimeUnit timeUnit0) {
        return this.delay(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Maybe delay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new MaybeDelay(this, Math.max(0L, v), timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe delay(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "delayIndicator is null");
        return RxJavaPlugins.onAssembly(new MaybeDelayOtherPublisher(this, publisher0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Maybe delaySubscription(long v, TimeUnit timeUnit0) {
        return this.delaySubscription(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Maybe delaySubscription(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delaySubscription(Flowable.timer(v, timeUnit0, scheduler0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe delaySubscription(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new MaybeDelaySubscriptionOtherPublisher(this, publisher0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doAfterSuccess(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onAfterSuccess is null");
        return RxJavaPlugins.onAssembly(new MaybeDoAfterSuccess(this, consumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doAfterTerminate(Action action0) {
        Object object0 = ObjectHelper.requireNonNull(action0, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new MaybePeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, ((Action)object0), Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doFinally(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return RxJavaPlugins.onAssembly(new MaybeDoFinally(this, action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnComplete(Action action0) {
        return RxJavaPlugins.onAssembly(new MaybePeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), ((Action)ObjectHelper.requireNonNull(action0, "onComplete is null")), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnDispose(Action action0) {
        Object object0 = ObjectHelper.requireNonNull(action0, "onDispose is null");
        return RxJavaPlugins.onAssembly(new MaybePeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, ((Action)object0)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnError(Consumer consumer0) {
        return RxJavaPlugins.onAssembly(new MaybePeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), ((Consumer)ObjectHelper.requireNonNull(consumer0, "onError is null")), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe doOnEvent(BiConsumer biConsumer0) {
        ObjectHelper.requireNonNull(biConsumer0, "onEvent is null");
        return RxJavaPlugins.onAssembly(new MaybeDoOnEvent(this, biConsumer0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnSubscribe(Consumer consumer0) {
        return RxJavaPlugins.onAssembly(new MaybePeek(this, ((Consumer)ObjectHelper.requireNonNull(consumer0, "onSubscribe is null")), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnSuccess(Consumer consumer0) {
        return RxJavaPlugins.onAssembly(new MaybePeek(this, Functions.emptyConsumer(), ((Consumer)ObjectHelper.requireNonNull(consumer0, "onSuccess is null")), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final Maybe doOnTerminate(Action action0) {
        ObjectHelper.requireNonNull(action0, "onTerminate is null");
        return RxJavaPlugins.onAssembly(new MaybeDoOnTerminate(this, action0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Maybe empty() {
        return RxJavaPlugins.onAssembly(MaybeEmpty.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe error(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "exception is null");
        return RxJavaPlugins.onAssembly(new MaybeError(throwable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe error(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new MaybeErrorCallable(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe filter(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new MaybeFilter(this, predicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe flatMap(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatten(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe flatMap(Function function0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        ObjectHelper.requireNonNull(biFunction0, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapBiSelector(this, function0, biFunction0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe flatMap(Function function0, Function function1, Callable callable0) {
        ObjectHelper.requireNonNull(function0, "onSuccessMapper is null");
        ObjectHelper.requireNonNull(function1, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable0, "onCompleteSupplier is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapNotification(this, function0, function1, callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapCompletable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable flatMapObservable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapObservable(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flatMapPublisher(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapPublisher(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single flatMapSingle(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapSingle(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe flatMapSingleElement(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapSingleElement(this, function0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable flattenAsFlowable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapIterableFlowable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable flattenAsObservable(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatMapIterableObservable(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromAction(Action action0) {
        ObjectHelper.requireNonNull(action0, "run is null");
        return RxJavaPlugins.onAssembly(new MaybeFromAction(action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromCallable(@NonNull Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "callable is null");
        return RxJavaPlugins.onAssembly(new MaybeFromCallable(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromCompletable(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "completableSource is null");
        return RxJavaPlugins.onAssembly(new MaybeFromCompletable(completableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromFuture(Future future0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return RxJavaPlugins.onAssembly(new MaybeFromFuture(future0, 0L, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromFuture(Future future0, long v, TimeUnit timeUnit0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        return RxJavaPlugins.onAssembly(new MaybeFromFuture(future0, v, timeUnit0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromRunnable(Runnable runnable0) {
        ObjectHelper.requireNonNull(runnable0, "run is null");
        return RxJavaPlugins.onAssembly(new MaybeFromRunnable(runnable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe fromSingle(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "singleSource is null");
        return RxJavaPlugins.onAssembly(new MaybeFromSingle(singleSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe hide() {
        return RxJavaPlugins.onAssembly(new MaybeHide(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable ignoreElement() {
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElementCompletable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single isEmpty() {
        return RxJavaPlugins.onAssembly(new MaybeIsEmptySingle(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe just(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return RxJavaPlugins.onAssembly(new MaybeJust(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe lift(MaybeOperator maybeOperator0) {
        ObjectHelper.requireNonNull(maybeOperator0, "lift is null");
        return RxJavaPlugins.onAssembly(new MaybeLift(this, maybeOperator0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe map(Function function0) {
        ObjectHelper.requireNonNull(function0, "mapper is null");
        return RxJavaPlugins.onAssembly(new MaybeMap(this, function0));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final Single materialize() {
        return RxJavaPlugins.onAssembly(new MaybeMaterialize(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        return Maybe.mergeArray(new MaybeSource[]{maybeSource0, maybeSource1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        return Maybe.mergeArray(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        return Maybe.mergeArray(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Iterable iterable0) {
        return Maybe.merge(Flowable.fromIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0) {
        return Maybe.merge(publisher0, 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable merge(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "source is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(publisher0, MaybeToPublisher.instance(), false, v, 1));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe merge(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "source is null");
        return RxJavaPlugins.onAssembly(new MaybeFlatten(maybeSource0, Functions.identity()));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeArray(MaybeSource[] arr_maybeSource) {
        ObjectHelper.requireNonNull(arr_maybeSource, "sources is null");
        if(arr_maybeSource.length == 0) {
            return Flowable.empty();
        }
        return arr_maybeSource.length == 1 ? RxJavaPlugins.onAssembly(new MaybeToFlowable(arr_maybeSource[0])) : RxJavaPlugins.onAssembly(new MaybeMergeArray(arr_maybeSource));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeArrayDelayError(MaybeSource[] arr_maybeSource) {
        return arr_maybeSource.length == 0 ? Flowable.empty() : Flowable.fromArray(arr_maybeSource).flatMap(MaybeToPublisher.instance(), true, arr_maybeSource.length);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        return Maybe.mergeArrayDelayError(new MaybeSource[]{maybeSource0, maybeSource1});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        return Maybe.mergeArrayDelayError(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        return Maybe.mergeArrayDelayError(new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Iterable iterable0) {
        return Flowable.fromIterable(iterable0).flatMap(MaybeToPublisher.instance(), true);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0) {
        return Maybe.mergeDelayError(publisher0, 0x7FFFFFFF);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Flowable mergeDelayError(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "source is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(publisher0, MaybeToPublisher.instance(), true, v, 1));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable mergeWith(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return Maybe.merge(this, maybeSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Maybe never() {
        return RxJavaPlugins.onAssembly(MaybeNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Maybe observeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new MaybeObserveOn(this, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe ofType(Class class0) {
        ObjectHelper.requireNonNull(class0, "clazz is null");
        return this.filter(Functions.isInstanceOf(class0)).cast(class0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe onErrorComplete() {
        return this.onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onErrorComplete(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new MaybeOnErrorComplete(this, predicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onErrorResumeNext(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "next is null");
        return this.onErrorResumeNext(Functions.justFunction(maybeSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onErrorResumeNext(Function function0) {
        ObjectHelper.requireNonNull(function0, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new MaybeOnErrorNext(this, function0, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onErrorReturn(Function function0) {
        ObjectHelper.requireNonNull(function0, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new MaybeOnErrorReturn(this, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onErrorReturnItem(Object object0) {
        ObjectHelper.requireNonNull(object0, "item is null");
        return this.onErrorReturn(Functions.justFunction(object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe onExceptionResumeNext(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "next is null");
        return RxJavaPlugins.onAssembly(new MaybeOnErrorNext(this, Functions.justFunction(maybeSource0), false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new MaybeDetach(this));
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
    public final Maybe retry() {
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe retry(long v) {
        return this.retry(v, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe retry(long v, Predicate predicate0) {
        return this.toFlowable().retry(v, predicate0).singleElement();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe retry(BiPredicate biPredicate0) {
        return this.toFlowable().retry(biPredicate0).singleElement();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe retry(Predicate predicate0) {
        return this.retry(0x7FFFFFFFFFFFFFFFL, predicate0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe retryUntil(BooleanSupplier booleanSupplier0) {
        ObjectHelper.requireNonNull(booleanSupplier0, "stop is null");
        return this.retry(0x7FFFFFFFFFFFFFFFL, Functions.predicateReverseFor(booleanSupplier0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe retryWhen(Function function0) {
        return this.toFlowable().retryWhen(function0).singleElement();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Single sequenceEqual(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        return Maybe.sequenceEqual(maybeSource0, maybeSource1, ObjectHelper.equalsPredicate());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single sequenceEqual(MaybeSource maybeSource0, MaybeSource maybeSource1, BiPredicate biPredicate0) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(biPredicate0, "isEqual is null");
        return RxJavaPlugins.onAssembly(new MaybeEqualSingle(maybeSource0, maybeSource1, biPredicate0));
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return this.subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0) {
        return this.subscribe(consumer0, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1) {
        return this.subscribe(consumer0, consumer1, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer consumer0, Consumer consumer1, Action action0) {
        ObjectHelper.requireNonNull(consumer0, "onSuccess is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        return (Disposable)this.subscribeWith(new MaybeCallbackObserver(consumer0, consumer1, action0));
    }

    @Override  // io.reactivex.MaybeSource
    @SchedulerSupport("none")
    public final void subscribe(MaybeObserver maybeObserver0) {
        ObjectHelper.requireNonNull(maybeObserver0, "observer is null");
        MaybeObserver maybeObserver1 = RxJavaPlugins.onSubscribe(this, maybeObserver0);
        ObjectHelper.requireNonNull(maybeObserver1, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.subscribeActual(maybeObserver1);
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

    public abstract void subscribeActual(MaybeObserver arg1);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Maybe subscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new MaybeSubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final MaybeObserver subscribeWith(MaybeObserver maybeObserver0) {
        this.subscribe(maybeObserver0);
        return maybeObserver0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe switchIfEmpty(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new MaybeSwitchIfEmpty(this, maybeSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single switchIfEmpty(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "other is null");
        return RxJavaPlugins.onAssembly(new MaybeSwitchIfEmptySingle(this, singleSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe takeUntil(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return RxJavaPlugins.onAssembly(new MaybeTakeUntilMaybe(this, maybeSource0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe takeUntil(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return RxJavaPlugins.onAssembly(new MaybeTakeUntilPublisher(this, publisher0));
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
    public final Maybe timeout(long v, TimeUnit timeUnit0) {
        return this.timeout(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Maybe timeout(long v, TimeUnit timeUnit0, MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "fallback is null");
        return this.timeout(v, timeUnit0, Schedulers.computation(), maybeSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Maybe timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.timeout(Maybe.timer(v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Maybe timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0, MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "fallback is null");
        return this.timeout(Maybe.timer(v, timeUnit0, scheduler0), maybeSource0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe timeout(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "timeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new MaybeTimeoutMaybe(this, maybeSource0, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe timeout(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        ObjectHelper.requireNonNull(maybeSource0, "timeoutIndicator is null");
        ObjectHelper.requireNonNull(maybeSource1, "fallback is null");
        return RxJavaPlugins.onAssembly(new MaybeTimeoutMaybe(this, maybeSource0, maybeSource1));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe timeout(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "timeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new MaybeTimeoutPublisher(this, publisher0, null));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe timeout(Publisher publisher0, MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(publisher0, "timeoutIndicator is null");
        ObjectHelper.requireNonNull(maybeSource0, "fallback is null");
        return RxJavaPlugins.onAssembly(new MaybeTimeoutPublisher(this, publisher0, maybeSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Maybe timer(long v, TimeUnit timeUnit0) {
        return Maybe.timer(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Maybe timer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new MaybeTimer(Math.max(0L, v), timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
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

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable)this).fuseToFlowable() : RxJavaPlugins.onAssembly(new MaybeToFlowable(this));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable)this).fuseToObservable() : RxJavaPlugins.onAssembly(new MaybeToObservable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single toSingle() {
        return RxJavaPlugins.onAssembly(new MaybeToSingle(this, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toSingle(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultValue is null");
        return RxJavaPlugins.onAssembly(new MaybeToSingle(this, object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe unsafeCreate(MaybeSource maybeSource0) {
        if(maybeSource0 instanceof Maybe) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        ObjectHelper.requireNonNull(maybeSource0, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new MaybeUnsafeCreate(maybeSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Maybe unsubscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new MaybeUnsubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Maybe using(Callable callable0, Function function0, Consumer consumer0) {
        return Maybe.using(callable0, function0, consumer0, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe using(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        ObjectHelper.requireNonNull(callable0, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function0, "sourceSupplier is null");
        ObjectHelper.requireNonNull(consumer0, "disposer is null");
        return RxJavaPlugins.onAssembly(new MaybeUsing(callable0, function0, consumer0, z));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe wrap(MaybeSource maybeSource0) {
        if(maybeSource0 instanceof Maybe) {
            return RxJavaPlugins.onAssembly(((Maybe)maybeSource0));
        }
        ObjectHelper.requireNonNull(maybeSource0, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new MaybeUnsafeCreate(maybeSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, MaybeSource maybeSource4, MaybeSource maybeSource5, MaybeSource maybeSource6, MaybeSource maybeSource7, MaybeSource maybeSource8, Function9 function90) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        ObjectHelper.requireNonNull(maybeSource4, "source5 is null");
        ObjectHelper.requireNonNull(maybeSource5, "source6 is null");
        ObjectHelper.requireNonNull(maybeSource6, "source7 is null");
        ObjectHelper.requireNonNull(maybeSource7, "source8 is null");
        ObjectHelper.requireNonNull(maybeSource8, "source9 is null");
        return Maybe.zipArray(Functions.toFunction(function90), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, maybeSource8});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, MaybeSource maybeSource4, MaybeSource maybeSource5, MaybeSource maybeSource6, MaybeSource maybeSource7, Function8 function80) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        ObjectHelper.requireNonNull(maybeSource4, "source5 is null");
        ObjectHelper.requireNonNull(maybeSource5, "source6 is null");
        ObjectHelper.requireNonNull(maybeSource6, "source7 is null");
        ObjectHelper.requireNonNull(maybeSource7, "source8 is null");
        return Maybe.zipArray(Functions.toFunction(function80), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, MaybeSource maybeSource4, MaybeSource maybeSource5, MaybeSource maybeSource6, Function7 function70) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        ObjectHelper.requireNonNull(maybeSource4, "source5 is null");
        ObjectHelper.requireNonNull(maybeSource5, "source6 is null");
        ObjectHelper.requireNonNull(maybeSource6, "source7 is null");
        return Maybe.zipArray(Functions.toFunction(function70), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, MaybeSource maybeSource4, MaybeSource maybeSource5, Function6 function60) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        ObjectHelper.requireNonNull(maybeSource4, "source5 is null");
        ObjectHelper.requireNonNull(maybeSource5, "source6 is null");
        return Maybe.zipArray(Functions.toFunction(function60), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, MaybeSource maybeSource4, Function5 function50) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        ObjectHelper.requireNonNull(maybeSource4, "source5 is null");
        return Maybe.zipArray(Functions.toFunction(function50), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, MaybeSource maybeSource3, Function4 function40) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        ObjectHelper.requireNonNull(maybeSource3, "source4 is null");
        return Maybe.zipArray(Functions.toFunction(function40), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2, maybeSource3});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2, Function3 function30) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        ObjectHelper.requireNonNull(maybeSource2, "source3 is null");
        return Maybe.zipArray(Functions.toFunction(function30), new MaybeSource[]{maybeSource0, maybeSource1, maybeSource2});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(MaybeSource maybeSource0, MaybeSource maybeSource1, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(maybeSource0, "source1 is null");
        ObjectHelper.requireNonNull(maybeSource1, "source2 is null");
        return Maybe.zipArray(Functions.toFunction(biFunction0), new MaybeSource[]{maybeSource0, maybeSource1});
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zip(Iterable iterable0, Function function0) {
        ObjectHelper.requireNonNull(function0, "zipper is null");
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new MaybeZipIterable(iterable0, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Maybe zipArray(Function function0, MaybeSource[] arr_maybeSource) {
        ObjectHelper.requireNonNull(arr_maybeSource, "sources is null");
        if(arr_maybeSource.length == 0) {
            return Maybe.empty();
        }
        ObjectHelper.requireNonNull(function0, "zipper is null");
        return RxJavaPlugins.onAssembly(new MaybeZipArray(arr_maybeSource, function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe zipWith(MaybeSource maybeSource0, BiFunction biFunction0) {
        ObjectHelper.requireNonNull(maybeSource0, "other is null");
        return Maybe.zip(this, maybeSource0, biFunction0);
    }
}

