package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00052\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001A\u00020\r*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b\u0006\u0010 R\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\u0007\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollingLayoutNode;", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "create", "()Landroidx/compose/foundation/ScrollingLayoutNode;", "node", "", "update", "(Landroidx/compose/foundation/ScrollingLayoutNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "b", "Landroidx/compose/foundation/ScrollState;", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "c", "Z", "()Z", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollingLayoutElement extends ModifierNodeElement {
    public static final int $stable;
    public final ScrollState b;
    public final boolean c;
    public final boolean d;

    public ScrollingLayoutElement(@NotNull ScrollState scrollState0, boolean z, boolean z1) {
        this.b = scrollState0;
        this.c = z;
        this.d = z1;
    }

    @NotNull
    public ScrollingLayoutNode create() {
        return new ScrollingLayoutNode(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ScrollingLayoutElement ? Intrinsics.areEqual(this.b, ((ScrollingLayoutElement)object0).b) && this.c == ((ScrollingLayoutElement)object0).c && this.d == ((ScrollingLayoutElement)object0).d : false;
    }

    @NotNull
    public final ScrollState getScrollState() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.d) + a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("layoutInScroll");
        inspectorInfo0.getProperties().set("state", this.b);
        a.k(this.c, inspectorInfo0.getProperties(), "isReversed", inspectorInfo0).set("isVertical", Boolean.valueOf(this.d));
    }

    public final boolean isReversed() {
        return this.c;
    }

    public final boolean isVertical() {
        return this.d;
    }

    public void update(@NotNull ScrollingLayoutNode scrollingLayoutNode0) {
        scrollingLayoutNode0.setScrollerState(this.b);
        scrollingLayoutNode0.setReversed(this.c);
        scrollingLayoutNode0.setVertical(this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((ScrollingLayoutNode)modifier$Node0));
    }
}

