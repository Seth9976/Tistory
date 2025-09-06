package b2;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final int w;
    public final LayoutNode x;

    public l(int v, LayoutNode layoutNode0) {
        this.w = v;
        this.x = layoutNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            LayoutNode layoutNode0 = this.x.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode0);
            return layoutNode0.getInnerCoordinator$ui_release().getCoordinates();
        }
        this.x.getLayoutDelegate$ui_release().markChildrenDirty();
        return Unit.INSTANCE;
    }
}

