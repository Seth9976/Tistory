package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class gh implements MeasurePolicy {
    public final Function1 a;
    public final boolean b;
    public final float c;
    public final PaddingValues d;

    public gh(Function1 function10, boolean z, float f, PaddingValues paddingValues0) {
        this.a = function10;
        this.b = z;
        this.c = f;
        this.d = paddingValues0;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        Object object13;
        Object object11;
        int v17;
        Object object8;
        int v13;
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
            v3 = OutlinedTextFieldKt.access$substractConstraintSafely(v, ((IntrinsicMeasurable)object0).maxIntrinsicWidth(0x7FFFFFFF));
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
            v3 = OutlinedTextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object2).maxIntrinsicWidth(0x7FFFFFFF));
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
        int v10 = ((IntrinsicMeasurable)object4) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object4), MathHelpersKt.lerp(v3, v, this.c))).intValue();
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
            v13 = 0;
        }
        else {
            v13 = ((Number)function20.invoke(((IntrinsicMeasurable)object6), v3)).intValue();
            v3 = OutlinedTextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object6).maxIntrinsicWidth(0x7FFFFFFF));
        }
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
        if(((IntrinsicMeasurable)object8) == null) {
            v17 = 0;
        }
        else {
            int v16 = ((Number)function20.invoke(((IntrinsicMeasurable)object8), v3)).intValue();
            v3 = OutlinedTextFieldKt.access$substractConstraintSafely(v3, ((IntrinsicMeasurable)object8).maxIntrinsicWidth(0x7FFFFFFF));
            v17 = v16;
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
                return OutlinedTextFieldKt.access$calculateHeight-mKXJcVc(v4, v7, v13, v17, v20, v10, v23, v26, this.c, 0x400200000000L, f, this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
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
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object7)), "Leading")) {
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
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object9)), "Prefix")) {
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
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object11)), "Suffix")) {
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
                float f = intrinsicMeasureScope0.getDensity();
                return OutlinedTextFieldKt.access$calculateWidth-DHJA7U0(v13, v10, v16, v19, v4, v7, v2, this.c, 0x400200000000L, f, this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, u4.G);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.b(intrinsicMeasureScope0, list0, v, u4.H);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object11;
        Object object9;
        Placeable placeable5;
        Object object8;
        Object object6;
        Object object4;
        Object object2;
        Object object0;
        PaddingValues paddingValues0 = this.d;
        int v1 = measureScope0.roundToPx-0680j_4(paddingValues0.calculateBottomPadding-D9Ej5fM());
        long v2 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            object0 = null;
            if(v4 >= v3) {
                break;
            }
            Object object1 = list0.get(v4);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "Leading")) {
                object0 = object1;
                break;
            }
        }
        Placeable placeable0 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(v2);
        int v5 = TextFieldImplKt.widthOrZero(placeable0);
        int v6 = Math.max(0, TextFieldImplKt.heightOrZero(placeable0));
        int v7 = list0.size();
        for(int v8 = 0; true; ++v8) {
            object2 = null;
            if(v8 >= v7) {
                break;
            }
            Object object3 = list0.get(v8);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object3)), "Trailing")) {
                object2 = object3;
                break;
            }
        }
        Placeable placeable1 = ((Measurable)object2) == null ? null : ((Measurable)object2).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v2, -v5, 0, 2, null));
        int v9 = TextFieldImplKt.widthOrZero(placeable1) + v5;
        int v10 = Math.max(v6, TextFieldImplKt.heightOrZero(placeable1));
        int v11 = list0.size();
        for(int v12 = 0; true; ++v12) {
            object4 = null;
            if(v12 >= v11) {
                break;
            }
            Object object5 = list0.get(v12);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object5)), "Prefix")) {
                object4 = object5;
                break;
            }
        }
        Placeable placeable2 = ((Measurable)object4) == null ? null : ((Measurable)object4).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v2, -v9, 0, 2, null));
        int v13 = TextFieldImplKt.widthOrZero(placeable2) + v9;
        int v14 = Math.max(v10, TextFieldImplKt.heightOrZero(placeable2));
        int v15 = list0.size();
        for(int v16 = 0; true; ++v16) {
            object6 = null;
            if(v16 >= v15) {
                break;
            }
            Object object7 = list0.get(v16);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object7)), "Suffix")) {
                object6 = object7;
                break;
            }
        }
        Placeable placeable3 = ((Measurable)object6) == null ? null : ((Measurable)object6).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v2, -v13, 0, 2, null));
        int v17 = TextFieldImplKt.widthOrZero(placeable3);
        int v18 = Math.max(v14, TextFieldImplKt.heightOrZero(placeable3));
        int v19 = measureScope0.roundToPx-0680j_4(paddingValues0.calculateLeftPadding-u2uoSUM(measureScope0.getLayoutDirection()));
        int v20 = measureScope0.roundToPx-0680j_4(paddingValues0.calculateRightPadding-u2uoSUM(measureScope0.getLayoutDirection()));
        int v21 = -(v17 + v13);
        Placeable placeable4 = placeable3;
        long v22 = ConstraintsKt.offset-NN6Ew-U(v2, MathHelpersKt.lerp(v21 - (v20 + v19), -(v20 + v19), this.c), -v1);
        int v23 = list0.size();
        int v24 = 0;
        while(true) {
            if(v24 >= v23) {
                placeable5 = placeable4;
                object8 = null;
                break;
            }
            object8 = list0.get(v24);
            placeable5 = placeable4;
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object8)), "Label")) {
                break;
            }
            ++v24;
            placeable4 = placeable5;
        }
        Placeable placeable6 = ((Measurable)object8) == null ? null : ((Measurable)object8).measure-BRTryo0(v22);
        Size size0 = Size.box-impl((placeable6 == null ? 0L : SizeKt.Size(placeable6.getWidth(), placeable6.getHeight())));
        this.a.invoke(size0);
        int v25 = list0.size();
        for(int v26 = 0; true; ++v26) {
            object9 = null;
            if(v26 >= v25) {
                break;
            }
            Object object10 = list0.get(v26);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object10)), "Supporting")) {
                object9 = object10;
                break;
            }
        }
        int v27 = ((Measurable)object9) == null ? 0 : ((Measurable)object9).minIntrinsicHeight(Constraints.getMinWidth-impl(v));
        int v28 = Math.max(TextFieldImplKt.heightOrZero(placeable6) / 2, measureScope0.roundToPx-0680j_4(paddingValues0.calculateTopPadding-D9Ej5fM()));
        long v29 = Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U(v, v21, -v1 - v28 - v27), 0, 0, 0, 0, 11, null);
        int v30 = list0.size();
        for(int v31 = 0; v31 < v30; ++v31) {
            Measurable measurable0 = (Measurable)list0.get(v31);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "TextField")) {
                Placeable placeable7 = measurable0.measure-BRTryo0(v29);
                long v32 = Constraints.copy-Zbe2FdA$default(v29, 0, 0, 0, 0, 14, null);
                int v33 = list0.size();
                for(int v34 = 0; true; ++v34) {
                    object11 = null;
                    if(v34 >= v33) {
                        break;
                    }
                    Object object12 = list0.get(v34);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object12)), "Hint")) {
                        object11 = object12;
                        break;
                    }
                }
                Placeable placeable8 = ((Measurable)object11) == null ? null : ((Measurable)object11).measure-BRTryo0(v32);
                int v35 = Math.max(v18, Math.max(TextFieldImplKt.heightOrZero(placeable7), TextFieldImplKt.heightOrZero(placeable8)) + v28 + v1);
                int v36 = TextFieldImplKt.widthOrZero(placeable0);
                int v37 = TextFieldImplKt.widthOrZero(placeable1);
                int v38 = TextFieldImplKt.widthOrZero(placeable2);
                int v39 = TextFieldImplKt.widthOrZero(placeable5);
                int v40 = TextFieldImplKt.widthOrZero(placeable6);
                int v41 = TextFieldImplKt.widthOrZero(placeable8);
                float f = measureScope0.getDensity();
                int v42 = OutlinedTextFieldKt.access$calculateWidth-DHJA7U0(v36, v37, v38, v39, placeable7.getWidth(), v40, v41, this.c, v, f, this.d);
                Placeable placeable9 = ((Measurable)object9) == null ? null : ((Measurable)object9).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U$default(v2, 0, -v35, 1, null), 0, v42, 0, 0, 9, null));
                int v43 = TextFieldImplKt.heightOrZero(placeable9);
                int v44 = TextFieldImplKt.heightOrZero(placeable0);
                int v45 = TextFieldImplKt.heightOrZero(placeable1);
                int v46 = TextFieldImplKt.heightOrZero(placeable2);
                int v47 = TextFieldImplKt.heightOrZero(placeable5);
                int v48 = TextFieldImplKt.heightOrZero(placeable6);
                int v49 = TextFieldImplKt.heightOrZero(placeable8);
                int v50 = TextFieldImplKt.heightOrZero(placeable9);
                float f1 = measureScope0.getDensity();
                int v51 = OutlinedTextFieldKt.access$calculateHeight-mKXJcVc(v44, v45, v46, v47, placeable7.getHeight(), v48, v49, v50, this.c, v, f1, this.d);
                int v52 = v51 - v43;
                int v53 = list0.size();
                for(int v54 = 0; v54 < v53; ++v54) {
                    Measurable measurable1 = (Measurable)list0.get(v54);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "Container")) {
                        int v55 = v42 == 0x7FFFFFFF ? 0 : v42;
                        return v52 == 0x7FFFFFFF ? MeasureScope.layout$default(measureScope0, v42, v51, null, new fh(v51, v42, placeable0, placeable1, placeable2, placeable5, placeable7, placeable6, placeable8, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v55, v42, 0, 0x7FFFFFFF)), placeable9, this, measureScope0), 4, null) : MeasureScope.layout$default(measureScope0, v42, v51, null, new fh(v51, v42, placeable0, placeable1, placeable2, placeable5, placeable7, placeable6, placeable8, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v55, v42, v52, v52)), placeable9, this, measureScope0), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, u4.I);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.b(intrinsicMeasureScope0, list0, v, u4.J);
    }
}

