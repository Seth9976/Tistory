package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p0.f7;
import p0.w6;
import p0.x6;
import r0.a;

public final class y extends Lambda implements Function1 {
    public final int A;
    public final int B;
    public final boolean C;
    public final WindowInsets D;
    public final int E;
    public final long F;
    public final Function2 G;
    public final Function3 H;
    public final SubcomposeMeasureScope w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public y(SubcomposeMeasureScope subcomposeMeasureScope0, Function2 function20, Function2 function21, Function2 function22, int v, int v1, boolean z, WindowInsets windowInsets0, int v2, long v3, Function2 function23, Function3 function30) {
        this.w = subcomposeMeasureScope0;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = v;
        this.B = v1;
        this.C = z;
        this.D = windowInsets0;
        this.E = v2;
        this.F = v3;
        this.G = function23;
        this.H = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v39;
        int v38;
        Integer integer1;
        int v37;
        Object object9;
        FabPlacement fabPlacement0;
        int v29;
        Object object7;
        Object object5;
        ArrayList arrayList3;
        Object object3;
        WindowInsets windowInsets0;
        Object object1;
        SubcomposeMeasureScope subcomposeMeasureScope0 = this.w;
        List list0 = subcomposeMeasureScope0.subcompose(f7.a, this.x);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; true; v1 = a.f(((Measurable)list0.get(v1)), v2, arrayList0, v1, 1)) {
            long v2 = this.F;
            if(v1 >= v) {
                break;
            }
        }
        if(arrayList0.isEmpty()) {
            object1 = null;
        }
        else {
            object1 = arrayList0.get(0);
            int v3 = ((Placeable)object1).getHeight();
            int v4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v4) {
                for(int v5 = 1; true; ++v5) {
                    Object object2 = arrayList0.get(v5);
                    int v6 = ((Placeable)object2).getHeight();
                    if(v3 < v6) {
                        object1 = object2;
                        v3 = v6;
                    }
                    if(v5 == v4) {
                        break;
                    }
                }
            }
        }
        int v7 = ((Placeable)object1) == null ? 0 : ((Placeable)object1).getHeight();
        List list1 = subcomposeMeasureScope0.subcompose(f7.c, this.y);
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v8 = list1.size();
        for(int v9 = 0; true; v9 = a.f(((Measurable)list1.get(v9)), ConstraintsKt.offset-NN6Ew-U(v2, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)), arrayList1, v9, 1)) {
            windowInsets0 = this.D;
            if(v9 >= v8) {
                break;
            }
        }
        if(arrayList1.isEmpty()) {
            object3 = null;
        }
        else {
            object3 = arrayList1.get(0);
            int v10 = ((Placeable)object3).getHeight();
            int v11 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v11) {
                for(int v12 = 1; true; ++v12) {
                    Object object4 = arrayList1.get(v12);
                    int v13 = ((Placeable)object4).getHeight();
                    if(v10 < v13) {
                        object3 = object4;
                        v10 = v13;
                    }
                    if(v12 == v11) {
                        break;
                    }
                }
            }
        }
        int v14 = ((Placeable)object3) == null ? 0 : ((Placeable)object3).getHeight();
        List list2 = subcomposeMeasureScope0.subcompose(f7.d, this.z);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v15 = list2.size();
        for(int v16 = 0; v16 < v15; v16 = a.f(((Measurable)list2.get(v16)), ConstraintsKt.offset-NN6Ew-U(v2, -windowInsets0.getLeft(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()) - windowInsets0.getRight(subcomposeMeasureScope0, subcomposeMeasureScope0.getLayoutDirection()), -windowInsets0.getBottom(subcomposeMeasureScope0)), arrayList2, v16, 1)) {
        }
        boolean z = this.C;
        if(arrayList2.isEmpty()) {
            arrayList3 = arrayList1;
            fabPlacement0 = null;
        }
        else {
            if(arrayList2.isEmpty()) {
                arrayList3 = arrayList1;
                object5 = null;
            }
            else {
                object5 = arrayList2.get(0);
                int v17 = ((Placeable)object5).getWidth();
                int v18 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v18) {
                    int v19 = 1;
                    while(true) {
                        Object object6 = arrayList2.get(v19);
                        arrayList3 = arrayList1;
                        int v20 = ((Placeable)object6).getWidth();
                        if(v17 < v20) {
                            v17 = v20;
                            object5 = object6;
                        }
                        if(v19 == v18) {
                            break;
                        }
                        ++v19;
                        arrayList1 = arrayList3;
                    }
                }
                else {
                    arrayList3 = arrayList1;
                }
            }
            int v21 = ((Placeable)object5) == null ? 0 : ((Placeable)object5).getWidth();
            if(arrayList2.isEmpty()) {
                object7 = null;
            }
            else {
                object7 = arrayList2.get(0);
                int v22 = ((Placeable)object7).getHeight();
                int v23 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if(1 <= v23) {
                    for(int v24 = 1; true; ++v24) {
                        Object object8 = arrayList2.get(v24);
                        int v25 = ((Placeable)object8).getHeight();
                        if(v22 < v25) {
                            v22 = v25;
                            object7 = object8;
                        }
                        if(v24 == v23) {
                            break;
                        }
                    }
                }
            }
            int v26 = ((Placeable)object7) == null ? 0 : ((Placeable)object7).getHeight();
            if(v21 == 0 || v26 == 0) {
                fabPlacement0 = null;
            }
            else {
                int v27 = this.A;
                int v28 = this.B;
                if(!FabPosition.equals-impl0(v27, 0)) {
                    if(!FabPosition.equals-impl0(v27, 2)) {
                        v29 = (v28 - v21) / 2;
                    }
                    else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                        v29 = v28 - subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) - v21;
                    }
                    else {
                        v29 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f);
                    }
                }
                else if(subcomposeMeasureScope0.getLayoutDirection() == LayoutDirection.Ltr) {
                    v29 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f);
                }
                else {
                    v29 = v28 - subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) - v21;
                }
                fabPlacement0 = new FabPlacement(z, v29, v21, v26);
            }
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xF0F18202, true, new x6(fabPlacement0, this.G));
        List list3 = subcomposeMeasureScope0.subcompose(f7.e, composableLambda0);
        ArrayList arrayList4 = new ArrayList(list3.size());
        int v30 = list3.size();
        for(int v31 = 0; v31 < v30; v31 = a.f(((Measurable)list3.get(v31)), v2, arrayList4, v31, 1)) {
        }
        if(arrayList4.isEmpty()) {
            object9 = null;
        }
        else {
            object9 = arrayList4.get(0);
            int v32 = ((Placeable)object9).getHeight();
            int v33 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
            if(1 <= v33) {
                for(int v34 = 1; true; ++v34) {
                    Object object10 = arrayList4.get(v34);
                    int v35 = ((Placeable)object10).getHeight();
                    if(v32 < v35) {
                        v32 = v35;
                        object9 = object10;
                    }
                    if(v34 == v33) {
                        break;
                    }
                }
            }
        }
        Integer integer0 = ((Placeable)object9) == null ? null : ((Placeable)object9).getHeight();
        if(fabPlacement0 == null) {
            integer1 = null;
        }
        else {
            if(integer0 == null) {
                int v36 = subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) + fabPlacement0.getHeight();
                v37 = windowInsets0.getBottom(subcomposeMeasureScope0) + v36;
            }
            else {
                v37 = z ? ((int)integer0) + fabPlacement0.getHeight() / 2 : subcomposeMeasureScope0.roundToPx-0680j_4(0.0f) + (fabPlacement0.getHeight() + ((int)integer0));
            }
            integer1 = v37;
        }
        if(v14 == 0) {
            v39 = 0;
        }
        else {
            if(integer1 == null) {
                v38 = integer0 == null ? windowInsets0.getBottom(subcomposeMeasureScope0) : ((int)integer0);
            }
            else {
                v38 = (int)integer1;
            }
            v39 = v38 + v14;
        }
        int v40 = this.E - v7;
        int v41 = this.E;
        ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambdaInstance(230985361, true, new w6(this.D, this.w, arrayList0, arrayList4, integer0, this.H));
        List list4 = this.w.subcompose(f7.b, composableLambda1);
        ArrayList arrayList5 = new ArrayList(list4.size());
        int v42 = list4.size();
        for(int v43 = 0; v43 < v42; v43 = a.f(((Measurable)list4.get(v43)), Constraints.copy-Zbe2FdA$default(this.F, 0, 0, 0, v40, 7, null), arrayList5, v43, 1)) {
        }
        int v44 = arrayList5.size();
        for(int v45 = 0; v45 < v44; ++v45) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList5.get(v45)), 0, v7, 0.0f, 4, null);
        }
        int v46 = arrayList0.size();
        for(int v47 = 0; v47 < v46; ++v47) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v47)), 0, 0, 0.0f, 4, null);
        }
        int v48 = arrayList3.size();
        for(int v49 = 0; v49 < v48; ++v49) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList3.get(v49)), 0, v41 - v39, 0.0f, 4, null);
        }
        int v50 = arrayList4.size();
        for(int v51 = 0; v51 < v50; ++v51) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList4.get(v51)), 0, v41 - (integer0 == null ? 0 : ((int)integer0)), 0.0f, 4, null);
        }
        int v52 = arrayList2.size();
        for(int v53 = 0; v53 < v52; ++v53) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList2.get(v53)), (fabPlacement0 == null ? 0 : fabPlacement0.getLeft()), v41 - (integer1 == null ? 0 : ((int)integer1)), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

