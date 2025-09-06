package c0;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final PaddingValues w;
    public final GridCells x;
    public final Horizontal y;

    public e(PaddingValues paddingValues0, GridCells gridCells0, Horizontal arrangement$Horizontal0) {
        this.w = paddingValues0;
        this.x = gridCells0;
        this.y = arrangement$Horizontal0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        if(Constraints.getMaxWidth-impl(v) == 0x7FFFFFFF) {
            throw new IllegalArgumentException("LazyVerticalGrid\'s width should be bound by parent.");
        }
        float f = PaddingKt.calculateStartPadding(this.w, LayoutDirection.Ltr);
        int v1 = Constraints.getMaxWidth-impl(v) - ((Density)object0).roundToPx-0680j_4(Dp.constructor-impl(PaddingKt.calculateEndPadding(this.w, LayoutDirection.Ltr) + f));
        int v2 = ((Density)object0).roundToPx-0680j_4(this.y.getSpacing-D9Ej5fM());
        int[] arr_v = CollectionsKt___CollectionsKt.toIntArray(this.x.calculateCrossAxisCellSizes(((Density)object0), v1, v2));
        int[] arr_v1 = new int[arr_v.length];
        this.y.arrange(((Density)object0), v1, arr_v, LayoutDirection.Ltr, arr_v1);
        return new LazyGridSlots(arr_v, arr_v1);
    }
}

