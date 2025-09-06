package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0016H\u0016J\u0010\u0010\u0017\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u0005H\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1484:1\n80#2:1485\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1392#1:1485\n*E\n"})
public final class NodeCoordinator.Companion.SemanticsSource.1 implements HitTestSource {
    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public void childHitTest-YqVAtuI(@NotNull LayoutNode layoutNode0, long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        layoutNode0.hitTestSemantics-M_7yMNQ$ui_release(v, hitTestResult0, z, z1);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public int entityType-OLwlOKw() {
        return 8;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean interceptOutOfBoundsChildEvents(@NotNull Node modifier$Node0) {
        return false;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean shouldHitTestChildren(@NotNull LayoutNode layoutNode0) {
        SemanticsConfiguration semanticsConfiguration0 = layoutNode0.getCollapsedSemantics$ui_release();
        return (semanticsConfiguration0 == null || !semanticsConfiguration0.isClearingSemantics() ? 0 : 1) ^ 1;
    }
}

