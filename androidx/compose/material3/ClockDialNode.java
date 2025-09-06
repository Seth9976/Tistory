package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001F\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ(\u0010\u001F\u001A\u00020\u000F2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "updateNode-e8ubxrI", "(Landroidx/compose/material3/AnalogTimePickerState;ZI)V", "updateNode", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2008:1\n1#2:2009\n*E\n"})
public final class ClockDialNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode, PointerInputModifierNode {
    public static final int $stable = 8;
    public AnalogTimePickerState p;
    public boolean q;
    public int r;
    public float s;
    public float t;
    public long u;
    public final SuspendingPointerInputModifierNode v;
    public final SuspendingPointerInputModifierNode w;

    public ClockDialNode(AnalogTimePickerState analogTimePickerState0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.p = analogTimePickerState0;
        this.q = z;
        this.r = v;
        this.u = 0L;
        this.v = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new j4(this, null)));
        this.w = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new g4(this, null)));
    }

    public static final float access$getMaxDist(ClockDialNode clockDialNode0) {
        clockDialNode0.getClass();
        return DelegatableNodeKt.requireDensity(clockDialNode0).toPx-0680j_4(74.0f);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.v.onCancelPointerInput();
        this.w.onCancelPointerInput();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        this.v.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
        this.w.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onRemeasured-ozmzZPI(long v) {
        this.u = IntSizeKt.getCenter-ozmzZPI(v);
    }

    public final void updateNode-e8ubxrI(@NotNull AnalogTimePickerState analogTimePickerState0, boolean z, int v) {
        this.p = analogTimePickerState0;
        this.q = z;
        if(!TimePickerSelectionMode.equals-impl0(this.r, v)) {
            this.r = v;
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new k4(analogTimePickerState0, null), 3, null);
        }
    }
}

