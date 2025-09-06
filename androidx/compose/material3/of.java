package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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

public final class of implements MeasurePolicy {
    public final DrawerState a;
    public final MutableState b;
    public final MutableFloatState c;

    public of(DrawerState drawerState0, MutableState mutableState0, MutableFloatState mutableFloatState0) {
        this.a = drawerState0;
        this.b = mutableState0;
        this.c = mutableFloatState0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Integer integer1;
        int v1 = 0;
        long v2 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v3 = list0.size();
        for(int v4 = 0; v4 < v3; v4 = a.f(((Measurable)list0.get(v4)), v2, arrayList0, v4, 1)) {
        }
        Integer integer0 = null;
        if(arrayList0.isEmpty()) {
            integer1 = null;
        }
        else {
            integer1 = ((Placeable)arrayList0.get(0)).getWidth();
            int v6 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v6) {
                for(int v7 = 1; true; ++v7) {
                    Integer integer2 = ((Placeable)arrayList0.get(v7)).getWidth();
                    if(integer2.compareTo(integer1) > 0) {
                        integer1 = integer2;
                    }
                    if(v7 == v6) {
                        break;
                    }
                }
            }
        }
        int v8 = integer1 == null ? 0 : ((int)integer1);
        if(!arrayList0.isEmpty()) {
            integer0 = ((Placeable)arrayList0.get(0)).getHeight();
            int v9 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v9) {
                for(int v5 = 1; true; ++v5) {
                    Integer integer3 = ((Placeable)arrayList0.get(v5)).getHeight();
                    if(integer3.compareTo(integer0) > 0) {
                        integer0 = integer3;
                    }
                    if(v5 == v9) {
                        break;
                    }
                }
            }
        }
        if(integer0 != null) {
            v1 = (int)integer0;
        }
        return MeasureScope.layout$default(measureScope0, v8, v1, null, new nf(this.a, v8, arrayList0, this.b, this.c), 4, null);
    }
}

