package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final LazyGridSpanLayoutProvider w;
    public final LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1 x;

    public a(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0, LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10) {
        this.w = lazyGridSpanLayoutProvider0;
        this.x = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LineConfiguration lazyGridSpanLayoutProvider$LineConfiguration0 = this.w.getLineConfiguration(((Number)object0).intValue());
        int v = lazyGridSpanLayoutProvider$LineConfiguration0.getFirstItemIndex();
        ArrayList arrayList0 = new ArrayList(lazyGridSpanLayoutProvider$LineConfiguration0.getSpans().size());
        List list0 = lazyGridSpanLayoutProvider$LineConfiguration0.getSpans();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = GridItemSpan.getCurrentLineSpan-impl(((GridItemSpan)list0.get(v2)).unbox-impl());
            arrayList0.add(TuplesKt.to(v, Constraints.box-impl(this.x.childConstraints-JhjzzOo$foundation_release(v3, v4))));
            ++v;
            v3 += v4;
        }
        return arrayList0;
    }
}

