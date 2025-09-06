package androidx.compose.ui.node;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final LookaheadPassDelegate w;
    public final LookaheadDelegate x;
    public final LayoutNodeLayoutDelegate y;

    public p(LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0, LookaheadDelegate lookaheadDelegate0, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0) {
        this.w = layoutNodeLayoutDelegate$LookaheadPassDelegate0;
        this.x = lookaheadDelegate0;
        this.y = layoutNodeLayoutDelegate0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.w;
        LookaheadPassDelegate.access$clearPlaceOrder(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        layoutNodeLayoutDelegate$LookaheadPassDelegate0.forEachChildAlignmentLinesOwner(n.w);
        LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.getInnerCoordinator().getLookaheadDelegate();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.y;
        if(lookaheadDelegate0 != null) {
            boolean z = lookaheadDelegate0.isPlacingForAlignment$ui_release();
            List list0 = layoutNodeLayoutDelegate0.a.getChildren$ui_release();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LookaheadDelegate lookaheadDelegate1 = ((LayoutNode)list0.get(v1)).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if(lookaheadDelegate1 != null) {
                    lookaheadDelegate1.setPlacingForAlignment$ui_release(z);
                }
            }
        }
        this.x.getMeasureResult$ui_release().placeChildren();
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0.getInnerCoordinator().getLookaheadDelegate() != null) {
            List list1 = layoutNodeLayoutDelegate0.a.getChildren$ui_release();
            int v2 = list1.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                LookaheadDelegate lookaheadDelegate2 = ((LayoutNode)list1.get(v3)).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if(lookaheadDelegate2 != null) {
                    lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
                }
            }
        }
        LookaheadPassDelegate.access$checkChildrenPlaceOrderForUpdates(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        layoutNodeLayoutDelegate$LookaheadPassDelegate0.forEachChildAlignmentLinesOwner(o.w);
        return Unit.INSTANCE;
    }
}

