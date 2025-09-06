package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class tk extends Lambda implements Function2 {
    public final ClosedFloatingPointRange A;
    public final Function0 B;
    public final SliderColors C;
    public final MutableInteractionSource D;
    public final MutableInteractionSource E;
    public final Function3 F;
    public final Function3 G;
    public final Function3 H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final ClosedFloatingPointRange w;
    public final Function1 x;
    public final Modifier y;
    public final boolean z;

    public tk(ClosedFloatingPointRange closedFloatingPointRange0, Function1 function10, Modifier modifier0, boolean z, ClosedFloatingPointRange closedFloatingPointRange1, Function0 function00, SliderColors sliderColors0, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Function3 function30, Function3 function31, Function3 function32, int v, int v1, int v2, int v3) {
        this.w = closedFloatingPointRange0;
        this.x = function10;
        this.y = modifier0;
        this.z = z;
        this.A = closedFloatingPointRange1;
        this.B = function00;
        this.C = sliderColors0;
        this.D = mutableInteractionSource0;
        this.E = mutableInteractionSource1;
        this.F = function30;
        this.G = function31;
        this.H = function32;
        this.I = v;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SliderKt.RangeSlider(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

