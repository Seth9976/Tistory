package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001A1\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001A\u0017\u0010\n\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000B\u001A*\u0010\u0012\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001A\u0010\u0018\u001A\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001A\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001A\u001A\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001A\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "snappingOffset", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "calculateFinalOffset", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMinFlingVelocityDp", "()F", "MinFlingVelocityDp", "NoDistance", "NoVelocity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,507:1\n503#1,4:515\n503#1,4:519\n503#1,4:523\n77#2:508\n1223#3,6:509\n148#4:527\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n351#1:515,4\n395#1:519,4\n477#1:523,4\n258#1:508\n260#1:509,6\n463#1:527\n*E\n"})
public final class SnapFlingBehaviorKt {
    public static final float NoDistance;
    public static final float NoVelocity;
    public static final float a;

    static {
        SnapFlingBehaviorKt.a = 400.0f;
    }

    public static final Object access$animateDecay(ScrollScope scrollScope0, float f, AnimationState animationState0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, Continuation continuation0) {
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.s;
            if((v & 0x80000000) == 0) {
                i0 = new i(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                i0.s = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = i0.r;
        a a0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(i0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                int v1 = ((Number)animationState0.getVelocity()).floatValue() == 0.0f ? 1 : 0;
                j j0 = new j(f, ref$FloatRef0, scrollScope0, function10);
                i0.p = animationState0;
                i0.q = ref$FloatRef0;
                i0.o = f;
                i0.s = 1;
                return SuspendAnimationKt.animateDecay(animationState0, decayAnimationSpec0, ((boolean)(v1 ^ 1)), j0, i0) == a0 ? a0 : new a(Boxing.boxFloat(f - ref$FloatRef0.element), animationState0);
            }
            case 1: {
                f = i0.o;
                FloatRef ref$FloatRef1 = i0.q;
                animationState0 = i0.p;
                ResultKt.throwOnFailure(object0);
                return new a(Boxing.boxFloat(f - ref$FloatRef1.element), animationState0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final void access$animateDecay$consumeDelta(AnimationScope animationScope0, ScrollScope scrollScope0, Function1 function10, float f) {
        float f1 = scrollScope0.scrollBy(f);
        function10.invoke(f1);
        if(Math.abs(f - f1) > 0.5f) {
            animationScope0.cancelAnimation();
        }
    }

    public static final Object access$animateWithTarget(ScrollScope scrollScope0, float f, float f1, AnimationState animationState0, AnimationSpec animationSpec0, Function1 function10, Continuation continuation0) {
        AnimationState animationState1;
        float f4;
        FloatRef ref$FloatRef1;
        float f3;
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.t;
            if((v & 0x80000000) == 0) {
                k0 = new k(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                k0.t = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = k0.s;
        a a0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(k0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                float f2 = ((Number)animationState0.getVelocity()).floatValue();
                int v1 = ((Number)animationState0.getVelocity()).floatValue() == 0.0f ? 1 : 0;
                l l0 = new l(f1, ref$FloatRef0, scrollScope0, function10);
                k0.q = animationState0;
                k0.r = ref$FloatRef0;
                f3 = f;
                k0.o = f3;
                k0.p = f2;
                k0.t = 1;
                if(SuspendAnimationKt.animateTo(animationState0, Boxing.boxFloat(f), animationSpec0, ((boolean)(v1 ^ 1)), l0, k0) != a0) {
                    ref$FloatRef1 = ref$FloatRef0;
                    f4 = f2;
                    animationState1 = animationState0;
                    break;
                }
                return a0;
            }
            case 1: {
                f4 = k0.p;
                float f5 = k0.o;
                ref$FloatRef1 = k0.r;
                AnimationState animationState2 = k0.q;
                ResultKt.throwOnFailure(object0);
                f3 = f5;
                animationState1 = animationState2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f6 = ((Number)animationState1.getVelocity()).floatValue();
        if(f4 != 0.0f) {
            return f4 > 0.0f ? new a(Boxing.boxFloat(f3 - ref$FloatRef1.element), AnimationStateKt.copy$default(animationState1, 0.0f, c.coerceAtMost(f6, f4), 0L, 0L, false, 29, null)) : new a(Boxing.boxFloat(f3 - ref$FloatRef1.element), AnimationStateKt.copy$default(animationState1, 0.0f, c.coerceAtLeast(f6, f4), 0L, 0L, false, 29, null));
        }
        return new a(Boxing.boxFloat(f3 - ref$FloatRef1.element), AnimationStateKt.copy$default(animationState1, 0.0f, 0.0f, 0L, 0L, false, 29, null));
    }

    public static final Object access$approach(ScrollScope scrollScope0, float f, float f1, ApproachAnimation approachAnimation0, Function1 function10, Continuation continuation0) {
        return approachAnimation0.approachAnimation(scrollScope0, Boxing.boxFloat(f), Boxing.boxFloat(f1), function10, continuation0);
    }

    public static final float access$coerceToTarget(float f, float f1) {
        if(f1 != 0.0f) {
            return f1 > 0.0f ? c.coerceAtMost(f, f1) : c.coerceAtLeast(f, f1);
        }
        return 0.0f;
    }

    public static final float calculateFinalOffset-Fhqu1e0(int v, float f, float f1) {
        if(!FinalSnappingItem.equals-impl0(v, 0)) {
            if(FinalSnappingItem.equals-impl0(v, 1)) {
                return f1 == Infinityf || f1 == -Infinityf ? 0.0f : f1;
            }
            if(!FinalSnappingItem.equals-impl0(v, 2)) {
                f = 0.0f;
            }
        }
        else if(Math.abs(f1) <= Math.abs(f)) {
            return f1 == Infinityf || f1 == -Infinityf ? 0.0f : f1;
        }
        return f == Infinityf || f == -Infinityf ? 0.0f : f;
    }

    public static final float getMinFlingVelocityDp() [...] // 潜在的解密器

    @Composable
    @NotNull
    public static final TargetedFlingBehavior rememberSnapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8D74ADF2, v, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = false;
        DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        if((v & 14 ^ 6) > 4 && composer0.changed(snapLayoutInfoProvider0) || (v & 6) == 4) {
            z = true;
        }
        boolean z1 = composer0.changed(decayAnimationSpec0);
        boolean z2 = composer0.changed(density0);
        TargetedFlingBehavior targetedFlingBehavior0 = composer0.rememberedValue();
        if((z1 | z | z2) != 0 || targetedFlingBehavior0 == Composer.Companion.getEmpty()) {
            targetedFlingBehavior0 = SnapFlingBehaviorKt.snapFlingBehavior(snapLayoutInfoProvider0, decayAnimationSpec0, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer0.updateRememberedValue(targetedFlingBehavior0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;
    }

    @NotNull
    public static final TargetedFlingBehavior snapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull AnimationSpec animationSpec0) {
        return new SnapFlingBehavior(snapLayoutInfoProvider0, decayAnimationSpec0, animationSpec0);
    }
}

