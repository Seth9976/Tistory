package androidx.compose.foundation;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import u.u;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/u;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class BackgroundElement extends ModifierNodeElement {
    public final long b;
    public final Brush c;
    public final float d;
    public final Shape e;
    public final Function1 f;

    public BackgroundElement(long v, Brush brush0, float f, Shape shape0, Function1 function10, int v1) {
        if((v1 & 1) != 0) {
            v = Color.Companion.getUnspecified-0d7_KjU();
        }
        if((v1 & 2) != 0) {
            brush0 = null;
        }
        super();
        this.b = v;
        this.c = brush0;
        this.d = f;
        this.e = shape0;
        this.f = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new u();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.e;
        modifier$Node0.r = 0x7FC000007FC00000L;
        return modifier$Node0;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        BackgroundElement backgroundElement0 = object0 instanceof BackgroundElement ? ((BackgroundElement)object0) : null;
        return backgroundElement0 == null ? false : Color.equals-impl0(this.b, backgroundElement0.b) && Intrinsics.areEqual(this.c, backgroundElement0.c) && this.d == backgroundElement0.d && Intrinsics.areEqual(this.e, backgroundElement0.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = Color.hashCode-impl(this.b);
        return this.c == null ? this.e.hashCode() + a.b(this.d, v * 961, 0x1F) : this.e.hashCode() + a.b(this.d, (v * 0x1F + this.c.hashCode()) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        this.f.invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((u)modifier$Node0).n = this.b;
        ((u)modifier$Node0).o = this.c;
        ((u)modifier$Node0).p = this.d;
        ((u)modifier$Node0).q = this.e;
    }
}

