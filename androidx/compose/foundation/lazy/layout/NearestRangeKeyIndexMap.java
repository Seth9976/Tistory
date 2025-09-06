package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000E\u001A\u0004\u0018\u00010\b2\u0006\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "", "key", "", "getIndex", "(Ljava/lang/Object;)I", "index", "getKey", "(I)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,103:1\n1#2:104\n26#3:105\n360#4,5:106\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n73#1:105\n98#1:106,5\n*E\n"})
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    public final ObjectIntMap a;
    public final Object[] b;
    public final int c;

    public NearestRangeKeyIndexMap(@NotNull IntRange intRange0, @NotNull LazyLayoutIntervalContent lazyLayoutIntervalContent0) {
        IntervalList intervalList0 = lazyLayoutIntervalContent0.getIntervals();
        int v = intRange0.getFirst();
        if(v < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int v1 = Math.min(intRange0.getLast(), intervalList0.getSize() - 1);
        if(v1 < v) {
            this.a = ObjectIntMapKt.emptyObjectIntMap();
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int v2 = v1 - v + 1;
        this.b = new Object[v2];
        this.c = v;
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(v2);
        intervalList0.forEach(v, v1, new d(v, v1, mutableObjectIntMap0, this));
        this.a = mutableObjectIntMap0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(@NotNull Object object0) {
        int v = this.a.findKeyIndex(object0);
        return v < 0 ? -1 : this.a.values[v];
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    @Nullable
    public Object getKey(int v) {
        int v1 = v - this.c;
        if(v1 >= 0) {
            return v1 > ArraysKt___ArraysKt.getLastIndex(this.b) ? null : this.b[v1];
        }
        return null;
    }
}

