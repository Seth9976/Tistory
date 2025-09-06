package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.material3.v6;
import androidx.compose.runtime.internal.StabilityInferred;
import c0.o;
import c0.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\u0003\u001B\u001C\u001DB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010R*\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00068\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001A\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0015¨\u0006\u001E"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "gridContent", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "getLineConfiguration", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "itemIndex", "getLineIndexOfItem", "(I)I", "maxSpan", "spanOf", "(II)I", "value", "i", "I", "getSlotsPerLine", "()I", "setSlotsPerLine", "(I)V", "slotsPerLine", "getTotalSize", "totalSize", "c0/o", "c0/p", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
public final class LazyGridSpanLayoutProvider {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "getFirstItemIndex", "()I", "b", "Ljava/util/List;", "getSpans", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class LineConfiguration {
        public static final int $stable = 8;
        public final int a;
        public final List b;

        public LineConfiguration(int v, @NotNull List list0) {
            this.a = v;
            this.b = list0;
        }

        public final int getFirstItemIndex() {
            return this.a;
        }

        @NotNull
        public final List getSpans() {
            return this.b;
        }
    }

    public static final int $stable = 8;
    public final LazyGridIntervalContent a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public LazyGridSpanLayoutProvider(@NotNull LazyGridIntervalContent lazyGridIntervalContent0) {
        this.a = lazyGridIntervalContent0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new o(0, 0));
        this.b = arrayList0;
        this.f = -1;
        this.g = new ArrayList();
        this.h = CollectionsKt__CollectionsKt.emptyList();
    }

    public final int a() {
        return ((int)Math.sqrt(((double)this.getTotalSize()) * 1.0 / ((double)this.i))) + 1;
    }

    @NotNull
    public final LineConfiguration getLineConfiguration(int v) {
        boolean z = true;
        if(!this.a.getHasCustomSpans$foundation_release()) {
            int v2 = v * this.i;
            int v3 = c.coerceAtLeast(c.coerceAtMost(this.i, this.getTotalSize() - v2), 0);
            if(v3 == this.h.size()) {
                return new LineConfiguration(v2, this.h);
            }
            ArrayList arrayList0 = new ArrayList(v3);
            for(int v1 = 0; v1 < v3; ++v1) {
                arrayList0.add(GridItemSpan.box-impl(LazyGridSpanKt.GridItemSpan(1)));
            }
            this.h = arrayList0;
            return new LineConfiguration(v2, arrayList0);
        }
        ArrayList arrayList1 = this.b;
        int v4 = Math.min(v / this.a(), arrayList1.size() - 1);
        int v5 = this.a() * v4;
        int v6 = ((o)arrayList1.get(v4)).a;
        int v7 = ((o)arrayList1.get(v4)).b;
        int v8 = this.c;
        ArrayList arrayList2 = this.g;
        if(v5 <= v8 && v8 <= v) {
            v6 = this.d;
            v7 = this.e;
            v5 = v8;
        }
        else if(v4 == this.f) {
            int v9 = v - v5;
            if(v9 < arrayList2.size()) {
                v6 = ((Number)arrayList2.get(v9)).intValue();
                v5 = v;
                v7 = 0;
            }
        }
        if(v5 % this.a() == 0 && (2 <= v - v5 && v - v5 < this.a())) {
            this.f = v4;
            arrayList2.clear();
        }
        else {
            z = false;
        }
        if(v5 > v) {
            throw new IllegalStateException("currentLine > lineIndex");
        }
        while(v5 < v && v6 < this.getTotalSize()) {
            if(z) {
                arrayList2.add(v6);
            }
            int v10 = 0;
            while(v10 < this.i && v6 < this.getTotalSize()) {
                if(v7 == 0) {
                    v7 = this.spanOf(v6, this.i - v10);
                }
                v10 += v7;
                if(v10 > this.i) {
                    break;
                }
                ++v6;
                v7 = 0;
            }
            ++v5;
            if(v5 % this.a() == 0 && v6 < this.getTotalSize()) {
                if(arrayList1.size() != v5 / this.a()) {
                    throw new IllegalStateException("invalid starting point");
                }
                arrayList1.add(new o(v6, v7));
            }
        }
        this.c = v;
        this.d = v6;
        this.e = v7;
        ArrayList arrayList3 = new ArrayList();
        int v11 = 0;
        int v12 = v6;
        while(v11 < this.i && v12 < this.getTotalSize()) {
            if(v7 == 0) {
                v7 = this.spanOf(v12, this.i - v11);
            }
            v11 += v7;
            if(v11 > this.i) {
                break;
            }
            ++v12;
            arrayList3.add(GridItemSpan.box-impl(LazyGridSpanKt.GridItemSpan(v7)));
            v7 = 0;
        }
        return new LineConfiguration(v6, arrayList3);
    }

    public final int getLineIndexOfItem(int v) {
        if(this.getTotalSize() <= 0) {
            return 0;
        }
        if(v >= this.getTotalSize()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if(!this.a.getHasCustomSpans$foundation_release()) {
            return v / this.i;
        }
        ArrayList arrayList0 = this.b;
        int v1 = CollectionsKt__CollectionsKt.binarySearch$default(arrayList0, 0, 0, new v6(v, 5), 3, null);
        if(v1 < 0) {
            v1 = -v1 - 2;
        }
        int v2 = this.a() * v1;
        int v3 = ((o)arrayList0.get(v1)).a;
        if(v3 > v) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int v4 = 0;
        while(v3 < v) {
            int v5 = this.spanOf(v3, this.i - v4);
            v4 += v5;
            int v6 = this.i;
            if(v4 >= v6) {
                if(v4 == v6) {
                    ++v2;
                    v4 = 0;
                }
                else {
                    ++v2;
                    v4 = v5;
                }
            }
            if(v2 % this.a() == 0 && v2 / this.a() >= arrayList0.size()) {
                arrayList0.add(new o(v3 + 1 - (v4 <= 0 ? 0 : 1), 0));
            }
            ++v3;
        }
        return this.spanOf(v, this.i - v4) + v4 <= this.i ? v2 : v2 + 1;
    }

    public final int getSlotsPerLine() {
        return this.i;
    }

    public final int getTotalSize() {
        return this.a.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int v) {
        if(v != this.i) {
            this.i = v;
            this.b.clear();
            o o0 = new o(0, 0);
            this.b.add(o0);
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = -1;
            this.g.clear();
        }
    }

    public final int spanOf(int v, int v1) {
        p.b = v1;
        p.c = this.i;
        Interval intervalList$Interval0 = this.a.getIntervals().get(v);
        return GridItemSpan.getCurrentLineSpan-impl(((GridItemSpan)((LazyGridInterval)intervalList$Interval0.getValue()).getSpan().invoke(p.a, ((int)(v - intervalList$Interval0.getStartIndex())))).unbox-impl());
    }
}

