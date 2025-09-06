package androidx.compose.animation.core;

import aa.d;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.room.a;
import j0.b2;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.q;
import zd.c;

@Stable
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\b\u0087\u0001\u0088\u0001\u0089\u0001\u008A\u0001B1\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\nB\u001B\b\u0010\u0012\u0006\u0010\u000B\u001A\u00028\u0000\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\fB#\b\u0011\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\u000EJ\u001F\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010 \u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\"\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b!\u0010\u001FJ\'\u0010\'\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u00002\u0006\u0010$\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b%\u0010&J\u001B\u0010+\u001A\u00020\u00182\n\u0010(\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0000\u00A2\u0006\u0004\b)\u0010*J\u001B\u0010-\u001A\u00020\u00182\n\u0010(\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0000\u00A2\u0006\u0004\b,\u0010*J)\u00102\u001A\u00020\u00182\u0018\u0010/\u001A\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030.R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000\u00A2\u0006\u0004\b0\u00101J)\u00105\u001A\u00020\u00132\u0018\u0010/\u001A\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030.R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000\u00A2\u0006\u0004\b3\u00104J\u0017\u00108\u001A\u00020\u00132\u0006\u0010#\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b6\u00107J\u0017\u0010;\u001A\u00020\u00132\u0006\u0010#\u001A\u00028\u0000H\u0001\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010=\u001A\u00020\u00132\u0006\u0010$\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b<\u0010\u001CJ\u0017\u0010B\u001A\u00020\u00132\u0006\u0010?\u001A\u00020>H\u0000\u00A2\u0006\u0004\b@\u0010AJ\u0017\u0010F\u001A\u00020\u00132\u0006\u0010C\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010H\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\bG\u0010\u001FJ\u000F\u0010J\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\bI\u0010\u001FJ\u000F\u0010K\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bK\u0010LJ)\u00105\u001A\u00020\u00132\u0018\u0010N\u001A\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030MR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000\u00A2\u0006\u0004\b3\u0010OR\u001D\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010LR+\u0010#\u001A\u00028\u00002\u0006\u0010W\u001A\u00028\u00008F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[\"\u0004\b\\\u00107R7\u0010c\u001A\b\u0012\u0004\u0012\u00028\u00000]2\f\u0010W\u001A\b\u0012\u0004\u0012\u00028\u00000]8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b^\u0010Y\u001A\u0004\b_\u0010`\"\u0004\ba\u0010bR+\u0010i\u001A\u00020\u000F2\u0006\u0010W\u001A\u00020\u000F8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bd\u0010e\u001A\u0004\bf\u0010g\"\u0004\bh\u0010\u001CR+\u0010k\u001A\u00020\u00182\u0006\u0010W\u001A\u00020\u00188G@AX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bj\u0010Y\u001A\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bo\u0010p\u001A\u0004\bq\u0010g\"\u0004\br\u0010\u001CR\u001B\u0010w\u001A\u00020\u000F8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010gR\u0011\u0010y\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\bx\u0010[R\u0011\u0010z\u001A\u00020\u00188F\u00A2\u0006\u0006\u001A\u0004\bz\u0010lR$\u0010$\u001A\u00020\u000F2\u0006\u0010{\u001A\u00020\u000F8G@GX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b|\u0010g\"\u0004\b}\u0010\u001CR\u001D\u0010\u0081\u0001\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000~8F\u00A2\u0006\u0007\u001A\u0005\b\u007F\u0010\u0080\u0001R,\u0010\u0083\u0001\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030.R\b\u0012\u0004\u0012\u00028\u00000\u00000~8F\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001D\u0010\u0086\u0001\u001A\u00020\u00188GX\u0087\u0004\u00A2\u0006\u000E\u0012\u0005\b\u0085\u0001\u0010\u001F\u001A\u0005\b\u0084\u0001\u0010l\u00A8\u0006\u008B\u0001"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "parentTransition", "", "label", "<init>", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "", "frameTimeNanos", "", "durationScale", "", "onFrame$animation_core_release", "(JF)V", "onFrame", "scaledPlayTimeNanos", "", "scaleToEnd", "(JZ)V", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onDisposed$animation_core_release", "()V", "onDisposed", "onTransitionEnd$animation_core_release", "onTransitionEnd", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;)V", "updateTarget", "animateTo$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "animateTo", "seekAnimations$animation_core_release", "seekAnimations", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animationState", "setInitialAnimations$animation_core_release", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "setInitialAnimations", "fraction", "resetAnimationFraction$animation_core_release", "(F)V", "resetAnimationFraction", "clearInitialAnimations$animation_core_release", "clearInitialAnimations", "updateInitialValues$animation_core_release", "updateInitialValues", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "b", "Landroidx/compose/animation/core/Transition;", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "c", "Ljava/lang/String;", "getLabel", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "Landroidx/compose/animation/core/Transition$Segment;", "e", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "g", "Landroidx/compose/runtime/MutableLongState;", "getStartTimeNanos$animation_core_release", "()J", "setStartTimeNanos$animation_core_release", "startTimeNanos", "k", "isSeeking", "()Z", "setSeeking$animation_core_release", "(Z)V", "l", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "m", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "getCurrentState", "currentState", "isRunning", "value", "getPlayTimeNanos", "setPlayTimeNanos", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "getHasInitialValueAnimations", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "DeferredAnimation", "Segment", "androidx/compose/animation/core/g", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n81#2:2196\n107#2,2:2197\n81#2:2199\n107#2,2:2200\n81#2:2220\n76#3:2190\n109#3,2:2191\n76#3:2193\n109#3,2:2194\n101#4,2:2202\n33#4,6:2204\n103#4:2210\n101#4,2:2211\n33#4,6:2213\n103#4:2219\n33#4,6:2221\n33#4,6:2227\n33#4,6:2233\n33#4,6:2239\n33#4,6:2245\n33#4,6:2251\n33#4,6:2257\n33#4,6:2263\n33#4,6:2269\n33#4,6:2296\n33#4,6:2302\n33#4,6:2308\n33#4,6:2314\n33#4,6:2320\n33#4,6:2326\n33#4,6:2332\n33#4,6:2338\n33#4,6:2344\n33#4,6:2350\n256#4,3:2356\n33#4,4:2359\n259#4,2:2363\n38#4:2365\n261#4:2366\n33#4,6:2367\n488#5:2275\n487#5,4:2276\n491#5,2:2283\n495#5:2289\n1223#6,3:2280\n1226#6,3:2286\n1223#6,6:2290\n487#7:2285\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n932#1:2184\n932#1:2185,2\n939#1:2187\n939#1:2188,2\n971#1:2196\n971#1:2197,2\n991#1:2199\n991#1:2200,2\n1018#1:2220\n948#1:2190\n948#1:2191,2\n968#1:2193\n968#1:2194,2\n1007#1:2202,2\n1007#1:2204,6\n1007#1:2210\n1008#1:2211,2\n1008#1:2213,6\n1008#1:2219\n1022#1:2221,6\n1025#1:2227,6\n1060#1:2233,6\n1069#1:2239,6\n1107#1:2245,6\n1145#1:2251,6\n1158#1:2257,6\n1201#1:2263,6\n1202#1:2269,6\n1253#1:2296,6\n1256#1:2302,6\n1272#1:2308,6\n1275#1:2314,6\n1285#1:2320,6\n1286#1:2326,6\n1293#1:2332,6\n1296#1:2338,6\n1308#1:2344,6\n1309#1:2350,6\n1313#1:2356,3\n1313#1:2359,4\n1313#1:2363,2\n1313#1:2365\n1313#1:2366\n1322#1:2367,6\n1218#1:2275\n1218#1:2276,4\n1218#1:2283,2\n1218#1:2289\n1218#1:2280,3\n1218#1:2286,3\n1219#1:2290,6\n1218#1:2285\n*E\n"})
public final class Transition {
    @RestrictTo({Scope.LIBRARY})
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001-B%\b\u0000\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u00142#\u0010\u000F\u001A\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000B¢\u0006\u0002\b\u000E2!\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u000B¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R{\u0010,\u001A*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010#R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000$2.\u0010%\u001A*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010#R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000$8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "setupSeeking$animation_core_release", "()V", "setupSeeking", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1667#1:2184\n1667#1:2185,2\n*E\n"})
    public final class DeferredAnimation {
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001A\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000B\u0012!\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0015\u001A\u00020\u00142\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR?\u0010\f\u001A\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R=\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001E\"\u0004\b#\u0010 R\u0014\u0010&\u001A\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "updateAnimationStates", "(Landroidx/compose/animation/core/Transition$Segment;)V", "a", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "b", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "setTransitionSpec", "(Lkotlin/jvm/functions/Function1;)V", "c", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class DeferredAnimationData implements State {
            public final TransitionAnimationState a;
            public Function1 b;
            public Function1 c;
            public final DeferredAnimation d;

