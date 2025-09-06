package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/u3;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class SizeElement extends ModifierNodeElement {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1 g;

    public SizeElement(float f, float f1, float f2, float f3, boolean z, Function1 function10) {
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = function10;
    }

    public SizeElement(float f, float f1, float f2, float f3, boolean z, Function1 function10, int v) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        if((v & 4) != 0) {
            f2 = NaNf;
        }
        if((v & 8) != 0) {
            f3 = NaNf;
        }
        this(f, f1, f2, f3, z, function10);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new u3();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.e;
        modifier$Node0.r = this.f;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SizeElement)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((SizeElement)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((SizeElement)object0).c)) {
            return false;
        }
        if(!Dp.equals-impl0(this.d, ((SizeElement)object0).d)) {
            return false;
        }
        return Dp.equals-impl0(this.e, ((SizeElement)object0).e) ? this.f == ((SizeElement)object0).f : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.f) + a.C(this.e, a.C(this.d, a.C(this.c, Dp.hashCode-impl(this.b) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        this.g.invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((u3)modifier$Node0).n = this.b;
        ((u3)modifier$Node0).o = this.c;
        ((u3)modifier$Node0).p = this.d;
        ((u3)modifier$Node0).q = this.e;
        ((u3)modifier$Node0).r = this.f;
    }
}

