package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.i1;
import z.j1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001B\u008F\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\u000B\u001A\u00020\u0006\u0012\u0006\u0010\f\u001A\u00020\u0006\u0012>\b\u0002\u0010\u0017\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r\u00A2\u0006\u0002\b\u0016\u0012#\b\u0002\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0004\u0012>\b\u0002\u0010\u001B\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r\u00A2\u0006\u0002\b\u0016\u0012#\b\u0002\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00140\u0004\u00A2\u0006\u0004\b\u001D\u0010\u001EJO\u0010#\u001A\u00020\u00142=\u0010\"\u001A9\b\u0001\u0012\u001F\u0012\u001D\u0012\u0013\u0012\u00110 \u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001FH\u0096@\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0012\u001A\u00020\u000FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010\u001B\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010&J\u000F\u0010\u000B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000B\u0010(J\u0095\u0002\u0010)\u001A\u00020\u00142\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00062>\b\u0002\u0010\u0017\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r\u00A2\u0006\u0002\b\u00162>\b\u0002\u0010\u001B\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r\u00A2\u0006\u0002\b\u00162#\b\u0002\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u00042#\b\u0002\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00140\u0004\u00A2\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006+"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "reverseDirection", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "onDragStart", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "onDragStop", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped-TH1AsA0", "()Z", "update", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    public Function3 A;
    public Function1 B;
    public Function3 C;
    public Function1 D;
    public Draggable2DState x;
    public boolean y;
    public boolean z;

    public Draggable2DNode(@NotNull Draggable2DState draggable2DState0, @NotNull Function1 function10, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, boolean z2, @NotNull Function3 function30, @NotNull Function1 function11, @NotNull Function3 function31, @NotNull Function1 function12) {
        super(function10, z, mutableInteractionSource0, null);
        this.x = draggable2DState0;
        this.y = z1;
        this.z = z2;
        this.A = function30;
        this.B = function11;
        this.C = function31;
        this.D = function12;
    }

    public Draggable2DNode(Draggable2DState draggable2DState0, Function1 function10, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, boolean z2, Function3 function30, Function1 function11, Function3 function31, Function1 function12, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(draggable2DState0, function10, z, mutableInteractionSource0, z1, z2, ((v & 0x40) == 0 ? function30 : Draggable2DKt.a), ((v & 0x80) == 0 ? function11 : Draggable2DKt.b), ((v & 0x100) == 0 ? function31 : Draggable2DKt.c), ((v & 0x200) == 0 ? function12 : Draggable2DKt.d));
    }

    // 去混淆评级： 低(20)
    public static final long access$reverseIfNeeded-AH228Gc(Draggable2DNode draggable2DNode0, long v) {
        return draggable2DNode0.z ? Velocity.times-adjELrA(v, -1.0f) : Velocity.times-adjELrA(v, 1.0f);
    }

    // 去混淆评级： 低(20)
    public static final long access$reverseIfNeeded-MK-Hz9U(Draggable2DNode draggable2DNode0, long v) {
        return draggable2DNode0.z ? Offset.times-tuRUvjQ(v, -1.0f) : Offset.times-tuRUvjQ(v, 1.0f);
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    @Nullable
    public Object drag(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Draggable2DState draggable2DState0 = this.x;
        t t0 = new t(function20, this, null);
        Object object0 = draggable2DState0.drag(MutatePriority.UserInput, t0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStarted-k-4lQ0M(long v) {
        this.B.invoke(Offset.box-impl(v));
        if(this.isAttached() && this.A != Draggable2DKt.a) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new i1(this, v, null), 3, null);
        }
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped-TH1AsA0(long v) {
        this.D.invoke(Velocity.box-impl(v));
        if(this.isAttached() && this.C != Draggable2DKt.c) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new j1(this, v, null), 3, null);
        }
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.y;
    }

    public final void update(@NotNull Draggable2DState draggable2DState0, @NotNull Function1 function10, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, boolean z2, @NotNull Function3 function30, @NotNull Function3 function31, @NotNull Function1 function11, @NotNull Function1 function12) {
        boolean z3;
        if(Intrinsics.areEqual(this.x, draggable2DState0)) {
            z3 = false;
        }
        else {
            this.x = draggable2DState0;
            z3 = true;
        }
        if(this.z != z2) {
            this.z = z2;
            z3 = true;
        }
        this.A = function30;
        this.C = function31;
        this.B = function11;
        this.D = function12;
        this.y = z1;
        this.update(function10, z, mutableInteractionSource0, null, z3);
    }

    public static void update$default(Draggable2DNode draggable2DNode0, Draggable2DState draggable2DState0, Function1 function10, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, boolean z2, Function3 function30, Function3 function31, Function1 function11, Function1 function12, int v, Object object0) {
        draggable2DNode0.update(draggable2DState0, function10, z, mutableInteractionSource0, z1, z2, ((v & 0x40) == 0 ? function30 : draggable2DNode0.A), ((v & 0x80) == 0 ? function31 : draggable2DNode0.C), ((v & 0x100) == 0 ? function11 : draggable2DNode0.B), ((v & 0x200) == 0 ? function12 : draggable2DNode0.D));
    }
}

