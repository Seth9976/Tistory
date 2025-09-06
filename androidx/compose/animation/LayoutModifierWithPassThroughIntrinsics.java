package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0004J\u001A\u0010\t\u001A\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0004J\u001A\u0010\u000B\u001A\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0004J\u001A\u0010\f\u001A\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0004¨\u0006\r"}, d2 = {"Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/ui/layout/LayoutModifier;", "()V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class LayoutModifierWithPassThroughIntrinsics implements LayoutModifier {
    public static final int $stable;

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.minIntrinsicWidth(v);
    }
}

