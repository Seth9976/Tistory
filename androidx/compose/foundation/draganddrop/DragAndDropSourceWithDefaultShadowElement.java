package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s.h1;
import y.a;
import y.d;
import y.e;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ly/e;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement {
    public final Function2 b;

    public DragAndDropSourceWithDefaultShadowElement(Function2 function20) {
        this.b = function20;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new e();  // 初始化器: Landroidx/compose/ui/node/DelegatingNode;-><init>()V
        modifier$Node0.p = this.b;
        a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        ((DelegatingNode)modifier$Node0).delegate(DrawModifierKt.CacheDrawModifierNode(new h(1, a0, a.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0, 13)));
        ((DelegatingNode)modifier$Node0).delegate(new DragAndDropSourceNode(new h1(a0, 23), new d(((e)modifier$Node0), null)));
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DragAndDropSourceWithDefaultShadowElement ? Intrinsics.areEqual(this.b, ((DragAndDropSourceWithDefaultShadowElement)object0).b) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("dragSourceWithDefaultPainter");
        inspectorInfo0.getProperties().set("dragAndDropSourceHandler", this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((e)modifier$Node0).p = this.b;
    }
}

