package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import d0.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ld0/i0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class TraversablePrefetchStateModifierElement extends ModifierNodeElement {
    public final LazyLayoutPrefetchState b;

    public TraversablePrefetchStateModifierElement(LazyLayoutPrefetchState lazyLayoutPrefetchState0) {
        this.b = lazyLayoutPrefetchState0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new i0(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TraversablePrefetchStateModifierElement ? Intrinsics.areEqual(this.b, ((TraversablePrefetchStateModifierElement)object0).b) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("traversablePrefetchState");
        inspectorInfo0.setValue(this.b);
    }

    @Override
    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((i0)modifier$Node0).n = this.b;
    }
}

