package p0;

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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.q;

public final class b implements MeasurePolicy {
    public final int a;
    public static final b b;
    public static final b c;
    public static final b d;

    static {
        b.b = new b(0);
        b.c = new b(1);
        b.d = new b(2);
    }

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v28;
        int v25;
        int v23;
        Object object2;
        Integer integer0;
        Object object0;
        switch(this.a) {
            case 0: {
                int v16 = list0.size();
                int v17 = 0;
                for(int v18 = 0; true; ++v18) {
                    object0 = null;
                    integer0 = null;
                    if(v18 >= v16) {
                        break;
                    }
                    Object object1 = list0.get(v18);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "title")) {
                        object0 = object1;
                        break;
                    }
                }
                Placeable placeable2 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                int v19 = list0.size();
                for(int v20 = 0; true; ++v20) {
                    object2 = null;
                    if(v20 >= v19) {
                        break;
                    }
                    Object object3 = list0.get(v20);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object3)), "text")) {
                        object2 = object3;
                        break;
                    }
                }
                Placeable placeable3 = ((Measurable)object2) == null ? null : ((Measurable)object2).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                int v21 = Math.max((placeable2 == null ? 0 : placeable2.getWidth()), (placeable3 == null ? 0 : placeable3.getWidth()));
                if(placeable2 == null) {
                    v23 = 0;
                }
                else {
                    int v22 = placeable2.get(AlignmentLineKt.getFirstBaseline());
                    Integer integer1 = v22 == 0x80000000 ? null : v22;
                    v23 = integer1 == null ? 0 : ((int)integer1);
                }
                if(placeable2 == null) {
                    v25 = 0;
                }
                else {
                    int v24 = placeable2.get(AlignmentLineKt.getLastBaseline());
                    Integer integer2 = v24 == 0x80000000 ? null : v24;
                    v25 = integer2 == null ? 0 : ((int)integer2);
                }
                int v26 = measureScope0.roundToPx--R2X_6o(0L) - v23;
                if(placeable3 == null) {
                    v28 = 0;
                }
                else {
                    int v27 = placeable3.get(AlignmentLineKt.getFirstBaseline());
                    if(v27 != 0x80000000) {
                        integer0 = v27;
                    }
                    v28 = integer0 == null ? 0 : ((int)integer0);
                }
                int v29 = measureScope0.roundToPx--R2X_6o(0L);
                int v30 = placeable2 == null ? 0 : placeable2.getHeight() + v26;
                int v31 = placeable2 == null ? v29 - v28 : (v25 == 0 ? v30 - v28 : v26 + v25 - v28) + v29;
                if(placeable3 != null) {
                    if(v25 == 0) {
                        return MeasureScope.layout$default(measureScope0, v21, v30 + (placeable3.getHeight() + v29 - v28), null, new a(placeable2, v26, placeable3, v31), 4, null);
                    }
                    int v32 = placeable3.getHeight();
                    if(placeable2 != null) {
                        v17 = placeable2.getHeight();
                    }
                    v17 = v32 + v29 - v28 - (v17 - v25);
                }
                return MeasureScope.layout$default(measureScope0, v21, v30 + v17, null, new a(placeable2, v26, placeable3, v31), 4, null);
            }
            case 1: {
                int v33 = list0.size();
                for(int v34 = 0; v34 < v33; ++v34) {
                    Measurable measurable2 = (Measurable)list0.get(v34);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "badge")) {
                        Placeable placeable4 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null));
                        int v35 = list0.size();
                        for(int v36 = 0; v36 < v35; ++v36) {
                            Measurable measurable3 = (Measurable)list0.get(v36);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "anchor")) {
                                Placeable placeable5 = measurable3.measure-BRTryo0(v);
                                int v37 = placeable5.get(AlignmentLineKt.getFirstBaseline());
                                int v38 = placeable5.get(AlignmentLineKt.getLastBaseline());
                                return measureScope0.layout(placeable5.getWidth(), placeable5.getHeight(), x.mapOf(new Pair[]{TuplesKt.to(AlignmentLineKt.getFirstBaseline(), v37), TuplesKt.to(AlignmentLineKt.getLastBaseline(), v38)}), new a1(placeable4, measureScope0, placeable5));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            case 2: {
                if(list0.size() != 1) {
                    throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
                }
                Placeable placeable6 = ((Measurable)CollectionsKt___CollectionsKt.first(list0)).measure-BRTryo0(v);
                int v39 = placeable6.get(AlignmentLineKt.getFirstBaseline());
                int v40 = placeable6.get(AlignmentLineKt.getLastBaseline());
                if(v39 == 0x80000000 || v40 == 0x80000000) {
                    throw new IllegalArgumentException("No baselines for text");
                }
                int v41 = Math.max(measureScope0.roundToPx-0680j_4((v39 == v40 ? 48.0f : 68.0f)), placeable6.getHeight());
                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), v41, null, new h9(placeable6, v41), 4, null);
            }
            default: {
                int v1 = list0.size();
                int v2 = 0;
                for(int v3 = 0; v3 < v1; ++v3) {
                    Measurable measurable0 = (Measurable)list0.get(v3);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "action")) {
                        Placeable placeable0 = measurable0.measure-BRTryo0(v);
                        int v4 = c.coerceAtLeast(Constraints.getMaxWidth-impl(v) - placeable0.getWidth() - measureScope0.roundToPx-0680j_4(8.0f), Constraints.getMinWidth-impl(v));
                        int v5 = list0.size();
                        for(int v6 = 0; v6 < v5; ++v6) {
                            Measurable measurable1 = (Measurable)list0.get(v6);
                            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "text")) {
                                Placeable placeable1 = measurable1.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v4, 0, 0, 9, null));
                                int v7 = placeable1.get(AlignmentLineKt.getFirstBaseline());
                                if(v7 == 0x80000000) {
                                    throw new IllegalArgumentException("No baselines for text");
                                }
                                int v8 = placeable1.get(AlignmentLineKt.getLastBaseline());
                                if(v8 == 0x80000000) {
                                    throw new IllegalArgumentException("No baselines for text");
                                }
                                int v9 = Constraints.getMaxWidth-impl(v);
                                int v10 = placeable0.getWidth();
                                if(v7 == v8) {
                                    int v11 = Math.max(measureScope0.roundToPx-0680j_4(48.0f), placeable0.getHeight());
                                    int v12 = q.A(placeable1, v11, 2);
                                    int v13 = placeable0.get(AlignmentLineKt.getFirstBaseline());
                                    if(v13 != 0x80000000) {
                                        v2 = v7 + v12 - v13;
                                    }
                                    return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), v11, null, new d9(placeable1, v12, placeable0, v9 - v10, v2), 4, null);
                                }
                                int v14 = measureScope0.roundToPx-0680j_4(30.0f) - v7;
                                int v15 = Math.max(measureScope0.roundToPx-0680j_4(68.0f), placeable1.getHeight() + v14);
                                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), v15, null, new d9(placeable1, v14, placeable0, v9 - v10, q.A(placeable0, v15, 2)), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }
}

