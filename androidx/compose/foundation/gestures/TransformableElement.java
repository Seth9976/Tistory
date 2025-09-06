package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import z.x3;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lz/x3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class TransformableElement extends ModifierNodeElement {
    public final TransformableState b;
    public final Function1 c;
    public final boolean d;
    public final boolean e;

    public TransformableElement(TransformableState transformableState0, Function1 function10, boolean z, boolean z1) {
        this.b = transformableState0;
        this.c = function10;
        this.d = z;
        this.e = z1;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new x3(this.b, this.c, this.d, this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(TransformableElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TransformableElement)object0).b)) {
            return false;
        }
        if(this.c != ((TransformableElement)object0).c) {
            return false;
        }
        return this.d == ((TransformableElement)object0).d ? this.e == ((TransformableElement)object0).e : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.e) + a.e(a.d(this.b.hashCode() * 0x1F, 0x1F, this.c), 0x1F, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("transformable");
        inspectorInfo0.getProperties().set("state", this.b);
        inspectorInfo0.getProperties().set("canPan", this.c);
        a.k(this.e, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("lockRotationOnZoomPan", Boolean.valueOf(this.d));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((x3)modifier$Node0).q = this.c;
        TransformableState transformableState0 = this.b;
        boolean z = Intrinsics.areEqual(((x3)modifier$Node0).p, transformableState0);
        boolean z1 = this.d;
        boolean z2 = this.e;
        if(!z || ((x3)modifier$Node0).s != z2 || ((x3)modifier$Node0).r != z1) {
            ((x3)modifier$Node0).p = transformableState0;
            ((x3)modifier$Node0).s = z2;
            ((x3)modifier$Node0).r = z1;
            ((x3)modifier$Node0).v.resetPointerInputHandler();
        }
    }
}

