package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final int C;
    public final AlignmentLine w;
    public final float x;
    public final int y;
    public final int z;

    public b(AlignmentLine alignmentLine0, float f, int v, int v1, int v2, Placeable placeable0, int v3) {
        this.w = alignmentLine0;
        this.x = f;
        this.y = v;
        this.z = v1;
        this.A = v2;
        this.B = placeable0;
        this.C = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v3;
        int v2;
        AlignmentLine alignmentLine0 = this.w;
        Placeable placeable0 = this.B;
        int v = this.A;
        int v1 = this.y;
        float f = this.x;
        if(AlignmentLineKt.access$getHorizontal(alignmentLine0)) {
            v2 = 0;
        }
        else {
            v2 = Dp.equals-impl0(f, NaNf) ? this.z - v - placeable0.getWidth() : v1;
        }
        if(AlignmentLineKt.access$getHorizontal(alignmentLine0)) {
            v3 = Dp.equals-impl0(f, NaNf) ? this.C - v - placeable0.getHeight() : v1;
        }
        else {
            v3 = 0;
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.B, v2, v3, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

