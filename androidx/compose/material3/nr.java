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

public final class nr implements MeasurePolicy {
    public final boolean a;
    public final Function0 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public nr(boolean z, Function0 function00, float f, float f1, float f2, float f3) {
        this.a = z;
        this.b = function00;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        Object object0;
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v3);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable0), "icon")) {
                int v4 = intrinsicMeasurable0.maxIntrinsicHeight(v);
                int v5 = list0.size();
                for(int v6 = 0; true; ++v6) {
                    object0 = null;
                    if(v6 >= v5) {
                        break;
                    }
                    Object object1 = list0.get(v6);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object1)), "label")) {
                        object0 = object1;
                        break;
                    }
                }
                if(((IntrinsicMeasurable)object0) != null) {
                    v2 = ((IntrinsicMeasurable)object0).maxIntrinsicHeight(v);
                }
                return v4 + v2 + intrinsicMeasureScope0.roundToPx-0680j_4(this.d * 2.0f + this.f * 2.0f + this.e);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        float f = ((Number)this.b.invoke()).floatValue();
        long v1 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Measurable measurable0 = (Measurable)list0.get(v4);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "icon")) {
                Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v1, -measureScope0.roundToPx-0680j_4(this.c * 2.0f), -measureScope0.roundToPx-0680j_4(this.d * 2.0f)));
                int v5 = measureScope0.roundToPx-0680j_4(this.c * 2.0f) + placeable0.getWidth();
                int v6 = measureScope0.roundToPx-0680j_4(this.d * 2.0f) + placeable0.getHeight();
                int v7 = c.roundToInt(((float)v5) * f);
                int v8 = list0.size();
                for(int v9 = 0; v9 < v8; ++v9) {
                    Measurable measurable1 = (Measurable)list0.get(v9);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "indicatorRipple")) {
                        Placeable placeable1 = measurable1.measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v1, Constraints.Companion.fixed-JhjzzOo(v5, v6)));
                        int v10 = list0.size();
                        for(int v11 = 0; v11 < v10; ++v11) {
                            Measurable measurable2 = (Measurable)list0.get(v11);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicator")) {
                                Placeable placeable2 = measurable2.measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v1, Constraints.Companion.fixed-JhjzzOo(v7, v6)));
                                if(this.a) {
                                    int v12 = list0.size();
                                    for(int v3 = 0; v3 < v12; ++v3) {
                                        Measurable measurable3 = (Measurable)list0.get(v3);
                                        if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "label")) {
                                            return NavigationItemKt.access$placeLabelAndTopIcon-qoqLrGI(measureScope0, measurable3.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v1, 0, -(measureScope0.roundToPx-0680j_4(this.e) + placeable2.getHeight()), 1, null)), placeable0, placeable1, placeable2, v, this.e, this.d, this.f);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                return NavigationItemKt.access$placeIcon-X9ElhV4(measureScope0, placeable0, placeable1, placeable2, v);
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

