package c0;

import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b implements LazyGridSlotsProvider {
    public final Lambda a;
    public long b;
    public float c;
    public LazyGridSlots d;

    public b(Function2 function20) {
        this.a = (Lambda)function20;
        this.b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    public final LazyGridSlots invoke-0kLqBqw(Density density0, long v) {
        if(this.d != null && Constraints.equals-impl0(this.b, v) && this.c == density0.getDensity()) {
            LazyGridSlots lazyGridSlots0 = this.d;
            Intrinsics.checkNotNull(lazyGridSlots0);
            return lazyGridSlots0;
        }
        this.b = v;
        this.c = density0.getDensity();
        Constraints constraints0 = Constraints.box-impl(v);
        LazyGridSlots lazyGridSlots1 = (LazyGridSlots)((Function2)this.a).invoke(density0, constraints0);
        this.d = lazyGridSlots1;
        return lazyGridSlots1;
    }
}

