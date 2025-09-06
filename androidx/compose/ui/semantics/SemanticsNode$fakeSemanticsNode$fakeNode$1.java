package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001A\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$fakeSemanticsNode$fakeNode$1", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsNode.fakeSemanticsNode.fakeNode.1 extends Node implements SemanticsModifierNode {
    public final Lambda n;

    public SemanticsNode.fakeSemanticsNode.fakeNode.1(Function1 function10) {
        this.n = (Lambda)function10;
        super();
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        ((Function1)this.n).invoke(semanticsPropertyReceiver0);
    }
}

