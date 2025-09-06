package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.ui.layout.AlignmentLineKt;
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

public final class pb implements MeasurePolicy {
    public final boolean a;
    public final float b;
    public final PaddingValues c;

    public pb(boolean z, float f, PaddingValues paddingValues0) {
        this.a = z;
        this.b = f;
        this.c = paddingValues0;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        Object object5;
        int v7;
        Object object3;
        int v4;
        int v3;
        Object object1;
        Object object0;
        int v1 = list0.size();
        boolean z = false;
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            object1 = null;
            if(v2 >= v1) {
                break;
            }
            Object object2 = list0.get(v2);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object2)), "Leading")) {
                object0 = object2;
                break;
            }
        }
        if(((IntrinsicMeasurable)object0) == null) {
            v3 = v;
            v4 = 0;
        }
        else {
            v3 = v - ((IntrinsicMeasurable)object0).maxIntrinsicWidth(0x7FFFFFFF);
            v4 = ((Number)function20.invoke(((IntrinsicMeasurable)object0), v)).intValue();
        }
        int v5 = list0.size();
        for(int v6 = 0; true; ++v6) {
            object3 = null;
            if(v6 >= v5) {
                break;
            }
            Object object4 = list0.get(v6);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object4)), "Trailing")) {
                object3 = object4;
                break;
            }
        }
        if(((IntrinsicMeasurable)object3) == null) {
            v7 = 0;
        }
        else {
            v3 -= ((IntrinsicMeasurable)object3).maxIntrinsicWidth(0x7FFFFFFF);
            v7 = ((Number)function20.invoke(((IntrinsicMeasurable)object3), v)).intValue();
        }
        int v8 = list0.size();
        for(int v9 = 0; true; ++v9) {
            object5 = null;
            if(v9 >= v8) {
                break;
            }
            Object object6 = list0.get(v9);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object6)), "Label")) {
                object5 = object6;
                break;
            }
        }
        int v10 = ((IntrinsicMeasurable)object5) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object5), v3)).intValue();
        int v11 = list0.size();
        for(int v12 = 0; v12 < v11; ++v12) {
            Object object7 = list0.get(v12);
            if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object7)), "TextField")) {
                int v13 = ((Number)function20.invoke(object7, v3)).intValue();
                int v14 = list0.size();
                for(int v15 = 0; v15 < v14; ++v15) {
                    Object object8 = list0.get(v15);
                    if(Intrinsics.areEqual(TextFieldImplKt.getLayoutId(((IntrinsicMeasurable)object8)), "Hint")) {
                        object1 = object8;
                        break;
                    }
                }
                int v16 = ((IntrinsicMeasurable)object1) == null ? 0 : ((Number)function20.invoke(((IntrinsicMeasurable)object1), v3)).intValue();
                if(v10 > 0) {
                    z = true;
                }
                return TextFieldKt.access$calculateHeight-O3s9Psw(v13, z, v10, v4, v7, v16, 0x400200000000L, intrinsicMeasureScope0.getDensity(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static int b(List list0, int v, Function2 function20) {
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
                return TextFieldKt.access$calculateWidth-VsPV1Ek(v13, v10, v4, v7, v2, 0x400200000000L);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, q2.M);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return pb.b(list0, v, q2.N);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object6;
        int v14;
        Object object4;
        Object object2;
        Object object0;
        int v1 = measureScope0.roundToPx-0680j_4(this.c.calculateTopPadding-D9Ej5fM());
        int v2 = measureScope0.roundToPx-0680j_4(this.c.calculateBottomPadding-D9Ej5fM());
        int v3 = measureScope0.roundToPx-0680j_4(2.0f);
        long v4 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v5 = list0.size();
        for(int v6 = 0; true; ++v6) {
            object0 = null;
            if(v6 >= v5) {
                break;
            }
            Object object1 = list0.get(v6);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object1)), "Leading")) {
                object0 = object1;
                break;
            }
        }
        Placeable placeable0 = ((Measurable)object0) == null ? null : ((Measurable)object0).measure-BRTryo0(v4);
        int v7 = TextFieldImplKt.widthOrZero(placeable0);
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
        Placeable placeable1 = ((Measurable)object2) == null ? null : ((Measurable)object2).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v4, -v7, 0, 2, null));
        int v10 = -(TextFieldImplKt.widthOrZero(placeable1) + v7);
        long v11 = ConstraintsKt.offset-NN6Ew-U(v4, v10, -v2);
        int v12 = list0.size();
        for(int v13 = 0; true; ++v13) {
            object4 = null;
            if(v13 >= v12) {
                break;
            }
            Object object5 = list0.get(v13);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object5)), "Label")) {
                object4 = object5;
                break;
            }
        }
        Placeable placeable2 = ((Measurable)object4) == null ? null : ((Measurable)object4).measure-BRTryo0(v11);
        if(placeable2 == null) {
            v14 = 0;
        }
        else {
            v14 = placeable2.get(AlignmentLineKt.getLastBaseline());
            if(v14 == 0x80000000) {
                v14 = placeable2.getHeight();
            }
        }
        int v15 = Math.max(v14, v1);
        long v16 = ConstraintsKt.offset-NN6Ew-U(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null), v10, (placeable2 == null ? -v1 - v2 : -v2 - v3 - v15));
        int v17 = list0.size();
        for(int v18 = 0; v18 < v17; ++v18) {
            Measurable measurable0 = (Measurable)list0.get(v18);
            if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable0), "TextField")) {
                Placeable placeable3 = measurable0.measure-BRTryo0(v16);
                long v19 = Constraints.copy-Zbe2FdA$default(v16, 0, 0, 0, 0, 14, null);
                int v20 = list0.size();
                for(int v21 = 0; true; ++v21) {
                    object6 = null;
                    if(v21 >= v20) {
                        break;
                    }
                    Object object7 = list0.get(v21);
                    if(Intrinsics.areEqual(LayoutIdKt.getLayoutId(((Measurable)object7)), "Hint")) {
                        object6 = object7;
                        break;
                    }
                }
                Placeable placeable4 = ((Measurable)object6) == null ? null : ((Measurable)object6).measure-BRTryo0(v19);
                int v22 = TextFieldKt.access$calculateWidth-VsPV1Ek(TextFieldImplKt.widthOrZero(placeable0), TextFieldImplKt.widthOrZero(placeable1), placeable3.getWidth(), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable4), v);
                int v23 = TextFieldKt.access$calculateHeight-O3s9Psw(placeable3.getHeight(), placeable2 != null, v15, TextFieldImplKt.heightOrZero(placeable0), TextFieldImplKt.heightOrZero(placeable1), TextFieldImplKt.heightOrZero(placeable4), v, measureScope0.getDensity(), this.c);
                return MeasureScope.layout$default(measureScope0, v22, v23, null, new ob(placeable2, v1, v14, v22, v23, placeable3, placeable4, placeable0, placeable1, this, v15, v3, measureScope0), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return this.a(intrinsicMeasureScope0, list0, v, q2.O);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return pb.b(list0, v, q2.P);
    }
}

