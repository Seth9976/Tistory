package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0016J\u0018\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0016J \u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\bH\u0016J\b\u0010\u000F\u001A\u00020\u0006H\u0014J\b\u0010\u0010\u001A\u00020\u0006H\u0016J\u0018\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "root", "(Landroidx/compose/ui/node/LayoutNode;)V", "insertBottomUp", "", "index", "", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "onEndChanges", "remove", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UiApplier extends AbstractApplier {
    public static final int $stable;

    public UiApplier(@NotNull LayoutNode layoutNode0) {
        super(layoutNode0);
    }

    public void insertBottomUp(int v, @NotNull LayoutNode layoutNode0) {
        ((LayoutNode)this.getCurrent()).insertAt$ui_release(v, layoutNode0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertBottomUp(int v, Object object0) {
        this.insertBottomUp(v, ((LayoutNode)object0));
    }

    public void insertTopDown(int v, @NotNull LayoutNode layoutNode0) {
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertTopDown(int v, Object object0) {
    }

    @Override  // androidx.compose.runtime.Applier
    public void move(int v, int v1, int v2) {
        ((LayoutNode)this.getCurrent()).move$ui_release(v, v1, v2);
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        ((LayoutNode)this.getRoot()).removeAll$ui_release();
    }

    @Override  // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner0 = ((LayoutNode)this.getRoot()).getOwner$ui_release();
        if(owner0 != null) {
            owner0.onEndApplyChanges();
        }
    }

    @Override  // androidx.compose.runtime.Applier
    public void remove(int v, int v1) {
        ((LayoutNode)this.getCurrent()).removeAt$ui_release(v, v1);
    }
}

