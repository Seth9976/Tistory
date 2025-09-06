package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR$\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00038\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "", "enabled", "<init>", "(Z)V", "", "update", "", "n", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "<set-?>", "o", "Z", "getEnabled", "()Z", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollableContainerNode extends Node implements TraversableNode {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TraverseKey {
        public TraverseKey(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final TraverseKey TraverseKey;
    public final TraverseKey n;
    public boolean o;

    static {
        ScrollableContainerNode.TraverseKey = new TraverseKey(null);
        ScrollableContainerNode.$stable = 8;
    }

    public ScrollableContainerNode(boolean z) {
        this.n = ScrollableContainerNode.TraverseKey;
        this.o = z;
    }

    public final boolean getEnabled() {
        return this.o;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.n;
    }

    public final void update(boolean z) {
        this.o = z;
    }
}