            public DeferredAnimationData(@NotNull TransitionAnimationState transition$TransitionAnimationState0, @NotNull Function1 function10, @NotNull Function1 function11) {
                this.a = transition$TransitionAnimationState0;
                this.b = function10;
                this.c = function11;
            }

            @NotNull
            public final TransitionAnimationState getAnimation() {
                return this.a;
            }

            @NotNull
            public final Function1 getTargetValueByState() {
                return this.c;
            }

            @NotNull
            public final Function1 getTransitionSpec() {
                return this.b;
            }

            @Override  // androidx.compose.runtime.State
            public Object getValue() {
                this.updateAnimationStates(Transition.this.getSegment());
                return this.a.getValue();
            }

            public final void setTargetValueByState(@NotNull Function1 function10) {
                this.c = function10;
            }

            public final void setTransitionSpec(@NotNull Function1 function10) {
                this.b = function10;
            }

            public final void updateAnimationStates(@NotNull Segment transition$Segment0) {
                Object object0 = this.c.invoke(transition$Segment0.getTargetState());
                boolean z = Transition.this.isSeeking();
                TransitionAnimationState transition$TransitionAnimationState0 = this.a;
                if(z) {
                    transition$TransitionAnimationState0.updateInitialAndTargetValue$animation_core_release(this.c.invoke(transition$Segment0.getInitialState()), object0, ((FiniteAnimationSpec)this.b.invoke(transition$Segment0)));
                    return;
                }
                transition$TransitionAnimationState0.updateTargetValue$animation_core_release(object0, ((FiniteAnimationSpec)this.b.invoke(transition$Segment0)));
            }
        }

        public final TwoWayConverter a;
        public final String b;
        public final MutableState c;
        public final Transition d;

