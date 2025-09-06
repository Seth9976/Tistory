package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class uo implements MeasurePolicy {
    public final boolean a;
    public final float b;
    public final PaddingValues c;

    public uo(boolean z, float f, PaddingValues paddingValues0) {
        this.a = z;
        this.b = f;
        this.c = paddingValues0;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        Object object13;
        Object object11;
        int v17;
        Object object8;
        int v14;
        Object object6;
        Object object4;
        int v7;
        Object object2;
        int v4;
        int v3;
        Object object0;
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            if(v2 >= v1) {
                break;
            }
            Object object1 = list0.get(v2);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object1)), "Leading")) {
                object0 = object1;
                break;
            }
        }
        if(((IntrinsicMeasurable)object0) == null) {
            v3 = v;
            v4 = 0;
        }
        else {
            v3 = TextFieldKt.access$substractConstraintSafely(v, ((IntrinsicMeasurable)object0).maxIntrinsicWidth(0x7FFFFFFF));
            v4 = ((Number)function20.invoke(((IntrinsicMeasurable)object0), v)).intValue();
        }
        int v5 = list0.size();
        for(int v6 = 0; true; ++v6) {
            object2 = null;
            if(v6 >= v5) {
                break;
            }
            Object object3 = list0.get(v6);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object3)), "Trailing")) {
                object2 = object3;
                break;
            }
        }
        if(((IntrinsicMeasurable)object2) == null) {
            v7 = 0;
        }
        else {
            v3 = TextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object2).maxIntrinsicWidth(0x7FFFFFFF));
            v7 = ((Number)function20.invoke(((IntrinsicMeasurable)object2), v)).intValue();
        }
        int v8 = list0.size();
        for(int v9 = 0; true; ++v9) {
            object4 = null;
            if(v9 >= v8) {
                break;
            }
            Object object5 = list0.get(v9);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object5)), "Label")) {
                object4 = object5;
                break;
            }
        }
        int v10 = ((IntrinsicMeasurable)object4) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object4), v3)).intValue();
        int v11 = list0.size();
        for(int v12 = 0; true; ++v12) {
            object6 = null;
            if(v12 >= v11) {
                break;
            }
            Object object7 = list0.get(v12);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object7)), "Prefix")) {
                object6 = object7;
                break;
            }
        }
        if(((IntrinsicMeasurable)object6) == null) {
            v14 = 0;
        }
        else {
            int v13 = ((Number)function20.invoke(((IntrinsicMeasurable)object6), v3)).intValue();
            v3 = TextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object6).maxIntrinsicWidth(0x7FFFFFFF));
            v14 = v13;
        }
        int v15 = list0.size();
        for(int v16 = 0; true; ++v16) {
            object8 = null;
            if(v16 >= v15) {
                break;
            }
            Object object9 = list0.get(v16);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object9)), "Suffix")) {
                object8 = object9;
                break;
            }
        }
        if(((IntrinsicMeasurable)object8) == null) {
            v17 = 0;
        }
        else {
            v17 = ((Number)function20.invoke(((IntrinsicMeasurable)object8), v3)).intValue();
            v3 = TextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object8).maxIntrinsicWidth(0x7FFFFFFF));
        }
        int v18 = list0.size();
        for(int v19 = 0; v19 < v18; ++v19) {
            Object object10 = list0.get(v19);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object10)), "TextField")) {
                int v20 = ((Number)function20.invoke(object10, v3)).intValue();
                int v21 = list0.size();
                for(int v22 = 0; true; ++v22) {
                    object11 = null;
                    if(v22 >= v21) {
                        break;
                    }
                    Object object12 = list0.get(v22);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object12)), "Hint")) {
                        object11 = object12;
                        break;
                    }
                }
                int v23 = ((IntrinsicMeasurable)object11) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object11), v3)).intValue();
                int v24 = list0.size();
                for(int v25 = 0; true; ++v25) {
                    object13 = null;
                    if(v25 >= v24) {
                        break;
                    }
                    Object object14 = list0.get(v25);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object14)), "Supporting")) {
                        object13 = object14;
                        break;
                    }
                }
                int v26 = ((IntrinsicMeasurable)object13) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object13), v)).intValue();
                float f = intrinsicMeasureScope0.getDensity();
                return TextFieldKt.access$calculateHeight-mKXJcVc(v20, v10, v4, v7, v14, v17, v23, v26, this.b, 0x400200000000L, f, this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static int b(List list0, int v, Function2 function20) {
        Object object10;
        Object object8;
        Object object6;
        Object object4;
        Object object2;
        Object object1;
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = list0.get(v3);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object0)), "TextField")) {
                int v4 = ((Number)function20.invoke(object0, v)).intValue();
                int v5 = list0.size();
                for(int v6 = 0; true; ++v6) {
                    object1 = null;
                    object2 = null;
                    if(v6 >= v5) {
                        break;
                    }
                    Object object3 = list0.get(v6);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object3)), "Label")) {
                        object1 = object3;
                        break;
                    }
                }
                int v7 = ((IntrinsicMeasurable)object1) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object1), v)).intValue();
                int v8 = list0.size();
                for(int v9 = 0; true; ++v9) {
                    object4 = null;
                    if(v9 >= v8) {
                        break;
                    }
                    Object object5 = list0.get(v9);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object5)), "Trailing")) {
                        object4 = object5;
                        break;
                    }
                }
                int v10 = ((IntrinsicMeasurable)object4) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object4), v)).intValue();
                int v11 = list0.size();
                for(int v12 = 0; true; ++v12) {
                    object6 = null;
                    if(v12 >= v11) {
                        break;
                    }
                    Object object7 = list0.get(v12);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object7)), "Prefix")) {
                        object6 = object7;
                        break;
                    }
                }
                int v13 = ((IntrinsicMeasurable)object6) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object6), v)).intValue();
                int v14 = list0.size();
                for(int v15 = 0; true; ++v15) {
                    object8 = null;
                    if(v15 >= v14) {
                        break;
                    }
                    Object object9 = list0.get(v15);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object9)), "Suffix")) {
                        object8 = object9;
                        break;
                    }
                }
                int v16 = ((IntrinsicMeasurable)object8) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object8), v)).intValue();
                int v17 = list0.size();
                for(int v18 = 0; true; ++v18) {
                    object10 = null;
                    if(v18 >= v17) {
                        break;
                    }
                    Object object11 = list0.get(v18);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object11)), "Leading")) {
                        object10 = object11;
                        break;
                    }
                }
                int v19 = ((IntrinsicMeasurable)object10) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object10), v)).intValue();
                int v20 = list0.size();
                for(int v21 = 0; v21 < v20; ++v21) {
                    Object object12 = list0.get(v21);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object12)), "Hint")) {
                        object2 = object12;
                        break;
                    }
                }
                if(((IntrinsicMeasurable)object2) != null) {
                    v2 = ((Number)function20.invoke(((IntrinsicMeasurable)object2), v)).intValue();
                }
                return TextFieldKt.access$calculateWidth-yeHjK3Y(v19, v10, v13, v16, v4, v7, v2, 0x400200000000L);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, u4.K);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return uo.b(list0, v, u4.L);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object13;
        Object object11;
        Object object8;
        Object object6;
        Object object4;
        Object object2;
        Object object0;
        int v1 = measureScope0.roundToPx-0680j_4(this.c.calculateTopPadding-D9Ej5fM());
        int v2 = measureScope0.roundToPx-0680j_4(this.c.calculateBottomPadding-D9Ej5fM());
        long v3 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v4 = list0.size();
        for(int v5 = 0; true; ++v5) {
            object0 = null;
            if(v5 >= v4) {
                break;
            }
            Object object1 = list0.get(v5);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "Leading")) {
                object0 = object1;
                break;
            }
        }
        Placeable placeable0 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(v3);
        int v6 = TextFieldImplKt.widthOrZero(placeable0);
        int v7 = Math.max(0, TextFieldImplKt.heightOrZero(placeable0));
        int v8 = list0.size();
        for(int v9 = 0; true; ++v9) {
            object2 = null;
            if(v9 >= v8) {
                break;
            }
            Object object3 = list0.get(v9);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object3)), "Trailing")) {
                object2 = object3;
                break;
            }
        }
        Placeable placeable1 = ((Measurable)object2) == null ? null : ((Measurable)object2).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v3, -v6, 0, 2, null));
        int v10 = TextFieldImplKt.widthOrZero(placeable1) + v6;
        int v11 = Math.max(v7, TextFieldImplKt.heightOrZero(placeable1));
        int v12 = list0.size();
        for(int v13 = 0; true; ++v13) {
            object4 = null;
            if(v13 >= v12) {
                break;
            }
            Object object5 = list0.get(v13);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object5)), "Prefix")) {
                object4 = object5;
                break;
            }
        }
        Placeable placeable2 = ((Measurable)object4) == null ? null : ((Measurable)object4).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v3, -v10, 0, 2, null));
        int v14 = TextFieldImplKt.widthOrZero(placeable2) + v10;
        int v15 = Math.max(v11, TextFieldImplKt.heightOrZero(placeable2));
        int v16 = list0.size();
        for(int v17 = 0; true; ++v17) {
            object6 = null;
            if(v17 >= v16) {
                break;
            }
            Object object7 = list0.get(v17);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object7)), "Suffix")) {
                object6 = object7;
                break;
            }
        }
        Placeable placeable3 = ((Measurable)object6) == null ? null : ((Measurable)object6).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v3, -v14, 0, 2, null));
        int v18 = TextFieldImplKt.widthOrZero(placeable3);
        int v19 = Math.max(v15, TextFieldImplKt.heightOrZero(placeable3));
        int v20 = -(v18 + v14);
        long v21 = ConstraintsKt.offset-NN6Ew-U(v3, v20, -v2);
        int v22 = list0.size();
        for(int v23 = 0; true; ++v23) {
            object8 = null;
            if(v23 >= v22) {
                break;
            }
            Object object9 = list0.get(v23);
            Object object10 = object9;
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object9)), "Label")) {
                object8 = object10;
                break;
            }
        }
        Placeable placeable4 = ((Measurable)object8) == null ? null : ((Measurable)object8).measure-BRTryo0(v21);
        int v24 = list0.size();
        for(int v25 = 0; true; ++v25) {
            object11 = null;
            if(v25 >= v24) {
                break;
            }
            Object object12 = list0.get(v25);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object12)), "Supporting")) {
                object11 = object12;
                break;
            }
        }
        int v26 = ((Measurable)object11) == null ? 0 : ((Measurable)object11).minIntrinsicHeight(Constraints.getMinWidth-impl(v));
        int v27 = TextFieldImplKt.heightOrZero(placeable4) + v1;
        long v28 = ConstraintsKt.offset-NN6Ew-U(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null), v20, -v27 - v2 - v26);
        int v29 = list0.size();
        for(int v30 = 0; v30 < v29; ++v30) {
            Measurable measurable0 = (Measurable)list0.get(v30);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "TextField")) {
                Placeable placeable5 = measurable0.measure-BRTryo0(v28);
                long v31 = Constraints.copy-Zbe2FdA$default(v28, 0, 0, 0, 0, 14, null);
                int v32 = list0.size();
                for(int v33 = 0; true; ++v33) {
                    object13 = null;
                    if(v33 >= v32) {
                        break;
                    }
                    Object object14 = list0.get(v33);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object14)), "Hint")) {
                        object13 = object14;
                        break;
                    }
                }
                Placeable placeable6 = ((Measurable)object13) == null ? null : ((Measurable)object13).measure-BRTryo0(v31);
                int v34 = Math.max(v19, Math.max(TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeable6)) + v27 + v2);
                int v35 = TextFieldKt.access$calculateWidth-yeHjK3Y(TextFieldImplKt.widthOrZero(placeable0), TextFieldImplKt.widthOrZero(placeable1), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable3), placeable5.getWidth(), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable6), v);
                Placeable placeable7 = ((Measurable)object11) == null ? null : ((Measurable)object11).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U$default(v3, 0, -v34, 1, null), 0, v35, 0, 0, 9, null));
                int v36 = TextFieldImplKt.heightOrZero(placeable7);
                int v37 = TextFieldImplKt.heightOrZero(placeable4);
                int v38 = TextFieldImplKt.heightOrZero(placeable0);
                int v39 = TextFieldImplKt.heightOrZero(placeable1);
                int v40 = TextFieldImplKt.heightOrZero(placeable2);
                int v41 = TextFieldImplKt.heightOrZero(placeable3);
                int v42 = TextFieldImplKt.heightOrZero(placeable6);
                int v43 = TextFieldImplKt.heightOrZero(placeable7);
                float f = measureScope0.getDensity();
                int v44 = TextFieldKt.access$calculateHeight-mKXJcVc(placeable5.getHeight(), v37, v38, v39, v40, v41, v42, v43, this.b, v, f, this.c);
                int v45 = v44 - v36;
                int v46 = list0.size();
                for(int v47 = 0; v47 < v46; ++v47) {
                    Measurable measurable1 = (Measurable)list0.get(v47);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "Container")) {
                        int v48 = v35 == 0x7FFFFFFF ? 0 : v35;
                        return v45 == 0x7FFFFFFF ? MeasureScope.layout$default(measureScope0, v35, v44, null, new to(placeable4, v35, v44, placeable5, placeable6, placeable0, placeable1, placeable2, placeable3, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v48, v35, 0, 0x7FFFFFFF)), placeable7, this, v1, measureScope0), 4, null) : MeasureScope.layout$default(measureScope0, v35, v44, null, new to(placeable4, v35, v44, placeable5, placeable6, placeable0, placeable1, placeable2, placeable3, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v48, v35, v45, v45)), placeable7, this, v1, measureScope0), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, u4.M);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return uo.b(list0, v, u4.N);
    }
}

