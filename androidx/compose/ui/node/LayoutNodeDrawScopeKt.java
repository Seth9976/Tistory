package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,133:1\n78#2:134\n76#2:135\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n119#1:134\n120#1:135\n*E\n"})
public final class LayoutNodeDrawScopeKt {
    public static final Node access$nextDrawNode(DelegatableNode delegatableNode0) {
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 != null && (modifier$Node0.getAggregateChildKindSet$ui_release() & 4) != 0) {
            while(modifier$Node0 != null && (modifier$Node0.getKindSet$ui_release() & 2) == 0) {
                if((modifier$Node0.getKindSet$ui_release() & 4) != 0) {
                    return modifier$Node0;
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
        return null;
    }
}

