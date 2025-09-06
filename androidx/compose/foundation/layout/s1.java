package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function2 {
    public final int A;
    public final FlowRowOverflow B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final Modifier w;
    public final Horizontal x;
    public final Vertical y;
    public final int z;

    public s1(Modifier modifier0, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, int v, int v1, FlowRowOverflow flowRowOverflow0, Function3 function30, int v2, int v3) {
        this.w = modifier0;
        this.x = arrangement$Horizontal0;
        this.y = arrangement$Vertical0;
        this.z = v;
        this.A = v1;
        this.B = flowRowOverflow0;
        this.C = function30;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FlowLayoutKt.FlowRow(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

