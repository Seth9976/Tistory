package androidx.compose.foundation.gestures;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.b;
import z.o;
import z.q;
import z.r;
import z.t;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b?\b\u0007\u0018\u0000 n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001nB\u0081\u0001\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00050\u000E\u0012#\b\u0002\u0010\u0012\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0014B\u0091\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00050\u000E\u0012#\b\u0002\u0010\u0012\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0017J\r\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00028\u0000H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ%\u0010!\u001A\u00020 2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00152\b\b\u0002\u0010\u001F\u001A\u00028\u0000\u00A2\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001A\u00020\u00052\u0006\u0010#\u001A\u00020\u0005H\u0086@\u00A2\u0006\u0004\b$\u0010%J^\u0010-\u001A\u00020 2\b\b\u0002\u0010\'\u001A\u00020&2B\u0010,\u001A>\b\u0001\u0012\u0004\u0012\u00020)\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0015\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*\u0012\u0006\u0012\u0004\u0018\u00010\u00020(\u00A2\u0006\u0002\b+H\u0086@\u00A2\u0006\u0004\b-\u0010.J{\u0010-\u001A\u00020 2\u0006\u0010/\u001A\u00028\u00002\b\b\u0002\u0010\'\u001A\u00020&2W\u0010,\u001AS\b\u0001\u0012\u0004\u0012\u00020)\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0015\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*\u0012\u0006\u0012\u0004\u0018\u00010\u000200\u00A2\u0006\u0002\b+H\u0086@\u00A2\u0006\u0004\b-\u00102J\u0017\u00106\u001A\u00020\u00052\u0006\u00103\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b4\u00105J\u0015\u00107\u001A\u00020\u00052\u0006\u00103\u001A\u00020\u0005\u00A2\u0006\u0004\b7\u00105R5\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00050\u000E8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR5\u0010\u0012\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bH\u00109\u001A\u0004\bI\u0010;R+\u0010Q\u001A\u00028\u00002\u0006\u0010J\u001A\u00028\u00008F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010U\u001A\u00028\u00002\u0006\u0010J\u001A\u00028\u00008F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bR\u0010L\u001A\u0004\bS\u0010N\"\u0004\bT\u0010PR\u001B\u0010/\u001A\u00028\u00008FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010NR+\u0010^\u001A\u00020\u00052\u0006\u0010J\u001A\u00020\u00058F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\u0019\"\u0004\b\\\u0010]R!\u0010\u001C\u001A\u00020\u00058GX\u0087\u0084\u0002\u00A2\u0006\u0012\n\u0004\b_\u0010W\u0012\u0004\ba\u0010b\u001A\u0004\b`\u0010\u0019R+\u0010f\u001A\u00020\u00052\u0006\u0010J\u001A\u00020\u00058F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bc\u0010Z\u001A\u0004\bd\u0010\u0019\"\u0004\be\u0010]R7\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010J\u001A\b\u0012\u0004\u0012\u00028\u00000\u00158F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bg\u0010L\u001A\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0011\u0010l\u001A\u00020\u00118F\u00A2\u0006\u0006\u001A\u0004\bl\u0010m\u00A8\u0006o"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)V", "requireOffset", "()F", "from", "to", "progress", "(Ljava/lang/Object;Ljava/lang/Object;)F", "newAnchors", "newTarget", "", "updateAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", "velocity", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "anchor", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$foundation_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "a", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$foundation_release", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$foundation_release", "()Lkotlin/jvm/functions/Function0;", "c", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "d", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "e", "getConfirmValueChange$foundation_release", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "h", "getSettledValue", "setSettledValue", "settledValue", "i", "Landroidx/compose/runtime/State;", "getTargetValue", "j", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "offset", "k", "getProgress", "getProgress$annotations", "()V", "l", "getLastVelocity", "setLastVelocity", "lastVelocity", "n", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "isAnimationRunning", "()Z", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1225:1\n81#2:1226\n107#2,2:1227\n81#2:1229\n107#2,2:1230\n81#2:1232\n81#2:1236\n81#2:1240\n107#2,2:1241\n81#2:1243\n107#2,2:1244\n76#3:1233\n109#3,2:1234\n76#3:1237\n109#3,2:1238\n195#4,9:1246\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n557#1:1226\n557#1:1227,2\n566#1:1229\n566#1:1230,2\n573#1:1232\n645#1:1236\n665#1:1240\n665#1:1241,2\n667#1:1243\n667#1:1244,2\n590#1:1233\n590#1:1234,2\n662#1:1237\n662#1:1238,2\n928#1:1246,9\n*E\n"})
public final class AnchoredDraggableState {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u008E\u0001\u0010\u0013\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00010\u0011\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u00062!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\r2\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000F0\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "", "confirmValueChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @ExperimentalFoundationApi
        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
            g g0 = new g(animationSpec0, decayAnimationSpec0, function10, function00, function11);
            return SaverKt.Saver(f.w, g0);
        }

        public static Saver Saver$default(Companion anchoredDraggableState$Companion0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
            if((v & 16) != 0) {
                function11 = e.w;
            }
            return anchoredDraggableState$Companion0.Saver(animationSpec0, decayAnimationSpec0, function10, function00, function11);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Function1 a;
    public final Function0 b;
    public final AnimationSpec c;
    public final DecayAnimationSpec d;
    public final Function1 e;
    public final MutatorMutex f;
    public final MutableState g;
    public final MutableState h;
    public final State i;
    public final MutableFloatState j;
    public final State k;
    public final MutableFloatState l;
    public final MutableState m;
    public final MutableState n;
    public final androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDragScope.1 o;

    static {
        AnchoredDraggableState.Companion = new Companion(null);
    }

    @ExperimentalFoundationApi
    public AnchoredDraggableState(Object object0, @NotNull DraggableAnchors draggableAnchors0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull AnimationSpec animationSpec0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull Function1 function11) {
        this(object0, function10, function00, animationSpec0, decayAnimationSpec0, function11);
        this.n.setValue(draggableAnchors0);
        this.a(object0);
    }

    public AnchoredDraggableState(Object object0, DraggableAnchors draggableAnchors0, Function1 function10, Function0 function00, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function1 function11, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Function1 function12 = (v & 0x40) == 0 ? function11 : b.z;
        this(object0, draggableAnchors0, function10, function00, animationSpec0, decayAnimationSpec0, function12);
    }

    public AnchoredDraggableState(Object object0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull AnimationSpec animationSpec0, @NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull Function1 function11) {
        this.a = function10;
        this.b = function00;
        this.c = animationSpec0;
        this.d = decayAnimationSpec0;
        this.e = function11;
        this.f = new MutatorMutex();
        this.g = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.i = SnapshotStateKt.derivedStateOf(new o(this, 3));
        this.j = PrimitiveSnapshotStateKt.mutableFloatStateOf(NaNf);
        this.k = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new o(this, 2));
        this.l = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.m = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.n = SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.access$emptyDraggableAnchors(), null, 2, null);
        this.o = new AnchoredDragScope() {
            public Object a;
            public Object b;
            public float c;
            public final AnchoredDraggableState d;

            {
                this.d = anchoredDraggableState0;
                this.c = NaNf;
            }

            @Override  // androidx.compose.foundation.gestures.AnchoredDragScope
            public void dragTo(float f, float f1) {
                float f2 = this.d.getOffset();
                AnchoredDraggableState.access$setOffset(this.d, f);
                AnchoredDraggableState.access$setLastVelocity(this.d, f1);
                if(Float.isNaN(f2)) {
                    return;
                }
                this.updateIfNeeded(f >= f2);
            }

            public final float getDistance() {
                return this.c;
            }

            @Nullable
            public final Object getLeftBound() {
                return this.a;
            }

            @Nullable
            public final Object getRightBound() {
                return this.b;
            }

            public final void setDistance(float f) {
                this.c = f;
            }

            public final void setLeftBound(@Nullable Object object0) {
                this.a = object0;
            }

            public final void setRightBound(@Nullable Object object0) {
                this.b = object0;
            }

            public final void updateBounds(boolean z) {
                AnchoredDraggableState anchoredDraggableState0 = this.d;
                float f = anchoredDraggableState0.getAnchors().positionOf(anchoredDraggableState0.getCurrentValue());
                if(anchoredDraggableState0.getOffset() == f) {
                    float f1 = anchoredDraggableState0.getOffset();
                    Object object0 = anchoredDraggableState0.getAnchors().closestAnchor(f1 + (z ? 1.0f : -1.0f), z);
                    if(object0 == null) {
                        object0 = anchoredDraggableState0.getCurrentValue();
                    }
                    if(z) {
                        this.a = anchoredDraggableState0.getCurrentValue();
                        this.b = object0;
                    }
                    else {
                        this.a = object0;
                        this.b = anchoredDraggableState0.getCurrentValue();
                    }
                }
                else {
                    Object object1 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset(), false);
                    if(object1 == null) {
                        object1 = anchoredDraggableState0.getCurrentValue();
                    }
                    Object object2 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset(), true);
                    if(object2 == null) {
                        object2 = anchoredDraggableState0.getCurrentValue();
                    }
                    this.a = object1;
                    this.b = object2;
                }
                DraggableAnchors draggableAnchors0 = anchoredDraggableState0.getAnchors();
                Object object3 = this.a;
                Intrinsics.checkNotNull(object3);
                float f2 = draggableAnchors0.positionOf(object3);
                DraggableAnchors draggableAnchors1 = anchoredDraggableState0.getAnchors();
                Object object4 = this.b;
                Intrinsics.checkNotNull(object4);
                this.c = Math.abs(f2 - draggableAnchors1.positionOf(object4));
            }

            public final void updateIfNeeded(boolean z) {
                this.updateBounds(z);
                AnchoredDraggableState anchoredDraggableState0 = this.d;
                if(Math.abs(anchoredDraggableState0.getOffset() - anchoredDraggableState0.getAnchors().positionOf(anchoredDraggableState0.getCurrentValue())) >= this.c / 2.0f) {
                    Object object0 = z ? this.b : this.a;
                    if(object0 == null) {
                        object0 = anchoredDraggableState0.getCurrentValue();
                    }
                    if(((Boolean)anchoredDraggableState0.getConfirmValueChange$foundation_release().invoke(object0)).booleanValue()) {
                        AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState0, object0);
                    }
                }
            }
        };
    }

    public AnchoredDraggableState(Object object0, Function1 function10, Function0 function00, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function1 function11, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 0x20) != 0) {
            function11 = b.y;
        }
        this(object0, function10, function00, animationSpec0, decayAnimationSpec0, function11);
    }

    public final boolean a(Object object0) {
        MutatorMutex mutatorMutex0 = this.f;
        if(mutatorMutex0.tryLock()) {
            try {
                androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDragScope.1 anchoredDraggableState$anchoredDragScope$10 = this.o;
                float f = this.getAnchors().positionOf(object0);
                if(!Float.isNaN(f)) {
                    AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$10, f, 0.0f, 2, null);
                    this.m.setValue(null);
                }
                this.g.setValue(object0);
                this.h.setValue(object0);
                return true;
            }
            finally {
                mutatorMutex0.unlock();
            }
        }
        return false;
    }

    public static final Object access$getDragTarget(AnchoredDraggableState anchoredDraggableState0) {
        return anchoredDraggableState0.m.getValue();
    }

    public static final void access$setCurrentValue(AnchoredDraggableState anchoredDraggableState0, Object object0) {
        anchoredDraggableState0.g.setValue(object0);
    }

    public static final void access$setDragTarget(AnchoredDraggableState anchoredDraggableState0, Object object0) {
        anchoredDraggableState0.m.setValue(object0);
    }

    public static final void access$setLastVelocity(AnchoredDraggableState anchoredDraggableState0, float f) {
        anchoredDraggableState0.l.setFloatValue(f);
    }

    public static final void access$setOffset(AnchoredDraggableState anchoredDraggableState0, float f) {
        anchoredDraggableState0.j.setFloatValue(f);
    }

    public static final void access$setSettledValue(AnchoredDraggableState anchoredDraggableState0, Object object0) {
        anchoredDraggableState0.h.setValue(object0);
    }

    @Nullable
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
        q q0 = new q(this, null, function30);
        Object object0 = this.f.mutate(mutatePriority0, q0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object anchoredDrag(Object object0, @NotNull MutatePriority mutatePriority0, @NotNull Function4 function40, @NotNull Continuation continuation0) {
        AnchoredDraggableState anchoredDraggableState0;
        r r0;
        if(continuation0 instanceof r) {
            r0 = (r)continuation0;
            int v = r0.r;
            if((v & 0x80000000) == 0) {
                r0 = new r(this, continuation0);
            }
            else {
                r0.r = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, continuation0);
        }
        Object object1 = r0.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(r0.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                if(this.getAnchors().hasAnchorFor(object0)) {
                    try {
                        t t0 = new t(this, object0, function40, null);
                        r0.o = this;
                        r0.r = 1;
                        if(this.f.mutate(mutatePriority0, t0, r0) == object2) {
                            return object2;
                        }
                    }
                    catch(Throwable throwable0) {
                        anchoredDraggableState0 = this;
                        anchoredDraggableState0.m.setValue(null);
                        throw throwable0;
                    }
                    anchoredDraggableState0 = this;
                    break;
                }
                if(((Boolean)this.e.invoke(object0)).booleanValue()) {
                    this.h.setValue(object0);
                    this.g.setValue(object0);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    anchoredDraggableState0 = r0.o;
                    ResultKt.throwOnFailure(object1);
                    break;
                }
                catch(Throwable throwable0) {
                }
                anchoredDraggableState0.m.setValue(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        anchoredDraggableState0.m.setValue(null);
        return Unit.INSTANCE;
    }

    public static Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState0, MutatePriority mutatePriority0, Function3 function30, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return anchoredDraggableState0.anchoredDrag(mutatePriority0, function30, continuation0);
    }

    public static Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState0, Object object0, MutatePriority mutatePriority0, Function4 function40, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return anchoredDraggableState0.anchoredDrag(object0, mutatePriority0, function40, continuation0);
    }

    public final float dispatchRawDelta(float f) {
        float f1 = this.newOffsetForDelta$foundation_release(f);
        float f2 = Float.isNaN(this.getOffset()) ? 0.0f : this.getOffset();
        this.j.setFloatValue(f1);
        return f1 - f2;
    }

    @NotNull
    public final DraggableAnchors getAnchors() {
        return (DraggableAnchors)this.n.getValue();
    }

    @NotNull
    public final Function1 getConfirmValueChange$foundation_release() {
        return this.e;
    }

    public final Object getCurrentValue() {
        return this.g.getValue();
    }

    @NotNull
    public final DecayAnimationSpec getDecayAnimationSpec() {
        return this.d;
    }

    public final float getLastVelocity() {
        return this.l.getFloatValue();
    }

    public final float getOffset() {
        return this.j.getFloatValue();
    }

    @NotNull
    public final Function1 getPositionalThreshold$foundation_release() {
        return this.a;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getProgress() {
        return ((Number)this.k.getValue()).floatValue();
    }

    @Deprecated(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static void getProgress$annotations() {
    }

    public final Object getSettledValue() {
        return this.h.getValue();
    }

    @NotNull
    public final AnimationSpec getSnapAnimationSpec() {
        return this.c;
    }

    public final Object getTargetValue() {
        return this.i.getValue();
    }

    @NotNull
    public final Function0 getVelocityThreshold$foundation_release() {
        return this.b;
    }

    public final boolean isAnimationRunning() {
        return this.m.getValue() != null;
    }

    // 去混淆评级： 低(20)
    public final float newOffsetForDelta$foundation_release(float f) {
        return Float.isNaN(this.getOffset()) ? c.coerceIn(f + 0.0f, this.getAnchors().minAnchor(), this.getAnchors().maxAnchor()) : c.coerceIn(this.getOffset() + f, this.getAnchors().minAnchor(), this.getAnchors().maxAnchor());
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float progress(Object object0, Object object1) {
        float f = this.getAnchors().positionOf(object0);
        float f1 = this.getAnchors().positionOf(object1);
        float f2 = (c.coerceIn(this.getOffset(), Math.min(f, f1), Math.max(f, f1)) - f) / (f1 - f);
        if(!Float.isNaN(f2)) {
            if(f2 < 0.000001f) {
                return 0.0f;
            }
            return f2 > 0.999999f ? 1.0f : Math.abs(f2);
        }
        return 1.0f;
    }

    public final float requireOffset() {
        if(Float.isNaN(this.getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.getOffset();
    }

    @Nullable
    public final Object settle(float f, @NotNull Continuation continuation0) {
        boolean z = false;
        Object object0 = this.getCurrentValue();
        float f1 = this.requireOffset();
        DraggableAnchors draggableAnchors0 = this.getAnchors();
        float f2 = draggableAnchors0.positionOf(object0);
        float f3 = ((Number)this.b.invoke()).floatValue();
        if(f2 != f1 && !Float.isNaN(f2)) {
            if(Float.compare(Math.abs(f), Math.abs(f3)) >= 0) {
                if(Math.signum(f) > 0.0f) {
                    z = true;
                }
                Object object1 = draggableAnchors0.closestAnchor(f1, z);
                Intrinsics.checkNotNull(object1);
                return ((Boolean)this.e.invoke(object1)).booleanValue() ? AnchoredDraggableKt.animateToWithDecay(this, object1, f, continuation0) : AnchoredDraggableKt.animateToWithDecay(this, object0, f, continuation0);
            }
            if(f1 - f2 > 0.0f) {
                z = true;
            }
            Object object2 = draggableAnchors0.closestAnchor(f1, z);
            Intrinsics.checkNotNull(object2);
            Float float0 = Math.abs(f2 - draggableAnchors0.positionOf(object2));
            if(Math.abs(f2 - f1) > Math.abs(((Number)this.a.invoke(float0)).floatValue())) {
                return ((Boolean)this.e.invoke(object2)).booleanValue() ? AnchoredDraggableKt.animateToWithDecay(this, object2, f, continuation0) : AnchoredDraggableKt.animateToWithDecay(this, object0, f, continuation0);
            }
        }
        return ((Boolean)this.e.invoke(object0)).booleanValue() ? AnchoredDraggableKt.animateToWithDecay(this, object0, f, continuation0) : AnchoredDraggableKt.animateToWithDecay(this, object0, f, continuation0);
    }

    public final void updateAnchors(@NotNull DraggableAnchors draggableAnchors0, Object object0) {
        if(!Intrinsics.areEqual(this.getAnchors(), draggableAnchors0)) {
            this.n.setValue(draggableAnchors0);
            if(!this.a(object0)) {
                this.m.setValue(object0);
            }
        }
    }

    public static void updateAnchors$default(AnchoredDraggableState anchoredDraggableState0, DraggableAnchors draggableAnchors0, Object object0, int v, Object object1) {
        if((v & 2) != 0) {
            if(Float.isNaN(anchoredDraggableState0.getOffset())) {
                object0 = anchoredDraggableState0.getTargetValue();
            }
            else {
                object0 = draggableAnchors0.closestAnchor(anchoredDraggableState0.getOffset());
                if(object0 == null) {
                    object0 = anchoredDraggableState0.getTargetValue();
                }
            }
        }
        anchoredDraggableState0.updateAnchors(draggableAnchors0, object0);
    }
}

