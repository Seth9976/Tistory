package e0;

import androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l implements LazyGridStaggeredGridSlotsProvider {
    public final Lambda a;
    public long b;
    public float c;
    public LazyStaggeredGridSlots d;

    public l(Function2 function20) {
        this.a = (Lambda)function20;
        this.b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    public final LazyStaggeredGridSlots invoke-0kLqBqw(Density density0, long v) {
        if(this.d != null && Constraints.equals-impl0(this.b, v) && this.c == density0.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots0 = this.d;
            Intrinsics.checkNotNull(lazyStaggeredGridSlots0);
            return lazyStaggeredGridSlots0;
        }
        this.b = v;
        this.c = density0.getDensity();
        Constraints constraints0 = Constraints.box-impl(v);
        LazyStaggeredGridSlots lazyStaggeredGridSlots1 = (LazyStaggeredGridSlots)((Function2)this.a).invoke(density0, constraints0);
        this.d = lazyStaggeredGridSlots1;
        return lazyStaggeredGridSlots1;
    }
}

