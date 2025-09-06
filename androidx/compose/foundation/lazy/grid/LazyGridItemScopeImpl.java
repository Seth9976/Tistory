package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\t\u001A\u00020\u0002*\u00020\u00022\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "animateItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyGridItemScopeImpl implements LazyGridItemScope {
    public static final int $stable;
    @NotNull
    public static final LazyGridItemScopeImpl INSTANCE;

    static {
        LazyGridItemScopeImpl.INSTANCE = new LazyGridItemScopeImpl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemScope
    @NotNull
    public Modifier animateItem(@NotNull Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) [...]
}

