package io.reactivex.rxkotlin;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00C6\u0002\u0018\u00002\u00020\u0001Jl\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\u001A\b\u0004\u0010\t\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bH\u0087\b\u00A2\u0006\u0004\b\u000B\u0010\fJQ\u0010\u000B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\n\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u000EJ\u008A\u0001\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052 \b\u0004\u0010\t\u001A\u001A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0013H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010\u0014Jo\u0010\u000B\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00150\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0016J\u00A8\u0001\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00040\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052&\b\u0004\u0010\t\u001A \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0019H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010\u001AJ\u00C6\u0001\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00050\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u001B*\u00020\u0001\"\b\b\u0005\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052,\b\u0004\u0010\t\u001A&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001DH\u0087\b\u00A2\u0006\u0004\b\u000B\u0010\u001EJ\u00E4\u0001\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00060\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u001B*\u00020\u0001\"\b\b\u0005\u0010\u001F*\u00020\u0001\"\b\b\u0006\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00050\u000522\b\u0004\u0010\t\u001A,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060!H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010\"J\u0082\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00070\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u001B*\u00020\u0001\"\b\b\u0005\u0010\u001F*\u00020\u0001\"\b\b\u0006\u0010#*\u00020\u0001\"\b\b\u0007\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00060\u000528\b\u0004\u0010\t\u001A2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070%H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010&J\u00A0\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\b0\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u001B*\u00020\u0001\"\b\b\u0005\u0010\u001F*\u00020\u0001\"\b\b\u0006\u0010#*\u00020\u0001\"\b\b\u0007\u0010\'*\u00020\u0001\"\b\b\b\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052>\b\u0004\u0010\t\u001A8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0)H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010*J\u00BE\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\t0\n\"\b\b\u0000\u0010\u000F*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u0001\"\b\b\u0002\u0010\u0011*\u00020\u0001\"\b\b\u0003\u0010\u0017*\u00020\u0001\"\b\b\u0004\u0010\u001B*\u00020\u0001\"\b\b\u0005\u0010\u001F*\u00020\u0001\"\b\b\u0006\u0010#*\u00020\u0001\"\b\b\u0007\u0010\'*\u00020\u0001\"\b\b\b\u0010+*\u00020\u0001\"\b\b\t\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\b0\u00052D\b\u0004\u0010\t\u001A>\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t0-H\u0087\b\u00A2\u0006\u0004\b\u000B\u0010.\u00A8\u0006/"}, d2 = {"Lio/reactivex/rxkotlin/Maybes;", "", "T", "U", "R", "Lio/reactivex/MaybeSource;", "s1", "s2", "Lkotlin/Function2;", "zipper", "Lio/reactivex/Maybe;", "zip", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "Lkotlin/Pair;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;)Lio/reactivex/Maybe;", "T1", "T2", "T3", "s3", "Lkotlin/Function3;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function3;)Lio/reactivex/Maybe;", "Lkotlin/Triple;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;)Lio/reactivex/Maybe;", "T4", "s4", "Lkotlin/Function4;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function4;)Lio/reactivex/Maybe;", "T5", "s5", "Lkotlin/Function5;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function5;)Lio/reactivex/Maybe;", "T6", "s6", "Lkotlin/Function6;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function6;)Lio/reactivex/Maybe;", "T7", "s7", "Lkotlin/Function7;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function7;)Lio/reactivex/Maybe;", "T8", "s8", "Lkotlin/Function8;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function8;)Lio/reactivex/Maybe;", "T9", "s9", "Lkotlin/Function9;", "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;Lkotlin/jvm/functions/Function9;)Lio/reactivex/Maybe;", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class Maybes {
    public static final Maybes INSTANCE;

    static {
        Maybes.INSTANCE = new Maybes();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, e.f);
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, f.e);
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3,\n  … -> Triple(t1, t2, t3) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull MaybeSource maybeSource4, @NotNull MaybeSource maybeSource5, @NotNull MaybeSource maybeSource6, @NotNull MaybeSource maybeSource7, @NotNull MaybeSource maybeSource8, @NotNull Function9 function90) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(maybeSource4, "s5");
        Intrinsics.checkParameterIsNotNull(maybeSource5, "s6");
        Intrinsics.checkParameterIsNotNull(maybeSource6, "s7");
        Intrinsics.checkParameterIsNotNull(maybeSource7, "s8");
        Intrinsics.checkParameterIsNotNull(maybeSource8, "s9");
        Intrinsics.checkParameterIsNotNull(function90, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, maybeSource8, new io.reactivex.functions.Function9() {
            @Override  // io.reactivex.functions.Function9
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7, @NotNull Object object8) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                Intrinsics.checkParameterIsNotNull(object8, "t9");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…4, t5, t6, t7, t8, t9) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull MaybeSource maybeSource4, @NotNull MaybeSource maybeSource5, @NotNull MaybeSource maybeSource6, @NotNull MaybeSource maybeSource7, @NotNull Function8 function80) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(maybeSource4, "s5");
        Intrinsics.checkParameterIsNotNull(maybeSource5, "s6");
        Intrinsics.checkParameterIsNotNull(maybeSource6, "s7");
        Intrinsics.checkParameterIsNotNull(maybeSource7, "s8");
        Intrinsics.checkParameterIsNotNull(function80, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, new io.reactivex.functions.Function8() {
            @Override  // io.reactivex.functions.Function8
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…3, t4, t5, t6, t7, t8) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull MaybeSource maybeSource4, @NotNull MaybeSource maybeSource5, @NotNull MaybeSource maybeSource6, @NotNull Function7 function70) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(maybeSource4, "s5");
        Intrinsics.checkParameterIsNotNull(maybeSource5, "s6");
        Intrinsics.checkParameterIsNotNull(maybeSource6, "s7");
        Intrinsics.checkParameterIsNotNull(function70, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, new io.reactivex.functions.Function7() {
            @Override  // io.reactivex.functions.Function7
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…2, t3, t4, t5, t6, t7) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull MaybeSource maybeSource4, @NotNull MaybeSource maybeSource5, @NotNull Function6 function60) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(maybeSource4, "s5");
        Intrinsics.checkParameterIsNotNull(maybeSource5, "s6");
        Intrinsics.checkParameterIsNotNull(function60, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, maybeSource5, new io.reactivex.functions.Function6() {
            @Override  // io.reactivex.functions.Function6
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                return this.a.invoke(object0, object1, object2, object3, object4, object5);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…1, t2, t3, t4, t5, t6) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull MaybeSource maybeSource4, @NotNull Function5 function50) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(maybeSource4, "s5");
        Intrinsics.checkParameterIsNotNull(function50, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, maybeSource4, new io.reactivex.functions.Function5() {
            @Override  // io.reactivex.functions.Function5
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                return this.a.invoke(object0, object1, object2, object3, object4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…ke(t1, t2, t3, t4, t5) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull MaybeSource maybeSource3, @NotNull Function4 function40) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(maybeSource3, "s4");
        Intrinsics.checkParameterIsNotNull(function40, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, maybeSource3, new io.reactivex.functions.Function4() {
            @Override  // io.reactivex.functions.Function4
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                return this.a.invoke(object0, object1, object2, object3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull MaybeSource maybeSource2, @NotNull Function3 function30) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(maybeSource2, "s3");
        Intrinsics.checkParameterIsNotNull(function30, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, maybeSource2, new io.reactivex.functions.Function3() {
            @Override  // io.reactivex.functions.Function3
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return this.a.invoke(object0, object1, object2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2, s3,\n  …per.invoke(t1, t2, t3) })");
        return maybe0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Maybe zip(@NotNull MaybeSource maybeSource0, @NotNull MaybeSource maybeSource1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(maybeSource0, "s1");
        Intrinsics.checkParameterIsNotNull(maybeSource1, "s2");
        Intrinsics.checkParameterIsNotNull(function20, "zipper");
        Maybe maybe0 = Maybe.zip(maybeSource0, maybeSource1, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t");
                Intrinsics.checkParameterIsNotNull(object1, "u");
                return this.a.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybe0, "Maybe.zip(s1, s2,\n      …-> zipper.invoke(t, u) })");
        return maybe0;
    }
}

