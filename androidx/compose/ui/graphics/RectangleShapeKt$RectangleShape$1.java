package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\b\u0010\f\u001A\u00020\rH\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"androidx/compose/ui/graphics/RectangleShapeKt$RectangleShape$1", "Landroidx/compose/ui/graphics/Shape;", "createOutline", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline$Rectangle;", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RectangleShapeKt.RectangleShape.1 implements Shape {
    @NotNull
    public Rectangle createOutline-Pq9zytI(long v, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0) {
        return new Rectangle(SizeKt.toRect-uvyYCjk(v));
    }

    @Override  // androidx.compose.ui.graphics.Shape
    public Outline createOutline-Pq9zytI(long v, LayoutDirection layoutDirection0, Density density0) {
        return this.createOutline-Pq9zytI(v, layoutDirection0, density0);
    }

    @Override
    @NotNull
    public String toString() {
        return "RectangleShape";
    }
}

