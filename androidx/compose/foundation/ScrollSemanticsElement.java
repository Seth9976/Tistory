package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import u.y2;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/y2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ScrollSemanticsElement extends ModifierNodeElement {
    public final ScrollState b;
    public final boolean c;
    public final FlingBehavior d;
    public final boolean e;
    public final boolean f;

    public ScrollSemanticsElement(ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, boolean z2) {
        this.b = scrollState0;
        this.c = z;
        this.d = flingBehavior0;
        this.e = z1;
        this.f = z2;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new y2();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.f;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScrollSemanticsElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ScrollSemanticsElement)object0).b)) {
            return false;
        }
        if(this.c != ((ScrollSemanticsElement)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ScrollSemanticsElement)object0).d)) {
            return false;
        }
        return this.e == ((ScrollSemanticsElement)object0).e ? this.f == ((ScrollSemanticsElement)object0).f : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
        return this.d == null ? Boolean.hashCode(this.f) + a.e(v * 0x1F, 0x1F, this.e) : Boolean.hashCode(this.f) + a.e((v + this.d.hashCode()) * 0x1F, 0x1F, this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScrollSemanticsElement(state=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", reverseScrolling=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", flingBehavior=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", isScrollable=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isVertical=");
        return a.p(stringBuilder0, this.f, ')');
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((y2)modifier$Node0).n = this.b;
        ((y2)modifier$Node0).o = this.c;
        ((y2)modifier$Node0).p = this.d;
        ((y2)modifier$Node0).q = this.f;
    }
}

