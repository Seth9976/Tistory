package z1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final class p extends Node implements LayoutAwareModifierNode {
    public Function1 n;
    public final boolean o;
    public long p;

    public p(Function1 function10) {
        this.n = function10;
        this.o = true;
        this.p = 0x8000000080000000L;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return this.o;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onRemeasured-ozmzZPI(long v) {
        if(!IntSize.equals-impl0(this.p, v)) {
            this.n.invoke(IntSize.box-impl(v));
            this.p = v;
        }
    }
}

