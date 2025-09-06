package o1;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class n implements Comparator {
    public static final n a;

    static {
        n.a = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(((FocusTargetNode)object0) == null || ((FocusTargetNode)object1) == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if(FocusTraversalKt.isEligibleForFocusSearch(((FocusTargetNode)object0)) && FocusTraversalKt.isEligibleForFocusSearch(((FocusTargetNode)object1))) {
            LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(((FocusTargetNode)object0));
            LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(((FocusTargetNode)object1));
            if(Intrinsics.areEqual(layoutNode0, layoutNode1)) {
                return 0;
            }
            MutableVector mutableVector0 = new MutableVector(new LayoutNode[16], 0);
            while(layoutNode0 != null) {
                mutableVector0.add(0, layoutNode0);
                layoutNode0 = layoutNode0.getParent$ui_release();
            }
            MutableVector mutableVector1 = new MutableVector(new LayoutNode[16], 0);
            while(layoutNode1 != null) {
                mutableVector1.add(0, layoutNode1);
                layoutNode1 = layoutNode1.getParent$ui_release();
            }
            int v1 = Math.min(mutableVector0.getSize() - 1, mutableVector1.getSize() - 1);
            if(v1 >= 0) {
                for(int v = 0; true; ++v) {
                    if(!Intrinsics.areEqual(mutableVector0.getContent()[v], mutableVector1.getContent()[v])) {
                        return Intrinsics.compare(((LayoutNode)mutableVector0.getContent()[v]).getPlaceOrder$ui_release(), ((LayoutNode)mutableVector1.getContent()[v]).getPlaceOrder$ui_release());
                    }
                    if(v == v1) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if(FocusTraversalKt.isEligibleForFocusSearch(((FocusTargetNode)object0))) {
            return -1;
        }
        return FocusTraversalKt.isEligibleForFocusSearch(((FocusTargetNode)object1)) ? 1 : 0;
    }
}

