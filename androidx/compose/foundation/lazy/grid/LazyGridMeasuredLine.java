package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001A\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\"\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001A\u0004\b!\u0010\u001BR\u0017\u0010%\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001A\u0004\b$\u0010\u001B¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "", "index", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "items", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "isEmpty", "()Z", "offset", "layoutWidth", "layoutHeight", "position", "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "a", "I", "getIndex", "()I", "b", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "g", "getMainAxisSize", "mainAxisSize", "h", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13579#2,2:87\n13644#2,3:89\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n46#1:87,2\n68#1:89,3\n*E\n"})
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    public final int a;
    public final LazyGridMeasuredItem[] b;
    public final LazyGridSlots c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public LazyGridMeasuredLine(int v, @NotNull LazyGridMeasuredItem[] arr_lazyGridMeasuredItem, @NotNull LazyGridSlots lazyGridSlots0, @NotNull List list0, boolean z, int v1) {
        this.a = v;
        this.b = arr_lazyGridMeasuredItem;
        this.c = lazyGridSlots0;
        this.d = list0;
        this.e = z;
        this.f = v1;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_lazyGridMeasuredItem.length; ++v2) {
            v3 = Math.max(v3, arr_lazyGridMeasuredItem[v2].getMainAxisSize());
        }
        this.g = v3;
        this.h = c.coerceAtLeast(v3 + this.f, 0);
    }

    public final int getIndex() {
        return this.a;
    }

    @NotNull
    public final LazyGridMeasuredItem[] getItems() {
        return this.b;
    }

    public final int getMainAxisSize() {
        return this.g;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.h;
    }

    public final boolean isEmpty() {
        return this.b.length == 0;
    }

    @NotNull
    public final LazyGridMeasuredItem[] position(int v, int v1, int v2) {
        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = this.b;
        int v3 = 0;
        int v5 = 0;
        for(int v4 = 0; v3 < arr_lazyGridMeasuredItem.length; ++v4) {
            LazyGridMeasuredItem lazyGridMeasuredItem0 = arr_lazyGridMeasuredItem[v3];
            int v6 = GridItemSpan.getCurrentLineSpan-impl(((GridItemSpan)this.d.get(v4)).unbox-impl());
            lazyGridMeasuredItem0.position(v, this.c.getPositions()[v5], v1, v2, (this.e ? this.a : v5), (this.e ? v5 : this.a));
            v5 += v6;
            ++v3;
        }
        return arr_lazyGridMeasuredItem;
    }
}

