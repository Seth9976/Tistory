package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function1 {
    public final Placeable[] A;
    public final FlowLineMeasurePolicy B;
    public final int C;
    public final MeasureScope D;
    public final int E;
    public final int[] F;
    public final int[] w;
    public final int x;
    public final int y;
    public final int z;

    public c2(int[] arr_v, int v, int v1, int v2, Placeable[] arr_placeable, FlowLineMeasurePolicy flowLineMeasurePolicy0, int v3, MeasureScope measureScope0, int v4, int[] arr_v1) {
        this.w = arr_v;
        this.x = v;
        this.y = v1;
        this.z = v2;
        this.A = arr_placeable;
        this.B = flowLineMeasurePolicy0;
        this.C = v3;
        this.D = measureScope0;
        this.E = v4;
        this.F = arr_v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.w == null ? 0 : this.w[this.x];
        int v1 = this.y;
        for(int v2 = v1; v2 < this.z; ++v2) {
            Placeable placeable0 = this.A[v2];
            Intrinsics.checkNotNull(placeable0);
            RowColumnParentData rowColumnParentData0 = RowColumnImplKt.getRowColumnParentData(placeable0);
            LayoutDirection layoutDirection0 = this.D.getLayoutDirection();
            int v3 = this.B.getCrossAxisPosition(placeable0, rowColumnParentData0, this.C, layoutDirection0, this.E) + v;
            boolean z = this.B.isHorizontal();
            int[] arr_v = this.F;
            if(z) {
                PlacementScope.place$default(((PlacementScope)object0), placeable0, arr_v[v2 - v1], v3, 0.0f, 4, null);
            }
            else {
                PlacementScope.place$default(((PlacementScope)object0), placeable0, v3, arr_v[v2 - v1], 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}

