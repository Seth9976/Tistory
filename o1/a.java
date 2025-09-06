package o1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a extends Node implements FocusEventModifierNode {
    public Function1 n;
    public FocusState o;

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState focusState0) {
        if(!Intrinsics.areEqual(this.o, focusState0)) {
            this.o = focusState0;
            this.n.invoke(focusState0);
        }
    }
}

