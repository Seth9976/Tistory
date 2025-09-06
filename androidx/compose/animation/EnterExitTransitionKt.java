package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.se;
import androidx.compose.material3.ti;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.a1;
import s.b0;
import s.i0;
import s.j0;
import s.k0;
import s.l0;
import s.m0;
import s.n0;
import s.o0;
import s.p0;
import s.q0;
import s.s;
import s.z0;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u001C\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0080\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u001C\u0010\u0003\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001A\u00020\u0001H\u0080\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0006\u001A)\u0010\u000B\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u000B\u0010\f\u001A)\u0010\u000E\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001AB\u0010\u0017\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072!\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0011H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001AB\u0010\u001A\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072!\u0010\u0019\u001A\u001D\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0011H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A6\u0010!\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u001C\u001A\u00020\b2\b\b\u0002\u0010\u001E\u001A\u00020\u001DH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A6\u0010%\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\"\u001A\u00020\b2\b\b\u0002\u0010\u001E\u001A\u00020\u001DH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\u001AX\u0010+\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\'\u001A\u00020&2\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u0010*\u001A\u001D\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011H\u0007\u00A2\u0006\u0004\b+\u0010,\u001AX\u0010/\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001A\u00020&2\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u0010.\u001A\u001D\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011H\u0007\u00A2\u0006\u0004\b/\u00100\u001AX\u00105\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\'\u001A\u0002012\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u00104\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\b5\u00106\u001AX\u0010:\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\'\u001A\u0002072\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u00109\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\b:\u0010;\u001AX\u0010=\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001A\u0002012\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u0010<\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\b=\u0010>\u001AX\u0010@\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001A\u0002072\b\b\u0002\u0010)\u001A\u00020(2#\b\u0002\u0010?\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\b@\u0010A\u001AD\u0010C\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010B\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\bC\u0010\u0018\u001AD\u0010E\u001A\u00020\u00002\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010D\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\bE\u0010\u0018\u001AD\u0010G\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010F\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\bG\u0010\u001B\u001AD\u0010I\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010H\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007\u00A2\u0006\u0004\bI\u0010\u001B\u001A.\u0010M\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010J*\u00020\u0001*\u00020\u00002\f\u0010L\u001A\b\u0012\u0004\u0012\u00028\u00000KH\u0080\u0002\u00A2\u0006\u0004\bM\u0010N\u001A.\u0010M\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010J*\u00020\u0001*\u00020\u00052\f\u0010L\u001A\b\u0012\u0004\u0012\u00028\u00000KH\u0080\u0002\u00A2\u0006\u0004\bM\u0010O\u001AA\u0010Y\u001A\u00020X*\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001A\u00020\u00002\u0006\u0010S\u001A\u00020\u00052\u000E\b\u0002\u0010U\u001A\b\u0012\u0004\u0012\u00020(0T2\u0006\u0010W\u001A\u00020VH\u0001\u00A2\u0006\u0004\bY\u0010Z\u001A!\u0010[\u001A\u00020\u0000*\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001A\u00020\u0000H\u0001\u00A2\u0006\u0004\b[\u0010\\\u001A!\u0010]\u001A\u00020\u0005*\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010S\u001A\u00020\u0005H\u0001\u00A2\u0006\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006a\u00B2\u0006\u000E\u0010_\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010`\u001A\u00020\u00058\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/TransitionEffect;", "effect", "withEffect", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffect;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffect;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "fadeIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/EnterTransition;", "targetAlpha", "fadeOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "initialOffset", "slideIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetOffset", "slideOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "shrinkTowards", "targetSize", "shrinkOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "expandHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "expandVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetWidth", "shrinkHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "targetHeight", "shrinkVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "T", "Landroidx/compose/animation/TransitionEffectKey;", "key", "get", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1272:1\n1223#2,6:1273\n1223#2,6:1279\n1223#2,6:1285\n1223#2,6:1291\n1223#2,6:1297\n1223#2,6:1303\n1223#2,6:1309\n1223#2,6:1315\n1223#2,6:1321\n81#3:1327\n107#3,2:1328\n81#3:1330\n107#3,2:1331\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n879#1:1273,6\n884#1:1279,6\n890#1:1285,6\n899#1:1291,6\n916#1:1297,6\n936#1:1303,6\n969#1:1309,6\n975#1:1315,6\n986#1:1321,6\n916#1:1327\n916#1:1328,2\n936#1:1330\n936#1:1331,2\n*E\n"})
public final class EnterExitTransitionKt {
    public static final TwoWayConverter a;
    public static final SpringSpec b;
    public static final SpringSpec c;
    public static final SpringSpec d;

