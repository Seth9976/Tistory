package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\b\'\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00132\u0006\u0010\u0004\u001A\u00020\u00132\u0006\u0010\u0005\u001A\u00020\u00132\u0006\u0010\u0006\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u000BH&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001B\u001A\u0004\b!\u0010\u001DR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001B\u001A\u0004\b#\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/foundation/shape/CornerSize;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "copy", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "all", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "a", "Landroidx/compose/foundation/shape/CornerSize;", "getTopStart", "()Landroidx/compose/foundation/shape/CornerSize;", "b", "getTopEnd", "c", "getBottomEnd", "d", "getBottomStart", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class CornerBasedShape implements Shape {
    public static final int $stable;
    public final CornerSize a;
    public final CornerSize b;
    public final CornerSize c;
    public final CornerSize d;

    public CornerBasedShape(@NotNull CornerSize cornerSize0, @NotNull CornerSize cornerSize1, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3) {
        this.a = cornerSize0;
        this.b = cornerSize1;
        this.c = cornerSize2;
        this.d = cornerSize3;
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize cornerSize0) {
        return this.copy(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize arg1, @NotNull CornerSize arg2, @NotNull CornerSize arg3, @NotNull CornerSize arg4);

    public static CornerBasedShape copy$default(CornerBasedShape cornerBasedShape0, CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if((v & 1) != 0) {
            cornerSize0 = cornerBasedShape0.a;
        }
        if((v & 2) != 0) {
            cornerSize1 = cornerBasedShape0.b;
        }
        if((v & 4) != 0) {
            cornerSize2 = cornerBasedShape0.c;
        }
        if((v & 8) != 0) {
            cornerSize3 = cornerBasedShape0.d;
        }
        return cornerBasedShape0.copy(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @NotNull
    public abstract Outline createOutline-LjSzlW0(long arg1, float arg2, float arg3, float arg4, float arg5, @NotNull LayoutDirection arg6);

    @Override  // androidx.compose.ui.graphics.Shape
    @NotNull
    public final Outline createOutline-Pq9zytI(long v, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0) {
        float f = this.a.toPx-TmRCtEA(v, density0);
        float f1 = this.b.toPx-TmRCtEA(v, density0);
        float f2 = this.c.toPx-TmRCtEA(v, density0);
        float f3 = this.d.toPx-TmRCtEA(v, density0);
        float f4 = Size.getMinDimension-impl(v);
        float f5 = f + f3;
        if(f5 > f4) {
            float f6 = f4 / f5;
            f *= f6;
            f3 *= f6;
        }
        float f7 = f1 + f2;
        if(f7 > f4) {
            float f8 = f4 / f7;
            f1 *= f8;
            f2 *= f8;
        }
        if(f < 0.0f || f1 < 0.0f || f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can\'t be negative(topStart = " + f + ", topEnd = " + f1 + ", bottomEnd = " + f2 + ", bottomStart = " + f3 + ")!").toString());
        }
        return this.createOutline-LjSzlW0(v, f, f1, f2, f3, layoutDirection0);
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.c;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.d;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.b;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.a;
    }
}

