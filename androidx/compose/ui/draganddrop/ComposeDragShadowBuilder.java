package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View.DragShadowBuilder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,63:1\n546#2,17:64\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n54#1:64,17\n*E\n"})
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable;
    public final Density a;
    public final long b;
    public final Function1 c;

    public ComposeDragShadowBuilder(Density density0, long v, Function1 function10, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = density0;
        this.b = v;
        this.c = function10;
    }

    @Override  // android.view.View$DragShadowBuilder
    public void onDrawShadow(@NotNull Canvas canvas0) {
        CanvasDrawScope canvasDrawScope0 = new CanvasDrawScope();
        androidx.compose.ui.graphics.Canvas canvas1 = AndroidCanvas_androidKt.Canvas(canvas0);
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(this.a);
        canvasDrawScope$DrawParams1.setLayoutDirection(LayoutDirection.Ltr);
        canvasDrawScope$DrawParams1.setCanvas(canvas1);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(this.b);
        canvas1.save();
        this.c.invoke(canvasDrawScope0);
        canvas1.restore();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
    }

    @Override  // android.view.View$DragShadowBuilder
    public void onProvideShadowMetrics(@NotNull Point point0, @NotNull Point point1) {
        float f = Size.getWidth-impl(this.b);
        float f1 = this.a.toDp-u2uoSUM(f);
        int v = this.a.roundToPx-0680j_4(f1);
        float f2 = Size.getHeight-impl(this.b);
        float f3 = this.a.toDp-u2uoSUM(f2);
        point0.set(v, this.a.roundToPx-0680j_4(f3));
        point1.set(point0.x / 2, point0.y / 2);
    }
}

