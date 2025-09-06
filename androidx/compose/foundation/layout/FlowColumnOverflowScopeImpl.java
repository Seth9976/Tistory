package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001C\u0010\n\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001A\u00020\bH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000BJ(\u0010\u0010\u001A\u00020\u0007*\u00020\u00072\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\fH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0010\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0014J\u001E\u0010\u0017\u001A\u00020\u0007*\u00020\u00072\b\b\u0003\u0010\u0016\u001A\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001A\u00020\u0007*\u00020\u00072\b\b\u0001\u0010\u0019\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\u001AH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001CR\u0014\u0010\u001F\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010!\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010\u001E¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "alignBy", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "alignmentLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxColumnWidth", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "getTotalItemCount", "()I", "totalItemCount", "getShownItemCount", "shownItemCount", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, FlowColumnScope {
    public static final int $stable;
    public final FlowLayoutOverflowState a;
    public final FlowColumnScopeInstance b;

    public FlowColumnOverflowScopeImpl(@NotNull FlowLayoutOverflowState flowLayoutOverflowState0) {
        this.a = flowLayoutOverflowState0;
        this.b = FlowColumnScopeInstance.INSTANCE;
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier0, @NotNull Horizontal alignment$Horizontal0) {
        return this.b.align(modifier0, alignment$Horizontal0);
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull VerticalAlignmentLine verticalAlignmentLine0) {
        return this.b.alignBy(modifier0, verticalAlignmentLine0);
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return this.b.alignBy(modifier0, function10);
    }

    @Override  // androidx.compose.foundation.layout.FlowColumnScope
    @ExperimentalLayoutApi
    @NotNull
    public Modifier fillMaxColumnWidth(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return this.b.fillMaxColumnWidth(modifier0, f);
    }

    @Override  // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getShownItemCount() {
        return this.a.getNoOfItemsShown$foundation_layout_release();
    }

    @Override  // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return this.a.getItemCount$foundation_layout_release();
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, fromInclusive = false) float f, boolean z) {
        return this.b.weight(modifier0, f, z);
    }
}

