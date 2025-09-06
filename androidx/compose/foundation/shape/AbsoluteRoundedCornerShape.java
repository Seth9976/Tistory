package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0015\u001A\u00020\u00122\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0096\u0002¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020 H\u0016¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/foundation/shape/CornerSize;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "Landroidx/compose/ui/geometry/Size;", "size", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Outline;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "copy", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable;

    public AbsoluteRoundedCornerShape(@NotNull CornerSize cornerSize0, @NotNull CornerSize cornerSize1, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3) {
        super(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @NotNull
    public AbsoluteRoundedCornerShape copy(@NotNull CornerSize cornerSize0, @NotNull CornerSize cornerSize1, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3) {
        return new AbsoluteRoundedCornerShape(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    public CornerBasedShape copy(CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3) {
        return this.copy(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public Outline createOutline-LjSzlW0(long v, float f, float f1, float f2, float f3, @NotNull LayoutDirection layoutDirection0) {
        return f + f1 + f2 + f3 == 0.0f ? new Rectangle(SizeKt.toRect-uvyYCjk(v)) : new Rounded(RoundRectKt.RoundRect-ZAM2FJo(SizeKt.toRect-uvyYCjk(v), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f1, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, null)));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTopStart(), ((AbsoluteRoundedCornerShape)object0).getTopStart())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTopEnd(), ((AbsoluteRoundedCornerShape)object0).getTopEnd())) {
            return false;
        }
        return Intrinsics.areEqual(this.getBottomEnd(), ((AbsoluteRoundedCornerShape)object0).getBottomEnd()) ? Intrinsics.areEqual(this.getBottomStart(), ((AbsoluteRoundedCornerShape)object0).getBottomStart()) : false;
    }

    @Override
    public int hashCode() {
        return this.getBottomStart().hashCode() + (this.getBottomEnd().hashCode() + (this.getTopEnd().hashCode() + this.getTopStart().hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.getTopStart() + ", topRight = " + this.getTopEnd() + ", bottomRight = " + this.getBottomEnd() + ", bottomLeft = " + this.getBottomStart() + ')';
    }
}

