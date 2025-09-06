package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0012\u001A\u00020\u000E*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001A\u00020\u00002\u0010\b\u0002\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CHÖ\u0003¢\u0006\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "create", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "node", "", "update", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement {
    public static final int $stable;
    public final FiniteAnimationSpec b;
    public final FiniteAnimationSpec c;
    public final FiniteAnimationSpec d;

    public LazyLayoutAnimateItemElement(@Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
        this.b = finiteAnimationSpec0;
        this.c = finiteAnimationSpec1;
        this.d = finiteAnimationSpec2;
    }

    @NotNull
    public final LazyLayoutAnimateItemElement copy(@Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable FiniteAnimationSpec finiteAnimationSpec1, @Nullable FiniteAnimationSpec finiteAnimationSpec2) {
        return new LazyLayoutAnimateItemElement(finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2);
    }

    public static LazyLayoutAnimateItemElement copy$default(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = lazyLayoutAnimateItemElement0.b;
        }
        if((v & 2) != 0) {
            finiteAnimationSpec1 = lazyLayoutAnimateItemElement0.c;
        }
        if((v & 4) != 0) {
            finiteAnimationSpec2 = lazyLayoutAnimateItemElement0.d;
        }
        return lazyLayoutAnimateItemElement0.copy(finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2);
    }

    @NotNull
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((LazyLayoutAnimateItemElement)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((LazyLayoutAnimateItemElement)object0).c) ? Intrinsics.areEqual(this.d, ((LazyLayoutAnimateItemElement)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c == null ? 0 : this.c.hashCode();
        FiniteAnimationSpec finiteAnimationSpec0 = this.d;
        if(finiteAnimationSpec0 != null) {
            v = finiteAnimationSpec0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("animateItem");
        inspectorInfo0.getProperties().set("fadeInSpec", this.b);
        inspectorInfo0.getProperties().set("placementSpec", this.c);
        inspectorInfo0.getProperties().set("fadeOutSpec", this.d);
    }

    @Override
    @NotNull
    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + ')';
    }

    public void update(@NotNull LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode0) {
        lazyLayoutAnimationSpecsNode0.setFadeInSpec(this.b);
        lazyLayoutAnimationSpecsNode0.setPlacementSpec(this.c);
        lazyLayoutAnimationSpecsNode0.setFadeOutSpec(this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((LazyLayoutAnimationSpecsNode)modifier$Node0));
    }
}

