package androidx.compose.ui.input.pointer;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u0010\u001A\u00020\f*\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010 \u001A\u00020\u00052\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0013R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0015¨\u0006("}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "create", "()Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "node", "", "update", "(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "component2", "()Z", "copy", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "c", "Z", "getOverrideDescendants", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerHoverIconModifierElement extends ModifierNodeElement {
    public static final int $stable;
    public final PointerIcon b;
    public final boolean c;

    public PointerHoverIconModifierElement(@NotNull PointerIcon pointerIcon0, boolean z) {
        this.b = pointerIcon0;
        this.c = z;
    }

    public PointerHoverIconModifierElement(PointerIcon pointerIcon0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(pointerIcon0, z);
    }

    @NotNull
    public final PointerIcon component1() {
        return this.b;
    }

    public final boolean component2() {
        return this.c;
    }

    @NotNull
    public final PointerHoverIconModifierElement copy(@NotNull PointerIcon pointerIcon0, boolean z) {
        return new PointerHoverIconModifierElement(pointerIcon0, z);
    }

    public static PointerHoverIconModifierElement copy$default(PointerHoverIconModifierElement pointerHoverIconModifierElement0, PointerIcon pointerIcon0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            pointerIcon0 = pointerHoverIconModifierElement0.b;
        }
        if((v & 2) != 0) {
            z = pointerHoverIconModifierElement0.c;
        }
        return pointerHoverIconModifierElement0.copy(pointerIcon0, z);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.b, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((PointerHoverIconModifierElement)object0).b) ? this.c == ((PointerHoverIconModifierElement)object0).c : false;
    }

    @NotNull
    public final PointerIcon getIcon() {
        return this.b;
    }

    public final boolean getOverrideDescendants() {
        return this.c;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("pointerHoverIcon");
        inspectorInfo0.getProperties().set("icon", this.b);
        inspectorInfo0.getProperties().set("overrideDescendants", Boolean.valueOf(this.c));
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", overrideDescendants=");
        return a.p(stringBuilder0, this.c, ')');
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((PointerHoverIconModifierNode)modifier$Node0));
    }

    public void update(@NotNull PointerHoverIconModifierNode pointerHoverIconModifierNode0) {
        pointerHoverIconModifierNode0.setIcon(this.b);
        pointerHoverIconModifierNode0.setOverrideDescendants(this.c);
    }
}

