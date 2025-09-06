package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q2.b;
import q2.d;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\u001A\u0017\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0003\u001A-\u0010\t\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bR\u0006\u0012\u0002\b\u00030\u00060\u0007*\u0006\u0012\u0002\b\u00030\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\n\u001AI\u0010\u0011\u001A\u00020\u0010\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f\"\u0004\b\u0002\u0010\u000E*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bR\b\u0012\u0004\u0012\u00028\u00020\u00062\b\b\u0002\u0010\u000F\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001AO\u0010\u0011\u001A\u00020\u0010\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0015\u001A\u00020\u00142\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u000F\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0018\u001AE\u0010\u0011\u001A\u00020\u0010\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019R\u00020\u001A2\b\b\u0002\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u001C\u001A7\u0010\"\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!\"\u0004\b\u0000\u0010\u000B2\u0006\u0010\u001D\u001A\u00028\u00002\u0006\u0010\u001F\u001A\u00020\u001E2\b\u0010 \u001A\u0004\u0018\u00010\u001EH\u0000\u00A2\u0006\u0004\b\"\u0010#\" \u0010(\u001A\b\u0012\u0004\u0012\u00020\u00140\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\u00A8\u0006,\u00B2\u0006\u001C\u0010)\u001A\u00020\u0000\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008A\u0084\u0002\u00B2\u0006(\u0010+\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008A\u0084\u0002\u00B2\u0006(\u0010+\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000B\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008A\u0084\u0002"}, d2 = {"", "timeNs", "nanosToMillis", "(J)J", "timeMs", "millisToNanos", "Landroidx/compose/animation/core/Transition;", "", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "allAnimations", "(Landroidx/compose/animation/core/Transition;)Ljava/util/List;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "S", "stepMs", "Landroidx/compose/animation/tooling/TransitionInfo;", "createTransitionInfo", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;J)Landroidx/compose/animation/tooling/TransitionInfo;", "Landroidx/compose/animation/core/Animation;", "", "label", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "(Landroidx/compose/animation/core/Animation;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;J)Landroidx/compose/animation/tooling/TransitionInfo;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;JJ)Landroidx/compose/animation/tooling/TransitionInfo;", "currentValue", "", "par1", "par2", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "parseParametersToValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "a", "Ljava/util/List;", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "IGNORE_TRANSITIONS", "startTimeMs", "", "values", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,281:1\n1360#2:282\n1446#2,5:283\n1#3:288\n168#4:289\n158#4:290\n148#4:291\n*S KotlinDebug\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n*L\n60#1:282\n60#1:283,5\n183#1:289\n183#1:290\n183#1:291\n*E\n"})
public final class Utils_androidKt {
    public static final List a;

    static {
        Utils_androidKt.a = k.listOf("TransformOriginInterruptionHandling");
    }

    public static final Dp a(Object object0) {
        Dp dp0 = object0 instanceof Dp ? ((Dp)object0) : null;
        if(dp0 == null) {
            Float float0 = object0 instanceof Float ? ((Float)object0) : null;
            dp0 = float0 == null ? null : Dp.box-impl(Dp.constructor-impl(((float)float0)));
            if(dp0 == null) {
                Double double0 = object0 instanceof Double ? ((Double)object0) : null;
                dp0 = double0 == null ? null : Dp.box-impl(Dp.constructor-impl(((float)(((double)double0)))));
                if(dp0 == null) {
                    Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
                    return integer0 == null ? null : Dp.box-impl(Dp.constructor-impl(((int)integer0)));
                }
            }
        }
        return dp0;
    }

    public static final long access$createTransitionInfo$lambda$1(Lazy lazy0) {
        return ((Number)lazy0.getValue()).longValue();
    }

