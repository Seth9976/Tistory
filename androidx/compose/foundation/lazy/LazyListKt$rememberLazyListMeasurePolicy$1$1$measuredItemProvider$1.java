package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001JB\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u00042\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "", "index", "", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "createItem-X9ElhV4", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "createItem", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1 extends LazyListMeasuredItemProvider {
    public final boolean d;
    public final LazyLayoutMeasureScope e;
    public final int f;
    public final int g;
    public final Horizontal h;
    public final Vertical i;
    public final boolean j;
    public final int k;
    public final int l;
    public final long m;
    public final LazyListState n;

    public LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1(long v, boolean z, LazyListItemProvider lazyListItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v1, int v2, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, boolean z1, int v3, int v4, long v5, LazyListState lazyListState0) {
        this.d = z;
        this.e = lazyLayoutMeasureScope0;
        this.f = v1;
        this.g = v2;
        this.h = alignment$Horizontal0;
        this.i = alignment$Vertical0;
        this.j = z1;
        this.k = v3;
        this.l = v4;
        this.m = v5;
        this.n = lazyListState0;
        super(v, z, lazyListItemProvider0, lazyLayoutMeasureScope0, null);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
    @NotNull
    public LazyListMeasuredItem createItem-X9ElhV4(int v, @NotNull Object object0, @Nullable Object object1, @NotNull List list0, long v1) {
        LayoutDirection layoutDirection0 = this.e.getLayoutDirection();
        return new LazyListMeasuredItem(v, list0, this.d, this.h, this.i, layoutDirection0, this.j, this.k, this.l, (v == this.f - 1 ? 0 : this.g), this.m, object0, object1, this.n.getItemAnimator$foundation_release(), v1, null);
    }
}

