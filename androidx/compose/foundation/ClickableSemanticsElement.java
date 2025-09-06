package androidx.compose.foundation;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u.f1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/f1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ClickableSemanticsElement extends ModifierNodeElement {
    public final boolean b;
    public final Role c;
    public final String d;
    public final Function0 e;
    public final String f;
    public final Function0 g;

    public ClickableSemanticsElement(boolean z, Role role0, String s, Function0 function00, String s1, Function0 function01) {
        this.b = z;
        this.c = role0;
        this.d = s;
        this.e = function00;
        this.f = s1;
        this.g = function01;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new f1();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.f;
        modifier$Node0.p = this.c;
        modifier$Node0.q = this.g;
        modifier$Node0.r = this.d;
        modifier$Node0.s = this.e;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClickableSemanticsElement)) {
            return false;
        }
        if(this.b != ((ClickableSemanticsElement)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ClickableSemanticsElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ClickableSemanticsElement)object0).d)) {
            return false;
        }
        if(this.e != ((ClickableSemanticsElement)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((ClickableSemanticsElement)object0).f) ? this.g == ((ClickableSemanticsElement)object0).g : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = Boolean.hashCode(this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.g.hashCode() + ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((f1)modifier$Node0).n = this.b;
        ((f1)modifier$Node0).o = this.f;
        ((f1)modifier$Node0).p = this.c;
        ((f1)modifier$Node0).q = this.g;
        ((f1)modifier$Node0).r = this.d;
        ((f1)modifier$Node0).s = this.e;
    }
}

