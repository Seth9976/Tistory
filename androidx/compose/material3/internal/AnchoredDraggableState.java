package androidx.compose.material3.internal;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.z;
import w0.h;
import w0.r;
import w0.s;
import w0.u;
import w0.v;
import w0.x;

@Stable
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001fBs\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\u0004\u00A2\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\u0004\u00A2\u0006\u0004\b\u0011\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001B\u001A\u00020\u001A2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0019\u001A\u00028\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0018\u0010\u001E\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u0005H\u0086@\u00A2\u0006\u0004\b\u001E\u0010\u001FJ^\u0010\'\u001A\u00020\u001A2\b\b\u0002\u0010!\u001A\u00020 2B\u0010&\u001A>\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"\u00A2\u0006\u0002\b%H\u0086@\u00A2\u0006\u0004\b\'\u0010(J{\u0010\'\u001A\u00020\u001A2\u0006\u0010)\u001A\u00028\u00002\b\b\u0002\u0010!\u001A\u00020 2W\u0010&\u001AS\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020*\u00A2\u0006\u0002\b%H\u0086@\u00A2\u0006\u0004\b\'\u0010+J\u0017\u0010/\u001A\u00020\u00052\u0006\u0010,\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b-\u0010.J\u0015\u00100\u001A\u00020\u00052\u0006\u0010,\u001A\u00020\u0005\u00A2\u0006\u0004\b0\u0010.R5\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\f8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<R5\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u00102\u001A\u0004\b>\u00104R\u001A\u0010D\u001A\u00020?8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR+\u0010K\u001A\u00028\u00002\u0006\u0010E\u001A\u00028\u00008F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bF\u0010G\u001A\u0004\bH\u0010I\"\u0004\b5\u0010JR\u001B\u0010)\u001A\u00028\u00008FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010IR\u001B\u0010Q\u001A\u00028\u00008@X\u0080\u0084\u0002\u00A2\u0006\f\n\u0004\bO\u0010M\u001A\u0004\bP\u0010IR+\u0010W\u001A\u00020\u00052\u0006\u0010E\u001A\u00020\u00058F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010\u0017\"\u0004\bU\u0010VR\u001B\u0010Z\u001A\u00020\u00058GX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bX\u0010M\u001A\u0004\bY\u0010\u0017R+\u0010^\u001A\u00020\u00052\u0006\u0010E\u001A\u00020\u00058F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b[\u0010S\u001A\u0004\b\\\u0010\u0017\"\u0004\b]\u0010VR7\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b_\u0010G\u001A\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0011\u0010d\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\bd\u0010e\u00A8\u0006g"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/material3/internal/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/material3/internal/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "requireOffset", "()F", "newAnchors", "newTarget", "", "updateAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;Ljava/lang/Object;)V", "velocity", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material3/internal/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material3_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "a", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material3_release", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material3_release", "()Lkotlin/jvm/functions/Function0;", "c", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "d", "getConfirmValueChange$material3_release", "Landroidx/compose/foundation/gestures/DraggableState;", "f", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "currentValue", "h", "Landroidx/compose/runtime/State;", "getTargetValue", "i", "getClosestValue$material3_release", "closestValue", "j", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "offset", "k", "getProgress", "progress", "l", "getLastVelocity", "setLastVelocity", "lastVelocity", "n", "getAnchors", "()Landroidx/compose/material3/internal/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;)V", "isAnimationRunning", "()Z", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,868:1\n81#2:869\n107#2,2:870\n81#2:872\n81#2:873\n81#2:877\n81#2:881\n107#2,2:882\n81#2:884\n107#2,2:885\n76#3:874\n109#3,2:875\n76#3:878\n109#3,2:879\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n*L\n287#1:869\n287#1:870,2\n295#1:872\n310#1:873\n355#1:877\n374#1:881\n374#1:882,2\n376#1:884\n376#1:885,2\n328#1:874\n328#1:875,2\n371#1:878\n371#1:879,2\n*E\n"})
public final class AnchoredDraggableState {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J|\u0010\u0011\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u000F\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/ParameterName;", "name", "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function00) {
            b b0 = new b(animationSpec0, function11, function10, function00);
            return SaverKt.Saver(a.w, b0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Function1 a;
    public final Function0 b;
    public final AnimationSpec c;
    public final Function1 d;
    public final InternalMutatorMutex e;
    public final androidx.compose.material3.internal.AnchoredDraggableState.draggableState.1 f;
    public final MutableState g;
    public final State h;
    public final State i;
    public final MutableFloatState j;
    public final State k;
    public final MutableFloatState l;
    public final MutableState m;
    public final MutableState n;
    public final androidx.compose.material3.internal.AnchoredDraggableState.anchoredDragScope.1 o;

    static {
        AnchoredDraggableState.Companion = new Companion(null);
    }

    public AnchoredDraggableState(Object object0, @NotNull DraggableAnchors draggableAnchors0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function11) {
        this(object0, function10, function00, animationSpec0, function11);
        this.n.setValue(draggableAnchors0);
        p9.a a0 = new p9.a(12, this, object0);
        this.e.tryMutate(a0);
    }

    public AnchoredDraggableState(Object object0, DraggableAnchors draggableAnchors0, Function1 function10, Function0 function00, AnimationSpec animationSpec0, Function1 function11, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 0x20) != 0) {
            function11 = h.z;
        }
        this(object0, draggableAnchors0, function10, function00, animationSpec0, function11);
    }

    public AnchoredDraggableState(Object object0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function11) {
        this.a = function10;
        this.b = function00;
        this.c = animationSpec0;
        this.d = function11;
        this.e = new InternalMutatorMutex();
        this.f = new DraggableState() {
            public final AnchoredDraggableState.draggableState.1.dragScope.1 a;
            public final AnchoredDraggableState b;

            {
                this.b = anchoredDraggableState0;
                this.a = new AnchoredDraggableState.draggableState.1.dragScope.1(anchoredDraggableState0);
            }

            @Override  // androidx.compose.foundation.gestures.DraggableState
            public void dispatchRawDelta(float f) {
                this.b.dispatchRawDelta(f);
            }

            @Override  // androidx.compose.foundation.gestures.DraggableState
            @Nullable
            public Object drag(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
                z z0 = new z(this, function20, null, 2);
                Object object0 = this.b.anchoredDrag(mutatePriority0, z0, continuation0);
                return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
        this.g = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.h = SnapshotStateKt.derivedStateOf(new s(this, 4));
        this.i = SnapshotStateKt.derivedStateOf(new s(this, 2));
        this.j = PrimitiveSnapshotStateKt.mutableFloatStateOf(NaNf);
        this.k = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new s(this, 3));
        this.l = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.m = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.n = SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.access$emptyDraggableAnchors(), null, 2, null);
        this.o = new AnchoredDragScope() {
            public final AnchoredDraggableState a;

            {
                this.a = anchoredDraggableState0;
            }

            @Override  // androidx.compose.material3.internal.AnchoredDragScope
            public void dragTo(float f, float f1) {
                AnchoredDraggableState.access$setOffset(this.a, f);
                AnchoredDraggableState.access$setLastVelocity(this.a, f1);
            }
        };
    }

    public AnchoredDraggableState(Object object0, Function1 function10, Function0 function00, AnimationSpec animationSpec0, Function1 function11, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            function11 = h.y;
        }
        this(object0, function10, function00, animationSpec0, function11);
    }

    public final Object a(float f, float f1, Object object0) {
        Object object1;
        DraggableAnchors draggableAnchors0 = this.getAnchors();
        float f2 = draggableAnchors0.positionOf(object0);
        float f3 = ((Number)this.b.invoke()).floatValue();
        int v = Float.compare(f2, f);
        if(v != 0 && !Float.isNaN(f2)) {
            Function1 function10 = this.a;
            if(v < 0) {
                if(Float.compare(f1, f3) >= 0) {
                    object0 = draggableAnchors0.closestAnchor(f, true);
                    Intrinsics.checkNotNull(object0);
                    return object0;
                }
                object1 = draggableAnchors0.closestAnchor(f, true);
                Intrinsics.checkNotNull(object1);
                return f < Math.abs(Math.abs(((Number)function10.invoke(Math.abs(draggableAnchors0.positionOf(object1) - f2))).floatValue()) + f2) ? object0 : object1;
            }
            if(Float.compare(f1, -f3) <= 0) {
                object0 = draggableAnchors0.closestAnchor(f, false);
                Intrinsics.checkNotNull(object0);
                return object0;
            }
            object1 = draggableAnchors0.closestAnchor(f, false);
            Intrinsics.checkNotNull(object1);
            float f4 = Math.abs(f2 - Math.abs(((Number)function10.invoke(Math.abs(f2 - draggableAnchors0.positionOf(object1)))).floatValue()));
            if(f < 0.0f) {
                return Math.abs(f) < f4 ? object0 : object1;
            }
            return f > f4 ? object0 : object1;
        }
        return object0;
    }

    public static final Object access$computeTarget(AnchoredDraggableState anchoredDraggableState0, float f, Object object0, float f1) {
        return anchoredDraggableState0.a(f, f1, object0);
    }

    public static final Object access$computeTargetWithoutThresholds(AnchoredDraggableState anchoredDraggableState0, float f, Object object0) {
        Object object1;
        DraggableAnchors draggableAnchors0 = anchoredDraggableState0.getAnchors();
        float f1 = draggableAnchors0.positionOf(object0);
        int v = Float.compare(f1, f);
        if(v != 0 && !Float.isNaN(f1)) {
            if(v < 0) {
                object1 = draggableAnchors0.closestAnchor(f, true);
                return object1 == null ? object0 : object1;
            }
            object1 = draggableAnchors0.closestAnchor(f, false);
            return object1 == null ? object0 : object1;
        }
        return object0;
    }

    public static final Object access$getDragTarget(AnchoredDraggableState anchoredDraggableState0) {
        return anchoredDraggableState0.m.getValue();
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

    @Nullable
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
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
        Object object0 = r0.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(r0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    u u0 = new u(this, null, function30);
                    r0.o = this;
                    r0.r = 1;
                    if(this.e.mutate(mutatePriority0, u0, r0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    anchoredDraggableState0 = this;
                    goto label_29;
                }
                anchoredDraggableState0 = this;
                break;
            }
            case 1: {
                try {
                    anchoredDraggableState0 = r0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_29:
                Object object2 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
                if(object2 != null && Math.abs(anchoredDraggableState0.getOffset() - anchoredDraggableState0.getAnchors().positionOf(object2)) <= 0.5f && ((Boolean)anchoredDraggableState0.d.invoke(object2)).booleanValue()) {
                    anchoredDraggableState0.b(object2);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object3 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
        if(object3 != null && Math.abs(anchoredDraggableState0.getOffset() - anchoredDraggableState0.getAnchors().positionOf(object3)) <= 0.5f && ((Boolean)anchoredDraggableState0.d.invoke(object3)).booleanValue()) {
            anchoredDraggableState0.b(object3);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object anchoredDrag(Object object0, @NotNull MutatePriority mutatePriority0, @NotNull Function4 function40, @NotNull Continuation continuation0) {
        AnchoredDraggableState anchoredDraggableState0;
        v v0;
        if(continuation0 instanceof v) {
            v0 = (v)continuation0;
            int v1 = v0.r;
            if((v1 & 0x80000000) == 0) {
                v0 = new v(this, continuation0);
            }
            else {
                v0.r = v1 ^ 0x80000000;
            }
        }
        else {
            v0 = new v(this, continuation0);
        }
        Object object1 = v0.p;
        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
        switch(v0.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                if(this.getAnchors().hasAnchorFor(object0)) {
                    try {
                        x x0 = new x(this, object0, function40, null);
                        v0.o = this;
                        v0.r = 1;
                        if(this.e.mutate(mutatePriority0, x0, v0) == object2) {
                            return object2;
                        }
                    }
                    catch(Throwable throwable0) {
                        anchoredDraggableState0 = this;
                        goto label_32;
                    }
                    anchoredDraggableState0 = this;
                    break;
                }
                this.b(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    anchoredDraggableState0 = v0.o;
                    ResultKt.throwOnFailure(object1);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_32:
                anchoredDraggableState0.m.setValue(null);
                Object object3 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
                if(object3 != null && Math.abs(anchoredDraggableState0.getOffset() - anchoredDraggableState0.getAnchors().positionOf(object3)) <= 0.5f && ((Boolean)anchoredDraggableState0.d.invoke(object3)).booleanValue()) {
                    anchoredDraggableState0.b(object3);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        anchoredDraggableState0.m.setValue(null);
        Object object4 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
        if(object4 != null && Math.abs(anchoredDraggableState0.getOffset() - anchoredDraggableState0.getAnchors().positionOf(object4)) <= 0.5f && ((Boolean)anchoredDraggableState0.d.invoke(object4)).booleanValue()) {
            anchoredDraggableState0.b(object4);
            return Unit.INSTANCE;
        }
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

    public final void b(Object object0) {
        this.g.setValue(object0);
    }

    public final float dispatchRawDelta(float f) {
        float f1 = this.newOffsetForDelta$material3_release(f);
        float f2 = Float.isNaN(this.getOffset()) ? 0.0f : this.getOffset();
        this.j.setFloatValue(f1);
        return f1 - f2;
    }

    @NotNull
    public final DraggableAnchors getAnchors() {
        return (DraggableAnchors)this.n.getValue();
    }

    @NotNull
    public final AnimationSpec getAnimationSpec() {
        return this.c;
    }

    public final Object getClosestValue$material3_release() {
        return this.i.getValue();
    }

    @NotNull
    public final Function1 getConfirmValueChange$material3_release() {
        return this.d;
    }

    public final Object getCurrentValue() {
        return this.g.getValue();
    }

    @NotNull
    public final DraggableState getDraggableState$material3_release() {
        return this.f;
    }

    public final float getLastVelocity() {
        return this.l.getFloatValue();
    }

    public final float getOffset() {
        return this.j.getFloatValue();
    }

    @NotNull
    public final Function1 getPositionalThreshold$material3_release() {
        return this.a;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getProgress() {
        return ((Number)this.k.getValue()).floatValue();
    }

    public final Object getTargetValue() {
        return this.h.getValue();
    }

    @NotNull
    public final Function0 getVelocityThreshold$material3_release() {
        return this.b;
    }

    public final boolean isAnimationRunning() {
        return this.m.getValue() != null;
    }

    // 去混淆评级： 低(20)
    public final float newOffsetForDelta$material3_release(float f) {
        return Float.isNaN(this.getOffset()) ? c.coerceIn(f + 0.0f, this.getAnchors().minAnchor(), this.getAnchors().maxAnchor()) : c.coerceIn(this.getOffset() + f, this.getAnchors().minAnchor(), this.getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if(Float.isNaN(this.getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.getOffset();
    }

    @Nullable
    public final Object settle(float f, @NotNull Continuation continuation0) {
        Object object0 = this.getCurrentValue();
        Object object1 = this.a(this.requireOffset(), f, object0);
        if(((Boolean)this.d.invoke(object1)).booleanValue()) {
            Object object2 = AnchoredDraggableKt.animateTo(this, object1, f, continuation0);
            return object2 == qd.a.getCOROUTINE_SUSPENDED() ? object2 : Unit.INSTANCE;
        }
        Object object3 = AnchoredDraggableKt.animateTo(this, object0, f, continuation0);
        return object3 == qd.a.getCOROUTINE_SUSPENDED() ? object3 : Unit.INSTANCE;
    }

    public final void updateAnchors(@NotNull DraggableAnchors draggableAnchors0, Object object0) {
        if(!Intrinsics.areEqual(this.getAnchors(), draggableAnchors0)) {
            this.n.setValue(draggableAnchors0);
            p9.a a0 = new p9.a(12, this, object0);
            if(!this.e.tryMutate(a0)) {
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