        public DeferredAnimation(@NotNull TwoWayConverter twoWayConverter0, @NotNull String s) {
            this.a = twoWayConverter0;
            this.b = s;
            this.c = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        @NotNull
        public final State animate(@NotNull Function1 function10, @NotNull Function1 function11) {
            State state0 = this.getData$animation_core_release();
            Transition transition0 = Transition.this;
            if(state0 == null) {
                Object object0 = function11.invoke(Transition.this.getCurrentState());
                Object object1 = function11.invoke(transition0.getCurrentState());
                AnimationVector animationVector0 = AnimationStateKt.createZeroVectorFrom(this.a, object1);
                state0 = new DeferredAnimationData(this, new TransitionAnimationState(Transition.this, object0, animationVector0, this.a, this.b), function10, function11);
                this.setData$animation_core_release(((DeferredAnimationData)state0));
                transition0.addAnimation$animation_core_release(((DeferredAnimationData)state0).getAnimation());
            }
            ((DeferredAnimationData)state0).setTargetValueByState(function11);
            ((DeferredAnimationData)state0).setTransitionSpec(function10);
            ((DeferredAnimationData)state0).updateAnimationStates(transition0.getSegment());
            return state0;
        }

        @Nullable
        public final DeferredAnimationData getData$animation_core_release() {
            return (DeferredAnimationData)this.c.getValue();
        }

        @NotNull
        public final String getLabel() {
            return this.b;
        }

        @NotNull
        public final TwoWayConverter getTypeConverter() {
            return this.a;
        }

        public final void setData$animation_core_release(@Nullable DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0) {
            this.c.setValue(transition$DeferredAnimation$DeferredAnimationData0);
        }

        public final void setupSeeking$animation_core_release() {
            DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0 = this.getData$animation_core_release();
            if(transition$DeferredAnimation$DeferredAnimationData0 != null) {
                transition$DeferredAnimation$DeferredAnimationData0.getAnimation().updateInitialAndTargetValue$animation_core_release(transition$DeferredAnimation$DeferredAnimationData0.getTargetValueByState().invoke(Transition.this.getSegment().getInitialState()), transition$DeferredAnimation$DeferredAnimationData0.getTargetValueByState().invoke(Transition.this.getSegment().getTargetState()), ((FiniteAnimationSpec)transition$DeferredAnimation$DeferredAnimationData0.getTransitionSpec().invoke(Transition.this.getSegment())));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001A\u0010\b\u001A\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001A\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001A\u00028\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00028\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Segment {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean isTransitioningTo(@NotNull Segment transition$Segment0, Object object0, Object object1) {
                return transition$Segment0.super.isTransitioningTo(object0, object1);
            }
        }

        Object getInitialState();

        Object getTargetState();

        // 去混淆评级： 低(20)
        default boolean isTransitioningTo(Object object0, Object object1) {
            return Intrinsics.areEqual(object0, this.getInitialState()) && Intrinsics.areEqual(object1, this.getTargetState());
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001A\u00028\u0001\u0012\u0006\u0010\u0006\u001A\u00028\u0002\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001C\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0019J\u0017\u0010!\u001A\u00020\u00112\u0006\u0010\u001E\u001A\u00020\u001DH\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010&\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010(\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b\'\u0010\u0019J\u000F\u0010)\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b)\u0010*J%\u00100\u001A\u00020\u00112\u0006\u0010+\u001A\u00028\u00012\f\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00010,H\u0000\u00A2\u0006\u0004\b.\u0010/J-\u00103\u001A\u00020\u00112\u0006\u0010\u0005\u001A\u00028\u00012\u0006\u0010+\u001A\u00028\u00012\f\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00010,H\u0000\u00A2\u0006\u0004\b1\u00102R#\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010*R7\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00010,2\f\u0010;\u001A\b\u0012\u0004\u0012\u00028\u00010,8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010ARC\u0010H\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B2\u0012\u0010;\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bC\u0010=\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010N\u001A\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010%R+\u0010T\u001A\u00020\u000F2\u0006\u0010;\u001A\u00020\u000F8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bO\u0010=\u001A\u0004\bP\u0010Q\"\u0004\bR\u0010SR+\u0010Z\u001A\u00020\u001D2\u0006\u0010;\u001A\u00020\u001D8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u0010X\"\u0004\bY\u0010 R+\u0010`\u001A\u00028\u00012\u0006\u0010;\u001A\u00028\u00018V@PX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b[\u0010=\u001A\u0004\b\\\u0010]\"\u0004\b^\u0010_R+\u0010f\u001A\u00020\r2\u0006\u0010;\u001A\u00020\r8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\bc\u0010d\"\u0004\be\u0010\u0016\u00A8\u0006g"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "", "playTimeNanos", "", "scaleToEnd", "", "onPlayTimeChanged$animation_core_release", "(JZ)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "updateInitialValue$animation_core_release", "()V", "updateInitialValue", "resetAnimation$animation_core_release", "resetAnimation", "", "fraction", "resetAnimationValue$animation_core_release", "(F)V", "resetAnimationValue", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animationState", "setInitialValueAnimation$animation_core_release", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "setInitialValueAnimation", "clearInitialAnimation$animation_core_release", "clearInitialAnimation", "toString", "()Ljava/lang/String;", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "e", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "f", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "getInitialValueState$animation_core_release", "()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialValueState$animation_core_release", "initialValueState", "h", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "i", "Landroidx/compose/runtime/MutableFloatState;", "getResetSnapValue$animation_core_release", "()F", "setResetSnapValue$animation_core_release", "resetSnapValue", "k", "getValue", "()Ljava/lang/Object;", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "m", "Landroidx/compose/runtime/MutableLongState;", "getDurationNanos$animation_core_release", "()J", "setDurationNanos$animation_core_release", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n81#2:2190\n107#2,2:2191\n81#2:2193\n107#2,2:2194\n81#2:2199\n107#2,2:2200\n76#3:2196\n109#3,2:2197\n76#4:2202\n109#4,2:2203\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1345#1:2184\n1345#1:2185,2\n1353#1:2187\n1353#1:2188,2\n1360#1:2190\n1360#1:2191,2\n1371#1:2193\n1371#1:2194,2\n1385#1:2199\n1385#1:2200,2\n1372#1:2196\n1372#1:2197,2\n1388#1:2202\n1388#1:2203,2\n*E\n"})
    public final class TransitionAnimationState implements State {
        public final TwoWayConverter a;
        public final String b;
        public final MutableState c;
        public final MutableState d;
        public final MutableState e;
        public SeekingAnimationState f;
        public TargetBasedAnimation g;
        public final MutableState h;
        public final MutableFloatState i;
        public boolean j;
        public final MutableState k;
        public AnimationVector l;
        public final MutableLongState m;
        public boolean n;
        public final SpringSpec o;
        public final Transition p;

        public TransitionAnimationState(Object object0, @NotNull AnimationVector animationVector0, @NotNull TwoWayConverter twoWayConverter0, @NotNull String s) {
            Object object1;
            this.a = twoWayConverter0;
            this.b = s;
            MutableState mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            this.c = mutableState0;
            this.d = SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.e = SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(this.getAnimationSpec(), twoWayConverter0, object0, mutableState0.getValue(), animationVector0), null, 2, null);
            this.h = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.i = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.k = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            this.l = animationVector0;
            this.m = SnapshotLongStateKt.mutableLongStateOf(this.getAnimation().getDurationNanos());
            Float float0 = (Float)VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter0);
            if(float0 == null) {
                object1 = null;
            }
            else {
                float f = float0.floatValue();
                AnimationVector animationVector1 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0);
                int v = animationVector1.getSize$animation_core_release();
                for(int v1 = 0; v1 < v; ++v1) {
                    animationVector1.set$animation_core_release(v1, f);
                }
                object1 = this.a.getConvertFromVector().invoke(animationVector1);
            }
            this.o = AnimationSpecKt.spring$default(0.0f, 0.0f, object1, 3, null);
        }

        public final void a(Object object0, boolean z) {
            MutableState mutableState0 = this.c;
            boolean z1 = Intrinsics.areEqual((this.g == null ? null : this.g.getTargetValue()), mutableState0.getValue());
            MutableState mutableState1 = this.e;
            AnimationSpec animationSpec0 = this.o;
            if(z1) {
                AnimationVector animationVector0 = AnimationVectorsKt.newInstance(this.l);
                mutableState1.setValue(new TargetBasedAnimation(animationSpec0, this.a, object0, object0, animationVector0));
                this.j = true;
                this.setDurationNanos$animation_core_release(this.getAnimation().getDurationNanos());
                return;
            }
            if(!z || this.n) {
                animationSpec0 = this.getAnimationSpec();
            }
            else if(this.getAnimationSpec() instanceof SpringSpec) {
                animationSpec0 = this.getAnimationSpec();
            }
            Transition transition0 = Transition.this;
            if(transition0.getPlayTimeNanos() > 0L) {
                animationSpec0 = AnimationSpecKt.delayed(animationSpec0, transition0.getPlayTimeNanos());
            }
            Object object1 = mutableState0.getValue();
            mutableState1.setValue(new TargetBasedAnimation(animationSpec0, this.a, object0, object1, this.l));
            this.setDurationNanos$animation_core_release(this.getAnimation().getDurationNanos());
            this.j = false;
            Transition.access$onChildAnimationUpdated(transition0);
        }

        public final void clearInitialAnimation$animation_core_release() {
            this.g = null;
            this.f = null;
            this.j = false;
        }

        @NotNull
        public final TargetBasedAnimation getAnimation() {
            return (TargetBasedAnimation)this.e.getValue();
        }

        @NotNull
        public final FiniteAnimationSpec getAnimationSpec() {
            return (FiniteAnimationSpec)this.d.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return this.m.getLongValue();
        }

        @Nullable
        public final SeekingAnimationState getInitialValueState$animation_core_release() {
            return this.f;
        }

        @NotNull
        public final String getLabel() {
            return this.b;
        }

        public final float getResetSnapValue$animation_core_release() {
            return this.i.getFloatValue();
        }

        @NotNull
        public final TwoWayConverter getTypeConverter() {
            return this.a;
        }

        @Override  // androidx.compose.runtime.State
        public Object getValue() {
            return this.k.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean)this.h.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long v, boolean z) {
            if(z) {
                v = this.getAnimation().getDurationNanos();
            }
            this.setValue$animation_core_release(this.getAnimation().getValueFromNanos(v));
            this.l = this.getAnimation().getVelocityVectorFromNanos(v);
            if(this.getAnimation().isFinishedFromNanos(v)) {
                this.setFinished$animation_core_release(true);
            }
        }

        public final void resetAnimation$animation_core_release() {
            this.setResetSnapValue$animation_core_release(-2.0f);
        }

        public final void resetAnimationValue$animation_core_release(float f) {
            int v = Float.compare(f, -4.0f);
            if(v == 0 || f == -5.0f) {
                TargetBasedAnimation targetBasedAnimation0 = this.g;
                if(targetBasedAnimation0 != null) {
                    this.getAnimation().setMutableInitialValue$animation_core_release(targetBasedAnimation0.getTargetValue());
                    this.f = null;
                    this.g = null;
                }
                Object object0 = v == 0 ? this.getAnimation().getInitialValue() : this.getAnimation().getTargetValue();
                this.getAnimation().setMutableInitialValue$animation_core_release(object0);
                this.getAnimation().setMutableTargetValue$animation_core_release(object0);
                this.setValue$animation_core_release(object0);
                this.setDurationNanos$animation_core_release(this.getAnimation().getDurationNanos());
                return;
            }
            this.setResetSnapValue$animation_core_release(f);
        }

        public final void seekTo$animation_core_release(long v) {
            if(this.getResetSnapValue$animation_core_release() == -1.0f) {
                this.n = true;
                if(Intrinsics.areEqual(this.getAnimation().getTargetValue(), this.getAnimation().getInitialValue())) {
                    this.setValue$animation_core_release(this.getAnimation().getTargetValue());
                    return;
                }
                this.setValue$animation_core_release(this.getAnimation().getValueFromNanos(v));
                this.l = this.getAnimation().getVelocityVectorFromNanos(v);
            }
        }

        public final void setDurationNanos$animation_core_release(long v) {
            this.m.setLongValue(v);
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.h.setValue(Boolean.valueOf(z));
        }

        public final void setInitialValueAnimation$animation_core_release(@NotNull SeekingAnimationState seekableTransitionState$SeekingAnimationState0) {
            if(!Intrinsics.areEqual(this.getAnimation().getTargetValue(), this.getAnimation().getInitialValue())) {
                this.g = this.getAnimation();
                this.f = seekableTransitionState$SeekingAnimationState0;
            }
            Object object0 = this.getValue();
            Object object1 = this.getValue();
            AnimationVector animationVector0 = AnimationVectorsKt.newInstance(this.l);
            TargetBasedAnimation targetBasedAnimation0 = new TargetBasedAnimation(this.o, this.a, object0, object1, animationVector0);
            this.e.setValue(targetBasedAnimation0);
            this.setDurationNanos$animation_core_release(this.getAnimation().getDurationNanos());
            this.j = true;
        }

        public final void setInitialValueState$animation_core_release(@Nullable SeekingAnimationState seekableTransitionState$SeekingAnimationState0) {
            this.f = seekableTransitionState$SeekingAnimationState0;
        }

        public final void setResetSnapValue$animation_core_release(float f) {
            this.i.setFloatValue(f);
        }

        public void setValue$animation_core_release(Object object0) {
            this.k.setValue(object0);
        }

        @Override
        @NotNull
        public String toString() {
            return "current value: " + this.getValue() + ", target: " + this.c.getValue() + ", spec: " + this.getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core_release(Object object0, Object object1, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
            this.c.setValue(object1);
            this.d.setValue(finiteAnimationSpec0);
            if(Intrinsics.areEqual(this.getAnimation().getInitialValue(), object0) && Intrinsics.areEqual(this.getAnimation().getTargetValue(), object1)) {
                return;
            }
            this.a(object0, false);
        }

        public final void updateInitialValue$animation_core_release() {
            SeekingAnimationState seekableTransitionState$SeekingAnimationState0 = this.f;
            if(seekableTransitionState$SeekingAnimationState0 == null) {
                return;
            }
            TargetBasedAnimation targetBasedAnimation0 = this.g;
            if(targetBasedAnimation0 == null) {
                return;
            }
            long v = c.roundToLong(((double)seekableTransitionState$SeekingAnimationState0.getDurationNanos()) * ((double)seekableTransitionState$SeekingAnimationState0.getValue()));
            Object object0 = targetBasedAnimation0.getValueFromNanos(v);
            if(this.j) {
                this.getAnimation().setMutableTargetValue$animation_core_release(object0);
            }
            this.getAnimation().setMutableInitialValue$animation_core_release(object0);
            this.setDurationNanos$animation_core_release(this.getAnimation().getDurationNanos());
            if(this.getResetSnapValue$animation_core_release() != -2.0f && !this.j) {
                this.seekTo$animation_core_release(Transition.this.getPlayTimeNanos());
            }
            else {
                this.setValue$animation_core_release(object0);
            }
            if(v >= seekableTransitionState$SeekingAnimationState0.getDurationNanos()) {
                this.f = null;
                this.g = null;
                return;
            }
            seekableTransitionState$SeekingAnimationState0.setComplete(false);
        }

        public final void updateTargetValue$animation_core_release(Object object0, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
            if(this.j && Intrinsics.areEqual(object0, (this.g == null ? null : this.g.getTargetValue()))) {
                return;
            }
            MutableState mutableState0 = this.c;
            if(Intrinsics.areEqual(mutableState0.getValue(), object0) && this.getResetSnapValue$animation_core_release() == -1.0f) {
                return;
            }
            mutableState0.setValue(object0);
            this.d.setValue(finiteAnimationSpec0);
            boolean z = true;
            this.a((this.getResetSnapValue$animation_core_release() == -3.0f ? object0 : this.getValue()), !this.isFinished$animation_core_release());
            if(Float.compare(this.getResetSnapValue$animation_core_release(), -3.0f) != 0) {
                z = false;
            }
            this.setFinished$animation_core_release(z);
            if(this.getResetSnapValue$animation_core_release() >= 0.0f) {
                long v = this.getAnimation().getDurationNanos();
                this.setValue$animation_core_release(this.getAnimation().getValueFromNanos(((long)(this.getResetSnapValue$animation_core_release() * ((float)v)))));
            }
            else if(this.getResetSnapValue$animation_core_release() == -3.0f) {
                this.setValue$animation_core_release(object0);
            }
            this.j = false;
            this.setResetSnapValue$animation_core_release(-1.0f);
        }
    }

    public static final int $stable;
    public final TransitionState a;
    public final Transition b;
    public final String c;
    public final MutableState d;
    public final MutableState e;
    public final MutableLongState f;
    public final MutableLongState g;
    public final MutableState h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final MutableState k;
    public long l;
    public final State m;

    @PublishedApi
    public Transition(@NotNull MutableTransitionState mutableTransitionState0, @Nullable String s) {
        Intrinsics.checkNotNull(mutableTransitionState0, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
        this(mutableTransitionState0, null, s);
    }

    public Transition(MutableTransitionState mutableTransitionState0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(mutableTransitionState0, s);
    }

    public Transition(@NotNull TransitionState transitionState0, @Nullable Transition transition0, @Nullable String s) {
        this.a = transitionState0;
        this.b = transition0;
        this.c = s;
        this.d = SnapshotStateKt.mutableStateOf$default(this.getCurrentState(), null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(new g(this.getCurrentState(), this.getCurrentState()), null, 2, null);
        this.f = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.g = SnapshotLongStateKt.mutableLongStateOf(0x8000000000000000L);
        this.h = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.i = SnapshotStateKt.mutableStateListOf();
        this.j = SnapshotStateKt.mutableStateListOf();
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.m = SnapshotStateKt.derivedStateOf(new q(this, 1));
        transitionState0.transitionConfigured$animation_core_release(this);
    }

    public Transition(TransitionState transitionState0, Transition transition0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            s = null;
        }
        this(transitionState0, transition0, s);
    }

    @PublishedApi
    public Transition(@NotNull TransitionState transitionState0, @Nullable String s) {
        this(transitionState0, null, s);
    }

    public Transition(TransitionState transitionState0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(transitionState0, s);
    }

    public Transition(Object object0, @Nullable String s) {
        this(new MutableTransitionState(object0), null, s);
    }

    public final long a() {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        long v1 = 0L;
        for(int v3 = 0; v3 < v; ++v3) {
            v1 = Math.max(v1, ((TransitionAnimationState)snapshotStateList0.get(v3)).getDurationNanos$animation_core_release());
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v4 = snapshotStateList1.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            v1 = Math.max(v1, ((Transition)snapshotStateList1.get(v2)).a());
        }
        return v1;
    }

    public static final void access$onChildAnimationUpdated(Transition transition0) {
        transition0.h.setValue(Boolean.TRUE);
        if(transition0.isSeeking()) {
            SnapshotStateList snapshotStateList0 = transition0.i;
            int v = snapshotStateList0.size();
            long v2 = 0L;
            for(int v1 = 0; v1 < v; ++v1) {
                TransitionAnimationState transition$TransitionAnimationState0 = (TransitionAnimationState)snapshotStateList0.get(v1);
                v2 = Math.max(v2, transition$TransitionAnimationState0.getDurationNanos$animation_core_release());
                transition$TransitionAnimationState0.seekTo$animation_core_release(transition0.l);
            }
            transition0.h.setValue(Boolean.FALSE);
        }
    }

    public final boolean addAnimation$animation_core_release(@NotNull TransitionAnimationState transition$TransitionAnimationState0) {
        return this.i.add(transition$TransitionAnimationState0);
    }

    public final boolean addTransition$animation_core_release(@NotNull Transition transition0) {
        return this.j.add(transition0);
    }

    @Composable
    public final void animateTo$animation_core_release(Object object0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA6F9B301);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(object0) : composer1.changedInstance(object0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA6F9B301, v1, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1209)");
            }
            if(this.isSeeking()) {
                composer1.startReplaceGroup(1823861403);
            }
            else {
                composer1.startReplaceGroup(0x6C9F42D2);
                this.updateTarget$animation_core_release(object0);
                if(!Intrinsics.areEqual(object0, this.getCurrentState()) || this.isRunning() || ((Boolean)this.h.getValue()).booleanValue()) {
                    composer1.startReplaceGroup(1822607949);
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
                    Companion composer$Companion0 = Composer.Companion;
                    if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                        compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
                    }
                    CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
                    boolean z = composer1.changedInstance(coroutineScope0);
                    b2 b20 = composer1.rememberedValue();
                    if((v1 & 0x70) == 0x20 || z || b20 == composer$Companion0.getEmpty()) {
                        b20 = new b2(24, coroutineScope0, this);
                        composer1.updateRememberedValue(b20);
                    }
                    EffectsKt.DisposableEffect(coroutineScope0, this, b20, composer1, v1 & 0x70);
                }
                else {
                    composer1.startReplaceGroup(0x6CB5C3DB);
                }
                composer1.endReplaceGroup();
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(this, object0, v, 21));
        }
    }

    public final void b() {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((TransitionAnimationState)snapshotStateList0.get(v2)).resetAnimation$animation_core_release();
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Transition)snapshotStateList1.get(v1)).b();
        }
    }

    public final void clearInitialAnimations$animation_core_release() {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((TransitionAnimationState)snapshotStateList0.get(v2)).clearInitialAnimation$animation_core_release();
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Transition)snapshotStateList1.get(v1)).clearInitialAnimations$animation_core_release();
        }
    }

    @NotNull
    public final List getAnimations() {
        return this.i;
    }

    public final Object getCurrentState() {
        return this.a.getCurrentState();
    }

    @InternalAnimationApi
    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((TransitionAnimationState)snapshotStateList0.get(v1)).getInitialValueState$animation_core_release() != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v2 = snapshotStateList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(((Transition)snapshotStateList1.get(v3)).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    @InternalAnimationApi
    public static void getHasInitialValueAnimations$annotations() {
    }

    @Nullable
    public final String getLabel() {
        return this.c;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.l;
    }

    @RestrictTo({Scope.LIBRARY})
    @Nullable
    public final Transition getParentTransition() {
        return this.b;
    }

    @RestrictTo({Scope.LIBRARY})
    public final long getPlayTimeNanos() {
        return this.b == null ? this.f.getLongValue() : this.b.getPlayTimeNanos();
    }

    @NotNull
    public final Segment getSegment() {
        return (Segment)this.e.getValue();
    }

    public final long getStartTimeNanos$animation_core_release() {
        return this.g.getLongValue();
    }

    public final Object getTargetState() {
        return this.d.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number)this.m.getValue()).longValue();
    }

    @NotNull
    public final List getTransitions() {
        return this.j;
    }

    public final boolean isRunning() {
        return this.getStartTimeNanos$animation_core_release() != 0x8000000000000000L;
    }

    @RestrictTo({Scope.LIBRARY})
    public final boolean isSeeking() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final void onDisposed$animation_core_release() {
        this.onTransitionEnd$animation_core_release();
        this.a.transitionRemoved$animation_core_release();
    }

    public final void onFrame$animation_core_release(long v, float f) {
        if(this.getStartTimeNanos$animation_core_release() == 0x8000000000000000L) {
            this.onTransitionStart$animation_core_release(v);
        }
        long v1 = v - this.getStartTimeNanos$animation_core_release();
        int v2 = Float.compare(f, 0.0f);
        if(v2 != 0) {
            v1 = c.roundToLong(((double)v1) / ((double)f));
        }
        this.setPlayTimeNanos(v1);
        this.onFrame$animation_core_release(v1, v2 == 0);
    }

    public final void onFrame$animation_core_release(long v, boolean z) {
        boolean z1 = true;
        if(Long.compare(this.getStartTimeNanos$animation_core_release(), 0x8000000000000000L) == 0) {
            this.onTransitionStart$animation_core_release(v);
        }
        else {
            TransitionState transitionState0 = this.a;
            if(!transitionState0.isRunning$animation_core_release()) {
                transitionState0.setRunning$animation_core_release(true);
            }
        }
        this.h.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList0 = this.i;
        int v1 = snapshotStateList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            TransitionAnimationState transition$TransitionAnimationState0 = (TransitionAnimationState)snapshotStateList0.get(v2);
            if(!transition$TransitionAnimationState0.isFinished$animation_core_release()) {
                transition$TransitionAnimationState0.onPlayTimeChanged$animation_core_release(v, z);
            }
            if(!transition$TransitionAnimationState0.isFinished$animation_core_release()) {
                z1 = false;
            }
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            Transition transition0 = (Transition)snapshotStateList1.get(v4);
            if(!Intrinsics.areEqual(transition0.getTargetState(), transition0.getCurrentState())) {
                transition0.onFrame$animation_core_release(v, z);
            }
            if(!Intrinsics.areEqual(transition0.getTargetState(), transition0.getCurrentState())) {
                z1 = false;
            }
        }
        if(z1) {
            this.onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        this.setStartTimeNanos$animation_core_release(0x8000000000000000L);
        TransitionState transitionState0 = this.a;
        if(transitionState0 instanceof MutableTransitionState) {
            transitionState0.setCurrentState$animation_core_release(this.getTargetState());
        }
        this.setPlayTimeNanos(0L);
        transitionState0.setRunning$animation_core_release(false);
        SnapshotStateList snapshotStateList0 = this.j;
        int v1 = snapshotStateList0.size();
        for(int v = 0; v < v1; ++v) {
            ((Transition)snapshotStateList0.get(v)).onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long v) {
        this.setStartTimeNanos$animation_core_release(v);
        this.a.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@NotNull DeferredAnimation transition$DeferredAnimation0) {
        DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0 = transition$DeferredAnimation0.getData$animation_core_release();
        if(transition$DeferredAnimation$DeferredAnimationData0 != null) {
            TransitionAnimationState transition$TransitionAnimationState0 = transition$DeferredAnimation$DeferredAnimationData0.getAnimation();
            if(transition$TransitionAnimationState0 != null) {
                this.removeAnimation$animation_core_release(transition$TransitionAnimationState0);
            }
        }
    }

    public final void removeAnimation$animation_core_release(@NotNull TransitionAnimationState transition$TransitionAnimationState0) {
        this.i.remove(transition$TransitionAnimationState0);
    }

    public final boolean removeTransition$animation_core_release(@NotNull Transition transition0) {
        return this.j.remove(transition0);
    }

    public final void resetAnimationFraction$animation_core_release(float f) {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((TransitionAnimationState)snapshotStateList0.get(v2)).resetAnimationValue$animation_core_release(f);
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Transition)snapshotStateList1.get(v1)).resetAnimationFraction$animation_core_release(f);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @JvmName(name = "seek")
    public final void seek(Object object0, Object object1, long v) {
        this.setStartTimeNanos$animation_core_release(0x8000000000000000L);
        TransitionState transitionState0 = this.a;
        transitionState0.setRunning$animation_core_release(false);
        if(!this.isSeeking() || !Intrinsics.areEqual(this.getCurrentState(), object0) || !Intrinsics.areEqual(this.getTargetState(), object1)) {
            if(!Intrinsics.areEqual(this.getCurrentState(), object0) && transitionState0 instanceof MutableTransitionState) {
                transitionState0.setCurrentState$animation_core_release(object0);
            }
            this.setTargetState$animation_core_release(object1);
            this.setSeeking$animation_core_release(true);
            g g0 = new g(object0, object1);
            this.e.setValue(g0);
        }
        SnapshotStateList snapshotStateList0 = this.j;
        int v2 = snapshotStateList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Transition transition0 = (Transition)snapshotStateList0.get(v3);
            Intrinsics.checkNotNull(transition0, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if(transition0.isSeeking()) {
                transition0.seek(transition0.getCurrentState(), transition0.getTargetState(), v);
            }
        }
        SnapshotStateList snapshotStateList1 = this.i;
        int v4 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v4; ++v1) {
            ((TransitionAnimationState)snapshotStateList1.get(v1)).seekTo$animation_core_release(v);
        }
        this.l = v;
    }

    public final void seekAnimations$animation_core_release(long v) {
        if(this.getStartTimeNanos$animation_core_release() == 0x8000000000000000L) {
            this.setStartTimeNanos$animation_core_release(v);
        }
        this.setPlayTimeNanos(v);
        this.h.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList0 = this.i;
        int v1 = snapshotStateList0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            ((TransitionAnimationState)snapshotStateList0.get(v3)).seekTo$animation_core_release(v);
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v4 = snapshotStateList1.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            Transition transition0 = (Transition)snapshotStateList1.get(v2);
            if(!Intrinsics.areEqual(transition0.getTargetState(), transition0.getCurrentState())) {
                transition0.seekAnimations$animation_core_release(v);
            }
        }
    }

    public final void setInitialAnimations$animation_core_release(@NotNull SeekingAnimationState seekableTransitionState$SeekingAnimationState0) {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((TransitionAnimationState)snapshotStateList0.get(v2)).setInitialValueAnimation$animation_core_release(seekableTransitionState$SeekingAnimationState0);
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Transition)snapshotStateList1.get(v1)).setInitialAnimations$animation_core_release(seekableTransitionState$SeekingAnimationState0);
        }
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long v) {
        this.l = v;
    }

    @RestrictTo({Scope.LIBRARY})
    public final void setPlayTimeNanos(long v) {
        if(this.b == null) {
            this.f.setLongValue(v);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public final void setSeeking$animation_core_release(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void setStartTimeNanos$animation_core_release(long v) {
        this.g.setLongValue(v);
    }

    public final void setTargetState$animation_core_release(Object object0) {
        this.d.setValue(object0);
    }

    @Override
    @NotNull
    public String toString() {
        List list0 = this.getAnimations();
        int v = list0.size();
        String s = "Transition animation values: ";
        for(int v1 = 0; v1 < v; ++v1) {
            s = s + ((TransitionAnimationState)list0.get(v1)) + ", ";
        }
        return s;
    }

    public final void updateInitialValues$animation_core_release() {
        SnapshotStateList snapshotStateList0 = this.i;
        int v = snapshotStateList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((TransitionAnimationState)snapshotStateList0.get(v2)).updateInitialValue$animation_core_release();
        }
        SnapshotStateList snapshotStateList1 = this.j;
        int v3 = snapshotStateList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Transition)snapshotStateList1.get(v1)).updateInitialValues$animation_core_release();
        }
    }

    public final void updateTarget$animation_core_release(Object object0) {
        if(!Intrinsics.areEqual(this.getTargetState(), object0)) {
            g g0 = new g(this.getTargetState(), object0);
            this.e.setValue(g0);
            if(!Intrinsics.areEqual(this.getCurrentState(), this.getTargetState())) {
                Object object1 = this.getTargetState();
                this.a.setCurrentState$animation_core_release(object1);
            }
            this.setTargetState$animation_core_release(object0);
            if(!this.isRunning()) {
                this.h.setValue(Boolean.TRUE);
            }
            this.b();
        }
    }
}

