package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\f*\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "weight", "", "fill", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/RowColumnParentData;", "n", "F", "getWeight", "()F", "setWeight", "(F)V", "o", "Z", "getFill", "()Z", "setFill", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutWeightNode extends Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    public float n;
    public boolean o;

    public LayoutWeightNode(float f, boolean z) {
        this.n = f;
        this.o = z;
    }

    public final boolean getFill() {
        return this.o;
    }

    public final float getWeight() {
        return this.n;
    }

    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density0, @Nullable Object object0) {
        RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
        if(rowColumnParentData0 == null) {
            rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData0.setWeight(this.n);
        rowColumnParentData0.setFill(this.o);
        return rowColumnParentData0;
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density0, Object object0) {
        return this.modifyParentData(density0, object0);
    }

    public final void setFill(boolean z) {
        this.o = z;
    }

    public final void setWeight(float f) {
        this.n = f;
    }
}

