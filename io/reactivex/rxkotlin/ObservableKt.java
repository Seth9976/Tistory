package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jd.a;
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

@Metadata(d1 = {"\u0000\u00AC\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u00A2\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0003\u0010\r\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001*\u00020\u000EH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0010\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0013\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0016\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0019\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u001D\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001*\u00020\u001EH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u001F\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000 H\u0007\u00A2\u0006\u0004\b\u0003\u0010!\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007\u00A2\u0006\u0004\b\u0003\u0010#\u001A)\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000$H\u0007\u00A2\u0006\u0004\b\u0003\u0010%\u001A1\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00A2\u0006\u0004\b&\u0010#\u001A1\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00A2\u0006\u0004\b\'\u0010#\u001A1\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u0001H\u0007\u00A2\u0006\u0004\b(\u0010)\u001A1\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u0001H\u0007\u00A2\u0006\u0004\b*\u0010)\u001AP\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010+*\u00020\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001A\b\u0004\u0010-\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0,H\u0087\b\u00A2\u0006\u0004\b.\u0010/\u001Ae\u00105\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010+*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00104\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u000000\u00A2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00010,H\u0087\b\u00A2\u0006\u0004\b5\u00106\u001Ae\u00108\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A\"\b\b\u0001\u0010+*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00107\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u000000\u00A2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00010,H\u0087\b\u00A2\u0006\u0004\b8\u00106\u001A*\u00109\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010+\u0018\u0001*\u00020\u001A*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u00A2\u0006\u0004\b9\u0010)\u001A*\u0010:\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010+\u0018\u0001*\u00020\u001A*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u00A2\u0006\u0004\b:\u0010)\u001A/\u0010;\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\b;\u0010)\u001A/\u0010<\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\b<\u0010)\u001A/\u0010=\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\b=\u0010)\u001A/\u0010>\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00A2\u0006\u0004\b>\u0010)\u001AK\u0010D\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0B\"\b\b\u0000\u0010?*\u00020\u001A\"\b\b\u0001\u0010@*\u00020\u001A*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A0\u0001H\u0007\u00A2\u0006\u0004\bD\u0010E\u001AQ\u0010G\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010F0C0B\"\b\b\u0000\u0010?*\u00020\u001A\"\b\b\u0001\u0010@*\u00020\u001A*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A0\u0001H\u0007\u00A2\u0006\u0004\bG\u0010E\u001A/\u0010<\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001B*\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000H0\"H\u0007\u00A2\u0006\u0004\b<\u0010#\u00A8\u0006I"}, d2 = {"", "Lio/reactivex/Observable;", "", "toObservable", "([Z)Lio/reactivex/Observable;", "", "", "([B)Lio/reactivex/Observable;", "", "", "([C)Lio/reactivex/Observable;", "", "", "([S)Lio/reactivex/Observable;", "", "", "([I)Lio/reactivex/Observable;", "", "", "([J)Lio/reactivex/Observable;", "", "", "([F)Lio/reactivex/Observable;", "", "", "([D)Lio/reactivex/Observable;", "", "T", "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Observable;", "", "(Ljava/util/Iterator;)Lio/reactivex/Observable;", "", "(Ljava/lang/Iterable;)Lio/reactivex/Observable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Observable;", "merge", "mergeDelayError", "flatMapIterable", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "concatMapIterable", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "zipFunction", "zip", "cast", "ofType", "mergeAll", "concatAll", "switchLatest", "switchOnNext", "A", "B", "Lkotlin/Pair;", "Lio/reactivex/Single;", "", "toMap", "(Lio/reactivex/Observable;)Lio/reactivex/Single;", "", "toMultimap", "Lio/reactivex/ObservableSource;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class ObservableKt {
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable cast(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable observable1 = observable0.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "cast(R::class.java)");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable combineLatest(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$combineLatest");
        Intrinsics.checkParameterIsNotNull(function10, "combineFunction");
        Observable observable0 = Observable.combineLatest(iterable0, new Function() {
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
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.combineLatest…List().map { it as T }) }");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable concatAll(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$concatAll");
        Observable observable1 = observable0.concatMap(a.m);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "concatMap { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable concatAll(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$concatAll");
        Observable observable0 = Observable.concat(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.concat(this)");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable concatMapIterable(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$concatMapIterable");
        Observable observable1 = observable0.concatMapIterable(a.n);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "concatMapIterable { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable flatMapIterable(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$flatMapIterable");
        Observable observable1 = observable0.flatMapIterable(a.o);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "flatMapIterable { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable flatMapSequence(@NotNull Observable observable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$flatMapSequence");
        Intrinsics.checkParameterIsNotNull(function10, "body");
        Observable observable1 = observable0.flatMap(new Function() {
            @NotNull
            public final Observable apply(@NotNull Object object0) {
                Intrinsics.checkParameterIsNotNull(object0, "it");
                return ObservableKt.toObservable(((Sequence)function10.invoke(object0)));
            }

            @Override  // io.reactivex.functions.Function
            public Object apply(Object object0) {
                return this.apply(object0);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable1, "flatMap { body(it).toObservable() }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable merge(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$merge");
        Observable observable0 = Observable.merge(ObservableKt.toObservable(iterable0));
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.merge(this.toObservable())");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable mergeAll(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$mergeAll");
        Observable observable1 = observable0.flatMap(a.p);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "flatMap { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable mergeDelayError(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$mergeDelayError");
        Observable observable0 = Observable.mergeDelayError(ObservableKt.toObservable(iterable0));
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.mergeDelayError(this.toObservable())");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable ofType(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable observable1 = observable0.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "ofType(R::class.java)");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable switchLatest(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$switchLatest");
        Observable observable1 = observable0.switchMap(a.q);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "switchMap { it }");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable switchOnNext(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$switchOnNext");
        Observable observable1 = Observable.switchOnNext(observable0);
        Intrinsics.checkExpressionValueIsNotNull(observable1, "Observable.switchOnNext(this)");
        return observable1;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single toMap(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$toMap");
        Single single0 = observable0.toMap(a.r, a.s);
        Intrinsics.checkExpressionValueIsNotNull(single0, "toMap({ it.first }, { it.second })");
        return single0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Single toMultimap(@NotNull Observable observable0) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$toMultimap");
        Single single0 = observable0.toMultimap(a.t, a.u);
        Intrinsics.checkExpressionValueIsNotNull(single0, "toMultimap({ it.first }, { it.second })");
        return single0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull Iterable iterable0) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$toObservable");
        Observable observable0 = Observable.fromIterable(iterable0);
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.fromIterable(this)");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull Iterator iterator0) {
        Intrinsics.checkParameterIsNotNull(iterator0, "$this$toObservable");
        return ObservableKt.toObservable(new ObservableKt.toIterable.1(iterator0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull IntProgression intProgression0) {
        Observable observable0;
        Intrinsics.checkParameterIsNotNull(intProgression0, "$this$toObservable");
        if(intProgression0.getStep() == 1 && ((long)intProgression0.getLast()) - ((long)intProgression0.getFirst()) < 0x7FFFFFFFL) {
            observable0 = Observable.range(intProgression0.getFirst(), Math.max(0, intProgression0.getLast() - intProgression0.getFirst() + 1));
            Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.range(first, …max(0, last - first + 1))");
            return observable0;
        }
        observable0 = Observable.fromIterable(intProgression0);
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.fromIterable(this)");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull Sequence sequence0) {
        Intrinsics.checkParameterIsNotNull(sequence0, "$this$toObservable");
        return ObservableKt.toObservable(SequencesKt___SequencesKt.asIterable(sequence0));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull byte[] arr_b) {
        Intrinsics.checkParameterIsNotNull(arr_b, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_b));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull char[] arr_c) {
        Intrinsics.checkParameterIsNotNull(arr_c, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_c));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull double[] arr_f) {
        Intrinsics.checkParameterIsNotNull(arr_f, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull float[] arr_f) {
        Intrinsics.checkParameterIsNotNull(arr_f, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull int[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull long[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull Object[] arr_object) {
        Intrinsics.checkParameterIsNotNull(arr_object, "$this$toObservable");
        Observable observable0 = Observable.fromArray(Arrays.copyOf(arr_object, arr_object.length));
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.fromArray(*this)");
        return observable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull short[] arr_v) {
        Intrinsics.checkParameterIsNotNull(arr_v, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_v));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable toObservable(@NotNull boolean[] arr_z) {
        Intrinsics.checkParameterIsNotNull(arr_z, "$this$toObservable");
        return ObservableKt.toObservable(ArraysKt___ArraysKt.asIterable(arr_z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable zip(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(iterable0, "$this$zip");
        Intrinsics.checkParameterIsNotNull(function10, "zipFunction");
        Observable observable0 = Observable.zip(iterable0, new Function() {
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
        Intrinsics.checkExpressionValueIsNotNull(observable0, "Observable.zip(this) { z…List().map { it as T }) }");
        return observable0;
    }
}

