package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016J,\u0010\u0004\u001A\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\nH\u0016¨\u0006\u000E"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$SpaceAround$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Arrangement.Absolute.SpaceAround.1 implements Horizontal {
    @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
    public void arrange(@NotNull Density density0, int v, @NotNull int[] arr_v, @NotNull LayoutDirection layoutDirection0, @NotNull int[] arr_v1) {
        Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(v, arr_v, arr_v1, false);
    }

    @Override
    @NotNull
    public String toString() {
        return "AbsoluteArrangement#SpaceAround";
    }
}

