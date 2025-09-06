package h0;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.c3;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import d0.s;
import kotlin.jvm.functions.Function1;

public final class f extends ClickableNode {
    public boolean G;
    public Function1 H;
    public final s I;

    public f(boolean z, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z1, Role role0, Function1 function10) {
        super(mutableInteractionSource0, indicationNodeFactory0, z1, null, role0, new c3(2, z, function10), null);
        this.G = z;
        this.H = function10;
        this.I = new s(this, 19);
    }

    @Override  // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver0, ToggleableStateKt.ToggleableState(this.G));
    }
}

