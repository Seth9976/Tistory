package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import u.c3;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0012\u001A\u00020\u000F*\u00020\n2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001A\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001A\u001A\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001A\u0010\u0018J#\u0010\u001B\u001A\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001B\u0010\u0018J#\u0010\u001C\u001A\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001C\u0010\u0018R\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b\u0006\u0010%\"\u0004\b&\u0010\'R\"\u0010\u0007\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010$\u001A\u0004\b\u0007\u0010%\"\u0004\b)\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/ScrollState;", "scrollerState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "n", "Landroidx/compose/foundation/ScrollState;", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "setScrollerState", "(Landroidx/compose/foundation/ScrollState;)V", "o", "Z", "()Z", "setReversed", "(Z)V", "p", "setVertical", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollingLayoutNode extends Node implements LayoutModifierNode {
    public static final int $stable = 8;
    public ScrollState n;
    public boolean o;
    public boolean p;

    public ScrollingLayoutNode(@NotNull ScrollState scrollState0, boolean z, boolean z1) {
        this.n = scrollState0;
        this.o = z;
        this.p = z1;
    }

    @NotNull
    public final ScrollState getScrollerState() {
        return this.n;
    }

    public final boolean isReversed() {
        return this.o;
    }

    public final boolean isVertical() {
        return this.p;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.p ? intrinsicMeasurable0.maxIntrinsicHeight(v) : intrinsicMeasurable0.maxIntrinsicHeight(0x7FFFFFFF);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.p ? intrinsicMeasurable0.maxIntrinsicWidth(0x7FFFFFFF) : intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        CheckScrollableContainerConstraintsKt.checkScrollableContainerConstraints-K40F9xA(v, (this.p ? Orientation.Vertical : Orientation.Horizontal));
        int v1 = 0x7FFFFFFF;
        int v2 = this.p ? 0x7FFFFFFF : Constraints.getMaxHeight-impl(v);
        if(this.p) {
            v1 = Constraints.getMaxWidth-impl(v);
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v1, 0, v2, 5, null));
        int v3 = c.coerceAtMost(placeable0.getWidth(), Constraints.getMaxWidth-impl(v));
        int v4 = c.coerceAtMost(placeable0.getHeight(), Constraints.getMaxHeight-impl(v));
        int v5 = placeable0.getHeight() - v4;
        int v6 = placeable0.getWidth();
        if(!this.p) {
            v5 = v6 - v3;
        }
        this.n.setMaxValue$foundation_release(v5);
        this.n.setViewportSize$foundation_release((this.p ? v4 : v3));
        return MeasureScope.layout$default(measureScope0, v3, v4, null, new c3(this, v5, placeable0), 4, null);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.p ? intrinsicMeasurable0.minIntrinsicHeight(v) : intrinsicMeasurable0.minIntrinsicHeight(0x7FFFFFFF);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.p ? intrinsicMeasurable0.minIntrinsicWidth(0x7FFFFFFF) : intrinsicMeasurable0.minIntrinsicWidth(v);
    }

    public final void setReversed(boolean z) {
        this.o = z;
    }

    public final void setScrollerState(@NotNull ScrollState scrollState0) {
        this.n = scrollState0;
    }

    public final void setVertical(boolean z) {
        this.p = z;
    }
}

