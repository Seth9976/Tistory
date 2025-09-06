package c0;

import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final PaddingValues w;
    public final GridCells x;
    public final Vertical y;

    public f(PaddingValues paddingValues0, GridCells gridCells0, Vertical arrangement$Vertical0) {
        this.w = paddingValues0;
        this.x = gridCells0;
        this.y = arrangement$Vertical0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        if(Constraints.getMaxHeight-impl(v) == 0x7FFFFFFF) {
            throw new IllegalArgumentException("LazyHorizontalGrid\'s height should be bound by parent.");
        }
        float f = this.w.calculateTopPadding-D9Ej5fM();
        int v1 = Constraints.getMaxHeight-impl(v) - ((Density)object0).roundToPx-0680j_4(Dp.constructor-impl(this.w.calculateBottomPadding-D9Ej5fM() + f));
        int v2 = ((Density)object0).roundToPx-0680j_4(this.y.getSpacing-D9Ej5fM());
        int[] arr_v = CollectionsKt___CollectionsKt.toIntArray(this.x.calculateCrossAxisCellSizes(((Density)object0), v1, v2));
        int[] arr_v1 = new int[arr_v.length];
        this.y.arrange(((Density)object0), v1, arr_v, arr_v1);
        return new LazyGridSlots(arr_v, arr_v1);
    }
}

