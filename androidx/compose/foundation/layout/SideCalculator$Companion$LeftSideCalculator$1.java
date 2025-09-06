package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u001A\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\"\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u000FH\u0016J\u0010\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0003H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "motionOf", "x", "y", "valueOf", "insets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SideCalculator.Companion.LeftSideCalculator.1 implements SideCalculator {
    @Override  // androidx.compose.foundation.layout.SideCalculator
    @NotNull
    public Insets adjustInsets(@NotNull Insets insets0, int v) {
        return Insets.of(v, insets0.top, insets0.right, insets0.bottom);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public long consumedOffsets-MK-Hz9U(long v) {
        return OffsetKt.Offset(Offset.getX-impl(v), 0.0f);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public long consumedVelocity-QWom1Mo(long v, float f) {
        return VelocityKt.Velocity(Velocity.getX-impl(v) - f, 0.0f);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public float motionOf(float f, float f1) {
        return f;
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public int valueOf(@NotNull Insets insets0) {
        return insets0.left;
    }
}

