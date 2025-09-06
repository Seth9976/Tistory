package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/tooling/data/NodeGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", "key", "node", "Landroidx/compose/ui/unit/IntRect;", "box", "", "data", "", "Landroidx/compose/ui/layout/ModifierInfo;", "modifierInfo", "children", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/unit/IntRect;Ljava/util/Collection;Ljava/util/List;Ljava/util/Collection;)V", "i", "Ljava/lang/Object;", "getNode", "()Ljava/lang/Object;", "j", "Ljava/util/List;", "getModifierInfo", "()Ljava/util/List;", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NodeGroup extends Group {
    public static final int $stable = 8;
    public final Object i;
    public final List j;

    public NodeGroup(@Nullable Object object0, @NotNull Object object1, @NotNull IntRect intRect0, @NotNull Collection collection0, @NotNull List list0, @NotNull Collection collection1) {
        super(object0, null, null, null, intRect0, collection0, collection1, false, null);
        this.i = object1;
        this.j = list0;
    }

    @Override  // androidx.compose.ui.tooling.data.Group
    @NotNull
    public List getModifierInfo() {
        return this.j;
    }

    @NotNull
    public final Object getNode() {
        return this.i;
    }
}

