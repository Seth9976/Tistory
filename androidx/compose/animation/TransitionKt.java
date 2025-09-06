package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A:\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001AD\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0082\u0001\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000E*\b\u0012\u0004\u0012\u0002H\u000E0\u000F2*\b\n\u0010\u0010\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\n\u001A\u00020\u000B2&\u0010\u0016\u001A\"\u0012\u0013\u0012\u0011H\u000E¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "label", "", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n1223#2,6:125\n1223#2,6:138\n1882#3,7:131\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125,6\n103#1:138,6\n74#1:131,7\n*E\n"})
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateColor(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.TransitionKt.animateColor.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "ColorAnimation";
        }
        ColorSpace colorSpace0 = Color.getColorSpace-impl(((Color)function31.invoke(transition0.getTargetState(), composer0, ((int)(v >> 6 & 0x70)))).unbox-impl());
        boolean z = composer0.changed(colorSpace0);
        TwoWayConverter twoWayConverter0 = composer0.rememberedValue();
        if(z || twoWayConverter0 == Composer.Companion.getEmpty()) {
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
            composer0.updateRememberedValue(twoWayConverter0);
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
        public final class androidx.compose.animation.TransitionKt.animateColor.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.TransitionKt.animateColor.1 INSTANCE;

            static {
                androidx.compose.animation.TransitionKt.animateColor.1.INSTANCE = new androidx.compose.animation.TransitionKt.animateColor.1();
            }

            public androidx.compose.animation.TransitionKt.animateColor.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(-1457805428);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1457805428, v, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return springSpec0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    @Composable
    @NotNull
    public static final State animateColor-DTcfvLk(@NotNull InfiniteTransition infiniteTransition0, long v, long v1, @NotNull InfiniteRepeatableSpec infiniteRepeatableSpec0, @Nullable String s, @Nullable Composer composer0, int v2, int v3) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x715DA90D, v2, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        TwoWayConverter twoWayConverter0 = composer0.rememberedValue();
        if(twoWayConverter0 == Composer.Companion.getEmpty()) {
            ColorSpace colorSpace0 = Color.getColorSpace-impl(v1);
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
            composer0.updateRememberedValue(twoWayConverter0);
        }
        State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, Color.box-impl(v), Color.box-impl(v1), twoWayConverter0, infiniteRepeatableSpec0, ((v3 & 8) == 0 ? s : "ColorAnimation"), composer0, InfiniteTransition.$stable | v2 & 14 | v2 & 0x70 | v2 & 0x380 | InfiniteRepeatableSpec.$stable << 12 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    public static final State animateColor-RIQooxk(InfiniteTransition infiniteTransition0, long v, long v1, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, v2, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        State state0 = TransitionKt.animateColor-DTcfvLk(infiniteTransition0, v, v1, infiniteRepeatableSpec0, "ColorAnimation", composer0, InfiniteTransition.$stable | 0x6000 | v2 & 14 | v2 & 0x70 | v2 & 0x380 | InfiniteRepeatableSpec.$stable << 9 | v2 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

