package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import zd.c;

public final class rj implements MeasurePolicy {
    public final Animatable a;
    public final MutableWindowInsets b;
    public final MutableState c;
    public final MutableFloatState d;
    public final MutableState e;

    public rj(Animatable animatable0, MutableWindowInsets mutableWindowInsets0, MutableState mutableState0, MutableFloatState mutableFloatState0, MutableState mutableState1) {
        this.a = animatable0;
        this.b = mutableWindowInsets0;
        this.c = mutableState0;
        this.d = mutableFloatState0;
        this.e = mutableState1;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object0;
        float f = ((Number)this.a.getValue()).floatValue();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Measurable measurable0 = (Measurable)list0.get(v2);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "InputField")) {
                int v3 = list0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Measurable measurable1 = (Measurable)list0.get(v4);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "Surface")) {
                        int v5 = list0.size();
                        for(int v6 = 0; true; ++v6) {
                            object0 = null;
                            if(v6 >= v5) {
                                break;
                            }
                            Object object1 = list0.get(v6);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "Content")) {
                                object0 = object1;
                                break;
                            }
                        }
                        int v7 = this.b.getTop(measureScope0);
                        int v8 = measureScope0.roundToPx-0680j_4(0.0f) + v7;
                        int v9 = measureScope0.roundToPx-0680j_4(0.0f);
                        int v10 = ConstraintsKt.constrainWidth-K40F9xA(v, measurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)));
                        int v11 = ConstraintsKt.constrainHeight-K40F9xA(v, measurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(v)));
                        int v12 = c.roundToInt(((float)Constraints.getMaxWidth-impl(v)) * 0.9f);
                        int v13 = c.roundToInt(((float)Constraints.getMaxHeight-impl(v)) * 0.9f);
                        float f1 = SearchBar_androidKt.access$calculatePredictiveBackMultiplier(((BackEventCompat)this.c.getValue()), f, this.d.getFloatValue());
                        int v14 = v8 + v11;
                        int v15 = Constraints.getMaxWidth-impl(v);
                        int v16 = MathHelpersKt.lerp(MathHelpersKt.lerp(v14, v13, f1), Constraints.getMaxHeight-impl(v), f);
                        int v17 = MathHelpersKt.lerp(v8, 0, f);
                        int v18 = MathHelpersKt.lerp(0, v9, f);
                        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.Constraints(MathHelpersKt.lerp(MathHelpersKt.lerp(v10, v12, f1), v15, f), v15, v11, v11));
                        int v19 = placeable0.getWidth();
                        Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(v19, v16 - v17));
                        if(((Measurable)object0) != null) {
                            Placeable placeable2 = ((Measurable)object0).measure-BRTryo0(ConstraintsKt.Constraints(v19, v19, 0, (Constraints.getHasBoundedHeight-impl(v) ? kotlin.ranges.c.coerceAtLeast(Constraints.getMaxHeight-impl(v) - (v14 + v9), 0) : Constraints.getMaxHeight-impl(v))));
                            return MeasureScope.layout$default(measureScope0, v19, v16, null, new qj(measureScope0, v, this.c, f, f1, this.e, v16, placeable1, v17, placeable0, v8, placeable2, v18), 4, null);
                        }
                        return MeasureScope.layout$default(measureScope0, v19, v16, null, new qj(measureScope0, v, this.c, f, f1, this.e, v16, placeable1, v17, placeable0, v8, null, v18), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

