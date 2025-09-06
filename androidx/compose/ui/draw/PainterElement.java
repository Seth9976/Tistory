package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n1.g;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ln1/g;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class PainterElement extends ModifierNodeElement {
    public final Painter b;
    public final boolean c;
    public final Alignment d;
    public final ContentScale e;
    public final float f;
    public final ColorFilter g;

    public PainterElement(Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0) {
        this.b = painter0;
        this.c = z;
        this.d = alignment0;
        this.e = contentScale0;
        this.f = f;
        this.g = colorFilter0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new g();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.e;
        modifier$Node0.r = this.f;
        modifier$Node0.s = this.g;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PainterElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((PainterElement)object0).b)) {
            return false;
        }
        if(this.c != ((PainterElement)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((PainterElement)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((PainterElement)object0).e)) {
            return false;
        }
        return Float.compare(this.f, ((PainterElement)object0).f) == 0 ? Intrinsics.areEqual(this.g, ((PainterElement)object0).g) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = a.b(this.f, (this.e.hashCode() + (this.d.hashCode() + a.e(this.b.hashCode() * 0x1F, 0x1F, this.c)) * 0x1F) * 0x1F, 0x1F);
        return this.g == null ? v : v + this.g.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("paint");
        inspectorInfo0.getProperties().set("painter", this.b);
        a.k(this.c, inspectorInfo0.getProperties(), "sizeToIntrinsics", inspectorInfo0).set("alignment", this.d);
        inspectorInfo0.getProperties().set("contentScale", this.e);
        inspectorInfo0.getProperties().set("alpha", this.f);
        inspectorInfo0.getProperties().set("colorFilter", this.g);
    }

    @Override
    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        boolean z = ((g)modifier$Node0).o != this.c || this.c && !Size.equals-impl0(((g)modifier$Node0).n.getIntrinsicSize-NH-jbRc(), this.b.getIntrinsicSize-NH-jbRc());
        ((g)modifier$Node0).n = this.b;
        ((g)modifier$Node0).o = this.c;
        ((g)modifier$Node0).p = this.d;
        ((g)modifier$Node0).q = this.e;
        ((g)modifier$Node0).r = this.f;
        ((g)modifier$Node0).s = this.g;
        if(z) {
            LayoutModifierNodeKt.invalidateMeasurement(((g)modifier$Node0));
        }
        DrawModifierNodeKt.invalidateDraw(((g)modifier$Node0));
    }
}

