package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 1)
@Deprecated(message = "Please use the snapFlingBehavior function", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001A\u00020\u0005*\u00020\u000B2\u0006\u0010\f\u001A\u00020\u00052\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000E0\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001A\u00020\u001A8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingDistanceUpdated", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/MotionDurationScale;", "d", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "motionScaleDuration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n503#2,4:508\n503#2,4:512\n503#2,4:516\n503#2,4:520\n1#3:524\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n112#1:508,4\n203#1:512,4\n206#1:516,4\n226#1:520,4\n*E\n"})
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable;
    public final SnapLayoutInfoProvider a;
    public final DecayAnimationSpec b;
    public final AnimationSpec c;
    public MotionDurationScale d;

    public SnapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull AnimationSpec animationSpec0) {
        this.a = snapLayoutInfoProvider0;
        this.b = decayAnimationSpec0;
        this.c = animationSpec0;
        this.d = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    public final Object a(ScrollScope scrollScope0, float f, Function1 function10, Continuation continuation0) {
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.r;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.r = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                MotionDurationScale motionDurationScale0 = this.d;
                f f1 = new f(this, scrollScope0, f, function10, null);
                c0.o = function10;
                c0.r = 1;
                object0 = BuildersKt.withContext(motionDurationScale0, f1, c0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                function10 = c0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function10.invoke(Boxing.boxFloat(0.0f));
        return (androidx.compose.foundation.gestures.snapping.a)object0;
    }

    public static final Object access$runApproach(SnapFlingBehavior snapFlingBehavior0, ScrollScope scrollScope0, float f, float f1, Function1 function10, Continuation continuation0) {
        return snapFlingBehavior0.b(scrollScope0, f, f1, function10, continuation0);
    }

    public static final Object access$tryApproach(SnapFlingBehavior snapFlingBehavior0, ScrollScope scrollScope0, float f, float f1, Function1 function10, Continuation continuation0) {
        h h0;
        snapFlingBehavior0.getClass();
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.q;
            if((v & 0x80000000) == 0) {
                h0 = new h(snapFlingBehavior0, continuation0);
            }
            else {
                h0.q = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(snapFlingBehavior0, continuation0);
        }
        Object object0 = h0.o;
        AnimationState animationState0 = a.getCOROUTINE_SUSPENDED();
        switch(h0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(Math.abs(f) == 0.0f || Math.abs(f1) == 0.0f) {
                    return AnimationStateKt.AnimationState$default(f, f1, 0L, 0L, false, 28, null);
                }
                h0.q = 1;
                object0 = snapFlingBehavior0.b(scrollScope0, f, f1, function10, h0);
                return object0 == animationState0 ? animationState0 : ((androidx.compose.foundation.gestures.snapping.a)object0).b;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return ((androidx.compose.foundation.gestures.snapping.a)object0).b;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(ScrollScope scrollScope0, float f, float f1, Function1 function10, Continuation continuation0) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.b, 0.0f, f1)) >= Math.abs(f) ? SnapFlingBehaviorKt.access$approach(scrollScope0, f, f1, new b(this.b, 0), function10, continuation0) : SnapFlingBehaviorKt.access$approach(scrollScope0, f, f1, new b(this.c, 1), function10, continuation0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof SnapFlingBehavior && Intrinsics.areEqual(((SnapFlingBehavior)object0).c, this.c) && Intrinsics.areEqual(((SnapFlingBehavior)object0).b, this.b) && Intrinsics.areEqual(((SnapFlingBehavior)object0).a, this.a);
    }

    @NotNull
    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() + this.c.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.foundation.gestures.TargetedFlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope0, float f, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.q;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.q = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g0.q = 1;
                object0 = this.a(scrollScope0, f, function10, g0);
                return object0 == object1 ? object1 : Boxing.boxFloat((((androidx.compose.foundation.gestures.snapping.a)object0).a.floatValue() == 0.0f ? 0.0f : ((Number)((androidx.compose.foundation.gestures.snapping.a)object0).b.getVelocity()).floatValue()));
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxFloat((((androidx.compose.foundation.gestures.snapping.a)object0).a.floatValue() == 0.0f ? 0.0f : ((Number)((androidx.compose.foundation.gestures.snapping.a)object0).b.getVelocity()).floatValue()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void setMotionScaleDuration$foundation_release(@NotNull MotionDurationScale motionDurationScale0) {
        this.d = motionDurationScale0;
    }
}

