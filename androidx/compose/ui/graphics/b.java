package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import m0.b0;
import p1.n;
import r0.a;

public final class b extends Node implements LayoutModifierNode {
    public RenderEffect A;
    public long B;
    public long C;
    public int D;
    public b0 E;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public Shape y;
    public boolean z;

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new n(placeable0, this), 4, null);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", scaleY=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", alpha = ");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", translationX=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", translationY=");
        stringBuilder0.append(this.r);
        stringBuilder0.append(", shadowElevation=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", rotationX=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", rotationY=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", rotationZ=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", cameraDistance=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", transformOrigin=");
        stringBuilder0.append(TransformOrigin.toString-impl(this.x));
        stringBuilder0.append(", shape=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", clip=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", renderEffect=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", ambientShadowColor=");
        a.x(this.B, ", spotShadowColor=", stringBuilder0);
        a.x(this.C, ", compositingStrategy=", stringBuilder0);
        stringBuilder0.append(CompositingStrategy.toString-impl(this.D));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

