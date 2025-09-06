package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "", "itemIndex", "", "isFullSpan", "(I)Z", "a", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;
    public final IntervalList a;

    public LazyStaggeredGridSpanProvider(@NotNull IntervalList intervalList0) {
        this.a = intervalList0;
    }

    @NotNull
    public final IntervalList getIntervals() {
        return this.a;
    }

    public final boolean isFullSpan(int v) {
        if(v >= 0) {
            IntervalList intervalList0 = this.a;
            if(v < intervalList0.getSize()) {
                Interval intervalList$Interval0 = intervalList0.get(v);
                Function1 function10 = ((LazyStaggeredGridInterval)intervalList$Interval0.getValue()).getSpan();
                return function10 != null && function10.invoke(((int)(v - intervalList$Interval0.getStartIndex()))) == StaggeredGridItemSpan.Companion.getFullLine();
            }
        }
        return false;
    }
}

