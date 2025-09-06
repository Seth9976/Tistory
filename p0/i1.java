package p0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.NavigationRailKt;
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

public final class i1 implements MeasurePolicy {
    public final int a;
    public final Function2 b;
    public final float c;

    public i1(Function2 function20, float f, int v) {
        this.a = v;
        this.b = function20;
        this.c = f;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Placeable placeable3;
        Placeable placeable1;
        if(this.a != 0) {
            int v1 = list0.size();
            int v2 = 0;
            int v3 = 0;
            while(v3 < v1) {
                Measurable measurable0 = (Measurable)list0.get(v3);
                if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "icon")) {
                    Placeable placeable0 = measurable0.measure-BRTryo0(v);
                    Function2 function20 = this.b;
                    if(function20 == null) {
                        placeable1 = null;
                    }
                    else {
                        int v4 = list0.size();
                        while(v2 < v4) {
                            Measurable measurable1 = (Measurable)list0.get(v2);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "label")) {
                                placeable1 = measurable1.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                                goto label_20;
                            }
                            ++v2;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                label_20:
                    if(function20 == null) {
                        return NavigationRailKt.access$placeIcon-3p2s80s(measureScope0, placeable0, v);
                    }
                    Intrinsics.checkNotNull(placeable1);
                    return NavigationRailKt.access$placeLabelAndIcon-DIyivk0(measureScope0, placeable1, placeable0, v, this.c);
                }
                ++v3;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        int v5 = list0.size();
        int v6 = 0;
        int v7 = 0;
        while(v7 < v5) {
            Measurable measurable2 = (Measurable)list0.get(v7);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                Placeable placeable2 = measurable2.measure-BRTryo0(v);
                Function2 function21 = this.b;
                if(function21 == null) {
                    placeable3 = null;
                }
                else {
                    int v8 = list0.size();
                    while(v6 < v8) {
                        Measurable measurable3 = (Measurable)list0.get(v6);
                        if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "label")) {
                            placeable3 = measurable3.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                            goto label_46;
                        }
                        ++v6;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            label_46:
                if(function21 == null) {
                    return BottomNavigationKt.access$placeIcon-3p2s80s(measureScope0, placeable2, v);
                }
                Intrinsics.checkNotNull(placeable3);
                return BottomNavigationKt.access$placeLabelAndIcon-DIyivk0(measureScope0, placeable3, placeable2, v, this.c);
            }
            ++v7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

