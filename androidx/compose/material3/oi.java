package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class oi extends Lambda implements Function2 {
    public final WindowInsets A;
    public final Function2 B;
    public final Function3 C;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final int z;

    public oi(Function2 function20, Function2 function21, Function2 function22, int v, WindowInsets windowInsets0, Function2 function23, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = v;
        this.A = windowInsets0;
        this.B = function23;
        this.C = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v49;
        int v48;
        Integer integer1;
        int v47;
        int v46;
        Object object14;
        int v41;
        FabPlacement fabPlacement0;
        int v38;
        Object object11;
        ArrayList arrayList3;
        Object object8;
        Object object6;
        Object object4;
        WindowInsets windowInsets0;
        Object object2;
        SubcomposeMeasureScope subcomposeMeasureScope0 = (SubcomposeMeasureScope)object0;
        long v = ((Constraints)object1).unbox-impl();
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = Constraints.getMaxHeight-impl(v);
        long v3 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        List list0 = subcomposeMeasureScope0.subcompose(qi.a, this.w);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; v5 = a.f(((Measurable)list0.get(v5)), v3, arrayList0, v5, 1)) {
        }
        if(arrayList0.isEmpty()) {
            object2 = null;
        }
        else {
            object2 = arrayList0.get(0);
            int v6 = ((Placeable)object2).getHeight();
            int v7 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v7) {
                for(int v8 = 1; true; ++v8) {
                    Object object3 = arrayList0.get(v8);
                    int v9 = ((Placeable)object3).getHeight();
                    if(v6 < v9) {
                        object2 = object3;
                        v6 = v9;
                    }
                    if(v8 == v7) {
                        break;
                    }
                }
            }
        }
        int v10 = ((Placeable)object2) == null ? 0 : ((Placeable)object2).getHeight();
        List list1 = subcomposeMeasureScope0.subcompose(qi.c, this.x);
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v11 = list1.size();
        for(int v12 = 0; true; v12 = a.f(((Measurable)list1.get(v12)), ConstraintsKt.offset-NN6Ew-U(v3, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)), arrayList1, v12, 1)) {
            windowInsets0 = this.A;
            if(v12 >= v11) {
                break;
            }
        }
        if(arrayList1.isEmpty()) {
            object4 = null;
        }
        else {
            object4 = arrayList1.get(0);
            int v13 = ((Placeable)object4).getHeight();
            int v14 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v14) {
                for(int v15 = 1; true; ++v15) {
                    Object object5 = arrayList1.get(v15);
                    int v16 = ((Placeable)object5).getHeight();
                    if(v13 < v16) {
                        v13 = v16;
                        object4 = object5;
                    }
                    if(v15 == v14) {
                        break;
                    }
                }
            }
        }
        int v17 = ((Placeable)object4) == null ? 0 : ((Placeable)object4).getHeight();
        if(arrayList1.isEmpty()) {
            object6 = null;
        }
        else {
            object6 = arrayList1.get(0);
            int v18 = ((Placeable)object6).getWidth();
            int v19 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v19) {
                for(int v20 = 1; true; ++v20) {
                    Object object7 = arrayList1.get(v20);
                    int v21 = ((Placeable)object7).getWidth();
                    if(v18 < v21) {
                        object6 = object7;
                        v18 = v21;
                    }
                    if(v20 == v19) {
                        break;
                    }
                }
            }
        }
        int v22 = ((Placeable)object6) == null ? 0 : ((Placeable)object6).getWidth();
        List list2 = subcomposeMeasureScope0.subcompose(qi.d, this.y);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v23 = list2.size();
        for(int v24 = 0; v24 < v23; ++v24) {
            Placeable placeable0 = ((Measurable)list2.get(v24)).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v3, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)));
            if(placeable0.getHeight() == 0 || placeable0.getWidth() == 0) {
                placeable0 = null;
            }
            if(placeable0 != null) {
                arrayList2.add(placeable0);
            }
        }
        int v25 = this.z;
        if(arrayList2.isEmpty()) {
            arrayList3 = arrayList2;
            fabPlacement0 = null;
        }
        else {
            if(arrayList2.isEmpty()) {
                object8 = null;
            }
            else {
                object8 = arrayList2.get(0);
                int v26 = ((Placeable)object8).getWidth();
                int v27 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v27) {
                    Object object9 = object8;
                    int v28 = v26;
                    for(int v29 = 1; true; ++v29) {
                        Object object10 = arrayList2.get(v29);
                        int v30 = ((Placeable)object10).getWidth();
                        if(v28 < v30) {
                            v28 = v30;
                            object9 = object10;
                        }
                        if(v29 == v27) {
                            break;
                        }
                    }
                    object8 = object9;
                }
            }
            Intrinsics.checkNotNull(object8);
            int v31 = ((Placeable)object8).getWidth();
            if(arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                object11 = null;
            }
            else {
                object11 = arrayList2.get(0);
                int v32 = ((Placeable)object11).getHeight();
                int v33 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v33) {
                    int v34 = 1;
                    Object object12 = object11;
                    int v35 = v32;
                    while(true) {
                        Object object13 = arrayList2.get(v34);
                        arrayList3 = arrayList2;
                        int v36 = ((Placeable)object13).getHeight();
                        if(v35 < v36) {
                            v35 = v36;
                            object12 = object13;
                        }
                        if(v34 == v33) {
                            break;
                        }
                        ++v34;
                        arrayList2 = arrayList3;
                    }
                    object11 = object12;
                }
                else {
                    arrayList3 = arrayList2;
                }
            }
            Intrinsics.checkNotNull(object11);
            int v37 = ((Placeable)object11).getHeight();
            if(!FabPosition.equals-impl0(v25, 0)) {
                if(!(FabPosition.equals-impl0(v25, 2) ? true : FabPosition.equals-impl0(v25, 3))) {
                    v38 = (v1 - v31) / 2;
                }
                else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                    v38 = v1 - subcomposeMeasureScope0.roundToPx-0680j_4(16.0f) - v31;
                }
                else {
                    v38 = subcomposeMeasureScope0.roundToPx-0680j_4(16.0f);
                }
            }
            else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                v38 = subcomposeMeasureScope0.roundToPx-0680j_4(16.0f);
            }
            else {
                v38 = v1 - subcomposeMeasureScope0.roundToPx-0680j_4(16.0f) - v31;
            }
            fabPlacement0 = new FabPlacement(v38, v31, v37);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x800FF2D1, true, new ni(this.B, 0));
        List list3 = subcomposeMeasureScope0.subcompose(qi.e, composableLambda0);
        ArrayList arrayList4 = new ArrayList(list3.size());
        int v39 = list3.size();
        for(int v40 = 0; v40 < v39; v40 = a.f(((Measurable)list3.get(v40)), v3, arrayList4, v40, 1)) {
        }
        if(arrayList4.isEmpty()) {
            v41 = v22;
            object14 = null;
        }
        else {
            Object object15 = arrayList4.get(0);
            int v42 = ((Placeable)object15).getHeight();
            int v43 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
            Object object16 = object15;
            if(1 <= v43) {
                int v44 = 1;
                while(true) {
                    Object object17 = arrayList4.get(v44);
                    v41 = v22;
                    int v45 = ((Placeable)object17).getHeight();
                    if(v42 < v45) {
                        v42 = v45;
                        object16 = object17;
                    }
                    if(v44 == v43) {
                        break;
                    }
                    ++v44;
                    v22 = v41;
                }
            }
            else {
                v41 = v22;
            }
            object14 = object16;
        }
        Integer integer0 = ((Placeable)object14) == null ? null : ((Placeable)object14).getHeight();
        if(fabPlacement0 == null) {
            integer1 = null;
        }
        else {
            if(integer0 == null || FabPosition.equals-impl0(v25, 3)) {
                v46 = subcomposeMeasureScope0.roundToPx-0680j_4(16.0f) + fabPlacement0.getHeight();
                v47 = windowInsets0.getBottom(subcomposeMeasureScope0);
            }
            else {
                v46 = fabPlacement0.getHeight() + ((int)integer0);
                v47 = subcomposeMeasureScope0.roundToPx-0680j_4(16.0f);
            }
            integer1 = (int)(v47 + v46);
        }
        if(v17 == 0) {
            v49 = 0;
        }
        else {
            if(integer1 == null) {
                v48 = integer0 == null ? windowInsets0.getBottom(subcomposeMeasureScope0) : ((int)integer0);
            }
            else {
                v48 = (int)integer1;
            }
            v49 = v17 + v48;
        }
        ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambdaInstance(0xB7AD96E0, true, new ki(this.A, subcomposeMeasureScope0, arrayList0, v10, arrayList4, integer0, this.C));
        List list4 = subcomposeMeasureScope0.subcompose(qi.b, composableLambda1);
        ArrayList arrayList5 = new ArrayList(list4.size());
        int v50 = list4.size();
        for(int v51 = 0; v51 < v50; v51 = a.f(((Measurable)list4.get(v51)), v3, arrayList5, v51, 1)) {
        }
        return MeasureScope.layout$default(subcomposeMeasureScope0, v1, v2, null, new mi(arrayList5, arrayList0, arrayList1, arrayList4, fabPlacement0, v1, v41, this.A, subcomposeMeasureScope0, v2, v49, integer0, arrayList3, integer1), 4, null);
    }
}

