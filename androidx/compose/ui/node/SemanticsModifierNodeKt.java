package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0005\u001A\u00020\u0006*\u00020\u0007\u001A\u0014\u0010\b\u001A\u00020\t*\u00020\n2\u0006\u0010\u0000\u001A\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u000B"}, d2 = {"useMinimumTouchTarget", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "invalidateSemantics", "", "Landroidx/compose/ui/node/SemanticsModifierNode;", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,107:1\n80#2:108\n80#2:109\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:108\n105#1:109\n*E\n"})
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(@NotNull SemanticsConfiguration semanticsConfiguration0) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@NotNull SemanticsModifierNode semanticsModifierNode0) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode0).invalidateSemantics$ui_release();
    }

    @NotNull
    public static final Rect touchBoundsInRoot(@NotNull Node modifier$Node0, boolean z) {
        if(!modifier$Node0.getNode().isAttached()) {
            return Rect.Companion.getZero();
        }
        return z ? DelegatableNodeKt.requireCoordinator-64DMado(modifier$Node0, 8).touchBoundsInRoot() : LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.requireCoordinator-64DMado(modifier$Node0, 8));
    }
}

