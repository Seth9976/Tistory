package androidx.compose.foundation.lazy;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyScopeMarker
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001JB\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u001C\u0010\n\u001A\u00020\u0003*\u00020\u00032\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\u0005H\u0017J\u0016\u0010\f\u001A\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\r\u001A\u00020\u0006H&J\u0016\u0010\u000E\u001A\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\r\u001A\u00020\u0006H&J\u0016\u0010\u000F\u001A\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\r\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "animateItemPlacement", "animationSpec", "fillParentMaxHeight", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyItemScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier animateItem(@NotNull LazyItemScope lazyItemScope0, @NotNull Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
            return lazyItemScope0.super.animateItem(modifier0, finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2);
        }

        public static Modifier animateItem$default(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2, int v, Object object0) {
            return LazyItemScope.animateItem$default(lazyItemScope0, modifier0, finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2, v, object0);
        }

        @ExperimentalFoundationApi
        @Deprecated
        @kotlin.Deprecated(message = "Use Modifier.animateItem() instead", replaceWith = @ReplaceWith(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
        @NotNull
        public static Modifier animateItemPlacement(@NotNull LazyItemScope lazyItemScope0, @NotNull Modifier modifier0, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
            return lazyItemScope0.super.animateItemPlacement(modifier0, finiteAnimationSpec0);
        }

        public static Modifier animateItemPlacement$default(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
            return LazyItemScope.animateItemPlacement$default(lazyItemScope0, modifier0, finiteAnimationSpec0, v, object0);
        }

        public static Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return LazyItemScope.fillParentMaxHeight$default(lazyItemScope0, modifier0, f, v, object0);
        }

        public static Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return LazyItemScope.fillParentMaxSize$default(lazyItemScope0, modifier0, f, v, object0);
        }

        public static Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return LazyItemScope.fillParentMaxWidth$default(lazyItemScope0, modifier0, f, v, object0);
        }
    }

    @NotNull
    default Modifier animateItem(@NotNull Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
        return modifier0;
    }

    static Modifier animateItem$default(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2, int v, Object object0) {
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
        return lazyItemScope0.animateItem(modifier0, finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2);
    }

    @ExperimentalFoundationApi
    @kotlin.Deprecated(message = "Use Modifier.animateItem() instead", replaceWith = @ReplaceWith(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    @NotNull
    default Modifier animateItemPlacement(@NotNull Modifier modifier0, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        return this.animateItem(modifier0, null, finiteAnimationSpec0, null);
    }

    static Modifier animateItemPlacement$default(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
        }
        return lazyItemScope0.animateItemPlacement(modifier0, finiteAnimationSpec0);
    }

    @NotNull
    Modifier fillParentMaxHeight(@NotNull Modifier arg1, @FloatRange(from = 0.0, to = 1.0) float arg2);

    static Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.fillParentMaxHeight(modifier0, f);
    }

    @NotNull
    Modifier fillParentMaxSize(@NotNull Modifier arg1, @FloatRange(from = 0.0, to = 1.0) float arg2);

    static Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.fillParentMaxSize(modifier0, f);
    }

    @NotNull
    Modifier fillParentMaxWidth(@NotNull Modifier arg1, @FloatRange(from = 0.0, to = 1.0) float arg2);

    static Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.fillParentMaxWidth(modifier0, f);
    }
}

