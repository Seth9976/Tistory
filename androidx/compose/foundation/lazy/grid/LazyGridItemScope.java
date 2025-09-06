package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyGridScopeMarker
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JB\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u001C\u0010\n\u001A\u00020\u0003*\u00020\u00032\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\u0005H\u0017\u0082\u0001\u0001\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "animateItemPlacement", "animationSpec", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyGridItemScope {
    @NotNull
    Modifier animateItem(@NotNull Modifier arg1, @Nullable FiniteAnimationSpec arg2, @Nullable FiniteAnimationSpec arg3, @Nullable FiniteAnimationSpec arg4);

    static Modifier animateItem$default(LazyGridItemScope lazyGridItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v & 2) != 0) {
            finiteAnimationSpec1 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        if((v & 4) != 0) {
            finiteAnimationSpec2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return lazyGridItemScope0.animateItem(modifier0, finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2);
    }

    @ExperimentalFoundationApi
    @Deprecated(message = "Use Modifier.animateItem() instead", replaceWith = @ReplaceWith(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    @NotNull
    default Modifier animateItemPlacement(@NotNull Modifier modifier0, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        return this.animateItem(modifier0, null, finiteAnimationSpec0, null);
    }

    static Modifier animateItemPlacement$default(LazyGridItemScope lazyGridItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        return lazyGridItemScope0.animateItemPlacement(modifier0, finiteAnimationSpec0);
    }
}

