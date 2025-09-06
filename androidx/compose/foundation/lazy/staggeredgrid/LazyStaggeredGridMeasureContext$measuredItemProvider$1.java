package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001JR\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u00062\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext$measuredItemProvider$1", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "", "index", "lane", "span", "", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "createItem-pitSLOA", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "createItem", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyStaggeredGridMeasureContext.measuredItemProvider.1 extends LazyStaggeredGridMeasureProvider {
    public final LazyStaggeredGridMeasureContext e;

    public LazyStaggeredGridMeasureContext.measuredItemProvider.1(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, boolean z, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, LazyStaggeredGridSlots lazyStaggeredGridSlots0) {
        this.e = lazyStaggeredGridMeasureContext0;
        super(z, lazyStaggeredGridItemProvider0, lazyLayoutMeasureScope0, lazyStaggeredGridSlots0);
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
    @NotNull
    public LazyStaggeredGridMeasuredItem createItem-pitSLOA(int v, int v1, int v2, @NotNull Object object0, @Nullable Object object1, @NotNull List list0, long v3) {
        return new LazyStaggeredGridMeasuredItem(v, object0, list0, this.e.isVertical(), this.e.getMainAxisSpacing(), v1, v2, this.e.getBeforeContentPadding(), this.e.getAfterContentPadding(), object1, this.e.getState().getItemAnimator$foundation_release(), v3, null);
    }
}

