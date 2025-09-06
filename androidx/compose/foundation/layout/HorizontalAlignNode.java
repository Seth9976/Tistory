package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u000B\u001A\u00020\n*\u00020\u00072\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/RowColumnParentData;", "n", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "setHorizontal", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HorizontalAlignNode extends Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    public Horizontal n;

    public HorizontalAlignNode(@NotNull Horizontal alignment$Horizontal0) {
        this.n = alignment$Horizontal0;
    }

    @NotNull
    public final Horizontal getHorizontal() {
        return this.n;
    }

    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density0, @Nullable Object object0) {
        RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
        if(rowColumnParentData0 == null) {
            rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData0.setCrossAxisAlignment(CrossAxisAlignment.Companion.horizontal$foundation_layout_release(this.n));
        return rowColumnParentData0;
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density0, Object object0) {
        return this.modifyParentData(density0, object0);
    }

    public final void setHorizontal(@NotNull Horizontal alignment$Horizontal0) {
        this.n = alignment$Horizontal0;
    }
}

