package p0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.y;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class y6 extends Lambda implements Function2 {
    public final boolean A;
    public final WindowInsets B;
    public final Function2 C;
    public final Function3 D;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final int z;

    public y6(Function2 function20, Function2 function21, Function2 function22, int v, boolean z, WindowInsets windowInsets0, Function2 function23, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = v;
        this.A = z;
        this.B = windowInsets0;
        this.C = function23;
        this.D = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = Constraints.getMaxHeight-impl(v);
        long v3 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v1, v2, null, new y(((SubcomposeMeasureScope)object0), this.w, this.x, this.y, this.z, v1, this.A, this.B, v2, v3, this.C, this.D), 4, null);
    }
}

