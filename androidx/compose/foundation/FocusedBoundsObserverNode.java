package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u001D\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\u00052\b\u0010\t\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000BR0\u0010\u0006\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\bR\u001A\u0010\u0016\u001A\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onPositioned", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusedBounds", "onFocusBoundsChanged", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "n", "Lkotlin/jvm/functions/Function1;", "getOnPositioned", "()Lkotlin/jvm/functions/Function1;", "setOnPositioned", "", "o", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusedBoundsObserverNode extends Node implements TraversableNode {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TraverseKey {
        public TraverseKey(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final TraverseKey TraverseKey;
    public Function1 n;
    public final TraverseKey o;

    static {
        FocusedBoundsObserverNode.TraverseKey = new TraverseKey(null);
        FocusedBoundsObserverNode.$stable = 8;
    }

    public FocusedBoundsObserverNode(@NotNull Function1 function10) {
        this.n = function10;
        this.o = FocusedBoundsObserverNode.TraverseKey;
    }

    @NotNull
    public final Function1 getOnPositioned() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.o;
    }

    public final void onFocusBoundsChanged(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.n.invoke(layoutCoordinates0);
        FocusedBoundsObserverNode focusedBoundsObserverNode0 = (FocusedBoundsObserverNode)TraversableNodeKt.findNearestAncestor(this);
        if(focusedBoundsObserverNode0 != null) {
            focusedBoundsObserverNode0.onFocusBoundsChanged(layoutCoordinates0);
        }
    }

    public final void setOnPositioned(@NotNull Function1 function10) {
        this.n = function10;
    }
}

