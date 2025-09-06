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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.k1;
import z.l1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u00C9\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012<\u0010\u0018\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000E\u00A2\u0006\u0002\b\u0017\u0012<\u0010\u001B\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000E\u00A2\u0006\u0002\b\u0017\u0012\u0006\u0010\u001C\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001D\u0010\u001EJO\u0010#\u001A\u00020\u00152=\u0010\"\u001A9\b\u0001\u0012\u001F\u0012\u001D\u0012\u0013\u0012\u00110 \u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00150\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001FH\u0096@\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u0010H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010\u001B\u001A\u00020\u00152\u0006\u0010\u001A\u001A\u00020\'H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010&J\u000F\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\r\u0010)J\u00CF\u0001\u0010*\u001A\u00020\u00152\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\r\u001A\u00020\u00062<\u0010\u0018\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000E\u00A2\u0006\u0002\b\u00172<\u0010\u001B\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000E\u00A2\u0006\u0002\b\u00172\u0006\u0010\u001C\u001A\u00020\u0006\u00A2\u0006\u0004\b*\u0010\u001E\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006+"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted-k-4lQ0M", "(J)V", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "()Z", "update", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    public Function3 A;
    public Function3 B;
    public boolean C;
    public DraggableState x;
    public Orientation y;
    public boolean z;

    public DraggableNode(@NotNull DraggableState draggableState0, @NotNull Function1 function10, @NotNull Orientation orientation0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function3 function30, @NotNull Function3 function31, boolean z2) {
        super(function10, z, mutableInteractionSource0, orientation0);
        this.x = draggableState0;
        this.y = orientation0;
        this.z = z1;
        this.A = function30;
        this.B = function31;
        this.C = z2;
    }

    // 去混淆评级： 低(20)
    public static final long access$reverseIfNeeded-AH228Gc(DraggableNode draggableNode0, long v) {
        return draggableNode0.C ? Velocity.times-adjELrA(v, -1.0f) : Velocity.times-adjELrA(v, 1.0f);
    }

    // 去混淆评级： 低(20)
    public static final long access$reverseIfNeeded-MK-Hz9U(DraggableNode draggableNode0, long v) {
        return draggableNode0.C ? Offset.times-tuRUvjQ(v, -1.0f) : Offset.times-tuRUvjQ(v, 1.0f);
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    @Nullable
    public Object drag(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        DraggableState draggableState0 = this.x;
        v v0 = new v(function20, this, null);
        Object object0 = draggableState0.drag(MutatePriority.UserInput, v0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStarted-k-4lQ0M(long v) {
        if(this.isAttached() && !Intrinsics.areEqual(this.A, DraggableKt.a)) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new k1(this, v, null), 3, null);
        }
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped-TH1AsA0(long v) {
        if(this.isAttached() && !Intrinsics.areEqual(this.B, DraggableKt.b)) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new l1(this, v, null), 3, null);
        }
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.z;
    }

    public final void update(@NotNull DraggableState draggableState0, @NotNull Function1 function10, @NotNull Orientation orientation0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function3 function30, @NotNull Function3 function31, boolean z2) {
        boolean z4;
        boolean z3;
        if(Intrinsics.areEqual(this.x, draggableState0)) {
            z3 = false;
        }
        else {
            this.x = draggableState0;
            z3 = true;
        }
        if(this.y != orientation0) {
            this.y = orientation0;
            z3 = true;
        }
        if(this.C == z2) {
            z4 = z3;
        }
        else {
            this.C = z2;
            z4 = true;
        }
        this.A = function30;
        this.B = function31;
        this.z = z1;
        this.update(function10, z, mutableInteractionSource0, orientation0, z4);
    }
}

