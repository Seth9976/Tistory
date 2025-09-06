package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001Jb\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00022\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lane", "span", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "createItem-O3s9Psw", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "createItem", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1 extends LazyGridMeasuredItemProvider {
    public final LazyLayoutMeasureScope d;
    public final LazyGridState e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final long j;

    public LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1(LazyGridItemProvider lazyGridItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v, LazyGridState lazyGridState0, boolean z, boolean z1, int v1, int v2, long v3) {
        this.d = lazyLayoutMeasureScope0;
        this.e = lazyGridState0;
        this.f = z;
        this.g = z1;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        super(lazyGridItemProvider0, lazyLayoutMeasureScope0, v);
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
    @NotNull
    public LazyGridMeasuredItem createItem-O3s9Psw(int v, @NotNull Object object0, @Nullable Object object1, int v1, int v2, @NotNull List list0, long v3, int v4, int v5) {
        LayoutDirection layoutDirection0 = this.d.getLayoutDirection();
        LazyLayoutItemAnimator lazyLayoutItemAnimator0 = this.e.getItemAnimator$foundation_release();
        return new LazyGridMeasuredItem(v, object0, this.f, v1, v2, this.g, layoutDirection0, this.h, this.i, list0, this.j, object1, lazyLayoutItemAnimator0, v3, v4, v5, null);
    }
}

