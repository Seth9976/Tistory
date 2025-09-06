package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001AF\u0010\u0000\u001A\u0004\u0018\u00010\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"})
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(@NotNull List list0, @NotNull LazyListMeasuredItemProvider lazyListMeasuredItemProvider0, @NotNull List list1, int v, int v1, int v2) {
        int v3 = ((LazyListMeasuredItem)CollectionsKt___CollectionsKt.first(list0)).getIndex();
        int v4 = list1.size();
        int v5 = -1;
        int v6 = -1;
        int v7 = 0;
        while(v7 < v4 && ((Number)list1.get(v7)).intValue() <= v3) {
            v6 = ((Number)list1.get(v7)).intValue();
            ++v7;
            Integer integer0 = v7 < 0 || v7 > CollectionsKt__CollectionsKt.getLastIndex(list1) ? -1 : list1.get(v7);
            v5 = integer0.intValue();
        }
        int v8 = list0.size();
        int v9 = 0x80000000;
        int v10 = 0x80000000;
        int v11 = -1;
        for(int v12 = 0; v12 < v8; ++v12) {
            LazyListMeasuredItem lazyListMeasuredItem0 = (LazyListMeasuredItem)list0.get(v12);
            if(lazyListMeasuredItem0.getIndex() == v6) {
                v9 = lazyListMeasuredItem0.getOffset();
                v11 = v12;
            }
            else if(lazyListMeasuredItem0.getIndex() == v5) {
                v10 = lazyListMeasuredItem0.getOffset();
            }
        }
        if(v6 == -1) {
            return null;
        }
        LazyListMeasuredItem lazyListMeasuredItem1 = LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v6, 0L, 2, null);
        lazyListMeasuredItem1.setNonScrollableItem(true);
        int v13 = v9 == 0x80000000 ? -v : Math.max(-v, v9);
        if(v10 != 0x80000000) {
            v13 = Math.min(v13, v10 - lazyListMeasuredItem1.getSize());
        }
        lazyListMeasuredItem1.position(v13, v1, v2);
        if(v11 != -1) {
            list0.set(v11, lazyListMeasuredItem1);
            return lazyListMeasuredItem1;
        }
        list0.add(0, lazyListMeasuredItem1);
        return lazyListMeasuredItem1;
    }
}

