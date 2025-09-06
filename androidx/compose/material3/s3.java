package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.q;
import r0.a;

public final class s3 implements MeasurePolicy {
    public final int a;
    public static final s3 b;
    public static final s3 c;
    public static final s3 d;

    static {
        s3.b = new s3(0);
        s3.c = new s3(1);
        s3.d = new s3(2);
    }

    public s3(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object2;
        Placeable placeable0;
        Object object0;
        Object object6;
        Placeable placeable3;
        Object object4;
        switch(this.a) {
            case 0: {
                int v22 = list0.size();
                for(int v24 = 0; true; ++v24) {
                    object4 = null;
                    placeable3 = null;
                    if(v24 >= v22) {
                        break;
                    }
                    Object object5 = list0.get(v24);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object5)), "leadingIcon")) {
                        object4 = object5;
                        break;
                    }
                }
                Placeable placeable4 = ((Measurable)object4) == null ? null : ((Measurable)object4).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                int v25 = TextFieldImplKt.widthOrZero(placeable4);
                int v26 = TextFieldImplKt.heightOrZero(placeable4);
                int v27 = list0.size();
                for(int v28 = 0; true; ++v28) {
                    object6 = null;
                    if(v28 >= v27) {
                        break;
                    }
                    Object object7 = list0.get(v28);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object7)), "trailingIcon")) {
                        object6 = object7;
                        break;
                    }
                }
                if(((Measurable)object6) != null) {
                    placeable3 = ((Measurable)object6).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null));
                }
                int v29 = TextFieldImplKt.widthOrZero(placeable3);
                int v30 = TextFieldImplKt.heightOrZero(placeable3);
                int v31 = list0.size();
                for(int v23 = 0; v23 < v31; ++v23) {
                    Measurable measurable1 = (Measurable)list0.get(v23);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "label")) {
                        Placeable placeable5 = measurable1.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v, -(v25 + v29), 0, 2, null));
                        int v32 = Math.max(v26, Math.max(placeable5.getHeight(), v30));
                        return MeasureScope.layout$default(measureScope0, placeable5.getWidth() + v25 + v29, v32, null, new r3(placeable4, v26, v32, placeable5, v25, placeable3, v30), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            case 1: {
                int v33 = list0.size();
                for(int v34 = 0; v34 < v33; ++v34) {
                    Measurable measurable2 = (Measurable)list0.get(v34);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                        Placeable placeable6 = measurable2.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, measureScope0.roundToPx-0680j_4(0.0f), 0, 0, 12, null));
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        int v35 = list0.size();
                        for(int v36 = 0; v36 < v35; ++v36) {
                            Object object8 = list0.get(v36);
                            if(!Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object8)), "Spacer")) {
                                arrayList0.add(object8);
                            }
                        }
                        ArrayList arrayList1 = new ArrayList(arrayList0.size());
                        int v37 = arrayList0.size();
                        for(int v38 = 0; v38 < v37; v38 = a.f(((Measurable)arrayList0.get(v38)), Constraints.copy-Zbe2FdA$default(v, 0, Constraints.getMaxWidth-impl(v) / 2, 0, 0, 12, null), arrayList1, v38, 1)) {
                        }
                        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new xp(placeable6, arrayList1), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            case 2: {
                int v39 = list0.size();
                for(int v40 = 0; v40 < v39; ++v40) {
                    Measurable measurable3 = (Measurable)list0.get(v40);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Spacer")) {
                        Placeable placeable7 = measurable3.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, measureScope0.roundToPx-0680j_4(0.0f), 3, null));
                        ArrayList arrayList2 = new ArrayList(list0.size());
                        int v41 = list0.size();
                        for(int v42 = 0; v42 < v41; ++v42) {
                            Object object9 = list0.get(v42);
                            if(!Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object9)), "Spacer")) {
                                arrayList2.add(object9);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int v43 = arrayList2.size();
                        for(int v44 = 0; v44 < v43; v44 = a.f(((Measurable)arrayList2.get(v44)), Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, Constraints.getMaxHeight-impl(v) / 2, 3, null), arrayList3, v44, 1)) {
                        }
                        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new rq(placeable7, arrayList3), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            default: {
                int v1 = Math.min(Constraints.getMaxWidth-impl(v), measureScope0.roundToPx-0680j_4(600.0f));
                int v2 = list0.size();
                for(int v3 = 0; true; ++v3) {
                    object0 = null;
                    placeable0 = null;
                    if(v3 >= v2) {
                        break;
                    }
                    Object object1 = list0.get(v3);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "action")) {
                        object0 = object1;
                        break;
                    }
                }
                Placeable placeable1 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(v);
                int v4 = list0.size();
                for(int v5 = 0; true; ++v5) {
                    object2 = null;
                    if(v5 >= v4) {
                        break;
                    }
                    Object object3 = list0.get(v5);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object3)), "dismissAction")) {
                        object2 = object3;
                        break;
                    }
                }
                if(((Measurable)object2) != null) {
                    placeable0 = ((Measurable)object2).measure-BRTryo0(v);
                }
                int v6 = placeable1 == null ? 0 : placeable1.getWidth();
                int v7 = placeable1 == null ? 0 : placeable1.getHeight();
                int v8 = placeable0 == null ? 0 : placeable0.getWidth();
                int v9 = placeable0 == null ? 0 : placeable0.getHeight();
                int v10 = c.coerceAtLeast(v1 - v6 - v8 - (v8 == 0 ? measureScope0.roundToPx-0680j_4(8.0f) : 0), Constraints.getMinWidth-impl(v));
                int v11 = list0.size();
                for(int v12 = 0; v12 < v11; ++v12) {
                    Measurable measurable0 = (Measurable)list0.get(v12);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "text")) {
                        Placeable placeable2 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, v10, 0, 0, 9, null));
                        int v13 = placeable2.get(AlignmentLineKt.getFirstBaseline());
                        int v14 = placeable2.get(AlignmentLineKt.getLastBaseline());
                        if(v13 == v14 || (v13 == 0x80000000 || v14 == 0x80000000)) {
                            int v15 = Math.max(measureScope0.roundToPx-0680j_4(0.0f), Math.max(v7, v9));
                            int v16 = q.A(placeable2, v15, 2);
                            if(placeable1 != null) {
                                int v17 = placeable1.get(AlignmentLineKt.getFirstBaseline());
                                if(v17 != 0x80000000) {
                                    int v18 = v13 + v16 - v17;
                                    return placeable0 == null ? MeasureScope.layout$default(measureScope0, v1, v15, null, new dm(placeable2, v16, null, v1 - v8, 0, placeable1, v1 - v8 - v6, v18), 4, null) : MeasureScope.layout$default(measureScope0, v1, v15, null, new dm(placeable2, v16, placeable0, v1 - v8, q.A(placeable0, v15, 2), placeable1, v1 - v8 - v6, v18), 4, null);
                                }
                            }
                            return placeable0 == null ? MeasureScope.layout$default(measureScope0, v1, v15, null, new dm(placeable2, v16, null, v1 - v8, 0, placeable1, v1 - v8 - v6, 0), 4, null) : MeasureScope.layout$default(measureScope0, v1, v15, null, new dm(placeable2, v16, placeable0, v1 - v8, q.A(placeable0, v15, 2), placeable1, v1 - v8 - v6, 0), 4, null);
                        }
                        int v19 = measureScope0.roundToPx-0680j_4(30.0f) - v13;
                        int v20 = Math.max(measureScope0.roundToPx-0680j_4(0.0f), placeable2.getHeight() + v19);
                        int v21 = placeable1 == null ? 0 : q.A(placeable1, v20, 2);
                        return placeable0 == null ? MeasureScope.layout$default(measureScope0, v1, v20, null, new dm(placeable2, v19, null, v1 - v8, 0, placeable1, v1 - v8 - v6, v21), 4, null) : MeasureScope.layout$default(measureScope0, v1, v20, null, new dm(placeable2, v19, placeable0, v1 - v8, q.A(placeable0, v20, 2), placeable1, v1 - v8 - v6, v21), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }
}

