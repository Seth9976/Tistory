package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001A(\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001A(\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001A(\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007\u001A#\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¨\u0006\f"}, d2 = {"cast", "Lio/reactivex/Maybe;", "R", "", "concatAll", "Lio/reactivex/Flowable;", "T", "", "Lio/reactivex/MaybeSource;", "mergeAllMaybes", "Lio/reactivex/Observable;", "ofType", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class MaybeKt {
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Maybe cast(@NotNull Maybe maybe0) {
        Intrinsics.checkParameterIsNotNull(maybe0, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe maybe1 = maybe0.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe1, "cast(R::class.java)");
        return maybe1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable concatAll(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$concatAll");
        Flowable flowable0 = Maybe.concat(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Maybe.concat(this)");
        return flowable0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable mergeAllMaybes(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$mergeAllMaybes");
        Flowable flowable1 = flowable0.flatMapMaybe(a.l);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "flatMapMaybe { it }");
        return flowable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable mergeAllMaybes(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$mergeAllMaybes");
        Observable observable1 = observable0.flatMapMaybe(a.k);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "flatMapMaybe { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Maybe ofType(@NotNull Maybe maybe0) {
        Intrinsics.checkParameterIsNotNull(maybe0, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe maybe1 = maybe0.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe1, "ofType(R::class.java)");
        return maybe1;
    }
}

