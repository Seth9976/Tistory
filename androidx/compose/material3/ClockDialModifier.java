package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0012\u001A\u00020\u000E*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u00052\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DHÖ\u0003¢\u0006\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material3/ClockDialModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/material3/ClockDialNode;", "node", "", "update", "(Landroidx/compose/material3/ClockDialNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy-e8ubxrI", "(Landroidx/compose/material3/AnalogTimePickerState;ZI)Landroidx/compose/material3/ClockDialModifier;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ClockDialModifier extends ModifierNodeElement {
    public static final int $stable;
    public final AnalogTimePickerState b;
    public final boolean c;
    public final int d;

    public ClockDialModifier(AnalogTimePickerState analogTimePickerState0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = analogTimePickerState0;
        this.c = z;
        this.d = v;
    }

    @NotNull
    public final ClockDialModifier copy-e8ubxrI(@NotNull AnalogTimePickerState analogTimePickerState0, boolean z, int v) {
        return new ClockDialModifier(analogTimePickerState0, z, v, null);
    }

    public static ClockDialModifier copy-e8ubxrI$default(ClockDialModifier clockDialModifier0, AnalogTimePickerState analogTimePickerState0, boolean z, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            analogTimePickerState0 = clockDialModifier0.b;
        }
        if((v1 & 2) != 0) {
            z = clockDialModifier0.c;
        }
        if((v1 & 4) != 0) {
            v = clockDialModifier0.d;
        }
        return clockDialModifier0.copy-e8ubxrI(analogTimePickerState0, z, v);
    }

    @NotNull
    public ClockDialNode create() {
        return new ClockDialNode(this.b, this.c, this.d, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClockDialModifier)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ClockDialModifier)object0).b)) {
            return false;
        }
        return this.c == ((ClockDialModifier)object0).c ? TimePickerSelectionMode.equals-impl0(this.d, ((ClockDialModifier)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return TimePickerSelectionMode.hashCode-impl(this.d) + a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    @Override
    @NotNull
    public String toString() {
        return "ClockDialModifier(state=" + this.b + ", autoSwitchToMinute=" + this.c + ", selection=" + TimePickerSelectionMode.toString-impl(this.d) + ')';
    }

    public void update(@NotNull ClockDialNode clockDialNode0) {
        clockDialNode0.updateNode-e8ubxrI(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((ClockDialNode)modifier$Node0));
    }
}

