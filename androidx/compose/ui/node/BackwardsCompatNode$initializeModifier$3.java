package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "onLayoutComplete", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,452:1\n88#2:453\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n*L\n187#1:453\n*E\n"})
public final class BackwardsCompatNode.initializeModifier.3 implements OnLayoutCompletedListener {
    public final BackwardsCompatNode a;

    public BackwardsCompatNode.initializeModifier.3(BackwardsCompatNode backwardsCompatNode0) {
        this.a = backwardsCompatNode0;
    }

    @Override  // androidx.compose.ui.node.Owner$OnLayoutCompletedListener
    public void onLayoutComplete() {
        BackwardsCompatNode backwardsCompatNode0 = this.a;
        if(backwardsCompatNode0.r == null) {
            backwardsCompatNode0.onPlaced(DelegatableNodeKt.requireCoordinator-64DMado(backwardsCompatNode0, 0x80));
        }
    }
}

