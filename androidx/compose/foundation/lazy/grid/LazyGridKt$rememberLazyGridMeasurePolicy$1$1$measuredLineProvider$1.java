package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "index", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "items", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "mainAxisSpacing", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "createLine", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1 extends LazyGridMeasuredLineProvider {
    public final boolean g;
    public final LazyGridSlots h;

    public LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1(boolean z, LazyGridSlots lazyGridSlots0, int v, int v1, LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0) {
        this.g = z;
        this.h = lazyGridSlots0;
        super(z, lazyGridSlots0, v, v1, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10, lazyGridSpanLayoutProvider0);
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
    @NotNull
    public LazyGridMeasuredLine createLine(int v, @NotNull LazyGridMeasuredItem[] arr_lazyGridMeasuredItem, @NotNull List list0, int v1) {
        return new LazyGridMeasuredLine(v, arr_lazyGridMeasuredItem, this.h, list0, this.g, v1);
    }
}

