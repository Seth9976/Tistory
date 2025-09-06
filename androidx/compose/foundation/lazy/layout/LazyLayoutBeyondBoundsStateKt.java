package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\"\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"calculateLazyLayoutPinnedIndices", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
public final class LazyLayoutBeyondBoundsStateKt {
    @NotNull
    public static final List calculateLazyLayoutPinnedIndices(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider0, @NotNull LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, @NotNull LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo0) {
        if(!lazyLayoutBeyondBoundsInfo0.hasIntervals() && lazyLayoutPinnedItemList0.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        IntRange intRange0 = lazyLayoutBeyondBoundsInfo0.hasIntervals() ? new IntRange(lazyLayoutBeyondBoundsInfo0.getStart(), Math.min(lazyLayoutBeyondBoundsInfo0.getEnd(), lazyLayoutItemProvider0.getItemCount() - 1)) : IntRange.Companion.getEMPTY();
        int v = lazyLayoutPinnedItemList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v1);
            int v2 = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider0, lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if((v2 > intRange0.getLast() || intRange0.getFirst() > v2) && v2 >= 0 && v2 < lazyLayoutItemProvider0.getItemCount()) {
                list0.add(v2);
            }
        }
        int v3 = intRange0.getFirst();
        int v4 = intRange0.getLast();
        if(v3 <= v4) {
            while(true) {
                list0.add(v3);
                if(v3 == v4) {
                    break;
                }
                ++v3;
            }
        }
        return list0;
    }
}

