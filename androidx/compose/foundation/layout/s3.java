package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s3 extends Lambda implements Function1 {
    public final int[] A;
    public final Placeable[] w;
    public final RowMeasurePolicy x;
    public final int y;
    public final int z;

    public s3(Placeable[] arr_placeable, RowMeasurePolicy rowMeasurePolicy0, int v, int v1, int[] arr_v) {
        this.w = arr_placeable;
        this.x = rowMeasurePolicy0;
        this.y = v;
        this.z = v1;
        this.A = arr_v;
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
            int v2 = RowMeasurePolicy.access$getCrossAxisPosition(this.x, placeable0, rowColumnParentData0, this.y, this.z);
            PlacementScope.place$default(((PlacementScope)object0), placeable0, this.A[v], v2, 0.0f, 4, null);
            ++v1;
        }
        return Unit.INSTANCE;
    }
}