    static {
        EnterExitTransitionKt.a = VectorConvertersKt.TwoWayConverter(s.G, s.H);
        EnterExitTransitionKt.b = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        EnterExitTransitionKt.c = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        EnterExitTransitionKt.d = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
    }

    public static final Alignment a(Horizontal alignment$Horizontal0) {
        Companion alignment$Companion0 = Alignment.Companion;
        if(Intrinsics.areEqual(alignment$Horizontal0, alignment$Companion0.getStart())) {
            return alignment$Companion0.getCenterStart();
        }
        return Intrinsics.areEqual(alignment$Horizontal0, alignment$Companion0.getEnd()) ? alignment$Companion0.getCenterEnd() : alignment$Companion0.getCenter();
    }

    public static final Alignment b(Vertical alignment$Vertical0) {
        Companion alignment$Companion0 = Alignment.Companion;
        if(Intrinsics.areEqual(alignment$Vertical0, alignment$Companion0.getTop())) {
            return alignment$Companion0.getTopCenter();
        }
        return Intrinsics.areEqual(alignment$Vertical0, alignment$Companion0.getBottom()) ? alignment$Companion0.getBottomCenter() : alignment$Companion0.getCenter();
    }

    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition transition0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @Nullable Function0 function00, @NotNull String s, @Nullable Composer composer0, int v, int v1) {
        ExitTransition exitTransition3;
        DeferredAnimation transition$DeferredAnimation11;
        DeferredAnimation transition$DeferredAnimation9;
        DeferredAnimation transition$DeferredAnimation7;
        boolean z6;
        boolean z3;
        DeferredAnimation transition$DeferredAnimation5;
        DeferredAnimation transition$DeferredAnimation3;
        DeferredAnimation transition$DeferredAnimation1;
        ExitTransition exitTransition2;
        Function0 function01 = (v1 & 4) == 0 ? function00 : i0.w;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1AF3D96, v, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        EnterTransition enterTransition1 = EnterExitTransitionKt.trackActiveEnter(transition0, enterTransition0, composer0, v & 0x7E);
        ExitTransition exitTransition1 = EnterExitTransitionKt.trackActiveExit(transition0, exitTransition0, composer0, v >> 3 & 0x70 | v & 14);
        boolean z = true;
        boolean z1 = enterTransition1.getData$animation_release().getSlide() != null || exitTransition1.getData$animation_release().getSlide() != null;
        boolean z2 = enterTransition1.getData$animation_release().getChangeSize() != null || exitTransition1.getData$animation_release().getChangeSize() != null;
        if(z1) {
            composer0.startReplaceGroup(0xCF0ACC25);
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            String s1 = composer0.rememberedValue();
            if(s1 == Composer.Companion.getEmpty()) {
                s1 = s + " slide";
                composer0.updateRememberedValue(s1);
            }
            exitTransition2 = exitTransition1;
            DeferredAnimation transition$DeferredAnimation0 = TransitionKt.createDeferredAnimation(transition0, twoWayConverter0, s1, composer0, v & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation1 = transition$DeferredAnimation0;
        }
        else {
            exitTransition2 = exitTransition1;
            composer0.startReplaceGroup(0xCF0C4A70);
            composer0.endReplaceGroup();
            transition$DeferredAnimation1 = null;
        }
        if(z2) {
            composer0.startReplaceGroup(0xCF0D72FF);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            String s2 = composer0.rememberedValue();
            if(s2 == Composer.Companion.getEmpty()) {
                s2 = s + " shrink/expand";
                composer0.updateRememberedValue(s2);
            }
            DeferredAnimation transition$DeferredAnimation2 = TransitionKt.createDeferredAnimation(transition0, twoWayConverter1, s2, composer0, v & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation3 = transition$DeferredAnimation2;
        }
        else {
            composer0.startReplaceGroup(0xCF0F05DF);
            composer0.endReplaceGroup();
            transition$DeferredAnimation3 = null;
        }
        if(z2) {
            composer0.startReplaceGroup(0xCF1003EE);
            TwoWayConverter twoWayConverter2 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            String s3 = composer0.rememberedValue();
            if(s3 == Composer.Companion.getEmpty()) {
                s3 = s + " InterruptionHandlingOffset";
                composer0.updateRememberedValue(s3);
            }
            DeferredAnimation transition$DeferredAnimation4 = TransitionKt.createDeferredAnimation(transition0, twoWayConverter2, s3, composer0, v & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation5 = transition$DeferredAnimation4;
        }
        else {
            composer0.startReplaceGroup(0xCF124EBF);
            composer0.endReplaceGroup();
            transition$DeferredAnimation5 = null;
        }
        ChangeSize changeSize0 = enterTransition1.getData$animation_release().getChangeSize();
        if(changeSize0 != null && !changeSize0.getClip()) {
            z3 = true;
        }
        else {
            ChangeSize changeSize1 = exitTransition2.getData$animation_release().getChangeSize();
            z3 = (changeSize1 == null || changeSize1.getClip()) && z2 ? false : true;
        }
        int v2 = v & 14 | v >> 3 & 0x1C00;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x264802D5, v2, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)");
        }
        boolean z4 = enterTransition1.getData$animation_release().getFade() != null || exitTransition2.getData$animation_release().getFade() != null;
        boolean z5 = enterTransition1.getData$animation_release().getScale() != null || exitTransition2.getData$animation_release().getScale() != null;
        if(z4) {
            composer0.startReplaceGroup(0xD7BE60EC);
            TwoWayConverter twoWayConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            String s4 = composer0.rememberedValue();
            if(s4 == Composer.Companion.getEmpty()) {
                s4 = s + " alpha";
                composer0.updateRememberedValue(s4);
            }
            z6 = z3;
            DeferredAnimation transition$DeferredAnimation6 = TransitionKt.createDeferredAnimation(transition0, twoWayConverter3, s4, composer0, v2 & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation7 = transition$DeferredAnimation6;
        }
        else {
            z6 = z3;
            composer0.startReplaceGroup(0xD7C0772F);
            composer0.endReplaceGroup();
            transition$DeferredAnimation7 = null;
        }
        if(z5) {
            composer0.startReplaceGroup(-675193780);
            TwoWayConverter twoWayConverter4 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            String s5 = composer0.rememberedValue();
            if(s5 == Composer.Companion.getEmpty()) {
                s5 = s + " scale";
                composer0.updateRememberedValue(s5);
            }
            DeferredAnimation transition$DeferredAnimation8 = TransitionKt.createDeferredAnimation(transition0, twoWayConverter4, s5, composer0, v2 & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation9 = transition$DeferredAnimation8;
        }
        else {
            composer0.startReplaceGroup(-675057009);
            composer0.endReplaceGroup();
            transition$DeferredAnimation9 = null;
        }
        if(z5) {
            composer0.startReplaceGroup(0xD7C4805C);
            DeferredAnimation transition$DeferredAnimation10 = TransitionKt.createDeferredAnimation(transition0, EnterExitTransitionKt.a, "TransformOriginInterruptionHandling", composer0, v2 & 14 | 0x180, 0);
            composer0.endReplaceGroup();
            transition$DeferredAnimation11 = transition$DeferredAnimation10;
        }
        else {
            composer0.startReplaceGroup(0xD7C6D2AF);
            composer0.endReplaceGroup();
            transition$DeferredAnimation11 = null;
        }
        boolean z7 = composer0.changedInstance(transition$DeferredAnimation7);
        boolean z8 = composer0.changed(enterTransition1);
        boolean z9 = composer0.changed(exitTransition2);
        boolean z10 = composer0.changedInstance(transition$DeferredAnimation9);
        int v3 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(transition0)) && (v2 & 6) != 4 ? 0 : 1;
        boolean z11 = composer0.changedInstance(transition$DeferredAnimation11);
        b0 b00 = composer0.rememberedValue();
        if((z7 | z8 | z9 | z10 | v3 | z11) != 0 || b00 == Composer.Companion.getEmpty()) {
            exitTransition3 = exitTransition2;
            b0 b01 = new b0(transition$DeferredAnimation7, transition$DeferredAnimation9, transition0, enterTransition1, exitTransition2, transition$DeferredAnimation11);
            composer0.updateRememberedValue(b01);
            b00 = b01;
        }
        else {
            exitTransition3 = exitTransition2;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        boolean z12 = composer0.changed(z6);
        if(((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(function01)) && (v & 0xC00) != 0x800) {
            z = false;
        }
        se se0 = composer0.rememberedValue();
        if(z12 || z || se0 == Composer.Companion.getEmpty()) {
            se0 = new se(z6, function01, 2);
            composer0.updateRememberedValue(se0);
        }
        Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, se0).then(new EnterExitTransitionElement(transition0, transition$DeferredAnimation3, transition$DeferredAnimation5, transition$DeferredAnimation1, enterTransition1, exitTransition3, function01, b00));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifier0;
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Horizontal alignment$Horizontal0, boolean z, @NotNull Function1 function10) {
        return EnterExitTransitionKt.expandIn(finiteAnimationSpec0, EnterExitTransitionKt.a(alignment$Horizontal0), z, new k0(function10));
    }

    public static EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec0, Horizontal alignment$Horizontal0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Horizontal0 = Alignment.Companion.getEnd();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = j0.w;
        }
        return EnterExitTransitionKt.expandHorizontally(finiteAnimationSpec0, alignment$Horizontal0, z, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Alignment alignment0, boolean z, @NotNull Function1 function10) {
        return new z0(new TransitionData(null, null, new ChangeSize(alignment0, function10, finiteAnimationSpec0, z), null, false, null, 59, null));
    }

    public static EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.Companion.getBottomEnd();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = s.I;
        }
        return EnterExitTransitionKt.expandIn(finiteAnimationSpec0, alignment0, z, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Vertical alignment$Vertical0, boolean z, @NotNull Function1 function10) {
        return EnterExitTransitionKt.expandIn(finiteAnimationSpec0, EnterExitTransitionKt.b(alignment$Vertical0), z, new m0(function10));
    }

    public static EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec0, Vertical alignment$Vertical0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Vertical0 = Alignment.Companion.getBottom();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = l0.w;
        }
        return EnterExitTransitionKt.expandVertically(finiteAnimationSpec0, alignment$Vertical0, z, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec finiteAnimationSpec0, float f) {
        return new z0(new TransitionData(new Fade(f, finiteAnimationSpec0), null, null, null, false, null, 62, null));
    }

    public static EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return EnterExitTransitionKt.fadeIn(finiteAnimationSpec0, f);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec finiteAnimationSpec0, float f) {
        return new a1(new TransitionData(new Fade(f, finiteAnimationSpec0), null, null, null, false, null, 62, null));
    }

    public static ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return EnterExitTransitionKt.fadeOut(finiteAnimationSpec0, f);
    }

    @Nullable
    public static final TransitionEffect get(@NotNull EnterTransition enterTransition0, @NotNull TransitionEffectKey transitionEffectKey0) {
        Object object0 = enterTransition0.getData$animation_release().getEffectsMap().get(transitionEffectKey0);
        return object0 instanceof TransitionEffect ? ((TransitionEffect)object0) : null;
    }

    @Nullable
    public static final TransitionEffect get(@NotNull ExitTransition exitTransition0, @NotNull TransitionEffectKey transitionEffectKey0) {
        Object object0 = exitTransition0.getData$animation_release().getEffectsMap().get(transitionEffectKey0);
        return object0 instanceof TransitionEffect ? ((TransitionEffect)object0) : null;
    }

    @Stable
    @NotNull
    public static final EnterTransition scaleIn-L8ZKh-E(@NotNull FiniteAnimationSpec finiteAnimationSpec0, float f, long v) {
        return new z0(new TransitionData(null, null, null, new Scale(f, v, finiteAnimationSpec0, null), false, null, 55, null));
    }

    public static EnterTransition scaleIn-L8ZKh-E$default(FiniteAnimationSpec finiteAnimationSpec0, float f, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            v = 0x3F0000003F000000L;
        }
        return EnterExitTransitionKt.scaleIn-L8ZKh-E(finiteAnimationSpec0, f, v);
    }

    @Stable
    @NotNull
    public static final ExitTransition scaleOut-L8ZKh-E(@NotNull FiniteAnimationSpec finiteAnimationSpec0, float f, long v) {
        return new a1(new TransitionData(null, null, null, new Scale(f, v, finiteAnimationSpec0, null), false, null, 55, null));
    }

    public static ExitTransition scaleOut-L8ZKh-E$default(FiniteAnimationSpec finiteAnimationSpec0, float f, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            v = 0x3F0000003F000000L;
        }
        return EnterExitTransitionKt.scaleOut-L8ZKh-E(finiteAnimationSpec0, f, v);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Horizontal alignment$Horizontal0, boolean z, @NotNull Function1 function10) {
        return EnterExitTransitionKt.shrinkOut(finiteAnimationSpec0, EnterExitTransitionKt.a(alignment$Horizontal0), z, new o0(function10));
    }

    public static ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec0, Horizontal alignment$Horizontal0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Horizontal0 = Alignment.Companion.getEnd();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = n0.w;
        }
        return EnterExitTransitionKt.shrinkHorizontally(finiteAnimationSpec0, alignment$Horizontal0, z, function10);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Alignment alignment0, boolean z, @NotNull Function1 function10) {
        return new a1(new TransitionData(null, null, new ChangeSize(alignment0, function10, finiteAnimationSpec0, z), null, false, null, 59, null));
    }

    public static ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.Companion.getBottomEnd();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = s.J;
        }
        return EnterExitTransitionKt.shrinkOut(finiteAnimationSpec0, alignment0, z, function10);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Vertical alignment$Vertical0, boolean z, @NotNull Function1 function10) {
        return EnterExitTransitionKt.shrinkOut(finiteAnimationSpec0, EnterExitTransitionKt.b(alignment$Vertical0), z, new q0(function10));
    }

    public static ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec0, Vertical alignment$Vertical0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Vertical0 = Alignment.Companion.getBottom();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = p0.w;
        }
        return EnterExitTransitionKt.shrinkVertically(finiteAnimationSpec0, alignment$Vertical0, z, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return new z0(new TransitionData(null, new Slide(function10, finiteAnimationSpec0), null, null, false, null, 61, null));
    }

    public static EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        return EnterExitTransitionKt.slideIn(finiteAnimationSpec0, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return EnterExitTransitionKt.slideIn(finiteAnimationSpec0, new ti(function10, 14));
    }

    public static EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            function10 = s.K;
        }
        return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec0, function10);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return EnterExitTransitionKt.slideIn(finiteAnimationSpec0, new ti(function10, 15));
    }

    public static EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            function10 = s.L;
        }
        return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec0, function10);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return new a1(new TransitionData(null, new Slide(function10, finiteAnimationSpec0), null, null, false, null, 61, null));
    }

    public static ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        return EnterExitTransitionKt.slideOut(finiteAnimationSpec0, function10);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return EnterExitTransitionKt.slideOut(finiteAnimationSpec0, new ti(function10, 16));
    }

    public static ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            function10 = s.M;
        }
        return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec0, function10);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        return EnterExitTransitionKt.slideOut(finiteAnimationSpec0, new ti(function10, 17));
    }

    public static ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            function10 = s.N;
        }
        return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec0, function10);
    }

    @Composable
    @NotNull
    public static final EnterTransition trackActiveEnter(@NotNull Transition transition0, @NotNull EnterTransition enterTransition0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x149CFA6, v, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(transition0) || (v & 6) == 4;
        MutableState mutableState0 = composer0.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(enterTransition0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        if(transition0.getCurrentState() != transition0.getTargetState() || transition0.getCurrentState() != EnterExitState.Visible) {
            if(transition0.getTargetState() == EnterExitState.Visible) {
                mutableState0.setValue(((EnterTransition)mutableState0.getValue()).plus(enterTransition0));
            }
        }
        else if(transition0.isSeeking()) {
            mutableState0.setValue(enterTransition0);
        }
        else {
            mutableState0.setValue(EnterTransition.Companion.getNone());
        }
        EnterTransition enterTransition1 = (EnterTransition)mutableState0.getValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransition1;
    }

    @Composable
    @NotNull
    public static final ExitTransition trackActiveExit(@NotNull Transition transition0, @NotNull ExitTransition exitTransition0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, v, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(transition0) || (v & 6) == 4;
        MutableState mutableState0 = composer0.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(exitTransition0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        if(transition0.getCurrentState() != transition0.getTargetState() || transition0.getCurrentState() != EnterExitState.Visible) {
            if(transition0.getTargetState() != EnterExitState.Visible) {
                mutableState0.setValue(((ExitTransition)mutableState0.getValue()).plus(exitTransition0));
            }
        }
        else if(transition0.isSeeking()) {
            mutableState0.setValue(exitTransition0);
        }
        else {
            mutableState0.setValue(ExitTransition.Companion.getNone());
        }
        ExitTransition exitTransition1 = (ExitTransition)mutableState0.getValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransition1;
    }

    @NotNull
    public static final EnterTransition withEffect(@NotNull EnterTransition enterTransition0, @NotNull TransitionEffect transitionEffect0) {
        return new z0(new TransitionData(null, null, null, null, false, w.mapOf(TuplesKt.to(transitionEffect0.getKey$animation_release(), transitionEffect0)), 0x1F, null));
    }

    @NotNull
    public static final ExitTransition withEffect(@NotNull ExitTransition exitTransition0, @NotNull TransitionEffect transitionEffect0) {
        return new a1(new TransitionData(null, null, null, null, false, w.mapOf(TuplesKt.to(transitionEffect0.getKey$animation_release(), transitionEffect0)), 0x1F, null));
    }
}

