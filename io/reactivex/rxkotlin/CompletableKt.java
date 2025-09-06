package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Action;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001A\u0012\u0010\u0004\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001A\u0012\u0010\u0004\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001A\u0010\u0010\u0007\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\b\u001A\n\u0010\u0007\u001A\u00020\u0001*\u00020\n\u001A\u0012\u0010\u0007\u001A\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000B\u001A\u0012\u0010\u0007\u001A\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\f¨\u0006\r"}, d2 = {"concatAll", "Lio/reactivex/Completable;", "", "Lio/reactivex/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/Flowable;", "Lio/reactivex/Observable;", "toCompletable", "Lkotlin/Function0;", "", "Lio/reactivex/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class CompletableKt {
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Completable concatAll(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$concatAll");
        Completable completable0 = Completable.concat(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "Completable.concat(this)");
        return completable0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Completable mergeAllCompletables(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$mergeAllCompletables");
        Completable completable0 = flowable0.flatMapCompletable(a.c);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "flatMapCompletable { it }");
        return completable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Completable mergeAllCompletables(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$mergeAllCompletables");
        Completable completable0 = observable0.flatMapCompletable(a.b);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "flatMapCompletable { it }");
        return completable0;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Action action0) {
        Intrinsics.checkParameterIsNotNull(action0, "$this$toCompletable");
        Completable completable0 = Completable.fromAction(action0);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "Completable.fromAction(this)");
        return completable0;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Callable callable0) {
        Intrinsics.checkParameterIsNotNull(callable0, "$this$toCompletable");
        Completable completable0 = Completable.fromCallable(callable0);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "Completable.fromCallable(this)");
        return completable0;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Future future0) {
        Intrinsics.checkParameterIsNotNull(future0, "$this$toCompletable");
        Completable completable0 = Completable.fromFuture(future0);
        Intrinsics.checkExpressionValueIsNotNull(completable0, "Completable.fromFuture(this)");
        return completable0;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Function0 function00) {
        Intrinsics.checkParameterIsNotNull(function00, "$this$toCompletable");
        Completable completable0 = Completable.fromCallable(new a6.a(function00, 5));
        Intrinsics.checkExpressionValueIsNotNull(completable0, "Completable.fromCallable(this)");
        return completable0;
    }
}

