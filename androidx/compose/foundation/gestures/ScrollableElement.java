package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ScrollableElement extends ModifierNodeElement {
    public final ScrollableState b;
    public final Orientation c;
    public final OverscrollEffect d;
    public final boolean e;
    public final boolean f;
    public final FlingBehavior g;
    public final MutableInteractionSource h;
    public final BringIntoViewSpec i;

    public ScrollableElement(OverscrollEffect overscrollEffect0, BringIntoViewSpec bringIntoViewSpec0, FlingBehavior flingBehavior0, Orientation orientation0, ScrollableState scrollableState0, MutableInteractionSource mutableInteractionSource0, boolean z, boolean z1) {
        this.b = scrollableState0;
        this.c = orientation0;
        this.d = overscrollEffect0;
        this.e = z;
        this.f = z1;
        this.g = flingBehavior0;
        this.h = mutableInteractionSource0;
        this.i = bringIntoViewSpec0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new y(this.d, this.i, this.g, this.c, this.b, this.h, this.e, this.f);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScrollableElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ScrollableElement)object0).b)) {
            return false;
        }
        if(this.c != ((ScrollableElement)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ScrollableElement)object0).d)) {
            return false;
        }
        if(this.e != ((ScrollableElement)object0).e) {
            return false;
        }
        if(this.f != ((ScrollableElement)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((ScrollableElement)object0).g)) {
            return false;
        }
        return Intrinsics.areEqual(this.h, ((ScrollableElement)object0).h) ? Intrinsics.areEqual(this.i, ((ScrollableElement)object0).i) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.e(a.e(((this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F, this.e), 0x1F, this.f);
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = this.h == null ? 0 : this.h.hashCode();
        BringIntoViewSpec bringIntoViewSpec0 = this.i;
        if(bringIntoViewSpec0 != null) {
            v = bringIntoViewSpec0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("scrollable");
        inspectorInfo0.getProperties().set("orientation", this.c);
        inspectorInfo0.getProperties().set("state", this.b);
        inspectorInfo0.getProperties().set("overscrollEffect", this.d);
        ValueElementSequence valueElementSequence0 = a.k(this.e, inspectorInfo0.getProperties(), "enabled", inspectorInfo0);
        a.k(this.f, valueElementSequence0, "reverseDirection", inspectorInfo0).set("flingBehavior", this.g);
        inspectorInfo0.getProperties().set("interactionSource", this.h);
        inspectorInfo0.getProperties().set("bringIntoViewSpec", this.i);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        boolean z1;
        boolean z = this.e;
        if(((y)modifier$Node0).getEnabled() == z) {
            z1 = false;
        }
        else {
            ((y)modifier$Node0).D.b = z;
            ((y)modifier$Node0).A.update(z);
            z1 = true;
        }
        FlingBehavior flingBehavior0 = this.g;
        FlingBehavior flingBehavior1 = flingBehavior0 == null ? ((y)modifier$Node0).B : flingBehavior0;
        boolean z2 = ((y)modifier$Node0).C.update(this.b, this.c, this.d, this.f, flingBehavior1, ((y)modifier$Node0).z);
        ((y)modifier$Node0).E.update(this.c, this.f, this.i);
        ((y)modifier$Node0).x = this.d;
        ((y)modifier$Node0).y = flingBehavior0;
        Orientation orientation0 = ((y)modifier$Node0).C.isVertical() ? Orientation.Vertical : Orientation.Horizontal;
        ((y)modifier$Node0).update(ScrollableKt.a, z, this.h, orientation0, z2);
        if(z1) {
            ((y)modifier$Node0).G = null;
            ((y)modifier$Node0).H = null;
            SemanticsModifierNodeKt.invalidateSemantics(((y)modifier$Node0));
        }
    }
}

