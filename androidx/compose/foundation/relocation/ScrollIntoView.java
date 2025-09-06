package androidx.compose.foundation.relocation;

import aa.m;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollIntoView {
    @Nullable
    public static final Object scrollIntoView(@NotNull DelegatableNode delegatableNode0, @Nullable Rect rect0, @NotNull Continuation continuation0) {
        if(!delegatableNode0.getNode().isAttached()) {
            return Unit.INSTANCE;
        }
        LayoutCoordinates layoutCoordinates0 = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode0);
        BringIntoViewParent bringIntoViewParent0 = BringIntoViewRequesterKt.findBringIntoViewParent(delegatableNode0);
        if(bringIntoViewParent0 == null) {
            return Unit.INSTANCE;
        }
        Unit unit0 = bringIntoViewParent0.bringChildIntoView(layoutCoordinates0, new m(23, rect0, layoutCoordinates0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static Object scrollIntoView$default(DelegatableNode delegatableNode0, Rect rect0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            rect0 = null;
        }
        return ScrollIntoView.scrollIntoView(delegatableNode0, rect0, continuation0);
    }
}

