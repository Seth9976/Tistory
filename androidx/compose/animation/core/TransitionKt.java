package androidx.compose.animation.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import j0.b2;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.y;
import t.f0;
import t.g0;
import t.g;

@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A/\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001A\u00028\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A5\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\b\t\u0010\n\u001A5\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B2\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\f\u001Ac\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000F*\u00020\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A^\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010\u001A\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00010\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001AC\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001D\u001A\u00028\u00012\u0006\u0010\u0001\u001A\u00028\u00012\u0006\u0010\u001E\u001A\u00020\u0002H\u0001\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u00A8\u0001\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00010\'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000F*\u00020\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b(\u0010)\u001Ao\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00010\'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000F*\u00020\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010*\u001A\u00028\u00012\u0006\u0010+\u001A\u00028\u00012\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u0002H\u0001\u00A2\u0006\u0004\b-\u0010.\u001A\u0084\u0001\u00100\u001A\b\u0012\u0004\u0012\u00020/0\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020/0\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b0\u00101\u001A\u0084\u0001\u00103\u001A\b\u0012\u0004\u0012\u0002020\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002020\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b3\u00101\u001A\u0084\u0001\u00105\u001A\b\u0012\u0004\u0012\u0002040\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002040\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b5\u00101\u001A\u0084\u0001\u00107\u001A\b\u0012\u0004\u0012\u0002060\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002060\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b7\u00101\u001A\u0084\u0001\u00109\u001A\b\u0012\u0004\u0012\u0002080\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002080\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b9\u00101\u001A\u0084\u0001\u0010;\u001A\b\u0012\u0004\u0012\u00020:0\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020:0\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b;\u00101\u001A\u0084\u0001\u0010=\u001A\b\u0012\u0004\u0012\u00020<0\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020<0\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b=\u00101\u001A\u0084\u0001\u0010?\u001A\b\u0012\u0004\u0012\u00020>0\'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001A$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\"0\u0015\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001A\u00020\u00022&\u0010&\u001A\"\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020>0\u0015\u00A2\u0006\u0002\b\u0019H\u0087\b\u00A2\u0006\u0004\b?\u00101\"\u0014\u0010@\u001A\u00020:8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b@\u0010A\"\u001B\u0010G\u001A\u00020B8@X\u0080\u0084\u0002\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\u00A8\u0006H"}, d2 = {"T", "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "updateTransition", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "rememberTransition", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "S", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createDeferredAnimation", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "parentState", "Landroidx/compose/runtime/Composable;", "transformToChildState", "createChildTransition", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "initialState", "childLabel", "createChildTransitionInternal", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animateValue", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "targetValue", "animationSpec", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "animateFloat", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDp", "Landroidx/compose/ui/geometry/Offset;", "animateOffset", "Landroidx/compose/ui/geometry/Size;", "animateSize", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffset", "", "animateInt", "Landroidx/compose/ui/unit/IntSize;", "animateIntSize", "Landroidx/compose/ui/geometry/Rect;", "animateRect", "AnimationDebugDurationScale", "I", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "b", "Lkotlin/Lazy;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2183:1\n1882#1,7:2256\n1882#1,7:2263\n1882#1,7:2270\n1882#1,7:2277\n1882#1,7:2284\n1882#1,7:2291\n1882#1,7:2298\n1882#1,7:2305\n1223#2,6:2184\n1223#2,6:2190\n1223#2,6:2196\n1223#2,6:2202\n1223#2,6:2208\n1223#2,6:2214\n1223#2,6:2220\n1223#2,6:2226\n1223#2,6:2232\n1223#2,6:2238\n1223#2,6:2244\n1223#2,6:2250\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1967#1:2256,7\n1998#1:2263,7\n2029#1:2270,7\n2060#1:2277,7\n2091#1:2284,7\n2122#1:2291,7\n2152#1:2298,7\n2182#1:2305,7\n91#1:2184,6\n93#1:2190,6\n820#1:2196,6\n824#1:2202,6\n835#1:2208,6\n1779#1:2214,6\n1780#1:2220,6\n1812#1:2226,6\n1825#1:2232,6\n1829#1:2238,6\n1900#1:2244,6\n1923#1:2250,6\n*E\n"})
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    public static final g a;
    public static final Lazy b;

    static {
        TransitionKt.a = g.D;
        TransitionKt.b = c.lazy(LazyThreadSafetyMode.NONE, f0.w);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateDp(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateDp.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "DpAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(Dp.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateDp.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateDp.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateDp.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateDp.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateDp.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(-575880366);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-575880366, v, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1992)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.box-impl(0.1f), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateFloat(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateFloat.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "FloatAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateFloat.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateFloat.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateFloat.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateFloat.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateFloat.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xE0E066C0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xE0E066C0, v, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1962)");
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateInt(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateInt.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "IntAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateInt.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateInt.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateInt.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateInt.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateInt.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xD131AF13);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD131AF13, v, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2116)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateIntOffset(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateIntOffset.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "IntOffsetAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(IntOffset.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateIntOffset.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateIntOffset.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateIntOffset.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateIntOffset.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateIntOffset.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x8B904446);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8B904446, v, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2086)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.box-impl(0x100000001L), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateIntSize(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateIntSize.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "IntSizeAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(IntSize.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateIntSize.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateIntSize.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateIntSize.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateIntSize.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateIntSize.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(967893300);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(967893300, v, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2147)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.box-impl(0x100000001L), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateOffset(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateOffset.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "OffsetAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(Offset.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateOffset.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateOffset.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateOffset.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateOffset.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateOffset.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x60C2E5D9);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x60C2E5D9, v, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2023)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.box-impl(0x3F0000003F000000L), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateRect(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateRect.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "RectAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(Rect.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateRect.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateRect.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateRect.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateRect.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateRect.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x2934F46A);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2934F46A, v, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2177)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateSize(@NotNull Transition transition0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateSize.1.INSTANCE;
        }
        if((v1 & 2) != 0) {
            s = "SizeAnimation";
        }
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        int v3 = v2 >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v3), function31.invoke(transition0.getTargetState(), composer0, v3), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v2 >> 3 & 0x70)))), VectorConvertersKt.getVectorConverter(Size.Companion), s, composer0, v2 & 14 | v2 << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateSize.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateSize.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateSize.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateSize.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateSize.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xA034CB87);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA034CB87, v, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2054)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.box-impl(0x3F0000003F000000L), 3, null);
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
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final State animateValue(@NotNull Transition transition0, @NotNull TwoWayConverter twoWayConverter0, @Nullable Function3 function30, @Nullable String s, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            function30 = androidx.compose.animation.core.TransitionKt.animateValue.1.INSTANCE;
        }
        if((v1 & 4) != 0) {
            s = "ValueAnimation";
        }
        int v2 = v >> 9 & 0x70;
        return TransitionKt.createTransitionAnimation(transition0, function31.invoke(transition0.getCurrentState(), composer0, v2), function31.invoke(transition0.getTargetState(), composer0, v2), ((FiniteAnimationSpec)function30.invoke(transition0.getSegment(), composer0, ((int)(v >> 3 & 0x70)))), twoWayConverter0, s, composer0, v & 14 | 0xE000 & v << 9 | v << 6 & 0x70000);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,2183:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateValue.1 extends Lambda implements Function3 {
            public static final androidx.compose.animation.core.TransitionKt.animateValue.1 INSTANCE;

            static {
                androidx.compose.animation.core.TransitionKt.animateValue.1.INSTANCE = new androidx.compose.animation.core.TransitionKt.animateValue.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateValue.1() {
                super(3);
            }

            @Composable
            @NotNull
            public final SpringSpec invoke(@NotNull Segment transition$Segment0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xCA9F45E6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xCA9F45E6, v, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1878)");
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

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final Transition createChildTransition(@NotNull Transition transition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        boolean z = true;
        if((v1 & 1) != 0) {
            s = "ChildTransition";
        }
        if(((v & 14 ^ 6) <= 4 || !composer0.changed(transition0)) && (v & 6) != 4) {
            z = false;
        }
        Object object0 = composer0.rememberedValue();
        if(z || object0 == Composer.Companion.getEmpty()) {
            object0 = transition0.getCurrentState();
            composer0.updateRememberedValue(object0);
        }
        if(transition0.isSeeking()) {
            object0 = transition0.getCurrentState();
        }
        int v2 = v >> 3 & 0x70;
        return TransitionKt.createChildTransitionInternal(transition0, function30.invoke(object0, composer0, v2), function30.invoke(transition0.getTargetState(), composer0, v2), s, composer0, v & 14 | v << 6 & 0x1C00);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Transition createChildTransitionInternal(@NotNull Transition transition0, Object object0, Object object1, @NotNull String s, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF42E10CA, v, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1823)");
        }
        int v1 = v & 14 ^ 6;
        boolean z = true;
        boolean z1 = v1 > 4 && composer0.changed(transition0) || (v & 6) == 4;
        Transition transition1 = composer0.rememberedValue();
        if(z1 || transition1 == Composer.Companion.getEmpty()) {
            transition1 = new Transition(new MutableTransitionState(object0), transition0, transition0.getLabel() + " > " + s);
            composer0.updateRememberedValue(transition1);
        }
        if((v1 <= 4 || !composer0.changed(transition0)) && (v & 6) != 4) {
            z = false;
        }
        boolean z2 = composer0.changed(transition1);
        b2 b20 = composer0.rememberedValue();
        if(z2 || z || b20 == Composer.Companion.getEmpty()) {
            b20 = new b2(25, transition0, transition1);
            composer0.updateRememberedValue(b20);
        }
        EffectsKt.DisposableEffect(transition1, b20, composer0, 0);
        if(transition0.isSeeking()) {
            transition1.seek(object0, object1, transition0.getLastSeekedTimeNanos$animation_core_release());
        }
        else {
            transition1.updateTarget$animation_core_release(object1);
            transition1.setSeeking$animation_core_release(false);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition1;
    }

    @RestrictTo({Scope.LIBRARY})
    @Composable
    @NotNull
    public static final DeferredAnimation createDeferredAnimation(@NotNull Transition transition0, @NotNull TwoWayConverter twoWayConverter0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = "DeferredAnimation";
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x99D490E0, v, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1777)");
        }
        int v2 = v & 14 ^ 6;
        boolean z = true;
        boolean z1 = v2 > 4 && composer0.changed(transition0) || (v & 6) == 4;
        DeferredAnimation transition$DeferredAnimation0 = composer0.rememberedValue();
        if(z1 || transition$DeferredAnimation0 == Composer.Companion.getEmpty()) {
            transition$DeferredAnimation0 = new DeferredAnimation(transition0, twoWayConverter0, s);
            composer0.updateRememberedValue(transition$DeferredAnimation0);
        }
        if((v2 <= 4 || !composer0.changed(transition0)) && (v & 6) != 4) {
            z = false;
        }
        boolean z2 = composer0.changedInstance(transition$DeferredAnimation0);
        h h0 = composer0.rememberedValue();
        if(z2 || z || h0 == Composer.Companion.getEmpty()) {
            h0 = new h(transition0, transition$DeferredAnimation0);
            composer0.updateRememberedValue(h0);
        }
        EffectsKt.DisposableEffect(transition$DeferredAnimation0, h0, composer0, 0);
        if(transition0.isSeeking()) {
            transition$DeferredAnimation0.setupSeeking$animation_core_release();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition$DeferredAnimation0;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final State createTransitionAnimation(@NotNull Transition transition0, Object object0, Object object1, @NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, @NotNull String s, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, v, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1898)");
        }
        int v1 = v & 14 ^ 6;
        boolean z = true;
        boolean z1 = v1 > 4 && composer0.changed(transition0) || (v & 6) == 4;
        TransitionAnimationState transition$TransitionAnimationState0 = composer0.rememberedValue();
        if(z1 || transition$TransitionAnimationState0 == Composer.Companion.getEmpty()) {
            TransitionAnimationState transition$TransitionAnimationState1 = new TransitionAnimationState(transition0, object0, AnimationStateKt.createZeroVectorFrom(twoWayConverter0, object1), twoWayConverter0, s);
            composer0.updateRememberedValue(transition$TransitionAnimationState1);
            transition$TransitionAnimationState0 = transition$TransitionAnimationState1;
        }
        if(transition0.isSeeking()) {
            transition$TransitionAnimationState0.updateInitialAndTargetValue$animation_core_release(object0, object1, finiteAnimationSpec0);
        }
        else {
            transition$TransitionAnimationState0.updateTargetValue$animation_core_release(object1, finiteAnimationSpec0);
        }
        if((v1 <= 4 || !composer0.changed(transition0)) && (v & 6) != 4) {
            z = false;
        }
        boolean z2 = composer0.changed(transition$TransitionAnimationState0);
        i i0 = composer0.rememberedValue();
        if(z2 || z || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(transition0, transition$TransitionAnimationState0);
            composer0.updateRememberedValue(i0);
        }
        EffectsKt.DisposableEffect(transition$TransitionAnimationState0, i0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition$TransitionAnimationState0;
    }

    @NotNull
    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver)TransitionKt.b.getValue();
    }

    @Composable
    @NotNull
    public static final Transition rememberTransition(@NotNull TransitionState transitionState0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x61F14C21, v, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:818)");
        }
        int v2 = v & 14 ^ 6;
        boolean z = true;
        boolean z1 = v2 > 4 && composer0.changed(transitionState0) || (v & 6) == 4;
        Transition transition0 = composer0.rememberedValue();
        if(z1 || transition0 == Composer.Companion.getEmpty()) {
            transition0 = new Transition(transitionState0, s);
            composer0.updateRememberedValue(transition0);
        }
        if(transitionState0 instanceof SeekableTransitionState) {
            composer0.startReplaceGroup(1030282692);
            Object object0 = transitionState0.getCurrentState();
            Object object1 = transitionState0.getTargetState();
            if((v2 <= 4 || !composer0.changed(transitionState0)) && (v & 6) != 4) {
                z = false;
            }
            g0 g00 = composer0.rememberedValue();
            if(z || g00 == Composer.Companion.getEmpty()) {
                g00 = new g0(transitionState0, null);
                composer0.updateRememberedValue(g00);
            }
            EffectsKt.LaunchedEffect(object0, object1, g00, composer0, 0);
        }
        else {
            composer0.startReplaceGroup(1030744251);
            transition0.animateTo$animation_core_release(transitionState0.getTargetState(), composer0, 0);
        }
        composer0.endReplaceGroup();
        boolean z2 = composer0.changed(transition0);
        y y0 = composer0.rememberedValue();
        if(z2 || y0 == Composer.Companion.getEmpty()) {
            y0 = new y(transition0, 1);
            composer0.updateRememberedValue(y0);
        }
        EffectsKt.DisposableEffect(transition0, y0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition0;
    }

    @Composable
    @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    @NotNull
    public static final Transition updateTransition(@NotNull MutableTransitionState mutableTransitionState0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x34A03233, v, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:871)");
        }
        Transition transition0 = TransitionKt.rememberTransition(mutableTransitionState0, s, composer0, v & 0x7E, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition0;
    }

    @Composable
    @NotNull
    public static final Transition updateTransition(Object object0, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x78F2A0AD, v, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:89)");
        }
        Transition transition0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(transition0 == composer$Companion0.getEmpty()) {
            transition0 = new Transition(object0, s);
            composer0.updateRememberedValue(transition0);
        }
        transition0.animateTo$animation_core_release(object0, composer0, v & 8 | 0x30 | v & 14);
        y y0 = composer0.rememberedValue();
        if(y0 == composer$Companion0.getEmpty()) {
            y0 = new y(transition0, 2);
            composer0.updateRememberedValue(y0);
        }
        EffectsKt.DisposableEffect(transition0, y0, composer0, 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition0;
    }
}

