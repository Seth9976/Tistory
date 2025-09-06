package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class sm extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final SwipeToDismissBoxState w;
    public final Function3 x;
    public final Modifier y;
    public final boolean z;

    public sm(SwipeToDismissBoxState swipeToDismissBoxState0, Function3 function30, Modifier modifier0, boolean z, boolean z1, boolean z2, Function3 function31, int v, int v1) {
        this.w = swipeToDismissBoxState0;
        this.x = function30;
        this.y = modifier0;
        this.z = z;
        this.A = z1;
        this.B = z2;
        this.C = function31;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SwipeToDismissBoxKt.SwipeToDismissBox(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

