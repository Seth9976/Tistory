package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement {
    public final LegacyPlatformTextInputServiceAdapter b;
    public final LegacyTextFieldState c;
    public final TextFieldSelectionManager d;

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0, LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0) {
        this.b = legacyPlatformTextInputServiceAdapter0;
        this.c = legacyTextFieldState0;
        this.d = textFieldSelectionManager0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((LegacyAdaptingPlatformTextInputModifier)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((LegacyAdaptingPlatformTextInputModifier)object0).c) ? Intrinsics.areEqual(this.d, ((LegacyAdaptingPlatformTextInputModifier)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
    }

    @Override
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((LegacyAdaptingPlatformTextInputModifierNode)modifier$Node0).setServiceAdapter(this.b);
        ((LegacyAdaptingPlatformTextInputModifierNode)modifier$Node0).setLegacyTextFieldState(this.c);
        ((LegacyAdaptingPlatformTextInputModifierNode)modifier$Node0).setTextFieldSelectionManager(this.d);
    }
}

