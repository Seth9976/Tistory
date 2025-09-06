package com.kakao.tistory.presentation.widget.common;

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

public final class q4 implements MeasurePolicy {
    public static final q4 a;

    static {
        q4.a = new q4();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Measurable measurable0 = (Measurable)list0.get(v3);
            if(LayoutIdKt.getLayoutId(measurable0) == j1.a) {
                Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Measurable measurable1 = (Measurable)list0.get(v5);
                    if(LayoutIdKt.getLayoutId(measurable1) == j1.b) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                        int v6 = list0.size();
                        for(int v7 = 0; v7 < v6; ++v7) {
                            Measurable measurable2 = (Measurable)list0.get(v7);
                            if(LayoutIdKt.getLayoutId(measurable2) == j1.e) {
                                Placeable placeable2 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                                int v8 = Constraints.getMaxWidth-impl(v) == 0x7FFFFFFF ? Constraints.getMaxWidth-impl(v) : c.coerceAtLeast(Constraints.getMaxWidth-impl(v) - Math.max(placeable1.getWidth(), placeable2.getWidth()) * 2, 0);
                                int v9 = list0.size();
                                for(int v10 = 0; v10 < v9; ++v10) {
                                    Measurable measurable3 = (Measurable)list0.get(v10);
                                    if(LayoutIdKt.getLayoutId(measurable3) == j1.c) {
                                        Placeable placeable3 = measurable3.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v8, 0, 0, 8, null));
                                        int v11 = list0.size();
                                        for(int v2 = 0; v2 < v11; ++v2) {
                                            Measurable measurable4 = (Measurable)list0.get(v2);
                                            if(LayoutIdKt.getLayoutId(measurable4) == j1.g) {
                                                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new p4(placeable0, placeable1, placeable2, v, placeable3, measurable4.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null))), 4, null);
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
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

