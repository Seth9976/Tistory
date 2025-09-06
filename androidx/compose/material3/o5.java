package androidx.compose.material3;

import androidx.compose.material.BottomSheetState;
import androidx.compose.material.i;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import d0.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p0.c2;
import r0.a;

public final class o5 extends Lambda implements Function2 {
    public final float A;
    public final int B;
    public final Object C;
    public final Function D;
    public final Object E;
    public final Object F;
    public final int w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public o5(Modifier modifier0, Function2 function20, Function2 function21, Function2 function22, DatePickerColors datePickerColors0, TextStyle textStyle0, float f, Function2 function23, int v) {
        this.w = 0;
        this.C = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.E = datePickerColors0;
        this.F = textStyle0;
        this.A = f;
        this.D = function23;
        this.B = v;
        super(2);
    }

    public o5(Function2 function20, Function2 function21, Function2 function22, Function3 function30, Function3 function31, float f, Function0 function00, int v, BottomSheetState bottomSheetState0) {
        this.w = 1;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.C = function30;
        this.D = function31;
        this.A = f;
        this.E = function00;
        this.B = v;
        this.F = bottomSheetState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Object object9;
        int v28;
        Object object6;
        int v22;
        Object object4;
        ArrayList arrayList5;
        int v12;
        Object object2;
        ArrayList arrayList2;
        if(this.w != 0) {
            long v = ((Constraints)object1).unbox-impl();
            int v1 = Constraints.getMaxWidth-impl(v);
            int v2 = Constraints.getMaxHeight-impl(v);
            long v3 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xF5D35FD9, true, new g0(((Function3)this.C), v2, 1));
            List list0 = ((SubcomposeMeasureScope)object0).subcompose(c2.c, composableLambda0);
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v4 = list0.size();
            for(int v5 = 0; v5 < v4; v5 = a.f(((Measurable)list0.get(v5)), v3, arrayList0, v5, 1)) {
            }
            Function2 function20 = this.x;
            if(function20 == null) {
                arrayList2 = null;
            }
            else {
                List list1 = ((SubcomposeMeasureScope)object0).subcompose(c2.a, function20);
                ArrayList arrayList1 = new ArrayList(list1.size());
                int v6 = list1.size();
                for(int v7 = 0; v7 < v6; v7 = a.f(((Measurable)list1.get(v7)), v3, arrayList1, v7, 1)) {
                }
                arrayList2 = arrayList1;
            }
            if(arrayList2 == null) {
                v12 = 0;
            }
            else {
                if(arrayList2.isEmpty()) {
                    object2 = null;
                }
                else {
                    object2 = arrayList2.get(0);
                    int v8 = ((Placeable)object2).getHeight();
                    int v9 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                    if(1 <= v9) {
                        for(int v10 = 1; true; ++v10) {
                            Object object3 = arrayList2.get(v10);
                            int v11 = ((Placeable)object3).getHeight();
                            if(v8 < v11) {
                                object2 = object3;
                                v8 = v11;
                            }
                            if(v10 == v9) {
                                break;
                            }
                        }
                    }
                }
                v12 = ((Placeable)object2) == null ? 0 : ((Placeable)object2).getHeight();
            }
            long v13 = Constraints.copy-Zbe2FdA$default(v3, 0, 0, 0, v2 - v12, 7, null);
            ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambdaInstance(0xE8CB1A2E, true, new q1(this.A, ((Function3)this.D), 1));
            List list2 = ((SubcomposeMeasureScope)object0).subcompose(c2.b, composableLambda1);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int v14 = list2.size();
            for(int v15 = 0; v15 < v14; v15 = a.f(((Measurable)list2.get(v15)), v13, arrayList3, v15, 1)) {
            }
            Function2 function21 = this.y;
            if(function21 == null) {
                arrayList5 = null;
            }
            else {
                List list3 = ((SubcomposeMeasureScope)object0).subcompose(c2.d, function21);
                ArrayList arrayList4 = new ArrayList(list3.size());
                int v16 = list3.size();
                for(int v17 = 0; v17 < v16; v17 = a.f(((Measurable)list3.get(v17)), v3, arrayList4, v17, 1)) {
                }
                arrayList5 = arrayList4;
            }
            if(arrayList5 == null) {
                v22 = 0;
            }
            else {
                if(arrayList5.isEmpty()) {
                    object4 = null;
                }
                else {
                    object4 = arrayList5.get(0);
                    int v18 = ((Placeable)object4).getWidth();
                    int v19 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
                    if(1 <= v19) {
                        for(int v20 = 1; true; ++v20) {
                            Object object5 = arrayList5.get(v20);
                            int v21 = ((Placeable)object5).getWidth();
                            if(v18 < v21) {
                                v18 = v21;
                                object4 = object5;
                            }
                            if(v20 == v19) {
                                break;
                            }
                        }
                    }
                }
                v22 = ((Placeable)object4) == null ? 0 : ((Placeable)object4).getWidth();
            }
            if(arrayList5 == null) {
                v28 = 0;
            }
            else {
                if(arrayList5.isEmpty()) {
                    object6 = null;
                }
                else {
                    object6 = arrayList5.get(0);
                    int v23 = ((Placeable)object6).getHeight();
                    int v24 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
                    if(1 <= v24) {
                        int v25 = v23;
                        Object object7 = object6;
                        for(int v26 = 1; true; ++v26) {
                            Object object8 = arrayList5.get(v26);
                            int v27 = ((Placeable)object8).getHeight();
                            if(v25 < v27) {
                                v25 = v27;
                                object7 = object8;
                            }
                            if(v26 == v24) {
                                break;
                            }
                        }
                        object6 = object7;
                    }
                }
                v28 = ((Placeable)object6) == null ? 0 : ((Placeable)object6).getHeight();
            }
            List list4 = ((SubcomposeMeasureScope)object0).subcompose(c2.e, this.z);
            ArrayList arrayList6 = new ArrayList(list4.size());
            int v29 = list4.size();
            for(int v30 = 0; v30 < v29; v30 = a.f(((Measurable)list4.get(v30)), v3, arrayList6, v30, 1)) {
            }
            if(arrayList6.isEmpty()) {
                object9 = null;
            }
            else {
                object9 = arrayList6.get(0);
                int v31 = ((Placeable)object9).getWidth();
                int v32 = CollectionsKt__CollectionsKt.getLastIndex(arrayList6);
                if(1 <= v32) {
                    for(int v33 = 1; true; ++v33) {
                        Object object10 = arrayList6.get(v33);
                        int v34 = ((Placeable)object10).getWidth();
                        if(v31 < v34) {
                            object9 = object10;
                            v31 = v34;
                        }
                        if(v33 == v32) {
                            break;
                        }
                    }
                }
            }
            int v35 = ((Placeable)object9) == null ? 0 : ((Placeable)object9).getWidth();
            if(arrayList6.isEmpty()) {
                return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v1, v2, null, new i(((Function0)this.E), this.B, ((SubcomposeMeasureScope)object0), v1, v22, this.A, v28, v35, ((BottomSheetState)this.F), 0, v2, arrayList3, arrayList2, arrayList0, arrayList5, arrayList6, v12), 4, null);
            }
            Object object11 = arrayList6.get(0);
            int v36 = ((Placeable)object11).getHeight();
            int v37 = CollectionsKt__CollectionsKt.getLastIndex(arrayList6);
            if(1 <= v37) {
                for(int v38 = 1; true; ++v38) {
                    Object object12 = arrayList6.get(v38);
                    int v39 = ((Placeable)object12).getHeight();
                    if(v36 < v39) {
                        v36 = v39;
                        object11 = object12;
                    }
                    if(v38 == v37) {
                        break;
                    }
                }
            }
            return ((Placeable)object11) == null ? MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v1, v2, null, new i(((Function0)this.E), this.B, ((SubcomposeMeasureScope)object0), v1, v22, this.A, v28, v35, ((BottomSheetState)this.F), 0, v2, arrayList3, arrayList2, arrayList0, arrayList5, arrayList6, v12), 4, null) : MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v1, v2, null, new i(((Function0)this.E), this.B, ((SubcomposeMeasureScope)object0), v1, v22, this.A, v28, v35, ((BottomSheetState)this.F), ((Placeable)object11).getHeight(), v2, arrayList3, arrayList2, arrayList0, arrayList5, arrayList6, v12), 4, null);
        }
        ((Number)object1).intValue();
        DatePickerKt.DateEntryContainer-au3_HiA(((Modifier)this.C), this.x, this.y, this.z, ((DatePickerColors)this.E), ((TextStyle)this.F), this.A, ((Function2)this.D), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
        return Unit.INSTANCE;
    }
}

