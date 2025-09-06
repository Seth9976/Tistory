package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.TraversableNode;

public final class i0 extends Node implements TraversableNode {
    public LazyLayoutPrefetchState n;
    public final String o;

    public i0(LazyLayoutPrefetchState lazyLayoutPrefetchState0) {
        this.n = lazyLayoutPrefetchState0;
        this.o = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.o;
    }
}

