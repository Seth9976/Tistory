package io.reactivex.rxkotlin;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import jd.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001AF\u0010\u0000\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007\u001Aa\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\b\b\u0002\u0010\b*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\u00072\u001A\b\u0004\u0010\t\u001A\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\b0\nH\u0087\b¨\u0006\u000B"}, d2 = {"zipWith", "Lio/reactivex/Single;", "Lkotlin/Pair;", "T", "U", "", "other", "Lio/reactivex/SingleSource;", "R", "zipper", "Lkotlin/Function2;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class SinglesKt {
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single zipWith(@NotNull Single single0, @NotNull SingleSource singleSource0) {
        Intrinsics.checkParameterIsNotNull(single0, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(singleSource0, "other");
        Single single1 = single0.zipWith(singleSource0, e.m);
        Intrinsics.checkExpressionValueIsNotNull(single1, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return single1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single zipWith(@NotNull Single single0, @NotNull SingleSource singleSource0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(single0, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(singleSource0, "other");
        Intrinsics.checkParameterIsNotNull(function20, "zipper");
        Single single1 = single0.zipWith(singleSource0, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return function20.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(single1, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return single1;
    }
}

