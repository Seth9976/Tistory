package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.material3.v6;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u001D\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\r\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\t\u0010\n¨\u0006\u000E"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "", "itemIndex", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "findVisibleItem", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo$annotations", "()V", "EmptyLazyStaggeredGridLayoutInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridMeasureResult a;

    static {
        int[] arr_v = new int[0];
        LazyStaggeredGridMeasureResultKt.a = new LazyStaggeredGridMeasureResult(arr_v, arr_v, 0.0f, new LazyStaggeredGridMeasureResultKt.EmptyLazyStaggeredGridLayoutInfo.1(), false, false, false, new LazyStaggeredGridSlots(arr_v, arr_v), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, CollectionsKt__CollectionsKt.emptyList(), 0L, 0, 0, 0, 0, 0, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), null);
    }

    @Nullable
    public static final LazyStaggeredGridItemInfo findVisibleItem(@NotNull LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo0, int v) {
        if(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int v1 = ((LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.first(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo())).getIndex();
        if(v <= ((LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.last(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo())).getIndex() && v1 <= v) {
            int v2 = CollectionsKt__CollectionsKt.binarySearch$default(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo(), 0, 0, new v6(v, 6), 3, null);
            return (LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo(), v2);
        }
        return null;
    }

    @NotNull
    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return LazyStaggeredGridMeasureResultKt.a;
    }

    public static void getEmptyLazyStaggeredGridLayoutInfo$annotations() {
    }
}

