package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NodeCoordinatorKt {
    public static final Node access$nextUntil-hw7D004(DelegatableNode delegatableNode0, int v, int v1) {
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 != null && (modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
            while(modifier$Node0 != null) {
                int v2 = modifier$Node0.getKindSet$ui_release();
                if((v2 & v1) != 0) {
                    break;
                }
                if((v2 & v) != 0) {
                    return modifier$Node0;
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
        return null;
    }
}

