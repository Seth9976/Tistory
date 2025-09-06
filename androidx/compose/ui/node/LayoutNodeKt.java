package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001B\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;", "child", "", "add", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1554:1\n66#2,9:1555\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1540#1:1555,9\n*E\n"})
public final class LayoutNodeKt {
    public static final Density a;

    static {
        LayoutNodeKt.a = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    }

    public static final Density access$getDefaultDensity$p() {
        return LayoutNodeKt.a;
    }

    public static final void add(@NotNull LayoutNode layoutNode0, @NotNull LayoutNode layoutNode1) {
        layoutNode0.insertAt$ui_release(layoutNode0.getChildren$ui_release().size(), layoutNode1);
    }

    @NotNull
    public static final Owner requireOwner(@NotNull LayoutNode layoutNode0) {
        Owner owner0 = layoutNode0.getOwner$ui_release();
        if(owner0 == null) {
            throw a.b("LayoutNode should be attached to an owner");
        }
        return owner0;
    }
}

