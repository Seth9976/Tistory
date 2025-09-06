package n1;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;

public final class g extends Node implements DrawModifierNode, LayoutModifierNode {
    public Painter n;
    public boolean o;
    public Alignment p;
    public ContentScale q;
    public float r;
    public ColorFilter s;

    public final boolean b() {
        return this.o && this.n.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L;
    }

    public static boolean c(long v) {
        if(!Size.equals-impl0(v, 0x7FC000007FC00000L)) {
            float f = Size.getHeight-impl(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    public static boolean d(long v) {
        if(!Size.equals-impl0(v, 0x7FC000007FC00000L)) {
            float f = Size.getWidth-impl(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        long v = this.n.getIntrinsicSize-NH-jbRc();
        long v1 = SizeKt.Size((g.d(v) ? Size.getWidth-impl(v) : Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc())), (g.c(v) ? Size.getHeight-impl(v) : Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc())));
        long v2 = Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) != 0.0f && Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc()) != 0.0f ? ScaleFactorKt.times-UQTWf7w(v1, this.q.computeScaleFactor-H7hwNQA(v1, contentDrawScope0.getSize-NH-jbRc())) : 0L;
        long v3 = this.p.align-KFBX0sM(IntSizeKt.IntSize(Math.round(Size.getWidth-impl(v2)), Math.round(Size.getHeight-impl(v2))), IntSizeKt.IntSize(Math.round(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc())), Math.round(Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc()))), contentDrawScope0.getLayoutDirection());
        float f = (float)IntOffset.getX-impl(v3);
        float f1 = (float)IntOffset.getY-impl(v3);
        contentDrawScope0.getDrawContext().getTransform().translate(f, f1);
        try {
            this.n.draw-x_KDEd0(contentDrawScope0, v2, this.r, this.s);
        }
        finally {
            contentDrawScope0.getDrawContext().getTransform().translate(-f, -f1);
        }
        contentDrawScope0.drawContent();
    }

    public final long e(long v) {
        boolean z = false;
        boolean z1 = Constraints.getHasBoundedWidth-impl(v) && Constraints.getHasBoundedHeight-impl(v);
        if(Constraints.getHasFixedWidth-impl(v) && Constraints.getHasFixedHeight-impl(v)) {
            z = true;
        }
        if(!this.b() && z1 || z) {
            return Constraints.copy-Zbe2FdA$default(v, Constraints.getMaxWidth-impl(v), 0, Constraints.getMaxHeight-impl(v), 0, 10, null);
        }
        long v1 = this.n.getIntrinsicSize-NH-jbRc();
        int v2 = g.d(v1) ? Math.round(Size.getWidth-impl(v1)) : Constraints.getMinWidth-impl(v);
        int v3 = g.c(v1) ? Math.round(Size.getHeight-impl(v1)) : Constraints.getMinHeight-impl(v);
        long v4 = SizeKt.Size(ConstraintsKt.constrainWidth-K40F9xA(v, v2), ConstraintsKt.constrainHeight-K40F9xA(v, v3));
        if(this.b()) {
            long v5 = SizeKt.Size((g.d(this.n.getIntrinsicSize-NH-jbRc()) ? Size.getWidth-impl(this.n.getIntrinsicSize-NH-jbRc()) : Size.getWidth-impl(v4)), (g.c(this.n.getIntrinsicSize-NH-jbRc()) ? Size.getHeight-impl(this.n.getIntrinsicSize-NH-jbRc()) : Size.getHeight-impl(v4)));
            if(Size.getWidth-impl(v4) == 0.0f || Size.getHeight-impl(v4) == 0.0f) {
                return Constraints.copy-Zbe2FdA$default(v, ConstraintsKt.constrainWidth-K40F9xA(v, Math.round(Size.getWidth-impl(0L))), 0, ConstraintsKt.constrainHeight-K40F9xA(v, Math.round(Size.getHeight-impl(0L))), 0, 10, null);
            }
            v4 = ScaleFactorKt.times-UQTWf7w(v5, this.q.computeScaleFactor-H7hwNQA(v5, v4));
        }
        return Constraints.copy-Zbe2FdA$default(v, ConstraintsKt.constrainWidth-K40F9xA(v, Math.round(Size.getWidth-impl(v4))), 0, ConstraintsKt.constrainHeight-K40F9xA(v, Math.round(Size.getHeight-impl(v4))), 0, 10, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.b() ? Math.max(Constraints.getMinHeight-impl(this.e(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))), intrinsicMeasurable0.maxIntrinsicHeight(v)) : intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.b() ? Math.max(Constraints.getMinWidth-impl(this.e(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))), intrinsicMeasurable0.maxIntrinsicWidth(v)) : intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(this.e(v));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new f(placeable0), 4, null);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.b() ? Math.max(Constraints.getMinHeight-impl(this.e(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))), intrinsicMeasurable0.minIntrinsicHeight(v)) : intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.b() ? Math.max(Constraints.getMinWidth-impl(this.e(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))), intrinsicMeasurable0.minIntrinsicWidth(v)) : intrinsicMeasurable0.minIntrinsicWidth(v);
    }

    @Override
    public final String toString() {
        return "PainterModifier(painter=" + this.n + ", sizeToIntrinsics=" + this.o + ", alignment=" + this.p + ", alpha=" + this.r + ", colorFilter=" + this.s + ')';
    }
}

