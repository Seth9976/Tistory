package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAmb;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableCache;
import io.reactivex.internal.operators.completable.CompletableConcat;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDefer;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableDetach;
import io.reactivex.internal.operators.completable.CompletableDisposeOn;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.CompletableDoOnEvent;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableError;
import io.reactivex.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletableFromObservable;
import io.reactivex.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.internal.operators.completable.CompletableHide;
import io.reactivex.internal.operators.completable.CompletableLift;
import io.reactivex.internal.operators.completable.CompletableMaterialize;
import io.reactivex.internal.operators.completable.CompletableMerge;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableNever;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable;
import io.reactivex.internal.operators.completable.CompletableTimeout;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.completable.CompletableToObservable;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.completable.CompletableUsing;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

public abstract class Completable implements CompletableSource {
    public final Completable a(Consumer consumer0, Consumer consumer1, Action action0, Action action1, Action action2, Action action3) {
        ObjectHelper.requireNonNull(consumer0, "onSubscribe is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.requireNonNull(action1, "onTerminate is null");
        ObjectHelper.requireNonNull(action2, "onAfterTerminate is null");
        ObjectHelper.requireNonNull(action3, "onDispose is null");
        return RxJavaPlugins.onAssembly(new CompletablePeek(this, consumer0, consumer1, action0, action1, action2, action3));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable amb(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableAmb(null, iterable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable ambArray(CompletableSource[] arr_completableSource) {
        ObjectHelper.requireNonNull(arr_completableSource, "sources is null");
        if(arr_completableSource.length == 0) {
            return Completable.complete();
        }
        return arr_completableSource.length == 1 ? Completable.wrap(arr_completableSource[0]) : RxJavaPlugins.onAssembly(new CompletableAmb(arr_completableSource, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable ambWith(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return Completable.ambArray(new CompletableSource[]{this, completableSource0});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable andThen(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable andThen(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenPublisher(this, publisher0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe andThen(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "next is null");
        return RxJavaPlugins.onAssembly(new MaybeDelayWithCompletable(maybeSource0, this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable andThen(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenObservable(this, observableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single andThen(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "next is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(singleSource0, this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Object as(@NonNull CompletableConverter completableConverter0) {
        return ((CompletableConverter)ObjectHelper.requireNonNull(completableConverter0, "converter is null")).apply(this);
    }

    public static Completable b(Publisher publisher0, int v, boolean z) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        ObjectHelper.verifyPositive(v, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new CompletableMerge(publisher0, v, z));
    }

    @SchedulerSupport("none")
    public final void blockingAwait() {
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        blockingMultiObserver0.blockingGet();
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final boolean blockingAwait(long v, TimeUnit timeUnit0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        return blockingMultiObserver0.blockingAwait(v, timeUnit0);
    }

    @CheckReturnValue
    @Nullable
    @SchedulerSupport("none")
    public final Throwable blockingGet() {
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        return blockingMultiObserver0.blockingGetError();
    }

    @CheckReturnValue
    @Nullable
    @SchedulerSupport("none")
    public final Throwable blockingGet(long v, TimeUnit timeUnit0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        BlockingMultiObserver blockingMultiObserver0 = new BlockingMultiObserver();
        this.subscribe(blockingMultiObserver0);
        return blockingMultiObserver0.blockingGetError(v, timeUnit0);
    }

    public final Completable c(long v, TimeUnit timeUnit0, Scheduler scheduler0, CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimeout(this, v, timeUnit0, scheduler0, completableSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable cache() {
        return RxJavaPlugins.onAssembly(new CompletableCache(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable complete() {
        return RxJavaPlugins.onAssembly(CompletableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable compose(CompletableTransformer completableTransformer0) {
        return Completable.wrap(((CompletableTransformer)ObjectHelper.requireNonNull(completableTransformer0, "transformer is null")).apply(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable concat(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableConcatIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable concat(Publisher publisher0) {
        return Completable.concat(publisher0, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable concat(Publisher publisher0, int v) {
        ObjectHelper.requireNonNull(publisher0, "sources is null");
        ObjectHelper.verifyPositive(v, "prefetch");
        return RxJavaPlugins.onAssembly(new CompletableConcat(publisher0, v));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable concatArray(CompletableSource[] arr_completableSource) {
        ObjectHelper.requireNonNull(arr_completableSource, "sources is null");
        if(arr_completableSource.length == 0) {
            return Completable.complete();
        }
        return arr_completableSource.length == 1 ? Completable.wrap(arr_completableSource[0]) : RxJavaPlugins.onAssembly(new CompletableConcatArray(arr_completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatWith(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable create(CompletableOnSubscribe completableOnSubscribe0) {
        ObjectHelper.requireNonNull(completableOnSubscribe0, "source is null");
        return RxJavaPlugins.onAssembly(new CompletableCreate(completableOnSubscribe0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable defer(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "completableSupplier");
        return RxJavaPlugins.onAssembly(new CompletableDefer(callable0));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Completable delay(long v, TimeUnit timeUnit0) {
        return this.delay(v, timeUnit0, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Completable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.delay(v, timeUnit0, scheduler0, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable delay(long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDelay(this, v, timeUnit0, scheduler0, z));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("io.reactivex:computation")
    public final Completable delaySubscription(long v, TimeUnit timeUnit0) {
        return this.delaySubscription(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("custom")
    public final Completable delaySubscription(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return Completable.timer(v, timeUnit0, scheduler0).andThen(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doAfterTerminate(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, action0, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doFinally(Action action0) {
        ObjectHelper.requireNonNull(action0, "onFinally is null");
        return RxJavaPlugins.onAssembly(new CompletableDoFinally(this, action0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doOnComplete(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), action0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doOnDispose(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, action0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doOnError(Consumer consumer0) {
        return this.a(Functions.emptyConsumer(), consumer0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnEvent(Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onEvent is null");
        return RxJavaPlugins.onAssembly(new CompletableDoOnEvent(this, consumer0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doOnSubscribe(Consumer consumer0) {
        return this.a(consumer0, Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable doOnTerminate(Action action0) {
        return this.a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action0, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable error(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "error is null");
        return RxJavaPlugins.onAssembly(new CompletableError(throwable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable error(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableErrorSupplier(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromAction(Action action0) {
        ObjectHelper.requireNonNull(action0, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromAction(action0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromCallable(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "callable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromCallable(callable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromFuture(Future future0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return Completable.fromAction(Functions.futureAction(future0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromMaybe(MaybeSource maybeSource0) {
        ObjectHelper.requireNonNull(maybeSource0, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElementCompletable(maybeSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromObservable(ObservableSource observableSource0) {
        ObjectHelper.requireNonNull(observableSource0, "observable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromObservable(observableSource0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromPublisher(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "publisher is null");
        return RxJavaPlugins.onAssembly(new CompletableFromPublisher(publisher0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromRunnable(Runnable runnable0) {
        ObjectHelper.requireNonNull(runnable0, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromRunnable(runnable0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromSingle(SingleSource singleSource0) {
        ObjectHelper.requireNonNull(singleSource0, "single is null");
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(singleSource0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable hide() {
        return RxJavaPlugins.onAssembly(new CompletableHide(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable lift(CompletableOperator completableOperator0) {
        ObjectHelper.requireNonNull(completableOperator0, "onLift is null");
        return RxJavaPlugins.onAssembly(new CompletableLift(this, completableOperator0));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final Single materialize() {
        return RxJavaPlugins.onAssembly(new CompletableMaterialize(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable merge(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable merge(Publisher publisher0) {
        return Completable.b(publisher0, 0x7FFFFFFF, false);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable merge(Publisher publisher0, int v) {
        return Completable.b(publisher0, v, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable mergeArray(CompletableSource[] arr_completableSource) {
        ObjectHelper.requireNonNull(arr_completableSource, "sources is null");
        if(arr_completableSource.length == 0) {
            return Completable.complete();
        }
        return arr_completableSource.length == 1 ? Completable.wrap(arr_completableSource[0]) : RxJavaPlugins.onAssembly(new CompletableMergeArray(arr_completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable mergeArrayDelayError(CompletableSource[] arr_completableSource) {
        ObjectHelper.requireNonNull(arr_completableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorArray(arr_completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable mergeDelayError(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorIterable(iterable0));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable mergeDelayError(Publisher publisher0) {
        return Completable.b(publisher0, 0x7FFFFFFF, true);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable mergeDelayError(Publisher publisher0, int v) {
        return Completable.b(publisher0, v, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable mergeWith(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return Completable.mergeArray(new CompletableSource[]{this, completableSource0});
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable never() {
        return RxJavaPlugins.onAssembly(CompletableNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable observeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableObserveOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable onErrorComplete() {
        return this.onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorComplete(Predicate predicate0) {
        ObjectHelper.requireNonNull(predicate0, "predicate is null");
        return RxJavaPlugins.onAssembly(new CompletableOnErrorComplete(this, predicate0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorResumeNext(Function function0) {
        ObjectHelper.requireNonNull(function0, "errorMapper is null");
        return RxJavaPlugins.onAssembly(new CompletableResumeNext(this, function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new CompletableDetach(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable repeat() {
        return Completable.fromPublisher(this.toFlowable().repeat());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable repeat(long v) {
        return Completable.fromPublisher(this.toFlowable().repeat(v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable repeatUntil(BooleanSupplier booleanSupplier0) {
        return Completable.fromPublisher(this.toFlowable().repeatUntil(booleanSupplier0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable repeatWhen(Function function0) {
        return Completable.fromPublisher(this.toFlowable().repeatWhen(function0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retry() {
        return Completable.fromPublisher(this.toFlowable().retry());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retry(long v) {
        return Completable.fromPublisher(this.toFlowable().retry(v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retry(long v, Predicate predicate0) {
        return Completable.fromPublisher(this.toFlowable().retry(v, predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retry(BiPredicate biPredicate0) {
        return Completable.fromPublisher(this.toFlowable().retry(biPredicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retry(Predicate predicate0) {
        return Completable.fromPublisher(this.toFlowable().retry(predicate0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable retryWhen(Function function0) {
        return Completable.fromPublisher(this.toFlowable().retryWhen(function0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable startWith(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return Completable.concatArray(new CompletableSource[]{completableSource0, this});
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Flowable startWith(Publisher publisher0) {
        ObjectHelper.requireNonNull(publisher0, "other is null");
        return this.toFlowable().startWith(publisher0);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable startWith(Observable observable0) {
        ObjectHelper.requireNonNull(observable0, "other is null");
        return observable0.concatWith(this.toObservable());
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        Disposable disposable0 = new EmptyCompletableObserver();
        this.subscribe(((CompletableObserver)disposable0));
        return disposable0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(Action action0) {
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        Disposable disposable0 = new CallbackCompletableObserver(action0);
        this.subscribe(((CompletableObserver)disposable0));
        return disposable0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(Action action0, Consumer consumer0) {
        ObjectHelper.requireNonNull(consumer0, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        Disposable disposable0 = new CallbackCompletableObserver(consumer0, action0);
        this.subscribe(((CompletableObserver)disposable0));
        return disposable0;
    }

    @Override  // io.reactivex.CompletableSource
    @SchedulerSupport("none")
    public final void subscribe(CompletableObserver completableObserver0) {
        ObjectHelper.requireNonNull(completableObserver0, "observer is null");
        try {
            CompletableObserver completableObserver1 = RxJavaPlugins.onSubscribe(this, completableObserver0);
            ObjectHelper.requireNonNull(completableObserver1, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.subscribeActual(completableObserver1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("Actually not, but can\'t pass out an exception otherwise...");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
    }

    public abstract void subscribeActual(CompletableObserver arg1);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable subscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableSubscribeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletableObserver subscribeWith(CompletableObserver completableObserver0) {
        this.subscribe(completableObserver0);
        return completableObserver0;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable takeUntil(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableTakeUntilCompletable(this, completableSource0));
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
    public final Completable timeout(long v, TimeUnit timeUnit0) {
        return this.c(v, timeUnit0, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Completable timeout(long v, TimeUnit timeUnit0, CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return this.c(v, timeUnit0, Schedulers.computation(), completableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Completable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return this.c(v, timeUnit0, scheduler0, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable timeout(long v, TimeUnit timeUnit0, Scheduler scheduler0, CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "other is null");
        return this.c(v, timeUnit0, scheduler0, completableSource0);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Completable timer(long v, TimeUnit timeUnit0) {
        return Completable.timer(v, timeUnit0, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Completable timer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        ObjectHelper.requireNonNull(timeUnit0, "unit is null");
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimer(v, timeUnit0, scheduler0));
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

    // 去混淆评级： 低(20)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable)this).fuseToFlowable() : RxJavaPlugins.onAssembly(new CompletableToFlowable(this));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe)this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromCompletable(this));
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable)this).fuseToObservable() : RxJavaPlugins.onAssembly(new CompletableToObservable(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toSingle(Callable callable0) {
        ObjectHelper.requireNonNull(callable0, "completionValueSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, callable0, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single toSingleDefault(Object object0) {
        ObjectHelper.requireNonNull(object0, "completionValue is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, null, object0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable unsafeCreate(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "source is null");
        if(completableSource0 instanceof Completable) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource0));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable unsubscribeOn(Scheduler scheduler0) {
        ObjectHelper.requireNonNull(scheduler0, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDisposeOn(this, scheduler0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Completable using(Callable callable0, Function function0, Consumer consumer0) {
        return Completable.using(callable0, function0, consumer0, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable using(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        ObjectHelper.requireNonNull(callable0, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function0, "completableFunction is null");
        ObjectHelper.requireNonNull(consumer0, "disposer is null");
        return RxJavaPlugins.onAssembly(new CompletableUsing(callable0, function0, consumer0, z));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable wrap(CompletableSource completableSource0) {
        ObjectHelper.requireNonNull(completableSource0, "source is null");
        return completableSource0 instanceof Completable ? RxJavaPlugins.onAssembly(((Completable)completableSource0)) : RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource0));
    }
}

