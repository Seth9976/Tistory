package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0005\u001A\u00020\u0001*\u00020\u0002\u001A\f\u0010\u0006\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0007"}, d2 = {"invalidateLayer", "", "Landroidx/compose/ui/node/LayoutModifierNode;", "invalidateMeasurement", "invalidatePlacement", "remeasureSync", "requestRemeasure", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,405:1\n76#2:406\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n149#1:406\n*E\n"})
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(@NotNull LayoutModifierNode layoutModifierNode0) {
        DelegatableNodeKt.requireCoordinator-64DMado(layoutModifierNode0, 2).invalidateLayer();
    }

    public static final void invalidateMeasurement(@NotNull LayoutModifierNode layoutModifierNode0) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode0).invalidateMeasurements$ui_release();
    }

    public static final void invalidatePlacement(@NotNull LayoutModifierNode layoutModifierNode0) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode0), false, 1, null);
    }

    public static final void remeasureSync(@NotNull LayoutModifierNode layoutModifierNode0) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode0).forceRemeasure();
    }

    public static final void requestRemeasure(@NotNull LayoutModifierNode layoutModifierNode0) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode0), false, false, false, 7, null);
    }
}

