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

public final class b4 implements MeasurePolicy {
    public final float a;

    public b4(float f) {
        this.a = f;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Measurable measurable0 = (Measurable)list0.get(v3);
            if(LayoutIdKt.getLayoutId(measurable0) == j1.f) {
                Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Measurable measurable1 = (Measurable)list0.get(v5);
                    if(LayoutIdKt.getLayoutId(measurable1) == j1.a) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                        int v6 = list0.size();
                        for(int v7 = 0; v7 < v6; ++v7) {
                            Measurable measurable2 = (Measurable)list0.get(v7);
                            if(LayoutIdKt.getLayoutId(measurable2) == j1.b) {
                                Placeable placeable2 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                                int v8 = list0.size();
                                for(int v9 = 0; v9 < v8; ++v9) {
                                    Measurable measurable3 = (Measurable)list0.get(v9);
                                    if(LayoutIdKt.getLayoutId(measurable3) == j1.e) {
                                        Placeable placeable3 = measurable3.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                                        int v10 = Constraints.getMaxWidth-impl(v) == 0x7FFFFFFF ? Constraints.getMaxWidth-impl(v) : c.coerceAtLeast(Constraints.getMaxWidth-impl(v) - Math.max(placeable0.getWidth(), Math.max(placeable2.getWidth(), placeable3.getWidth()) * 2), 0);
                                        int v11 = list0.size();
                                        for(int v12 = 0; v12 < v11; ++v12) {
                                            Measurable measurable4 = (Measurable)list0.get(v12);
                                            if(LayoutIdKt.getLayoutId(measurable4) == j1.c) {
                                                Placeable placeable4 = measurable4.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v10, 0, 0, 8, null));
                                                int v13 = list0.size();
                                                for(int v14 = 0; v14 < v13; ++v14) {
                                                    Measurable measurable5 = (Measurable)list0.get(v14);
                                                    if(LayoutIdKt.getLayoutId(measurable5) == j1.d) {
                                                        Placeable placeable5 = measurable5.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                                                        int v15 = list0.size();
                                                        for(int v2 = 0; v2 < v15; ++v2) {
                                                            Measurable measurable6 = (Measurable)list0.get(v2);
                                                            if(LayoutIdKt.getLayoutId(measurable6) == j1.g) {
                                                                Placeable placeable6 = measurable6.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                                                                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new a4(measureScope0, placeable0, v, placeable1, placeable2, placeable3, placeable4, this.a, placeable5, placeable6), 4, null);
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
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

