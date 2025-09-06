package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ApproachLayoutElement extends ModifierNodeElement {
    public final Function3 b;
    public final Function1 c;
    public final Function2 d;

    public ApproachLayoutElement(Function3 function30, Function1 function10, Function2 function20) {
        this.b = function30;
        this.c = function10;
        this.d = function20;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new b();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ApproachLayoutElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ApproachLayoutElement)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((ApproachLayoutElement)object0).c) ? Intrinsics.areEqual(this.d, ((ApproachLayoutElement)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.d.hashCode() + a.d(this.b.hashCode() * 0x1F, 0x1F, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("approachLayout");
        inspectorInfo0.getProperties().set("approachMeasure", this.b);
        inspectorInfo0.getProperties().set("isMeasurementApproachInProgress", this.c);
        inspectorInfo0.getProperties().set("isPlacementApproachInProgress", this.d);
    }

    @Override
    public final String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.b + ", isMeasurementApproachInProgress=" + this.c + ", isPlacementApproachInProgress=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((b)modifier$Node0).n = this.b;
        ((b)modifier$Node0).o = this.c;
        ((b)modifier$Node0).p = this.d;
    }
}

