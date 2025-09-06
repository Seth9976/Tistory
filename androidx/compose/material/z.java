package androidx.compose.material;

import aa.x;
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
import kotlin.jvm.internal.Lambda;
import p0.d4;
import p0.e7;
import p0.f7;
import r0.a;

public final class z extends Lambda implements Function2 {
    public final boolean A;
    public final WindowInsets B;
    public final Function2 C;
    public final Function3 D;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final int z;

    public z(Function2 function20, Function2 function21, Function2 function22, int v, boolean z, WindowInsets windowInsets0, Function2 function23, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = v;
        this.A = z;
        this.B = windowInsets0;
        this.C = function23;
        this.D = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v42;
        int v41;
        Integer integer1;
        int v40;
        Object object11;
        ArrayList arrayList4;
        FabPlacement fabPlacement0;
        int v32;
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
        List list0 = subcomposeMeasureScope0.subcompose(f7.a, this.w);
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
        List list1 = subcomposeMeasureScope0.subcompose(f7.c, this.x);
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v11 = list1.size();
        for(int v12 = 0; true; v12 = a.f(((Measurable)list1.get(v12)), ConstraintsKt.offset-NN6Ew-U(v3, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)), arrayList1, v12, 1)) {
            windowInsets0 = this.B;
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
                        object4 = object5;
                        v13 = v16;
                    }
                    if(v15 == v14) {
                        break;
                    }
                }
            }
        }
        int v17 = ((Placeable)object4) == null ? 0 : ((Placeable)object4).getHeight();
        List list2 = subcomposeMeasureScope0.subcompose(f7.d, this.y);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v18 = list2.size();
        for(int v19 = 0; v19 < v18; v19 = a.f(((Measurable)list2.get(v19)), ConstraintsKt.offset-NN6Ew-U(v3, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)), arrayList2, v19, 1)) {
        }
        boolean z = this.A;
        if(arrayList2.isEmpty()) {
            fabPlacement0 = null;
        }
        else {
            if(arrayList2.isEmpty()) {
                object6 = null;
            }
            else {
                object6 = arrayList2.get(0);
                int v20 = ((Placeable)object6).getWidth();
                int v21 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v21) {
                    for(int v22 = 1; true; ++v22) {
                        Object object7 = arrayList2.get(v22);
                        int v23 = ((Placeable)object7).getWidth();
                        if(v20 < v23) {
                            object6 = object7;
                            v20 = v23;
                        }
                        if(v22 == v21) {
                            break;
                        }
                    }
                }
            }
            int v24 = ((Placeable)object6) == null ? 0 : ((Placeable)object6).getWidth();
            if(arrayList2.isEmpty()) {
                object8 = null;
            }
            else {
                object8 = arrayList2.get(0);
                int v25 = ((Placeable)object8).getHeight();
                int v26 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v26) {
                    int v27 = v25;
                    Object object9 = object8;
                    for(int v28 = 1; true; ++v28) {
                        Object object10 = arrayList2.get(v28);
                        int v29 = ((Placeable)object10).getHeight();
                        if(v27 < v29) {
                            v27 = v29;
                            object9 = object10;
                        }
                        if(v28 == v26) {
                            break;
                        }
                    }
                    object8 = object9;
                }
            }
            int v30 = ((Placeable)object8) == null ? 0 : ((Placeable)object8).getHeight();
            if(v24 == 0 || v30 == 0) {
                fabPlacement0 = null;
            }
            else {
                int v31 = this.z;
                if(!FabPosition.equals-impl0(v31, 0)) {
                    if(!FabPosition.equals-impl0(v31, 2)) {
                        v32 = (v1 - v24) / 2;
                    }
                    else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                        v32 = v1 - subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) - v24;
                    }
                    else {
                        v32 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f);
                    }
                }
                else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                    v32 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f);
                }
                else {
                    v32 = v1 - subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) - v24;
                }
                fabPlacement0 = new FabPlacement(z, v32, v24, v30);
            }
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x9F9721E1, true, new x(25, fabPlacement0, this.C));
        List list3 = subcomposeMeasureScope0.subcompose(f7.e, composableLambda0);
        ArrayList arrayList3 = new ArrayList(list3.size());
        int v33 = list3.size();
        for(int v34 = 0; v34 < v33; v34 = a.f(((Measurable)list3.get(v34)), v3, arrayList3, v34, 1)) {
        }
        if(arrayList3.isEmpty()) {
            arrayList4 = arrayList3;
            object11 = null;
        }
        else {
            arrayList4 = arrayList3;
            object11 = arrayList4.get(0);
            int v35 = ((Placeable)object11).getHeight();
            int v36 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
            if(1 <= v36) {
                for(int v37 = 1; true; ++v37) {
                    Object object12 = arrayList4.get(v37);
                    int v38 = ((Placeable)object12).getHeight();
                    if(v35 < v38) {
                        object11 = object12;
                        v35 = v38;
                    }
                    if(v37 == v36) {
                        break;
                    }
                }
            }
        }
        Integer integer0 = ((Placeable)object11) == null ? null : ((Placeable)object11).getHeight();
        if(fabPlacement0 == null) {
            integer1 = null;
        }
        else {
            if(integer0 == null) {
                int v39 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) + fabPlacement0.getHeight();
                v40 = windowInsets0.getBottom(subcomposeMeasureScope0) + v39;
            }
            else {
                v40 = z ? ((int)integer0) + fabPlacement0.getHeight() / 2 : subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) + (fabPlacement0.getHeight() + ((int)integer0));
            }
            integer1 = v40;
        }
        if(v17 == 0) {
            v42 = 0;
        }
        else {
            if(integer1 == null) {
                v41 = integer0 == null ? windowInsets0.getBottom(subcomposeMeasureScope0) : ((int)integer0);
            }
            else {
                v41 = (int)integer1;
            }
            v42 = v17 + v41;
        }
        ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambdaInstance(0xC97DED32, true, new d4(this.B, subcomposeMeasureScope0, arrayList0, arrayList4, integer0, this.D, 1));
        List list4 = subcomposeMeasureScope0.subcompose(f7.b, composableLambda1);
        ArrayList arrayList5 = new ArrayList(list4.size());
        int v43 = list4.size();
        for(int v44 = 0; v44 < v43; v44 = a.f(((Measurable)list4.get(v44)), Constraints.copy-Zbe2FdA$default(v3, 0, 0, 0, v2 - v10, 7, null), arrayList5, v44, 1)) {
        }
        return MeasureScope.layout$default(subcomposeMeasureScope0, v1, v2, null, new e7(arrayList5, arrayList0, arrayList1, arrayList4, arrayList2, v10, v2, v42, integer0, fabPlacement0, integer1), 4, null);
    }
}

