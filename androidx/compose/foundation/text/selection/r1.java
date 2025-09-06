package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import r0.a;

public final class r1 implements MeasurePolicy {
    public static final r1 a;

    static {
        r1.a = new r1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        Integer integer0 = 0;
        for(int v3 = 0; v3 < v1; v3 = a.f(((Measurable)list0.get(v3)), v, arrayList0, v3, 1)) {
        }
        int v4 = arrayList0.size();
        Integer integer1 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            integer1 = Math.max(integer1.intValue(), ((Placeable)arrayList0.get(v5)).getWidth());
        }
        int v6 = integer1.intValue();
        int v7 = arrayList0.size();
        for(int v2 = 0; v2 < v7; ++v2) {
            integer0 = Math.max(integer0.intValue(), ((Placeable)arrayList0.get(v2)).getHeight());
        }
        return MeasureScope.layout$default(measureScope0, v6, integer0.intValue(), null, new q1(arrayList0), 4, null);
    }
}

