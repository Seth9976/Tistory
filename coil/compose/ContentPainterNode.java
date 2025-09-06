package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p5.f;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ&\u0010\u0018\u001A\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001D\u001A\u00020\u001B*\u00020\u00192\u0006\u0010\u0012\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ#\u0010\u001F\u001A\u00020\u001B*\u00020\u00192\u0006\u0010\u0012\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001EJ#\u0010!\u001A\u00020\u001B*\u00020\u00192\u0006\u0010\u0012\u001A\u00020\u001A2\u0006\u0010 \u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b!\u0010\u001EJ#\u0010\"\u001A\u00020\u001B*\u00020\u00192\u0006\u0010\u0012\u001A\u00020\u001A2\u0006\u0010 \u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\"\u0010\u001EJ\u0013\u0010%\u001A\u00020$*\u00020#H\u0016\u00A2\u0006\u0004\b%\u0010&R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u000B\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\r\u001A\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010H\u001A\u00020E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006I"}, d2 = {"Lcoil/compose/ContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "n", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "o", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "p", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "q", "F", "getAlpha", "()F", "setAlpha", "(F)V", "r", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 utils.kt\ncoil/compose/UtilsKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,249:1\n152#2:250\n152#2:251\n152#2:252\n152#2:253\n159#2:254\n159#2:257\n181#3:255\n181#3:256\n66#4:258\n70#4:259\n66#4,5:260\n121#5,4:265\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n*L\n104#1:250\n118#1:251\n132#1:252\n147#1:253\n164#1:254\n191#1:257\n169#1:255\n170#1:256\n209#1:258\n211#1:259\n223#1:260,5\n239#1:265,4\n*E\n"})
public final class ContentPainterNode extends Node implements DrawModifierNode, LayoutModifierNode {
    public static final int $stable = 8;
    public Painter n;
    public Alignment o;
    public ContentScale p;
    public float q;
    public ColorFilter r;

    public ContentPainterNode(@NotNull Painter painter0, @NotNull Alignment alignment0, @NotNull ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0) {
        this.n = painter0;
        this.o = alignment0;
        this.p = contentScale0;
        this.q = f;
        this.r = colorFilter0;
    }

    public final long b(long v) {
        if(Size.isEmpty-impl(v)) {
            return 0L;
        }
        long v1 = this.n.getIntrinsicSize-NH-jbRc();
        if(v1 == 0x7FC000007FC00000L) {
            return v;
        }
        float f = Size.getWidth-impl(v1);
        if(Float.isInfinite(f) || Float.isNaN(f)) {
            f = Size.getWidth-impl(v);
        }
        float f1 = Size.getHeight-impl(v1);
        if(Float.isInfinite(f1) || Float.isNaN(f1)) {
            f1 = Size.getHeight-impl(v);
        }
        long v2 = SizeKt.Size(f, f1);
        long v3 = this.p.computeScaleFactor-H7hwNQA(v2, v);
        float f2 = ScaleFactor.getScaleX-impl(v3);
        if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            float f3 = ScaleFactor.getScaleY-impl(v3);
            return Float.isInfinite(f3) || Float.isNaN(f3) ? v : ScaleFactorKt.times-m-w2e94(v3, v2);
        }
        return v;
    }

    public final long c(long v) {
        float f1;
        float f;
        boolean z = Constraints.getHasFixedWidth-impl(v);
        boolean z1 = Constraints.getHasFixedHeight-impl(v);
        if(z && z1) {
            return v;
        }
        boolean z2 = Constraints.getHasBoundedWidth-impl(v) && Constraints.getHasBoundedHeight-impl(v);
        long v1 = this.n.getIntrinsicSize-NH-jbRc();
        if(v1 == 0x7FC000007FC00000L) {
            return z2 ? Constraints.copy-Zbe2FdA$default(v, Constraints.getMaxWidth-impl(v), 0, Constraints.getMaxHeight-impl(v), 0, 10, null) : v;
        }
        if(!z2 || !z && !z1) {
            float f2 = Size.getWidth-impl(v1);
            float f3 = Size.getHeight-impl(v1);
            f = Float.isInfinite(f2) || Float.isNaN(f2) ? ((float)Constraints.getMinWidth-impl(v)) : UtilsKt.constrainWidth-K40F9xA(v, f2);
            f1 = Float.isInfinite(f3) || Float.isNaN(f3) ? ((float)Constraints.getMinHeight-impl(v)) : UtilsKt.constrainHeight-K40F9xA(v, f3);
        }
        else {
            f = (float)Constraints.getMaxWidth-impl(v);
            f1 = (float)Constraints.getMaxHeight-impl(v);
        }
        long v2 = this.b(SizeKt.Size(f, f1));
        float f4 = Size.getWidth-impl(v2);
        float f5 = Size.getHeight-impl(v2);
        return Constraints.copy-Zbe2FdA$default(v, ConstraintsKt.constrainWidth-K40F9xA(v, c.roundToInt(f4)), 0, ConstraintsKt.constrainHeight-K40F9xA(v, c.roundToInt(f5)), 0, 10, null);
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        long v = this.b(contentDrawScope0.getSize-NH-jbRc());
        long v1 = this.o.align-KFBX0sM(UtilsKt.toIntSize-uvyYCjk(v), UtilsKt.toIntSize-uvyYCjk(contentDrawScope0.getSize-NH-jbRc()), contentDrawScope0.getLayoutDirection());
        float f = (float)IntOffset.component1-impl(v1);
        float f1 = (float)IntOffset.component2-impl(v1);
        contentDrawScope0.getDrawContext().getTransform().translate(f, f1);
        this.n.draw-x_KDEd0(contentDrawScope0, v, this.q, this.r);
        contentDrawScope0.getDrawContext().getTransform().translate(-f, -f1);
        contentDrawScope0.drawContent();
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.o;
    }

    public final float getAlpha() {
        return this.q;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.r;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.p;
    }

    @NotNull
    public final Painter getPainter() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        if(this.n.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L) {
            int v1 = intrinsicMeasurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(this.c(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))));
            return Math.max(c.roundToInt(Size.getHeight-impl(this.b(SizeKt.Size(v, v1)))), v1);
        }
        return intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        if(this.n.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L) {
            int v1 = intrinsicMeasurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(this.c(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))));
            return Math.max(c.roundToInt(Size.getWidth-impl(this.b(SizeKt.Size(v1, v)))), v1);
        }
        return intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(this.c(v));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new f(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        if(this.n.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L) {
            int v1 = intrinsicMeasurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(this.c(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))));
            return Math.max(c.roundToInt(Size.getHeight-impl(this.b(SizeKt.Size(v, v1)))), v1);
        }
        return intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        if(this.n.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L) {
            int v1 = intrinsicMeasurable0.minIntrinsicWidth(Constraints.getMaxHeight-impl(this.c(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))));
            return Math.max(c.roundToInt(Size.getWidth-impl(this.b(SizeKt.Size(v1, v)))), v1);
        }
        return intrinsicMeasurable0.minIntrinsicWidth(v);
    }

    public final void setAlignment(@NotNull Alignment alignment0) {
        this.o = alignment0;
    }

    public final void setAlpha(float f) {
        this.q = f;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.r = colorFilter0;
    }

    public final void setContentScale(@NotNull ContentScale contentScale0) {
        this.p = contentScale0;
    }

    public final void setPainter(@NotNull Painter painter0) {
        this.n = painter0;
    }
}