    @NotNull
    public static final List allAnimations(@NotNull Transition transition0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: transition0.getTransitions()) {
            o.addAll(arrayList0, Utils_androidKt.allAnimations(((Transition)object0)));
        }
        return CollectionsKt___CollectionsKt.plus(transition0.getAnimations(), arrayList0);
    }

    public static final TargetState b(Object object0, Object object1, Object object2) {
        if(object0 instanceof Dp && object2 != null) {
            if(object1 instanceof Dp && object2 instanceof Dp) {
                return new TargetState(object1, object2);
            }
            Dp dp0 = Utils_androidKt.a(object1);
            Dp dp1 = Utils_androidKt.a(object2);
            return dp0 == null || dp1 == null ? null : new TargetState(dp0, dp1);
        }
        return null;
    }

    @NotNull
    public static final TransitionInfo createTransitionInfo(@NotNull Animation animation0, @NotNull String s, @NotNull AnimationSpec animationSpec0, long v) {
        long v1 = Utils_androidKt.nanosToMillis(animation0.getDurationNanos());
        Lazy lazy0 = c.lazy(new b(animationSpec0));
        Lazy lazy1 = c.lazy(new q2.c(animation0, v1, v, lazy0));
        return new TransitionInfo(s, animationSpec0.getClass().getName(), ((Number)lazy0.getValue()).longValue(), v1, ((Map)lazy1.getValue()));
    }

    @NotNull
    public static final TransitionInfo createTransitionInfo(@NotNull TransitionAnimationState infiniteTransition$TransitionAnimationState0, long v, long v1) {
        Lazy lazy0 = c.lazy(new d(infiniteTransition$TransitionAnimationState0, v1, v));
        return new TransitionInfo(infiniteTransition$TransitionAnimationState0.getLabel(), infiniteTransition$TransitionAnimationState0.getAnimationSpec().getClass().getName(), 0L, v1, ((Map)lazy0.getValue()));
    }

    @NotNull
    public static final TransitionInfo createTransitionInfo(@NotNull androidx.compose.animation.core.Transition.TransitionAnimationState transition$TransitionAnimationState0, long v) {
        return Utils_androidKt.createTransitionInfo(transition$TransitionAnimationState0.getAnimation(), transition$TransitionAnimationState0.getLabel(), transition$TransitionAnimationState0.getAnimationSpec(), v);
    }

    public static TransitionInfo createTransitionInfo$default(Animation animation0, String s, AnimationSpec animationSpec0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 1L;
        }
        return Utils_androidKt.createTransitionInfo(animation0, s, animationSpec0, v);
    }

    public static TransitionInfo createTransitionInfo$default(TransitionAnimationState infiniteTransition$TransitionAnimationState0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 1L;
        }
        return Utils_androidKt.createTransitionInfo(infiniteTransition$TransitionAnimationState0, v, v1);
    }

    public static TransitionInfo createTransitionInfo$default(androidx.compose.animation.core.Transition.TransitionAnimationState transition$TransitionAnimationState0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 1L;
        }
        return Utils_androidKt.createTransitionInfo(transition$TransitionAnimationState0, v);
    }

    @NotNull
    public static final List getIGNORE_TRANSITIONS() {
        return Utils_androidKt.a;
    }

    public static final long millisToNanos(long v) [...] // Inlined contents

    public static final long nanosToMillis(long v) [...] // Inlined contents

    @Nullable
    public static final TargetState parseParametersToValue(Object object0, @NotNull Object object1, @Nullable Object object2) {
        TargetState targetState1;
        if(object0 == null) {
            return null;
        }
        TargetState targetState0 = Utils_androidKt.b(object0, object1, object2);
        if(targetState0 != null) {
            return targetState0;
        }
        if(object1 != null && object2 != null && object1.getClass() == object2.getClass()) {
            Intrinsics.checkNotNull(object2);
            if(object0.getClass() == object1.getClass() && object0.getClass() == object2.getClass()) {
                return new TargetState(object1, object2);
            }
            if(object1 instanceof List && object2 instanceof List) {
                try {
                    if(object0 instanceof IntSize) {
                        Object object3 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Int");
                        Object object4 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Int");
                        IntSize intSize0 = IntSize.box-impl(IntSizeKt.IntSize(((int)(((Integer)object3))), ((int)(((Integer)object4)))));
                        Object object5 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Int");
                        Object object6 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Int");
                        targetState1 = new TargetState(intSize0, IntSize.box-impl(IntSizeKt.IntSize(((int)(((Integer)object5))), ((int)(((Integer)object6))))));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof IntOffset) {
                        Object object7 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type kotlin.Int");
                        Object object8 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type kotlin.Int");
                        IntOffset intOffset0 = IntOffset.box-impl(IntOffsetKt.IntOffset(((int)(((Integer)object7))), ((int)(((Integer)object8)))));
                        Object object9 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type kotlin.Int");
                        Object object10 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type kotlin.Int");
                        targetState1 = new TargetState(intOffset0, IntOffset.box-impl(IntOffsetKt.IntOffset(((int)(((Integer)object9))), ((int)(((Integer)object10))))));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof Size) {
                        Object object11 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type kotlin.Float");
                        Object object12 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object12, "null cannot be cast to non-null type kotlin.Float");
                        Size size0 = Size.box-impl(SizeKt.Size(((float)(((Float)object11))), ((float)(((Float)object12)))));
                        Object object13 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object13, "null cannot be cast to non-null type kotlin.Float");
                        Object object14 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object14, "null cannot be cast to non-null type kotlin.Float");
                        targetState1 = new TargetState(size0, Size.box-impl(SizeKt.Size(((float)(((Float)object13))), ((float)(((Float)object14))))));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof Offset) {
                        Object object15 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object15, "null cannot be cast to non-null type kotlin.Float");
                        Object object16 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object16, "null cannot be cast to non-null type kotlin.Float");
                        Offset offset0 = Offset.box-impl(OffsetKt.Offset(((float)(((Float)object15))), ((float)(((Float)object16)))));
                        Object object17 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object17, "null cannot be cast to non-null type kotlin.Float");
                        Object object18 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object18, "null cannot be cast to non-null type kotlin.Float");
                        targetState1 = new TargetState(offset0, Offset.box-impl(OffsetKt.Offset(((float)(((Float)object17))), ((float)(((Float)object18))))));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof Rect) {
                        Object object19 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object19, "null cannot be cast to non-null type kotlin.Float");
                        Object object20 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object20, "null cannot be cast to non-null type kotlin.Float");
                        Object object21 = ((List)object1).get(2);
                        Intrinsics.checkNotNull(object21, "null cannot be cast to non-null type kotlin.Float");
                        Object object22 = ((List)object1).get(3);
                        Intrinsics.checkNotNull(object22, "null cannot be cast to non-null type kotlin.Float");
                        Rect rect0 = new Rect(((float)(((Float)object19))), ((float)(((Float)object20))), ((float)(((Float)object21))), ((float)(((Float)object22))));
                        Object object23 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object23, "null cannot be cast to non-null type kotlin.Float");
                        Object object24 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object24, "null cannot be cast to non-null type kotlin.Float");
                        Object object25 = ((List)object2).get(2);
                        Intrinsics.checkNotNull(object25, "null cannot be cast to non-null type kotlin.Float");
                        Object object26 = ((List)object2).get(3);
                        Intrinsics.checkNotNull(object26, "null cannot be cast to non-null type kotlin.Float");
                        targetState1 = new TargetState(rect0, new Rect(((float)(((Float)object23))), ((float)(((Float)object24))), ((float)(((Float)object25))), ((float)(((Float)object26)))));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof Color) {
                        Object object27 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object27, "null cannot be cast to non-null type kotlin.Float");
                        Object object28 = ((List)object1).get(1);
                        Intrinsics.checkNotNull(object28, "null cannot be cast to non-null type kotlin.Float");
                        Object object29 = ((List)object1).get(2);
                        Intrinsics.checkNotNull(object29, "null cannot be cast to non-null type kotlin.Float");
                        Object object30 = ((List)object1).get(3);
                        Intrinsics.checkNotNull(object30, "null cannot be cast to non-null type kotlin.Float");
                        Color color0 = Color.box-impl(ColorKt.Color$default(((float)(((Float)object27))), ((float)(((Float)object28))), ((float)(((Float)object29))), ((float)(((Float)object30))), null, 16, null));
                        Object object31 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object31, "null cannot be cast to non-null type kotlin.Float");
                        Object object32 = ((List)object2).get(1);
                        Intrinsics.checkNotNull(object32, "null cannot be cast to non-null type kotlin.Float");
                        Object object33 = ((List)object2).get(2);
                        Intrinsics.checkNotNull(object33, "null cannot be cast to non-null type kotlin.Float");
                        Object object34 = ((List)object2).get(3);
                        Intrinsics.checkNotNull(object34, "null cannot be cast to non-null type kotlin.Float");
                        targetState1 = new TargetState(color0, Color.box-impl(ColorKt.Color$default(((float)(((Float)object31))), ((float)(((Float)object32))), ((float)(((Float)object33))), ((float)(((Float)object34))), null, 16, null)));
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    if(object0 instanceof Dp) {
                        Object object35 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object35);
                        Object object36 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object36);
                        targetState1 = Utils_androidKt.b(object0, object35, object36);
                        Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                        return targetState1;
                    }
                    Object object37 = ((List)object1).get(0);
                    Object object38 = ((List)object2).get(0);
                    if(object37 != null && object38 != null && object37.getClass() == object38.getClass()) {
                        Object object39 = ((List)object1).get(0);
                        Intrinsics.checkNotNull(object39);
                        Object object40 = ((List)object2).get(0);
                        Intrinsics.checkNotNull(object40);
                        if(object0.getClass() == object39.getClass() && object0.getClass() == object40.getClass()) {
                            targetState1 = new TargetState(((List)object1).get(0), ((List)object2).get(0));
                            Intrinsics.checkNotNull(targetState1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                            return targetState1;
                        }
                    }
                    return null;
                }
                catch(IndexOutOfBoundsException | ClassCastException | IllegalArgumentException | NullPointerException unused_ex) {
                }
            }
        }
        return null;
    }
}

