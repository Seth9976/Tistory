package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class AnchoredDraggableElement extends ModifierNodeElement {
    public final AnchoredDraggableState b;
    public final Orientation c;
    public final boolean d;
    public final Boolean e;
    public final MutableInteractionSource f;
    public final boolean g;
    public final OverscrollEffect h;

    public AnchoredDraggableElement(AnchoredDraggableState anchoredDraggableState0, Orientation orientation0, boolean z, Boolean boolean0, MutableInteractionSource mutableInteractionSource0, boolean z1, OverscrollEffect overscrollEffect0) {
        this.b = anchoredDraggableState0;
        this.c = orientation0;
        this.d = z;
        this.e = boolean0;
        this.f = mutableInteractionSource0;
        this.g = z1;
        this.h = overscrollEffect0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new d(AnchoredDraggableKt.a, this.d, this.f, this.c);  // 初始化器: Landroidx/compose/foundation/gestures/DragGestureNode;-><init>(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V
        modifier$Node0.x = this.b;
        modifier$Node0.y = this.c;
        modifier$Node0.z = this.e;
        modifier$Node0.A = this.h;
        modifier$Node0.B = this.g;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnchoredDraggableElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((AnchoredDraggableElement)object0).b)) {
            return false;
        }
        if(this.c != ((AnchoredDraggableElement)object0).c) {
            return false;
        }
        if(this.d != ((AnchoredDraggableElement)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((AnchoredDraggableElement)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((AnchoredDraggableElement)object0).f)) {
            return false;
        }
        return this.g == ((AnchoredDraggableElement)object0).g ? Intrinsics.areEqual(this.h, ((AnchoredDraggableElement)object0).h) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.e(((a.e((this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F, 0x1F, this.d) + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F, 0x1F, this.g);
        OverscrollEffect overscrollEffect0 = this.h;
        if(overscrollEffect0 != null) {
            v = overscrollEffect0.hashCode();
        }
        return v1 + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("anchoredDraggable");
        inspectorInfo0.getProperties().set("state", this.b);
        inspectorInfo0.getProperties().set("orientation", this.c);
        a.k(this.d, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("reverseDirection", this.e);
        inspectorInfo0.getProperties().set("interactionSource", this.f);
        a.k(this.g, inspectorInfo0.getProperties(), "startDragImmediately", inspectorInfo0).set("overscrollEffect", this.h);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        boolean z1;
        boolean z;
        AnchoredDraggableState anchoredDraggableState0 = this.b;
        if(Intrinsics.areEqual(((d)modifier$Node0).x, anchoredDraggableState0)) {
            z = false;
        }
        else {
            ((d)modifier$Node0).x = anchoredDraggableState0;
            z = true;
        }
        Orientation orientation0 = this.c;
        if(((d)modifier$Node0).y != orientation0) {
            ((d)modifier$Node0).y = orientation0;
            z = true;
        }
        Boolean boolean0 = this.e;
        if(Intrinsics.areEqual(((d)modifier$Node0).z, boolean0)) {
            z1 = z;
        }
        else {
            ((d)modifier$Node0).z = boolean0;
            z1 = true;
        }
        ((d)modifier$Node0).B = this.g;
        ((d)modifier$Node0).A = this.h;
        DragGestureNode.update$default(((d)modifier$Node0), null, this.d, this.f, orientation0, z1, 1, null);
    }
}

