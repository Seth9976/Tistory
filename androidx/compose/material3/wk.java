package androidx.compose.material3;

import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class wk extends Lambda implements Function2 {
    public final boolean A;
    public final ClosedFloatingPointRange B;
    public final int C;
    public final Function0 D;
    public final int E;
    public final int F;
    public final Object G;
    public final int w;
    public final ClosedFloatingPointRange x;
    public final Function1 y;
    public final Modifier z;

    public wk(ClosedFloatingPointRange closedFloatingPointRange0, Function1 function10, Modifier modifier0, boolean z, ClosedFloatingPointRange closedFloatingPointRange1, int v, Function0 function00, Object object0, int v1, int v2, int v3) {
        this.w = v3;
        this.x = closedFloatingPointRange0;
        this.y = function10;
        this.z = modifier0;
        this.A = z;
        this.B = closedFloatingPointRange1;
        this.C = v;
        this.D = function00;
        this.G = object0;
        this.E = v1;
        this.F = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SliderKt.RangeSlider(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((SliderColors)this.G), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.SliderKt.RangeSlider(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((androidx.compose.material3.SliderColors)this.G), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

