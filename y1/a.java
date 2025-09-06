package y1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.jvm.functions.Function1;

public final class a extends Node implements RotaryInputModifierNode {
    public Function1 n;
    public Function1 o;

    @Override  // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent0) {
        return this.o == null ? false : ((Boolean)this.o.invoke(rotaryScrollEvent0)).booleanValue();
    }

    @Override  // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent0) {
        return this.n == null ? false : ((Boolean)this.n.invoke(rotaryScrollEvent0)).booleanValue();
    }
}

