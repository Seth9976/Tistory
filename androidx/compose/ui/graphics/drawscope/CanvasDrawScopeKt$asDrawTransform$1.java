package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ:\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u001B\u001A\u00020\u00072\u0006\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001AJ*\u0010 \u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010%\u001A\u00020\u00072\u0006\u0010\"\u001A\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001A\u0010)\u001A\u00020&8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\'\u0010(R\u001A\u0010+\u001A\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b*\u0010(\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "left", "top", "right", "bottom", "", "inset", "(FFFF)V", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "translate", "(FF)V", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Uv8p0NA", "(FJ)V", "rotate", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "scale", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "getCenter-F1C5BW0", "center", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,791:1\n33#2,7:792\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n*L\n745#1:792,7\n*E\n"})
public final class CanvasDrawScopeKt.asDrawTransform.1 implements DrawTransform {
    public final DrawContext a;

    public CanvasDrawScopeKt.asDrawTransform.1(DrawContext drawContext0) {
        this.a = drawContext0;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void clipPath-mtrdD-E(@NotNull Path path0, int v) {
        this.a.getCanvas().clipPath-mtrdD-E(path0, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void clipRect-N_I0leg(float f, float f1, float f2, float f3, int v) {
        this.a.getCanvas().clipRect-N_I0leg(f, f1, f2, f3, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public long getCenter-F1C5BW0() {
        return SizeKt.getCenter-uvyYCjk(this.getSize-NH-jbRc());
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public long getSize-NH-jbRc() {
        return this.a.getSize-NH-jbRc();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void inset(float f, float f1, float f2, float f3) {
        DrawContext drawContext0 = this.a;
        Canvas canvas0 = drawContext0.getCanvas();
        long v = SizeKt.Size(Size.getWidth-impl(this.getSize-NH-jbRc()) - (f2 + f), Size.getHeight-impl(this.getSize-NH-jbRc()) - (f3 + f1));
        if(Size.getWidth-impl(v) < 0.0f || Size.getHeight-impl(v) < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        drawContext0.setSize-uvyYCjk(v);
        canvas0.translate(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void rotate-Uv8p0NA(float f, long v) {
        Canvas canvas0 = this.a.getCanvas();
        canvas0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
        canvas0.rotate(f);
        canvas0.translate(-Offset.getX-impl(v), -Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void scale-0AR0LA0(float f, float f1, long v) {
        Canvas canvas0 = this.a.getCanvas();
        canvas0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
        canvas0.scale(f, f1);
        canvas0.translate(-Offset.getX-impl(v), -Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void transform-58bKbWc(@NotNull float[] arr_f) {
        this.a.getCanvas().concat-58bKbWc(arr_f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
    public void translate(float f, float f1) {
        this.a.getCanvas().translate(f, f1);
    }
}

