package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class t implements MeasurePolicy {
    public final int a;
    public static final t b;
    public static final t c;

    static {
        t.b = new t(0);
        t.c = new t(1);
    }

    public t(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v1 = 0;
        if(this.a != 0) {
            int v2 = Constraints.getHasFixedWidth-impl(v) ? Constraints.getMaxWidth-impl(v) : 0;
            if(Constraints.getHasFixedHeight-impl(v)) {
                v1 = Constraints.getMaxHeight-impl(v);
            }
            return MeasureScope.layout$default(measureScope0, v2, v1, null, v3.w, 4, null);
        }
        return MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, s.w, 4, null);
    }
}

