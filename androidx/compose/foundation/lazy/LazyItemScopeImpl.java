package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001B\u0010\r\u001A\u00020\n*\u00020\n2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u000F\u001A\u00020\n*\u00020\n2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u001B\u0010\u0010\u001A\u00020\n*\u00020\n2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u000EJC\u0010\u0016\u001A\u00020\n*\u00020\n2\u000E\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u00112\u000E\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u000E\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "<init>", "()V", "", "width", "height", "", "setMaxSize", "(II)V", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "animateItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyItemScopeImpl implements LazyItemScope {
    public static final int $stable;
    public final MutableIntState a;
    public final MutableIntState b;

    public LazyItemScopeImpl() {
        this.a = SnapshotIntStateKt.mutableIntStateOf(0x7FFFFFFF);
        this.b = SnapshotIntStateKt.mutableIntStateOf(0x7FFFFFFF);
    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier animateItem(@NotNull Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
        return finiteAnimationSpec0 == null && finiteAnimationSpec1 == null && finiteAnimationSpec2 == null ? modifier0 : modifier0.then(new LazyLayoutAnimateItemElement(finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2));
    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxHeight(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new ParentSizeElement(f, null, this.b, "fillParentMaxHeight", 2));
    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxSize(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new ParentSizeElement(f, this.a, this.b, "fillParentMaxSize"));
    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxWidth(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new ParentSizeElement(f, this.a, null, "fillParentMaxWidth", 4));
    }

    public final void setMaxSize(int v, int v1) {
        this.a.setIntValue(v);
        this.b.setIntValue(v1);
    }
}

