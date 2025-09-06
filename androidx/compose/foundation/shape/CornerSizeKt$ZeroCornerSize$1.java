package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\"\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\b\u0010\u000F\u001A\u00020\u0004H\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/shape/CornerSizeKt$ZeroCornerSize$1", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "valueOverride", "", "getValueOverride", "()Ljava/lang/String;", "toPx", "", "shapeSize", "Landroidx/compose/ui/geometry/Size;", "density", "Landroidx/compose/ui/unit/Density;", "toPx-TmRCtEA", "(JLandroidx/compose/ui/unit/Density;)F", "toString", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CornerSizeKt.ZeroCornerSize.1 implements CornerSize, InspectableValue {
    @Override  // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return "ZeroCornerSize";
    }

    @NotNull
    public String getValueOverride() [...] // Inlined contents

    @Override  // androidx.compose.foundation.shape.CornerSize
    public float toPx-TmRCtEA(long v, @NotNull Density density0) {
        return 0.0f;
    }

    @Override
    @NotNull
    public String toString() {
        return "ZeroCornerSize";
    }
}

