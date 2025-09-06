package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jd.a;
import jd.b;
import jd.c;
import jd.d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u00A2\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0003\u0010\r\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001*\u00020\u000EH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0010\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0013\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0016\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0019\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u001D\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001*\u00020\u001EH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u001F\u001A\'\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000 \u00A2\u0006\u0004\b\u0003\u0010!\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007\u00A2\u0006\u0004\b\u0003\u0010#\u001A\'\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000$\u00A2\u0006\u0004\b\u0003\u0010%\u001A1\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00A2\u0006\u0004\b&\u0010#\u001A1\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00A2\u0006\u0004\b\'\u0010#\u001AP\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010(*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001A\b\u0004\u0010*\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0)H\u0087\b\u00A2\u0006\u0004\b+\u0010,\u001Ae\u00102\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010(*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00101\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-\u00A2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b\u00A2\u0006\u0004\b2\u00103\u001Ae\u00105\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010(*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00104\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-\u00A2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b\u00A2\u0006\u0004\b5\u00103\u001A*\u00106\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001A*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u00A2\u0006\u0004\b6\u00107\u001A*\u00108\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001A*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u00A2\u0006\u0004\b8\u00107\u001AM\u00102\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010(*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00109\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u00A2\u0006\u0004\b2\u0010;\u001Ak\u00102\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?0\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010(*\u00020\u001A\"\b\b\u0002\u0010<*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010=\u001A\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010>\u001A\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007\u00A2\u0006\u0004\b2\u0010@\u001A/\u0010A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\bA\u00107\u001A/\u0010B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\bB\u00107\u001A/\u0010C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\bC\u00107\u001A/\u0010D\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\bD\u00107\u001AK\u0010I\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H0G\"\b\b\u0000\u0010E*\u00020\u001A\"\b\b\u0001\u0010F*\u00020\u001A*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H\u0007\u00A2\u0006\u0004\bI\u0010J\u001AQ\u0010L\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010K0H0G\"\b\b\u0000\u0010E*\u00020\u001A\"\b\b\u0001\u0010F*\u00020\u001A*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H\u0007\u00A2\u0006\u0004\bL\u0010J\u001A/\u0010B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000M0\"H\u0007\u00A2\u0006\u0004\bB\u0010#\u00A8\u0006N"}, d2 = {"", "Lio/reactivex/Flowable;", "", "toFlowable", "([Z)Lio/reactivex/Flowable;", "", "", "([B)Lio/reactivex/Flowable;", "", "", "([C)Lio/reactivex/Flowable;", "", "", "([S)Lio/reactivex/Flowable;", "", "", "([I)Lio/reactivex/Flowable;", "", "", "([J)Lio/reactivex/Flowable;", "", "", "([F)Lio/reactivex/Flowable;", "", "", "([D)Lio/reactivex/Flowable;", "", "T", "", "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Flowable;", "", "(Ljava/util/Iterator;)Lio/reactivex/Flowable;", "", "(Ljava/lang/Iterable;)Lio/reactivex/Flowable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Flowable;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "zipFunction", "zip", "cast", "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "ofType", "flowable", "Lkotlin/Pair;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "U", "flowable1", "flowable2", "Lkotlin/Triple;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", "A", "B", "Lio/reactivex/Single;", "", "toMap", "(Lio/reactivex/Flowable;)Lio/reactivex/Single;", "", "toMultimap", "Lorg/reactivestreams/Publisher;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class FlowableKt {
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable cast(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable flowable1 = flowable0.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "cast(R::class.java)");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable combineLatest(@NotNull Flowable flowable0, @NotNull Flowable flowable1) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(flowable1, "flowable");
        b b0 = b.a;
        if(b0 != null) {
            b0 = new o2(b0, 2);
        }
        Flowable flowable2 = Flowable.combineLatest(flowable0, flowable1, ((BiFunction)b0));
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return flowable2;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable combineLatest(@NotNull Flowable flowable0, @NotNull Flowable flowable1, @NotNull Flowable flowable2) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(flowable1, "flowable1");
        Intrinsics.checkParameterIsNotNull(flowable2, "flowable2");
        c c0 = c.a;
        if(c0 != null) {
            c0 = new d(c0);
        }
        Flowable flowable3 = Flowable.combineLatest(flowable0, flowable1, flowable2, ((Function3)c0));
        Intrinsics.checkExpressionValueIsNotNull(flowable3, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return flowable3;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable combineLatest(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(function10, "combineFunction");
        Flowable flowable0 = Flowable.combineLatest(iterable0, new Function() {
            @Override  // io.reactivex.functions.Function
            public Object apply(Object object0) {
                return this.apply(((Object[])object0));
            }

            @NotNull
            public final Object apply(@NotNull Object[] arr_object) {
                Intrinsics.checkParameterIsNotNull(arr_object, "it");
                Iterable iterable0 = ArraysKt___ArraysJvmKt.asList(arr_object);
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    if(object0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList0.add(object0);
                }
                return function10.invoke(arrayList0);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.combineLatest(t…List().map { it as T }) }");
        return flowable0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable concatAll(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$concatAll");
        Flowable flowable1 = flowable0.concatMap(a.d);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "concatMap { it }");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable concatAll(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$concatAll");
        Flowable flowable0 = Flowable.concat(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.concat(this)");
        return flowable0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable flatMapSequence(@NotNull Flowable flowable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$flatMapSequence");
        Intrinsics.checkParameterIsNotNull(function10, "body");
        Flowable flowable1 = flowable0.flatMap(new Function() {
            @NotNull
            public final Flowable apply(@NotNull Object object0) {
                Intrinsics.checkParameterIsNotNull(object0, "it");
                return FlowableKt.toFlowable(((Sequence)function10.invoke(object0)));
            }

            @Override  // io.reactivex.functions.Function
            public Object apply(Object object0) {
                return this.apply(object0);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "flatMap { body(it).toFlowable() }");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable merge(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$merge");
        Flowable flowable0 = Flowable.merge(FlowableKt.toFlowable(iterable0));
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.merge(this.toFlowable())");
        return flowable0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable mergeAll(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$mergeAll");
        Flowable flowable1 = flowable0.flatMap(a.e);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "flatMap { it }");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable mergeDelayError(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$mergeDelayError");
        Flowable flowable0 = Flowable.mergeDelayError(FlowableKt.toFlowable(iterable0));
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.mergeDelayError(this.toFlowable())");
        return flowable0;
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable ofType(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable flowable1 = flowable0.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "ofType(R::class.java)");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable switchLatest(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$switchLatest");
        Flowable flowable1 = flowable0.switchMap(a.f);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "switchMap { it }");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable switchOnNext(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$switchOnNext");
        Flowable flowable1 = Flowable.switchOnNext(flowable0);
        Intrinsics.checkExpressionValueIsNotNull(flowable1, "Flowable.switchOnNext(this)");
        return flowable1;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable toFlowable(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$toFlowable");
        Flowable flowable0 = Flowable.fromIterable(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.fromIterable(this)");
        return flowable0;
    }

    @NotNull
    public static final Flowable toFlowable(@NotNull Iterator iterator0) {
        Intrinsics.checkParameterIsNotNull(iterator0, "$this$toFlowable");
        return FlowableKt.toFlowable(new FlowableKt.toIterable.1(iterator0));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable toFlowable(@NotNull IntProgression intProgression0) {
        Flowable flowable0;
        Intrinsics.checkParameterIsNotNull(intProgression0, "$this$toFlowable");
        if(intProgression0.getStep() == 1 && ((long)intProgression0.getLast()) - ((long)intProgression0.getFirst()) < 0x7FFFFFFFL) {
            flowable0 = Flowable.range(intProgression0.getFirst(), Math.max(0, intProgression0.getLast() - intProgression0.getFirst() + 1));
            Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.range(first, Ma…max(0, last - first + 1))");
            return flowable0;
        }
        flowable0 = Flowable.fromIterable(intProgression0);
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.fromIterable(this)");
        return flowable0;
    }

    @NotNull
    public static final Flowable toFlowable(@NotNull Sequence sequence0) {
        Intrinsics.checkParameterIsNotNull(sequence0, "$this$toFlowable");
        return FlowableKt.toFlowable(SequencesKt___SequencesKt.asIterable(sequence0));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull byte[] arr_b) {
        Intrinsics.checkParameterIsNotNull(arr_b, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_b));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull char[] arr_c) {
        Intrinsics.checkParameterIsNotNull(arr_c, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_c));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull double[] arr_f) {
        Intrinsics.checkParameterIsNotNull(arr_f, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_f));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull float[] arr_f) {
        Intrinsics.checkParameterIsNotNull(arr_f, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_f));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull int[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull long[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable toFlowable(@NotNull Object[] arr_object) {
        Intrinsics.checkParameterIsNotNull(arr_object, "$this$toFlowable");
        Flowable flowable0 = Flowable.fromArray(Arrays.copyOf(arr_object, arr_object.length));
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.fromArray(*this)");
        return flowable0;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull short[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable toFlowable(@NotNull boolean[] arr_z) {
        Intrinsics.checkParameterIsNotNull(arr_z, "$this$toFlowable");
        return FlowableKt.toFlowable(ArraysKt___ArraysKt.asIterable(arr_z));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single toMap(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$toMap");
        Single single0 = flowable0.toMap(a.g, a.h);
        Intrinsics.checkExpressionValueIsNotNull(single0, "toMap({ it.first }, { it.second })");
        return single0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single toMultimap(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$toMultimap");
        Single single0 = flowable0.toMultimap(a.i, a.j);
        Intrinsics.checkExpressionValueIsNotNull(single0, "toMultimap({ it.first }, { it.second })");
        return single0;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Flowable zip(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$zip");
        Intrinsics.checkParameterIsNotNull(function10, "zipFunction");
        Flowable flowable0 = Flowable.zip(iterable0, new Function() {
            @Override  // io.reactivex.functions.Function
            public Object apply(Object object0) {
                return this.apply(((Object[])object0));
            }

            @NotNull
            public final Object apply(@NotNull Object[] arr_object) {
                Intrinsics.checkParameterIsNotNull(arr_object, "it");
                Iterable iterable0 = ArraysKt___ArraysJvmKt.asList(arr_object);
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    if(object0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList0.add(object0);
                }
                return function10.invoke(arrayList0);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable0, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return flowable0;
    }
}

