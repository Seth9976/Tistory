package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import j0.j2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.text.q;
import zd.c;

public final class yk implements MeasurePolicy {
    public final int a;
    public final Object b;

    public yk(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        switch(this.a) {
            case 0: {
                int v1 = list0.size();
                for(int v3 = 0; v3 < v1; ++v3) {
                    Measurable measurable0 = (Measurable)list0.get(v3);
                    if(LayoutIdKt.getLayoutId(measurable0) == fi.b) {
                        Placeable placeable0 = measurable0.measure-BRTryo0(v);
                        int v4 = list0.size();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            Measurable measurable1 = (Measurable)list0.get(v5);
                            if(LayoutIdKt.getLayoutId(measurable1) == fi.a) {
                                Placeable placeable1 = measurable1.measure-BRTryo0(v);
                                int v6 = list0.size();
                                for(int v2 = 0; v2 < v6; ++v2) {
                                    Measurable measurable2 = (Measurable)list0.get(v2);
                                    if(LayoutIdKt.getLayoutId(measurable2) == fi.c) {
                                        Placeable placeable2 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U$default(v, -(placeable1.getWidth() + placeable0.getWidth()) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int v7 = placeable2.getWidth() + (placeable1.getWidth() + placeable0.getWidth()) / 2;
                                        int v8 = Math.max(placeable2.getHeight(), Math.max(placeable0.getHeight(), placeable1.getHeight()));
                                        ((RangeSliderState)this.b).setTrackHeight$material3_release(((float)placeable2.getHeight()));
                                        ((RangeSliderState)this.b).setTotalWidth$material3_release(v7);
                                        ((RangeSliderState)this.b).updateMinMaxPx$material3_release();
                                        int v9 = c.roundToInt(((RangeSliderState)this.b).getCoercedActiveRangeStartAsFraction$material3_release() * ((float)placeable2.getWidth()));
                                        int v10 = q.d(placeable1, placeable0.getWidth(), 2);
                                        int v11 = c.roundToInt(((RangeSliderState)this.b).getCoercedActiveRangeEndAsFraction$material3_release() * ((float)placeable2.getWidth()) + ((float)v10));
                                        return MeasureScope.layout$default(measureScope0, v7, v8, null, new xk(placeable0.getWidth() / 2, q.A(placeable2, v8, 2), v9, q.A(placeable0, v8, 2), v11, q.A(placeable1, v8, 2), placeable2, placeable0, placeable1), 4, null);
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
            case 1: {
                int v12 = list0.size();
                for(int v14 = 0; v14 < v12; ++v14) {
                    Measurable measurable3 = (Measurable)list0.get(v14);
                    if(LayoutIdKt.getLayoutId(measurable3) == lk.a) {
                        Placeable placeable3 = measurable3.measure-BRTryo0(v);
                        int v15 = list0.size();
                        for(int v13 = 0; v13 < v15; ++v13) {
                            Measurable measurable4 = (Measurable)list0.get(v13);
                            if(LayoutIdKt.getLayoutId(measurable4) == lk.b) {
                                Placeable placeable4 = measurable4.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U$default(v, -placeable3.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                int v16 = placeable4.getWidth() + placeable3.getWidth();
                                int v17 = Math.max(placeable4.getHeight(), placeable3.getHeight());
                                ((SliderState)this.b).updateDimensions$material3_release(((float)placeable4.getHeight()), v16);
                                int v18 = c.roundToInt(((SliderState)this.b).getCoercedValueAsFraction$material3_release() * ((float)placeable4.getWidth()));
                                return MeasureScope.layout$default(measureScope0, v16, v17, null, new dl(placeable4, placeable3.getWidth() / 2, q.A(placeable4, v17, 2), placeable3, v18, q.A(placeable3, v17, 2)), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            default: {
                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new j2(list0, this), 4, null);
            }
        }
    }
}

