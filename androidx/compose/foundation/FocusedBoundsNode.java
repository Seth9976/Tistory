package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0013\u001A\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "<init>", "()V", "", "focused", "", "setFocus", "(Z)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusedBoundsNode extends Node implements GlobalPositionAwareModifierNode, TraversableNode {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TraverseKey {
        public TraverseKey(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final TraverseKey TraverseKey;
    public boolean n;
    public LayoutCoordinates o;

    static {
        FocusedBoundsNode.TraverseKey = new TraverseKey(null);
        FocusedBoundsNode.$stable = 8;
    }

    public final FocusedBoundsObserverNode b() {
        if(this.isAttached()) {
            TraversableNode traversableNode0 = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
            return traversableNode0 instanceof FocusedBoundsObserverNode ? ((FocusedBoundsObserverNode)traversableNode0) : null;
        }
        return null;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return FocusedBoundsNode.TraverseKey;
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.o = layoutCoordinates0;
        if(!this.n) {
            return;
        }
        if(layoutCoordinates0.isAttached()) {
            LayoutCoordinates layoutCoordinates1 = this.o;
            if(layoutCoordinates1 != null) {
                Intrinsics.checkNotNull(layoutCoordinates1);
                if(layoutCoordinates1.isAttached()) {
                    FocusedBoundsObserverNode focusedBoundsObserverNode0 = this.b();
                    if(focusedBoundsObserverNode0 != null) {
                        focusedBoundsObserverNode0.onFocusBoundsChanged(this.o);
                    }
                }
            }
        }
        else {
            FocusedBoundsObserverNode focusedBoundsObserverNode1 = this.b();
            if(focusedBoundsObserverNode1 != null) {
                focusedBoundsObserverNode1.onFocusBoundsChanged(null);
            }
        }
    }

    public final void setFocus(boolean z) {
        if(z == this.n) {
            return;
        }
        if(z) {
            LayoutCoordinates layoutCoordinates0 = this.o;
            if(layoutCoordinates0 != null) {
                Intrinsics.checkNotNull(layoutCoordinates0);
                if(layoutCoordinates0.isAttached()) {
                    FocusedBoundsObserverNode focusedBoundsObserverNode1 = this.b();
                    if(focusedBoundsObserverNode1 != null) {
                        focusedBoundsObserverNode1.onFocusBoundsChanged(this.o);
                    }
                }
            }
        }
        else {
            FocusedBoundsObserverNode focusedBoundsObserverNode0 = this.b();
            if(focusedBoundsObserverNode0 != null) {
                focusedBoundsObserverNode0.onFocusBoundsChanged(null);
            }
        }
        this.n = z;
    }
}

