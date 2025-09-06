package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class BringIntoViewRequesterElement extends ModifierNodeElement {
    public final BringIntoViewRequester b;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester0) {
        this.b = bringIntoViewRequester0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new BringIntoViewRequesterNode(this.b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        return this == object0 || object0 instanceof BringIntoViewRequesterElement && Intrinsics.areEqual(this.b, ((BringIntoViewRequesterElement)object0).b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("bringIntoViewRequester");
        inspectorInfo0.getProperties().set("bringIntoViewRequester", this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((BringIntoViewRequesterNode)modifier$Node0).updateRequester(this.b);
    }
}

