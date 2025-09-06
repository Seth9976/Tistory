package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ \u0010\u0013\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000Fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010!\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\u00192\b\u0010\u001B\u001A\u0004\u0018\u00010\u00192\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C2\u0006\u0010\u0016\u001A\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001F\u0010 R\u0011\u0010%\u001A\u00020\"8F¢\u0006\u0006\u001A\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "<init>", "(ZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "span", "getAndMeasure-jy6DScQ", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getAndMeasure", "lane", "Landroidx/compose/ui/unit/Constraints;", "constraints", "getAndMeasure--hBUhpc", "(IIIJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem-pitSLOA", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "createItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n1007#2:1335\n1009#2:1337\n1008#2:1338\n1007#2:1340\n107#3:1336\n114#3:1339\n107#3:1341\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1130#1:1335\n1131#1:1337\n1131#1:1338\n1131#1:1340\n1130#1:1336\n1131#1:1339\n1131#1:1341\n*E\n"})
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider {
    public static final int $stable = 8;
    public final boolean a;
    public final LazyStaggeredGridItemProvider b;
    public final LazyLayoutMeasureScope c;
    public final LazyStaggeredGridSlots d;

    public LazyStaggeredGridMeasureProvider(boolean z, @NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, @NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope0, @NotNull LazyStaggeredGridSlots lazyStaggeredGridSlots0) {
        this.a = z;
        this.b = lazyStaggeredGridItemProvider0;
        this.c = lazyLayoutMeasureScope0;
        this.d = lazyStaggeredGridSlots0;
    }

    @NotNull
    public abstract LazyStaggeredGridMeasuredItem createItem-pitSLOA(int arg1, int arg2, int arg3, @NotNull Object arg4, @Nullable Object arg5, @NotNull List arg6, long arg7);

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public LazyLayoutMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        return this.getAndMeasure--hBUhpc(v, v1, v2, v3);
    }

    @NotNull
    public LazyStaggeredGridMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        Object object0 = this.b.getKey(v);
        List list0 = this.c.measure-0kLqBqw(v, v3);
        return this.createItem-pitSLOA(v, v1, v2, object0, this.b.getContentType(v), list0, v3);
    }

    @NotNull
    public final LazyStaggeredGridMeasuredItem getAndMeasure-jy6DScQ(int v, long v1) {
        long v6;
        int v4;
        Object object0 = this.b.getKey(v);
        Object object1 = this.b.getContentType(v);
        LazyStaggeredGridSlots lazyStaggeredGridSlots0 = this.d;
        int[] arr_v = lazyStaggeredGridSlots0.getSizes();
        int v2 = c.coerceAtMost(((int)(v1 >> 0x20)), arr_v.length - 1);
        int v3 = c.coerceAtMost(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v1 >> 0x20)), arr_v.length - v2);
        if(v3 == 1) {
            v4 = lazyStaggeredGridSlots0.getSizes()[v2];
        }
        else {
            int v5 = v2 + v3 - 1;
            v4 = lazyStaggeredGridSlots0.getPositions()[v5] + lazyStaggeredGridSlots0.getSizes()[v5] - lazyStaggeredGridSlots0.getPositions()[v2];
        }
        if(this.a) {
            v6 = Constraints.Companion.fixedWidth-OenEA2s(v4);
            return this.createItem-pitSLOA(v, v2, v3, object0, object1, this.c.measure-0kLqBqw(v, v6), v6);
        }
        v6 = Constraints.Companion.fixedHeight-OenEA2s(v4);
        return this.createItem-pitSLOA(v, v2, v3, object0, object1, this.c.measure-0kLqBqw(v, v6), v6);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.b.getKeyIndexMap();
    }
}

