package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

public final class i1 implements MeasurePolicy {
    public final MutableFloatState a;
    public final MutableFloatState b;
    public final MutableFloatState c;
    public final MutableFloatState d;

    public i1(MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3) {
        this.a = mutableFloatState0;
        this.b = mutableFloatState1;
        this.c = mutableFloatState2;
        this.d = mutableFloatState3;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Measurable measurable0 = (Measurable)list0.get(v3);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "badge")) {
                Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                int v4 = list0.size();
                for(int v2 = 0; v2 < v4; ++v2) {
                    Measurable measurable1 = (Measurable)list0.get(v2);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "anchor")) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(v);
                        int v5 = placeable1.get(AlignmentLineKt.getFirstBaseline());
                        int v6 = placeable1.get(AlignmentLineKt.getLastBaseline());
                        return measureScope0.layout(placeable1.getWidth(), placeable1.getHeight(), x.mapOf(new Pair[]{TuplesKt.to(AlignmentLineKt.getFirstBaseline(), v5), TuplesKt.to(AlignmentLineKt.getLastBaseline(), v6)}), new h1(placeable0, measureScope0, placeable1, this.a, this.b, this.c, this.d));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

