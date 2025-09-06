package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003H\u0016JB\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0002\u001A\u00020\r2\u0006\u0010\u0004\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001A\u00020\u0017H\u0016J\b\u0010\u0018\u001A\u00020\u0019H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable;

    public RoundedCornerShape(@NotNull CornerSize cornerSize0, @NotNull CornerSize cornerSize1, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3) {
        super(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    public CornerBasedShape copy(CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3) {
        return this.copy(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @NotNull
    public RoundedCornerShape copy(@NotNull CornerSize cornerSize0, @NotNull CornerSize cornerSize1, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3) {
        return new RoundedCornerShape(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public Outline createOutline-LjSzlW0(long v, float f, float f1, float f2, float f3, @NotNull LayoutDirection layoutDirection0) {
        if(f + f1 + f2 + f3 == 0.0f) {
            return new Rectangle(SizeKt.toRect-uvyYCjk(v));
        }
        Rect rect0 = SizeKt.toRect-uvyYCjk(v);
        long v1 = CornerRadiusKt.CornerRadius$default((layoutDirection0 == LayoutDirection.Ltr ? f : f1), 0.0f, 2, null);
        long v2 = CornerRadiusKt.CornerRadius$default((layoutDirection0 == LayoutDirection.Ltr ? f1 : f), 0.0f, 2, null);
        long v3 = CornerRadiusKt.CornerRadius$default((layoutDirection0 == LayoutDirection.Ltr ? f2 : f3), 0.0f, 2, null);
        return layoutDirection0 == LayoutDirection.Ltr ? new Rounded(RoundRectKt.RoundRect-ZAM2FJo(rect0, v1, v2, v3, CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, null))) : new Rounded(RoundRectKt.RoundRect-ZAM2FJo(rect0, v1, v2, v3, CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null)));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RoundedCornerShape)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTopStart(), ((RoundedCornerShape)object0).getTopStart())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTopEnd(), ((RoundedCornerShape)object0).getTopEnd())) {
            return false;
        }
        return Intrinsics.areEqual(this.getBottomEnd(), ((RoundedCornerShape)object0).getBottomEnd()) ? Intrinsics.areEqual(this.getBottomStart(), ((RoundedCornerShape)object0).getBottomStart()) : false;
    }

    @Override
    public int hashCode() {
        return this.getBottomStart().hashCode() + (this.getBottomEnd().hashCode() + (this.getTopEnd().hashCode() + this.getTopStart().hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RoundedCornerShape(topStart = " + this.getTopStart() + ", topEnd = " + this.getTopEnd() + ", bottomEnd = " + this.getBottomEnd() + ", bottomStart = " + this.getBottomStart() + ')';
    }
}

