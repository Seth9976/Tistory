package androidx.compose.material3;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.na;

public final class in implements MeasurePolicy {
    public final int a;
    public final Function2 b;
    public final Function2 c;

    public in(Function2 function20, Function2 function21, int v) {
        this.a = v;
        this.b = function20;
        this.c = function21;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Placeable placeable3;
        Placeable placeable2;
        Placeable placeable1;
        Placeable placeable0;
        int v1 = 0;
        int v2 = 0;
        if(this.a != 0) {
            if(this.b == null) {
                placeable0 = null;
            }
            else {
                int v3 = list0.size();
                int v4 = 0;
                while(v4 < v3) {
                    Measurable measurable0 = (Measurable)list0.get(v4);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "text")) {
                        placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                        goto label_15;
                    }
                    ++v4;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        label_15:
            if(this.c == null) {
                placeable1 = null;
            }
            else {
                int v5 = list0.size();
                int v6 = 0;
                while(v6 < v5) {
                    Measurable measurable1 = (Measurable)list0.get(v6);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "icon")) {
                        placeable1 = measurable1.measure-BRTryo0(v);
                        goto label_27;
                    }
                    ++v6;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        label_27:
            int v7 = placeable0 == null ? 0 : placeable0.getWidth();
            if(placeable1 != null) {
                v2 = placeable1.getWidth();
            }
            int v8 = Math.max(v7, v2);
            int v9 = measureScope0.roundToPx-0680j_4((placeable0 == null || placeable1 == null ? 48.0f : 72.0f));
            Integer integer0 = placeable0 == null ? null : placeable0.get(AlignmentLineKt.getFirstBaseline());
            return placeable0 == null ? MeasureScope.layout$default(measureScope0, v8, v9, null, new na(null, placeable1, measureScope0, v8, v9, integer0, null), 4, null) : MeasureScope.layout$default(measureScope0, v8, v9, null, new na(placeable0, placeable1, measureScope0, v8, v9, integer0, placeable0.get(AlignmentLineKt.getLastBaseline())), 4, null);
        }
        if(this.b == null) {
            placeable2 = null;
        }
        else {
            int v10 = list0.size();
            int v11 = 0;
            while(v11 < v10) {
                Measurable measurable2 = (Measurable)list0.get(v11);
                if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "text")) {
                    placeable2 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                    goto label_46;
                }
                ++v11;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    label_46:
        if(this.c == null) {
            placeable3 = null;
        }
        else {
            int v12 = list0.size();
            int v13 = 0;
            while(v13 < v12) {
                Measurable measurable3 = (Measurable)list0.get(v13);
                if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "icon")) {
                    placeable3 = measurable3.measure-BRTryo0(v);
                    goto label_58;
                }
                ++v13;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    label_58:
        int v14 = Math.max((placeable2 == null ? 0 : placeable2.getWidth()), (placeable3 == null ? 0 : placeable3.getWidth()));
        int v15 = measureScope0.roundToPx-0680j_4(0.0f);
        int v16 = placeable3 == null ? 0 : placeable3.getHeight();
        if(placeable2 != null) {
            v1 = placeable2.getHeight();
        }
        int v17 = Math.max(v15, measureScope0.roundToPx--R2X_6o(0L) + (v16 + v1));
        Integer integer1 = placeable2 == null ? null : placeable2.get(AlignmentLineKt.getFirstBaseline());
        return placeable2 == null ? MeasureScope.layout$default(measureScope0, v14, v17, null, new hn(null, placeable3, measureScope0, v14, v17, integer1, null), 4, null) : MeasureScope.layout$default(measureScope0, v14, v17, null, new hn(placeable2, placeable3, measureScope0, v14, v17, integer1, placeable2.get(AlignmentLineKt.getLastBaseline())), 4, null);
    }
}

