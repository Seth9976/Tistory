package p5;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class b implements MeasurePolicy {
    public final int a;
    public static final b b;
    public static final b c;

    static {
        b.b = new b(0);
        b.c = new b(1);
    }

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        return this.a == 0 ? MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, a.w, 4, null) : MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, j.w, 4, null);
    }
}

