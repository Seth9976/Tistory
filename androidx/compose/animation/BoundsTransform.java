package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalSharedTransitionApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/BoundsTransform;", "", "transform", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/geometry/Rect;", "initialBounds", "targetBounds", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BoundsTransform {
    @NotNull
    FiniteAnimationSpec transform(@NotNull Rect arg1, @NotNull Rect arg2);
}

