package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zd.c;

public final class km implements MeasurePolicy {
    public final Function0 a;
    public final float b;
    public final float c;
    public final float d;

    public km(Function0 function00, float f, float f1, float f2) {
        this.a = function00;
        this.b = f;
        this.c = f1;
        this.d = f2;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v3);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable0), "icon")) {
                int v4 = intrinsicMeasurable0.maxIntrinsicHeight(v);
                int v5 = list0.size();
                for(int v2 = 0; v2 < v5; ++v2) {
                    IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable1), "label")) {
                        return Math.max(v4, intrinsicMeasurable1.maxIntrinsicHeight(v)) + intrinsicMeasureScope0.roundToPx-0680j_4(this.c * 2.0f);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v3);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable0), "icon")) {
                int v4 = intrinsicMeasurable0.maxIntrinsicWidth(v);
                int v5 = list0.size();
                for(int v2 = 0; v2 < v5; ++v2) {
                    IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable1), "label")) {
                        return v4 + intrinsicMeasurable1.maxIntrinsicWidth(v) + intrinsicMeasureScope0.roundToPx-0680j_4(this.b * 2.0f + this.d);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        float f = ((Number)this.a.invoke()).floatValue();
        long v1 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        float f1 = this.b;
        int v2 = measureScope0.roundToPx-0680j_4(f1 * 2.0f);
        float f2 = this.c;
        long v3 = ConstraintsKt.offset-NN6Ew-U(v1, -v2, -measureScope0.roundToPx-0680j_4(f2 * 2.0f));
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Measurable measurable0 = (Measurable)list0.get(v5);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "icon")) {
                Placeable placeable0 = measurable0.measure-BRTryo0(v3);
                int v6 = list0.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    Measurable measurable1 = (Measurable)list0.get(v7);
                    Measurable measurable2 = measurable1;
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "label")) {
                        Placeable placeable1 = measurable2.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v3, -(measureScope0.roundToPx-0680j_4(this.d) + placeable0.getWidth()), 0, 2, null));
                        int v8 = measureScope0.roundToPx-0680j_4(f1 * 2.0f + this.d) + (placeable1.getWidth() + placeable0.getWidth());
                        int v9 = measureScope0.roundToPx-0680j_4(f2 * 2.0f) + Math.max(placeable0.getHeight(), placeable1.getHeight());
                        int v10 = c.roundToInt(((float)v8) * f);
                        int v11 = list0.size();
                        for(int v12 = 0; v12 < v11; ++v12) {
                            Measurable measurable3 = (Measurable)list0.get(v12);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeable2 = measurable3.measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v1, Constraints.Companion.fixed-JhjzzOo(v8, v9)));
                                int v13 = list0.size();
                                for(int v14 = 0; v14 < v13; ++v14) {
                                    Measurable measurable4 = (Measurable)list0.get(v14);
                                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.access$placeLabelAndStartIcon-nru01g4(measureScope0, placeable1, placeable0, placeable2, measurable4.measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v1, Constraints.Companion.fixed-JhjzzOo(v10, v9))), v, this.d);
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

