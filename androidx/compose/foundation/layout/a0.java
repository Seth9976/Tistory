package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final MeasureScope A;
    public final int[] B;
    public final Placeable[] w;
    public final ColumnMeasurePolicy x;
    public final int y;
    public final int z;

    public a0(Placeable[] arr_placeable, ColumnMeasurePolicy columnMeasurePolicy0, int v, int v1, MeasureScope measureScope0, int[] arr_v) {
        this.w = arr_placeable;
        this.x = columnMeasurePolicy0;
        this.y = v;
        this.z = v1;
        this.A = measureScope0;
        this.B = arr_v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable[] arr_placeable = this.w;
        int v1 = 0;
        for(int v = 0; v1 < arr_placeable.length; ++v) {
            Placeable placeable0 = arr_placeable[v1];
            Intrinsics.checkNotNull(placeable0);
            RowColumnParentData rowColumnParentData0 = RowColumnImplKt.getRowColumnParentData(placeable0);
            LayoutDirection layoutDirection0 = this.A.getLayoutDirection();
            PlacementScope.place$default(((PlacementScope)object0), placeable0, ColumnMeasurePolicy.access$getCrossAxisPosition(this.x, placeable0, rowColumnParentData0, this.y, this.z, layoutDirection0), this.B[v], 0.0f, 4, null);
            ++v1;
        }
        return Unit.INSTANCE;
    }
}

