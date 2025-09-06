package g0;

import android.view.View;
import androidx.compose.foundation.relocation.BringIntoViewParent;
import androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

public final class g implements BringIntoViewParent {
    public final DelegatableNode a;

    public g(DelegatableNode delegatableNode0) {
        this.a = delegatableNode0;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewParent
    public final Object bringChildIntoView(LayoutCoordinates layoutCoordinates0, Function0 function00, Continuation continuation0) {
        View view0 = DelegatableNode_androidKt.requireView(this.a);
        long v = LayoutCoordinatesKt.positionInRoot(layoutCoordinates0);
        Rect rect0 = (Rect)function00.invoke();
        Rect rect1 = rect0 == null ? null : rect0.translate-k-4lQ0M(v);
        if(rect1 != null) {
            view0.requestRectangleOnScreen(BringIntoViewResponder_androidKt.access$toRect(rect1), false);
        }
        return Unit.INSTANCE;
    }
}

