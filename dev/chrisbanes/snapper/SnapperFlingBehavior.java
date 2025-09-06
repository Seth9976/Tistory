package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.material3.c7;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import vc.d;
import vc.e;
import vc.f;
import vc.g;

@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012>\b\u0002\u0010\u000F\u001A8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011BE\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u001F\u0010\u0017\u001A\u00020\u0005*\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R/\u0010 \u001A\u0004\u0018\u00010\n2\b\u0010\u0019\u001A\u0004\u0018\u00010\n8F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "layoutInfo", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "springAnimationSpec", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "<init>", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "maximumFlingDistance", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getAnimationTarget", "()Ljava/lang/Integer;", "e", "(Ljava/lang/Integer;)V", "animationTarget", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SnapperFlingBehavior implements FlingBehavior {
    public static final int $stable;
    public final SnapperLayoutInfo a;
    public final DecayAnimationSpec b;
    public final AnimationSpec c;
    public final Function3 d;
    public final Function1 e;
    public final MutableState f;

    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    public SnapperFlingBehavior(@NotNull SnapperLayoutInfo snapperLayoutInfo0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo0, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec0, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(animationSpec0, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(function10, "maximumFlingDistance");
        this(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex(), function10);
    }

    public SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            animationSpec0 = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        if((v & 8) != 0) {
            function10 = SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance();
        }
        this(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function10);
    }

    public SnapperFlingBehavior(@NotNull SnapperLayoutInfo snapperLayoutInfo0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull AnimationSpec animationSpec0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo0, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec0, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(animationSpec0, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(function30, "snapIndex");
        this(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function30, SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance());
    }

    public SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Function3 function30, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            animationSpec0 = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        if((v & 8) != 0) {
            function30 = SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex();
        }
        this(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function30);
    }

    public SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Function3 function30, Function1 function10) {
        this.a = snapperLayoutInfo0;
        this.b = decayAnimationSpec0;
        this.c = animationSpec0;
        this.d = function30;
        this.e = function10;
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final float a(float f) {
        SnapperLayoutInfo snapperLayoutInfo0 = this.a;
        if(Float.compare(f, 0.0f) < 0 && !snapperLayoutInfo0.canScrollTowardsStart()) {
            return f;
        }
        return f <= 0.0f || snapperLayoutInfo0.canScrollTowardsEnd() ? 0.0f : f;
    }

    public static final boolean access$performSnapBackIfNeeded(SnapperFlingBehavior snapperFlingBehavior0, AnimationScope animationScope0, SnapperLayoutItemInfo snapperLayoutItemInfo0, int v, Function1 function10) {
        int v1;
        snapperFlingBehavior0.getClass();
        float f = ((Number)animationScope0.getVelocity()).floatValue();
        SnapperLayoutInfo snapperLayoutInfo0 = snapperFlingBehavior0.a;
        if(Float.compare(f, 0.0f) <= 0 || snapperLayoutItemInfo0.getIndex() < v) {
            v1 = f >= 0.0f || snapperLayoutItemInfo0.getIndex() > v - 1 ? 0 : snapperLayoutInfo0.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex() + 1);
        }
        else {
            v1 = snapperLayoutInfo0.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex());
        }
        if(v1 != 0) {
            function10.invoke(((float)v1));
            return true;
        }
        return false;
    }

    public final Object b(ScrollScope scrollScope0, int v, float f, Continuation continuation0) {
        SnapperFlingBehavior snapperFlingBehavior1;
        float f2;
        int v2;
        ScrollScope scrollScope1;
        SnapperFlingBehavior snapperFlingBehavior0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v1 = d0.u;
            if((v1 & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.u = v1 ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SnapperLayoutInfo snapperLayoutInfo0 = this.a;
                SnapperLayoutItemInfo snapperLayoutItemInfo0 = snapperLayoutInfo0.getCurrentItem();
                if(snapperLayoutItemInfo0 == null) {
                    return Boxing.boxFloat(f);
                }
                if(snapperLayoutItemInfo0.getIndex() == v && snapperLayoutInfo0.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex()) == 0) {
                    return Boxing.boxFloat(this.a(f));
                }
                if(Math.abs(f) >= 0.5f) {
                    float f1 = DecayAnimationSpecKt.calculateTargetValue(this.b, 0.0f, f);
                    if(f >= 0.0f) {
                        if(f1 >= ((float)snapperLayoutInfo0.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex() + 1))) {
                        label_26:
                            d0.o = this;
                            d0.p = scrollScope0;
                            d0.q = v;
                            d0.r = f;
                            d0.u = 1;
                            object0 = this.c(scrollScope0, snapperLayoutItemInfo0, v, f, true, d0);
                            if(object0 == object1) {
                                return object1;
                            }
                            snapperFlingBehavior0 = this;
                            goto label_46;
                        }
                        goto label_36;
                    }
                    else if(f1 <= ((float)snapperLayoutInfo0.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex()))) {
                        goto label_26;
                    }
                    else {
                        goto label_36;
                    }
                }
                else {
                label_36:
                    scrollScope1 = scrollScope0;
                    v2 = v;
                    f2 = f;
                    snapperFlingBehavior1 = this;
                }
                goto label_50;
            }
            case 1: {
                f = d0.r;
                v = d0.q;
                scrollScope0 = d0.p;
                snapperFlingBehavior0 = d0.o;
                ResultKt.throwOnFailure(object0);
            label_46:
                scrollScope1 = scrollScope0;
                v2 = v;
                f2 = ((Number)object0).floatValue();
                snapperFlingBehavior1 = snapperFlingBehavior0;
            label_50:
                SnapperLayoutItemInfo snapperLayoutItemInfo1 = snapperFlingBehavior1.a.getCurrentItem();
                if(snapperLayoutItemInfo1 == null) {
                    return Boxing.boxFloat(f);
                }
                if(snapperLayoutItemInfo1.getIndex() != v2 || snapperFlingBehavior1.a.distanceToIndexSnap(v2) != 0) {
                    d0.o = snapperFlingBehavior1;
                    d0.p = null;
                    d0.u = 2;
                    object0 = snapperFlingBehavior1.d(scrollScope1, snapperLayoutItemInfo1, v2, f2, d0);
                    if(object0 == object1) {
                        return object1;
                    }
                    f2 = ((Number)object0).floatValue();
                    return Boxing.boxFloat(snapperFlingBehavior1.a(f2));
                }
                return Boxing.boxFloat(snapperFlingBehavior1.a(f2));
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        snapperFlingBehavior1 = d0.o;
        ResultKt.throwOnFailure(object0);
        f2 = ((Number)object0).floatValue();
        return Boxing.boxFloat(snapperFlingBehavior1.a(f2));
    }

    public final Object c(ScrollScope scrollScope0, SnapperLayoutItemInfo snapperLayoutItemInfo0, int v, float f, boolean z, Continuation continuation0) {
        SnapperFlingBehavior snapperFlingBehavior0;
        FloatRef ref$FloatRef2;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v1 = e0.s;
            if((v1 & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.s = v1 ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object0 = e0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(snapperLayoutItemInfo0.getIndex() == v) {
                    int v2 = snapperLayoutItemInfo0.getIndex();
                    if(this.a.distanceToIndexSnap(v2) == 0) {
                        return Boxing.boxFloat(this.a(f));
                    }
                }
                FloatRef ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = f;
                FloatRef ref$FloatRef1 = new FloatRef();
                boolean z1 = z && Math.abs(v - snapperLayoutItemInfo0.getIndex()) >= 2;
                try {
                    this.e(Boxing.boxInt(v));
                    AnimationState animationState0 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                    f f1 = new f(ref$FloatRef1, scrollScope0, ref$FloatRef0, this, z1, v);
                    e0.o = this;
                    e0.p = ref$FloatRef0;
                    e0.s = 1;
                    ref$FloatRef2 = ref$FloatRef0;
                    if(SuspendAnimationKt.animateDecay$default(animationState0, this.b, false, f1, e0, 2, null) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    snapperFlingBehavior0 = this;
                    snapperFlingBehavior0.e(null);
                    throw throwable0;
                }
                snapperFlingBehavior0 = this;
                break;
            }
            case 1: {
                try {
                    ref$FloatRef2 = e0.p;
                    snapperFlingBehavior0 = e0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                snapperFlingBehavior0.e(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        snapperFlingBehavior0.e(null);
        return Boxing.boxFloat(ref$FloatRef2.element);
    }

    public final Object d(ScrollScope scrollScope0, SnapperLayoutItemInfo snapperLayoutItemInfo0, int v, float f, Continuation continuation0) {
        FloatRef ref$FloatRef2;
        SnapperFlingBehavior snapperFlingBehavior0;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v1 = g0.s;
            if((v1 & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.s = v1 ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = (v <= snapperLayoutItemInfo0.getIndex() || f <= 0.0f) && (v > snapperLayoutItemInfo0.getIndex() || f >= 0.0f) ? 0.0f : f;
                FloatRef ref$FloatRef1 = new FloatRef();
                try {
                    this.e(Boxing.boxInt(v));
                    AnimationState animationState0 = AnimationStateKt.AnimationState$default(ref$FloatRef1.element, ref$FloatRef0.element, 0L, 0L, false, 28, null);
                    Float float0 = Boxing.boxFloat(this.a.distanceToIndexSnap(v));
                    c7 c70 = new c7(ref$FloatRef1, scrollScope0, ref$FloatRef0, this, v);
                    g0.o = this;
                    g0.p = ref$FloatRef0;
                    g0.s = 1;
                    if(SuspendAnimationKt.animateTo$default(animationState0, float0, this.c, false, c70, g0, 4, null) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    snapperFlingBehavior0 = this;
                    snapperFlingBehavior0.e(null);
                    throw throwable0;
                }
                ref$FloatRef2 = ref$FloatRef0;
                snapperFlingBehavior0 = this;
                break;
            }
            case 1: {
                try {
                    ref$FloatRef2 = g0.p;
                    snapperFlingBehavior0 = g0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                snapperFlingBehavior0.e(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        snapperFlingBehavior0.e(null);
        return Boxing.boxFloat(ref$FloatRef2.element);
    }

    public final void e(Integer integer0) {
        this.f.setValue(integer0);
    }

    @Nullable
    public final Integer getAnimationTarget() {
        return (Integer)this.f.getValue();
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope0, float f, @NotNull Continuation continuation0) {
        SnapperLayoutInfo snapperLayoutInfo0 = this.a;
        if(snapperLayoutInfo0.canScrollTowardsStart() && snapperLayoutInfo0.canScrollTowardsEnd()) {
            float f1 = ((Number)this.e.invoke(snapperLayoutInfo0)).floatValue();
            if(f1 <= 0.0f) {
                throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
            }
            SnapperLayoutItemInfo snapperLayoutItemInfo0 = snapperLayoutInfo0.getCurrentItem();
            if(snapperLayoutItemInfo0 == null) {
                return Boxing.boxFloat(f);
            }
            int v = snapperLayoutInfo0.determineTargetIndex(f, this.b, f1);
            int v1 = f < 0.0f ? snapperLayoutItemInfo0.getIndex() + 1 : snapperLayoutItemInfo0.getIndex();
            int v2 = ((Number)this.d.invoke(snapperLayoutInfo0, Boxing.boxInt(v1), Boxing.boxInt(v))).intValue();
            if(v2 < 0 || v2 >= snapperLayoutInfo0.getTotalItemsCount()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return this.b(scrollScope0, v2, f, continuation0);
        }
        return Boxing.boxFloat(f);
    }
}

