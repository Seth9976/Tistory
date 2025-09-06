package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@ExperimentalLayoutApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001C\u0010\n\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001A\u00020\bH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000BJ(\u0010\u0010\u001A\u00020\u0007*\u00020\u00072\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\fH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0010\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0014J\u0014\u0010\u0015\u001A\u00020\u0007*\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001E\u0010\u0019\u001A\u00020\u0007*\u00020\u00072\b\b\u0001\u0010\u0018\u001A\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ&\u0010\u001B\u001A\u00020\u0007*\u00020\u00072\b\b\u0001\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u001CH\u0097\u0001¢\u0006\u0004\b\u001B\u0010\u001ER\u0014\u0010!\u001A\u00020\u000E8\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0014\u0010#\u001A\u00020\u000E8\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "alignBy", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "getShownItemCount", "()I", "shownItemCount", "getTotalItemCount", "totalItemCount", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextualFlowRowOverflowScopeImpl implements ContextualFlowRowOverflowScope, FlowRowOverflowScope {
    public static final int $stable;
    public final FlowRowOverflowScopeImpl a;

    public ContextualFlowRowOverflowScopeImpl(@NotNull FlowLayoutOverflowState flowLayoutOverflowState0) {
        this.a = new FlowRowOverflowScopeImpl(flowLayoutOverflowState0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier0, @NotNull Vertical alignment$Vertical0) {
        return this.a.align(modifier0, alignment$Vertical0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull HorizontalAlignmentLine horizontalAlignmentLine0) {
        return this.a.alignBy(modifier0, horizontalAlignmentLine0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return this.a.alignBy(modifier0, function10);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier0) {
        return this.a.alignByBaseline(modifier0);
    }

    @Override  // androidx.compose.foundation.layout.FlowRowScope
    @ExperimentalLayoutApi
    @NotNull
    public Modifier fillMaxRowHeight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return this.a.fillMaxRowHeight(modifier0, f);
    }

    @Override  // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getShownItemCount() {
        return this.a.getShownItemCount();
    }

    @Override  // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return this.a.getTotalItemCount();
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, fromInclusive = false) float f, boolean z) {
        return this.a.weight(modifier0, f, z);
    }
}

