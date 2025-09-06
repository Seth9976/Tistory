package o1;

import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final FocusTargetNode w;

    public m(FocusTargetNode focusTargetNode0) {
        this.w = focusTargetNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FocusTargetNode focusTargetNode0 = this.w;
        if(focusTargetNode0.getNode().isAttached()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
        }
        return Unit.INSTANCE;
    }
}

