package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import java.util.List;
import kotlin.collections.k;

public final class z1 implements MeasurePolicy {
    public final p2 a;

    public z1(p2 p20) {
        this.a = p20;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        List list1 = k.listOf(list0);
        return this.a.measure-3p2s80s(measureScope0, list1, v);
    }
}

