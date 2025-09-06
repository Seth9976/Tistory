package v2;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import r0.a;

public final class f implements MeasurePolicy {
    public static final f a;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object1;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; v2 = a.f(((Measurable)list0.get(v2)), v, arrayList0, v2, 1)) {
        }
        Object object0 = null;
        if(arrayList0.isEmpty()) {
            object1 = null;
        }
        else {
            object1 = arrayList0.get(0);
            int v4 = ((Placeable)object1).getWidth();
            int v5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v5) {
                for(int v6 = 1; true; ++v6) {
                    Object object2 = arrayList0.get(v6);
                    int v7 = ((Placeable)object2).getWidth();
                    if(v4 < v7) {
                        object1 = object2;
                        v4 = v7;
                    }
                    if(v6 == v5) {
                        break;
                    }
                }
            }
        }
        int v8 = ((Placeable)object1) == null ? Constraints.getMinWidth-impl(v) : ((Placeable)object1).getWidth();
        if(!arrayList0.isEmpty()) {
            Object object3 = arrayList0.get(0);
            int v9 = ((Placeable)object3).getHeight();
            int v10 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v10) {
                for(int v3 = 1; true; ++v3) {
                    Object object4 = arrayList0.get(v3);
                    int v11 = ((Placeable)object4).getHeight();
                    if(v9 < v11) {
                        object3 = object4;
                        v9 = v11;
                    }
                    if(v3 == v10) {
                        break;
                    }
                }
            }
            object0 = object3;
        }
        return ((Placeable)object0) == null ? MeasureScope.layout$default(measureScope0, v8, Constraints.getMinHeight-impl(v), null, new e(arrayList0), 4, null) : MeasureScope.layout$default(measureScope0, v8, ((Placeable)object0).getHeight(), null, new e(arrayList0), 4, null);
    }
}

