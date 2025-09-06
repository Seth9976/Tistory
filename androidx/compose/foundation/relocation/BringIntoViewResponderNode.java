package androidx.compose.foundation.relocation;

import androidx.compose.material3.td;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.TraversableNode;
import g0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\"B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\t2\u000E\u0010\u0011\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000FH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\u0014\u0010\u001C\u001A\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001E\u001A\u00020\u001D8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "bringChildIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class BringIntoViewResponderNode extends Node implements BringIntoViewParent, LayoutAwareModifierNode, TraversableNode {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TraverseKey {
        public TraverseKey(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final TraverseKey TraverseKey;
    public BringIntoViewResponder n;
    public boolean o;

    static {
        BringIntoViewResponderNode.TraverseKey = new TraverseKey(null);
        BringIntoViewResponderNode.$stable = 8;
    }

    public BringIntoViewResponderNode(@NotNull BringIntoViewResponder bringIntoViewResponder0) {
        this.n = bringIntoViewResponder0;
    }

    public static final Rect access$bringChildIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode0, LayoutCoordinates layoutCoordinates0, Function0 function00) {
        if(bringIntoViewResponderNode0.isAttached() && bringIntoViewResponderNode0.o) {
            LayoutCoordinates layoutCoordinates1 = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode0);
            if(!layoutCoordinates0.isAttached()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                Rect rect0 = (Rect)function00.invoke();
                return rect0 == null ? null : rect0.translate-k-4lQ0M(layoutCoordinates1.localBoundingBoxOf(layoutCoordinates0, false).getTopLeft-F1C5BW0());
            }
        }
        return null;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewParent
    @Nullable
    public Object bringChildIntoView(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new f(this, layoutCoordinates0, function00, new td(this, layoutCoordinates0, 8, function00), null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final BringIntoViewResponder getResponder() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return BringIntoViewResponderNode.TraverseKey;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.o = true;
    }

    public final void setResponder(@NotNull BringIntoViewResponder bringIntoViewResponder0) {
        this.n = bringIntoViewResponder0;
    }
}

