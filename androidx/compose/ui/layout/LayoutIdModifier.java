package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\n\u001A\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\t\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000BR*\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00048\u0016@PX\u0096\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/unit/Density;", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "n", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "setLayoutId$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutIdModifier extends Node implements LayoutIdParentData, ParentDataModifierNode {
    public static final int $stable = 8;
    public Object n;

    public LayoutIdModifier(@NotNull Object object0) {
        this.n = object0;
    }

    @Override  // androidx.compose.ui.layout.LayoutIdParentData
    @NotNull
    public Object getLayoutId() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @Nullable
    public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
        return this;
    }

    public void setLayoutId$ui_release(@NotNull Object object0) {
        this.n = object0;
    }
}

