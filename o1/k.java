package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final int w;
    public final FocusTargetNode x;

    public k(FocusTargetNode focusTargetNode0, int v) {
        this.w = v;
        this.x = focusTargetNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.fetchFocusProperties$ui_release();
            return Unit.INSTANCE;
        }
        return this.x.getPreviouslyFocusedChildHash();
    }
}

