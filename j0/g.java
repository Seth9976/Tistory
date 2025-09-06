package j0;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import r0.a;

public final class g implements MeasurePolicy {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; v2 = a.f(((Measurable)list0.get(v2)), v, arrayList0, v2, 1)) {
        }
        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new f(arrayList0), 4, null);
    }
}

