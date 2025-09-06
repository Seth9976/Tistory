package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import b0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lb0/z;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ParentSizeElement extends ModifierNodeElement {
    public final float b;
    public final State c;
    public final State d;
    public final String e;

    public ParentSizeElement(float f, State state0, State state1, String s) {
        this.b = f;
        this.c = state0;
        this.d = state1;
        this.e = s;
    }

    public ParentSizeElement(float f, State state0, State state1, String s, int v) {
        if((v & 2) != 0) {
            state0 = null;
        }
        if((v & 4) != 0) {
            state1 = null;
        }
        this(f, state0, state1, s);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new z();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
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
        return object0 instanceof ParentSizeElement ? this.b == ((ParentSizeElement)object0).b && Intrinsics.areEqual(this.c, ((ParentSizeElement)object0).c) && Intrinsics.areEqual(this.d, ((ParentSizeElement)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        State state0 = this.d;
        if(state0 != null) {
            v = state0.hashCode();
        }
        return Float.hashCode(this.b) + (v1 * 0x1F + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName(this.e);
        inspectorInfo0.setValue(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((z)modifier$Node0).n = this.b;
        ((z)modifier$Node0).o = this.c;
        ((z)modifier$Node0).p = this.d;
    }
}

