package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.b0;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class GraphicsLayerElement extends ModifierNodeElement {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final Shape m;
    public final boolean n;
    public final RenderEffect o;
    public final long p;
    public final long q;
    public final int r;

    public GraphicsLayerElement(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3) {
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = v;
        this.m = shape0;
        this.n = z;
        this.o = renderEffect0;
        this.p = v1;
        this.q = v2;
        this.r = v3;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new b();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.e;
        modifier$Node0.r = this.f;
        modifier$Node0.s = this.g;
        modifier$Node0.t = this.h;
        modifier$Node0.u = this.i;
        modifier$Node0.v = this.j;
        modifier$Node0.w = this.k;
        modifier$Node0.x = this.l;
        modifier$Node0.y = this.m;
        modifier$Node0.z = this.n;
        modifier$Node0.A = this.o;
        modifier$Node0.B = this.p;
        modifier$Node0.C = this.q;
        modifier$Node0.D = this.r;
        modifier$Node0.E = new b0(modifier$Node0, 22);
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GraphicsLayerElement)) {
            return false;
        }
        if(Float.compare(this.b, ((GraphicsLayerElement)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((GraphicsLayerElement)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((GraphicsLayerElement)object0).d) != 0) {
            return false;
        }
        if(Float.compare(this.e, ((GraphicsLayerElement)object0).e) != 0) {
            return false;
        }
        if(Float.compare(this.f, ((GraphicsLayerElement)object0).f) != 0) {
            return false;
        }
        if(Float.compare(this.g, ((GraphicsLayerElement)object0).g) != 0) {
            return false;
        }
        if(Float.compare(this.h, ((GraphicsLayerElement)object0).h) != 0) {
            return false;
        }
        if(Float.compare(this.i, ((GraphicsLayerElement)object0).i) != 0) {
            return false;
        }
        if(Float.compare(this.j, ((GraphicsLayerElement)object0).j) != 0) {
            return false;
        }
        if(Float.compare(this.k, ((GraphicsLayerElement)object0).k) != 0) {
            return false;
        }
        if(!TransformOrigin.equals-impl0(this.l, ((GraphicsLayerElement)object0).l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((GraphicsLayerElement)object0).m)) {
            return false;
        }
        if(this.n != ((GraphicsLayerElement)object0).n) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, ((GraphicsLayerElement)object0).o)) {
            return false;
        }
        if(!Color.equals-impl0(this.p, ((GraphicsLayerElement)object0).p)) {
            return false;
        }
        return Color.equals-impl0(this.q, ((GraphicsLayerElement)object0).q) ? CompositingStrategy.equals-impl0(this.r, ((GraphicsLayerElement)object0).r) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = a.e((this.m.hashCode() + (TransformOrigin.hashCode-impl(this.l) + a.b(this.k, a.b(this.j, a.b(this.i, a.b(this.h, a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, a.b(this.c, Float.hashCode(this.b) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F) * 0x1F, 0x1F, this.n);
        return this.o == null ? CompositingStrategy.hashCode-impl(this.r) + wb.a.a(this.q, wb.a.a(this.p, v * 0x1F, 0x1F), 0x1F) : CompositingStrategy.hashCode-impl(this.r) + wb.a.a(this.q, wb.a.a(this.p, (v + this.o.hashCode()) * 0x1F, 0x1F), 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("graphicsLayer");
        inspectorInfo0.getProperties().set("scaleX", this.b);
        inspectorInfo0.getProperties().set("scaleY", this.c);
        inspectorInfo0.getProperties().set("alpha", this.d);
        inspectorInfo0.getProperties().set("translationX", this.e);
        inspectorInfo0.getProperties().set("translationY", this.f);
        inspectorInfo0.getProperties().set("shadowElevation", this.g);
        inspectorInfo0.getProperties().set("rotationX", this.h);
        inspectorInfo0.getProperties().set("rotationY", this.i);
        inspectorInfo0.getProperties().set("rotationZ", this.j);
        inspectorInfo0.getProperties().set("cameraDistance", this.k);
        inspectorInfo0.getProperties().set("transformOrigin", TransformOrigin.box-impl(this.l));
        inspectorInfo0.getProperties().set("shape", this.m);
        a.k(this.n, inspectorInfo0.getProperties(), "clip", inspectorInfo0).set("renderEffect", this.o);
        inspectorInfo0.getProperties().set("ambientShadowColor", Color.box-impl(this.p));
        inspectorInfo0.getProperties().set("spotShadowColor", Color.box-impl(this.q));
        inspectorInfo0.getProperties().set("compositingStrategy", CompositingStrategy.box-impl(this.r));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GraphicsLayerElement(scaleX=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", scaleY=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", translationX=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", translationY=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", shadowElevation=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", rotationX=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", rotationY=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", rotationZ=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", cameraDistance=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", transformOrigin=");
        stringBuilder0.append(TransformOrigin.toString-impl(this.l));
        stringBuilder0.append(", shape=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", clip=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", renderEffect=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", ambientShadowColor=");
        a.x(this.p, ", spotShadowColor=", stringBuilder0);
        a.x(this.q, ", compositingStrategy=", stringBuilder0);
        stringBuilder0.append(CompositingStrategy.toString-impl(this.r));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((b)modifier$Node0).n = this.b;
        ((b)modifier$Node0).o = this.c;
        ((b)modifier$Node0).p = this.d;
        ((b)modifier$Node0).q = this.e;
        ((b)modifier$Node0).r = this.f;
        ((b)modifier$Node0).s = this.g;
        ((b)modifier$Node0).t = this.h;
        ((b)modifier$Node0).u = this.i;
        ((b)modifier$Node0).v = this.j;
        ((b)modifier$Node0).w = this.k;
        ((b)modifier$Node0).x = this.l;
        ((b)modifier$Node0).y = this.m;
        ((b)modifier$Node0).z = this.n;
        ((b)modifier$Node0).A = this.o;
        ((b)modifier$Node0).B = this.p;
        ((b)modifier$Node0).C = this.q;
        ((b)modifier$Node0).D = this.r;
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.requireCoordinator-64DMado(((b)modifier$Node0), 2).getWrapped$ui_release();
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.updateLayerBlock(((b)modifier$Node0).E, true);
        }
    }
}

