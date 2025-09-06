package k0;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import j2.j;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import md.c;

public final class d extends Node implements FocusEventModifierNode {
    public FocusState n;
    public final Lazy o;

    public d() {
        j j0 = new j(this, 4);
        this.o = c.lazy(LazyThreadSafetyMode.NONE, j0);
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState focusState0) {
        if(!Intrinsics.areEqual(this.n, focusState0)) {
            this.n = focusState0;
            if(focusState0.getHasFocus()) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new k0.c(this, null), 3, null);
            }
        }
    }
}

