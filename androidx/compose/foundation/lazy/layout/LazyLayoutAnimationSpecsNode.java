package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u00020\f*\u00020\u000B2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR*\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001A\u0004\b\u001A\u0010\u0013\"\u0004\b\u001B\u0010\u0015¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setFadeInSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "o", "getPlacementSpec", "setPlacementSpec", "p", "getFadeOutSpec", "setFadeOutSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutAnimationSpecsNode extends Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    public FiniteAnimationSpec n;
    public FiniteAnimationSpec o;
    public FiniteAnimationSpec p;

    public LazyLayoutAnimationSpecsNode(@Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
        this.n = finiteAnimationSpec0;
        this.o = finiteAnimationSpec1;
        this.p = finiteAnimationSpec2;
    }

    @Nullable
    public final FiniteAnimationSpec getFadeInSpec() {
        return this.n;
    }

    @Nullable
    public final FiniteAnimationSpec getFadeOutSpec() {
        return this.p;
    }

    @Nullable
    public final FiniteAnimationSpec getPlacementSpec() {
        return this.o;
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @NotNull
    public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
        return this;
    }

    public final void setFadeInSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.n = finiteAnimationSpec0;
    }

    public final void setFadeOutSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.p = finiteAnimationSpec0;
    }

    public final void setPlacementSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.o = finiteAnimationSpec0;
    }
}

