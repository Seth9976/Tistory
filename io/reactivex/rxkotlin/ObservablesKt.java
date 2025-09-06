package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import jd.e;
import jd.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Ad\u0010\u0000\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00050\bH\u0007\u001A\u007F\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00050\b2 \b\u0004\u0010\u000B\u001A\u001A\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\fH\u0087\b\u001A\u009D\u0001\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\r0\b2&\b\u0004\u0010\u000B\u001A \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\n0\u000FH\u0087\b\u001A\u00BB\u0001\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\u0010*\u00020\u0006\"\b\b\u0005\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\r0\b2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\u00100\b2,\b\u0004\u0010\u000B\u001A&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\n0\u0012H\u0087\b\u001AF\u0010\u0000\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001Aa\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00140\b2\u001A\b\u0004\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b\u001AF\u0010\u0017\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001Aa\u0010\u0017\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00140\b2\u001A\b\u0004\u0010\u0018\u001A\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b\u00A8\u0006\u0019"}, d2 = {"withLatestFrom", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "T", "T1", "T2", "", "o1", "Lio/reactivex/ObservableSource;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class ObservablesKt {
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "other");
        Observable observable1 = observable0.withLatestFrom(observableSource0, e.j);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull ObservableSource observableSource1) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "o1");
        Intrinsics.checkParameterIsNotNull(observableSource1, "o2");
        Observable observable1 = observable0.withLatestFrom(observableSource0, observableSource1, f.h);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull ObservableSource observableSource1, @NotNull ObservableSource observableSource2, @NotNull ObservableSource observableSource3, @NotNull Function5 function50) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "o1");
        Intrinsics.checkParameterIsNotNull(observableSource1, "o2");
        Intrinsics.checkParameterIsNotNull(observableSource2, "o3");
        Intrinsics.checkParameterIsNotNull(observableSource3, "o4");
        Intrinsics.checkParameterIsNotNull(function50, "combiner");
        Observable observable1 = observable0.withLatestFrom(observableSource0, observableSource1, observableSource2, observableSource3, new io.reactivex.functions.Function5() {
            @Override  // io.reactivex.functions.Function5
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "t1");
                Intrinsics.checkParameterIsNotNull(object2, "t2");
                Intrinsics.checkParameterIsNotNull(object3, "t3");
                Intrinsics.checkParameterIsNotNull(object4, "t4");
                return function50.invoke(object0, object1, object2, object3, object4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull ObservableSource observableSource1, @NotNull ObservableSource observableSource2, @NotNull Function4 function40) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "o1");
        Intrinsics.checkParameterIsNotNull(observableSource1, "o2");
        Intrinsics.checkParameterIsNotNull(observableSource2, "o3");
        Intrinsics.checkParameterIsNotNull(function40, "combiner");
        Observable observable1 = observable0.withLatestFrom(observableSource0, observableSource1, observableSource2, new io.reactivex.functions.Function4() {
            @Override  // io.reactivex.functions.Function4
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "t1");
                Intrinsics.checkParameterIsNotNull(object2, "t2");
                Intrinsics.checkParameterIsNotNull(object3, "t3");
                return function40.invoke(object0, object1, object2, object3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull ObservableSource observableSource1, @NotNull Function3 function30) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "o1");
        Intrinsics.checkParameterIsNotNull(observableSource1, "o2");
        Intrinsics.checkParameterIsNotNull(function30, "combiner");
        Observable observable1 = observable0.withLatestFrom(observableSource0, observableSource1, new io.reactivex.functions.Function3() {
            @Override  // io.reactivex.functions.Function3
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "t1");
                Intrinsics.checkParameterIsNotNull(object2, "t2");
                return function30.invoke(object0, object1, object2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable withLatestFrom(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(observableSource0, "other");
        Intrinsics.checkParameterIsNotNull(function20, "combiner");
        Observable observable1 = observable0.withLatestFrom(observableSource0, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return function20.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable zipWith(@NotNull Observable observable0, @NotNull ObservableSource observableSource0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(observableSource0, "other");
        Observable observable1 = observable0.zipWith(observableSource0, e.k);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable zipWith(@NotNull Observable observable0, @NotNull ObservableSource observableSource0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$zipWith");
        Intrinsics.checkParameterIsNotNull(observableSource0, "other");
        Intrinsics.checkParameterIsNotNull(function20, "zipper");
        Observable observable1 = observable0.zipWith(observableSource0, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return function20.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return observable1;
    }
}

