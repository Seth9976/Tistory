package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldImplKt;
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

public final class k6 implements MeasurePolicy {
    public final Function1 a;
    public final boolean b;
    public final float c;
    public final PaddingValues d;

    public k6(Function1 function10, boolean z, float f, PaddingValues paddingValues0) {
        this.a = function10;
        this.b = z;
        this.c = f;
        this.d = paddingValues0;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        Object object5;
        int v8;
        Object object3;
        int v5;
        int v4;
        Object object1;
        Object object0;
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            object0 = null;
            object1 = null;
            if(v3 >= v1) {
                break;
            }
            Object object2 = list0.get(v3);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object2)), "Leading")) {
                object0 = object2;
                break;
            }
        }
        if(((IntrinsicMeasurable)object0) == null) {
            v4 = v;
            v5 = 0;
        }
        else {
            v4 = v - ((IntrinsicMeasurable)object0).maxIntrinsicWidth(0x7FFFFFFF);
            v5 = ((Number)function20.invoke(((IntrinsicMeasurable)object0), v)).intValue();
        }
        int v6 = list0.size();
        for(int v7 = 0; true; ++v7) {
            object3 = null;
            if(v7 >= v6) {
                break;
            }
            Object object4 = list0.get(v7);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object4)), "Trailing")) {
                object3 = object4;
                break;
            }
        }
        if(((IntrinsicMeasurable)object3) == null) {
            v8 = 0;
        }
        else {
            v4 -= ((IntrinsicMeasurable)object3).maxIntrinsicWidth(0x7FFFFFFF);
            v8 = ((Number)function20.invoke(((IntrinsicMeasurable)object3), v)).intValue();
        }
        int v9 = list0.size();
        for(int v10 = 0; true; ++v10) {
            object5 = null;
            if(v10 >= v9) {
                break;
            }
            Object object6 = list0.get(v10);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object6)), "Label")) {
                object5 = object6;
                break;
            }
        }
        int v11 = ((IntrinsicMeasurable)object5) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object5), MathHelpersKt.lerp(v4, v, this.c))).intValue();
        int v12 = list0.size();
        for(int v13 = 0; v13 < v12; ++v13) {
            Object object7 = list0.get(v13);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object7)), "TextField")) {
                int v14 = ((Number)function20.invoke(object7, v4)).intValue();
                int v15 = list0.size();
                for(int v16 = 0; v16 < v15; ++v16) {
                    Object object8 = list0.get(v16);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object8)), "Hint")) {
                        object1 = object8;
                        break;
                    }
                }
                if(((IntrinsicMeasurable)object1) != null) {
                    v2 = ((Number)function20.invoke(((IntrinsicMeasurable)object1), v4)).intValue();
                }
                float f = intrinsicMeasureScope0.getDensity();
                return OutlinedTextFieldKt.access$calculateHeight-O3s9Psw(v5, v8, v14, v11, v2, this.c, 0x400200000000L, f, this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
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
                for(int v15 = 0; v15 < v14; ++v15) {
                    Object object8 = list0.get(v15);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object8)), "Hint")) {
                        object2 = object8;
                        break;
                    }
                }
                if(((IntrinsicMeasurable)object2) != null) {
                    v2 = ((Number)function20.invoke(((IntrinsicMeasurable)object2), v)).intValue();
                }
                float f = intrinsicMeasureScope0.getDensity();
                return OutlinedTextFieldKt.access$calculateWidth-O3s9Psw(v13, v10, v4, v7, v2, this.c, 0x400200000000L, f, this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, q2.G);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.b(intrinsicMeasureScope0, list0, v, q2.H);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
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
        int v6 = list0.size();
        for(int v7 = 0; true; ++v7) {
            object2 = null;
            if(v7 >= v6) {
                break;
            }
            Object object3 = list0.get(v7);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object3)), "Trailing")) {
                object2 = object3;
                break;
            }
        }
        Placeable placeable1 = ((Measurable)object2) == null ? null : ((Measurable)object2).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v2, -v5, 0, 2, null));
        int v8 = TextFieldImplKt.widthOrZero(placeable1);
        int v9 = measureScope0.roundToPx-0680j_4(paddingValues0.calculateLeftPadding-u2uoSUM(measureScope0.getLayoutDirection()));
        int v10 = measureScope0.roundToPx-0680j_4(paddingValues0.calculateRightPadding-u2uoSUM(measureScope0.getLayoutDirection()));
        int v11 = -(v8 + v5);
        long v12 = ConstraintsKt.offset-NN6Ew-U(v2, MathHelpersKt.lerp(v11 - (v10 + v9), -(v10 + v9), this.c), -v1);
        int v13 = list0.size();
        for(int v14 = 0; true; ++v14) {
            object4 = null;
            if(v14 >= v13) {
                break;
            }
            Object object5 = list0.get(v14);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object5)), "Label")) {
                object4 = object5;
                break;
            }
        }
        Placeable placeable2 = ((Measurable)object4) == null ? null : ((Measurable)object4).measure-BRTryo0(v12);
        if(placeable2 != null) {
            Size size0 = Size.box-impl(SizeKt.Size(placeable2.getWidth(), placeable2.getHeight()));
            this.a.invoke(size0);
        }
        long v15 = Constraints.copy-Zbe2FdA$default(ConstraintsKt.offset-NN6Ew-U(v, v11, -v1 - Math.max(TextFieldImplKt.heightOrZero(placeable2) / 2, measureScope0.roundToPx-0680j_4(paddingValues0.calculateTopPadding-D9Ej5fM()))), 0, 0, 0, 0, 11, null);
        int v16 = list0.size();
        for(int v17 = 0; v17 < v16; ++v17) {
            Measurable measurable0 = (Measurable)list0.get(v17);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "TextField")) {
                Placeable placeable3 = measurable0.measure-BRTryo0(v15);
                long v18 = Constraints.copy-Zbe2FdA$default(v15, 0, 0, 0, 0, 14, null);
                int v19 = list0.size();
                for(int v20 = 0; true; ++v20) {
                    object6 = null;
                    if(v20 >= v19) {
                        break;
                    }
                    Object object7 = list0.get(v20);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object7)), "Hint")) {
                        object6 = object7;
                        break;
                    }
                }
                Placeable placeable4 = ((Measurable)object6) == null ? null : ((Measurable)object6).measure-BRTryo0(v18);
                int v21 = TextFieldImplKt.widthOrZero(placeable0);
                int v22 = TextFieldImplKt.widthOrZero(placeable1);
                int v23 = TextFieldImplKt.widthOrZero(placeable2);
                int v24 = TextFieldImplKt.widthOrZero(placeable4);
                float f = measureScope0.getDensity();
                int v25 = OutlinedTextFieldKt.access$calculateWidth-O3s9Psw(v21, v22, placeable3.getWidth(), v23, v24, this.c, v, f, this.d);
                int v26 = TextFieldImplKt.heightOrZero(placeable0);
                int v27 = TextFieldImplKt.heightOrZero(placeable1);
                int v28 = TextFieldImplKt.heightOrZero(placeable2);
                int v29 = TextFieldImplKt.heightOrZero(placeable4);
                float f1 = measureScope0.getDensity();
                int v30 = OutlinedTextFieldKt.access$calculateHeight-O3s9Psw(v26, v27, placeable3.getHeight(), v28, v29, this.c, v, f1, this.d);
                int v31 = list0.size();
                for(int v32 = 0; v32 < v31; ++v32) {
                    Measurable measurable1 = (Measurable)list0.get(v32);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable1), "border")) {
                        int v33 = v25 == 0x7FFFFFFF ? 0 : v25;
                        return v30 == 0x7FFFFFFF ? MeasureScope.layout$default(measureScope0, v25, 0x7FFFFFFF, null, new j6(0x7FFFFFFF, v25, placeable0, placeable1, placeable3, placeable2, placeable4, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v33, v25, 0, 0x7FFFFFFF)), this, measureScope0), 4, null) : MeasureScope.layout$default(measureScope0, v25, v30, null, new j6(v30, v25, placeable0, placeable1, placeable3, placeable2, placeable4, measurable1.measure-BRTryo0(ConstraintsKt.Constraints(v33, v25, v30, v30)), this, measureScope0), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, q2.I);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.b(intrinsicMeasureScope0, list0, v, q2.J);
    }
}

