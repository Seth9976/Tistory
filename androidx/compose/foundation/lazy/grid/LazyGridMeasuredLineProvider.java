package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0006¢\u0006\u0004\b\u001A\u0010\u001BJ;\u0010#\u001A\u00020\u00192\u0006\u0010\u0015\u001A\u00020\u00062\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C2\f\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\u001F2\u0006\u0010\"\u001A\u00020\u0006H&¢\u0006\u0004\b#\u0010$R\u0011\u0010(\u001A\u00020%8F¢\u0006\u0006\u001A\u0004\b&\u0010\'\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "<init>", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "startSlot", "span", "Landroidx/compose/ui/unit/Constraints;", "childConstraints-JhjzzOo$foundation_release", "(II)J", "childConstraints", "index", "spanOf", "(I)I", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getAndMeasure", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "items", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "mainAxisSpacing", "createLine", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    public final boolean a;
    public final LazyGridSlots b;
    public final int c;
    public final int d;
    public final LazyGridMeasuredItemProvider e;
    public final LazyGridSpanLayoutProvider f;

    public LazyGridMeasuredLineProvider(boolean z, @NotNull LazyGridSlots lazyGridSlots0, int v, int v1, @NotNull LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider0, @NotNull LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0) {
        this.a = z;
        this.b = lazyGridSlots0;
        this.c = v;
        this.d = v1;
        this.e = lazyGridMeasuredItemProvider0;
        this.f = lazyGridSpanLayoutProvider0;
    }

    public final long childConstraints-JhjzzOo$foundation_release(int v, int v1) {
        int v2;
        LazyGridSlots lazyGridSlots0 = this.b;
        if(v1 == 1) {
            v2 = lazyGridSlots0.getSizes()[v];
        }
        else {
            int v3 = v1 + v - 1;
            v2 = lazyGridSlots0.getPositions()[v3] + lazyGridSlots0.getSizes()[v3] - lazyGridSlots0.getPositions()[v];
        }
        int v4 = c.coerceAtLeast(v2, 0);
        return this.a ? Constraints.Companion.fixedWidth-OenEA2s(v4) : Constraints.Companion.fixedHeight-OenEA2s(v4);
    }

    @NotNull
    public abstract LazyGridMeasuredLine createLine(int arg1, @NotNull LazyGridMeasuredItem[] arg2, @NotNull List arg3, int arg4);

    @NotNull
    public final LazyGridMeasuredLine getAndMeasure(int v) {
        LineConfiguration lazyGridSpanLayoutProvider$LineConfiguration0 = this.f.getLineConfiguration(v);
        int v1 = lazyGridSpanLayoutProvider$LineConfiguration0.getSpans().size();
        int v3 = v1 == 0 || lazyGridSpanLayoutProvider$LineConfiguration0.getFirstItemIndex() + v1 == this.c ? 0 : this.d;
        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = new LazyGridMeasuredItem[v1];
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v5 = GridItemSpan.getCurrentLineSpan-impl(((GridItemSpan)lazyGridSpanLayoutProvider$LineConfiguration0.getSpans().get(v2)).unbox-impl());
            long v6 = this.childConstraints-JhjzzOo$foundation_release(v4, v5);
            LazyGridMeasuredItem lazyGridMeasuredItem0 = this.e.getAndMeasure-m8Kt_7k(lazyGridSpanLayoutProvider$LineConfiguration0.getFirstItemIndex() + v2, v6, v4, v5, v3);
            v4 += v5;
            arr_lazyGridMeasuredItem[v2] = lazyGridMeasuredItem0;
        }
        return this.createLine(v, arr_lazyGridMeasuredItem, lazyGridSpanLayoutProvider$LineConfiguration0.getSpans(), v3);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.e.getKeyIndexMap();
    }

    public final int spanOf(int v) {
        int v1 = this.f.getSlotsPerLine();
        return this.f.spanOf(v, v1);
    }
}

