package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001A\u0017\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001A5\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0002\u0010\r\u001A?\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000E\u001AY\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001A\u0002H\u00102\u0006\u0010\n\u001A\u0002H\u00102\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00100\fH\u0007¢\u0006\u0002\u0010\u0015\u001Ac\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001A\u0002H\u00102\u0006\u0010\n\u001A\u0002H\u00102\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00100\f2\b\b\u0002\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n1223#2,6:365\n1223#2,6:371\n1223#2,6:377\n1223#2,6:383\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365,6\n263#1:371,6\n269#1:377,6\n281#1:383,6\n*E\n"})
public final class InfiniteTransitionKt {
    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final State animateFloat(InfiniteTransition infiniteTransition0, float f, float f1, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1BFB95F0, v, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        State state0 = InfiniteTransitionKt.animateFloat(infiniteTransition0, f, f1, infiniteRepeatableSpec0, "FloatAnimation", composer0, v & 14 | 0x6000 | v & 0x70 | v & 0x380 | v & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateFloat(@NotNull InfiniteTransition infiniteTransition0, float f, float f1, @NotNull InfiniteRepeatableSpec infiniteRepeatableSpec0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, v, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, f, f1, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), infiniteRepeatableSpec0, ((v1 & 8) == 0 ? s : "FloatAnimation"), composer0, v & 0x3FE | 0xE000 & v << 3 | v << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final State animateValue(InfiniteTransition infiniteTransition0, Object object0, Object object1, TwoWayConverter twoWayConverter0, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9AF211C6, v, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:337)");
        }
        int v1 = v >> 3 & 8;
        State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, object0, object1, twoWayConverter0, infiniteRepeatableSpec0, "ValueAnimation", composer0, v & 14 | 0x30000 | v1 << 3 | v & 0x70 | v1 << 6 | v & 0x380 | v & 0x1C00 | v & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateValue(@NotNull InfiniteTransition infiniteTransition0, Object object0, Object object1, @NotNull TwoWayConverter twoWayConverter0, @NotNull InfiniteRepeatableSpec infiniteRepeatableSpec0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 16) != 0) {
            s = "ValueAnimation";
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC0A63B11, v, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        TransitionAnimationState infiniteTransition$TransitionAnimationState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(infiniteTransition$TransitionAnimationState0 == composer$Companion0.getEmpty()) {
            infiniteTransition$TransitionAnimationState0 = new TransitionAnimationState(infiniteTransition0, object0, object1, twoWayConverter0, infiniteRepeatableSpec0, s);
            composer0.updateRememberedValue(infiniteTransition$TransitionAnimationState0);
        }
        int v2 = 1;
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changedInstance(object0)) && (v & 0x30) != 0x20 ? 0 : 1;
        int v4 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changedInstance(object1)) && (v & 0x180) != 0x100 ? 0 : 1;
        if(((0xE000 & v ^ 0x6000) <= 0x4000 || !composer0.changedInstance(infiniteRepeatableSpec0)) && (v & 0x6000) != 0x4000) {
            v2 = 0;
        }
        b b0 = composer0.rememberedValue();
        if((v3 | v4 | v2) != 0 || b0 == composer$Companion0.getEmpty()) {
            b0 = new b(object0, infiniteTransition$TransitionAnimationState0, object1, infiniteRepeatableSpec0);
            composer0.updateRememberedValue(b0);
        }
        EffectsKt.SideEffect(b0, composer0, 0);
        boolean z = composer0.changedInstance(infiniteTransition0);
        c c0 = composer0.rememberedValue();
        if(z || c0 == composer$Companion0.getEmpty()) {
            c0 = new c(infiniteTransition0, infiniteTransition$TransitionAnimationState0);
            composer0.updateRememberedValue(c0);
        }
        EffectsKt.DisposableEffect(infiniteTransition$TransitionAnimationState0, c0, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition$TransitionAnimationState0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final InfiniteTransition rememberInfiniteTransition(Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, v, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition("InfiniteTransition", composer0, 6, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition0;
    }

    @Composable
    @NotNull
    public static final InfiniteTransition rememberInfiniteTransition(@Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            s = "InfiniteTransition";
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, v, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        InfiniteTransition infiniteTransition0 = composer0.rememberedValue();
        if(infiniteTransition0 == Composer.Companion.getEmpty()) {
            infiniteTransition0 = new InfiniteTransition(s);
            composer0.updateRememberedValue(infiniteTransition0);
        }
        infiniteTransition0.run$animation_core_release(composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition0;
    }
}

