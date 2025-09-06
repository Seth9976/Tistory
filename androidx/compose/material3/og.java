package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zd.c;

public final class og implements MeasurePolicy {
    public final Function0 a;
    public final Function2 b;
    public final boolean c;

    public og(Function0 function00, Function2 function20, boolean z) {
        this.a = function00;
        this.b = function20;
        this.c = z;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Placeable placeable3;
        Object object0;
        float f = ((Number)this.a.invoke()).floatValue();
        long v1 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v2 = list0.size();
        int v3 = 0;
        while(v3 < v2) {
            Measurable measurable0 = (Measurable)list0.get(v3);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "icon")) {
                Placeable placeable0 = measurable0.measure-BRTryo0(v1);
                int v4 = measureScope0.roundToPx-0680j_4(0.0f) + placeable0.getWidth();
                int v5 = c.roundToInt(((float)v4) * f);
                Function2 function20 = this.b;
                int v6 = measureScope0.roundToPx-0680j_4(0.0f) + placeable0.getHeight();
                int v7 = list0.size();
                int v8 = 0;
                while(v8 < v7) {
                    Measurable measurable1 = (Measurable)list0.get(v8);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "indicatorRipple")) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(v4, v6));
                        int v9 = list0.size();
                        for(int v10 = 0; true; ++v10) {
                            object0 = null;
                            if(v10 >= v9) {
                                break;
                            }
                            Object object1 = list0.get(v10);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "indicator")) {
                                object0 = object1;
                                break;
                            }
                        }
                        Placeable placeable2 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(v5, v6));
                        if(function20 == null) {
                            placeable3 = null;
                        }
                        else {
                            int v11 = list0.size();
                            int v12 = 0;
                            while(v12 < v11) {
                                Measurable measurable2 = (Measurable)list0.get(v12);
                                if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                    placeable3 = measurable2.measure-BRTryo0(v1);
                                    goto label_42;
                                }
                                ++v12;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    label_42:
                        if(function20 == null) {
                            return NavigationRailKt.access$placeIcon-X9ElhV4(measureScope0, placeable0, placeable1, placeable2, v);
                        }
                        Intrinsics.checkNotNull(placeable3);
                        return NavigationRailKt.access$placeLabelAndIcon-zUg2_y0(measureScope0, placeable3, placeable0, placeable1, placeable2, v, this.c, f);
                    }
                    ++v8;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            ++v3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

