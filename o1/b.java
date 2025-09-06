package o1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import kotlin.jvm.functions.Function1;

public final class b extends Node implements FocusEventModifierNode {
    public Function1 n;

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState focusState0) {
        this.n.invoke(focusState0);
    }
}

