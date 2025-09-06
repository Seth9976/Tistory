package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class s0 implements MeasurePolicy {
    public final ScrolledOffset a;
    public final Horizontal b;
    public final Vertical c;
    public final int d;

    public s0(ScrolledOffset scrolledOffset0, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, int v) {
        this.a = scrolledOffset0;
        this.b = arrangement$Horizontal0;
        this.c = arrangement$Vertical0;
        this.d = v;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v10;
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            Measurable measurable0 = (Measurable)list0.get(v3);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "navigationIcon")) {
                Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 14, null));
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Measurable measurable1 = (Measurable)list0.get(v5);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "actionIcons")) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 14, null));
                        int v6 = Constraints.getMaxWidth-impl(v) == 0x7FFFFFFF ? Constraints.getMaxWidth-impl(v) : c.coerceAtLeast(Constraints.getMaxWidth-impl(v) - placeable0.getWidth() - placeable1.getWidth(), 0);
                        int v7 = list0.size();
                        for(int v8 = 0; v8 < v7; ++v8) {
                            Measurable measurable2 = (Measurable)list0.get(v8);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "title")) {
                                Placeable placeable2 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v6, 0, 0, 12, null));
                                int v9 = placeable2.get(AlignmentLineKt.getLastBaseline()) == 0x80000000 ? 0 : placeable2.get(AlignmentLineKt.getLastBaseline());
                                float f = this.a.offset();
                                if(!Float.isNaN(f)) {
                                    v2 = zd.c.roundToInt(f);
                                }
                                if(Constraints.getMaxHeight-impl(v) == 0x7FFFFFFF) {
                                    v10 = Constraints.getMaxHeight-impl(v);
                                    return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), v10, null, new r0(placeable0, v10, placeable2, this.b, v, placeable1, measureScope0, this.c, this.d, v9), 4, null);
                                }
                                v10 = Constraints.getMaxHeight-impl(v) + v2;
                                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), v10, null, new r0(placeable0, v10, placeable2, this.b, v, placeable1, measureScope0, this.c, this.d, v9), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

