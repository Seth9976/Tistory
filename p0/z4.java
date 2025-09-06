package p0;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

public final class z4 implements MeasurePolicy {
    public final float a;

    public z4(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Placeable placeable0 = ((Measurable)list0.get(0)).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
        int v1 = placeable0.get(AlignmentLineKt.getFirstBaseline());
        if(v1 != 0x80000000) {
            int v2 = measureScope0.roundToPx-0680j_4(this.a) - v1;
            return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), Math.max(Constraints.getMinHeight-impl(v), placeable0.getHeight() + v2), null, new y4(placeable0, v2), 4, null);
        }
        int v3 = Math.max(Constraints.getMinHeight-impl(v), placeable0.getHeight());
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), v3, null, new y4(placeable0, IntOffset.getY-impl(Alignment.Companion.getCenter().align-KFBX0sM(0L, IntSizeKt.IntSize(0, v3 - placeable0.getHeight()), layoutDirection0))), 4, null);
    }
}

