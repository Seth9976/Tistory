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

public final class bl extends Lambda implements Function2 {
    public final Function0 A;
    public final SliderColors B;
    public final MutableInteractionSource C;
    public final int D;
    public final Function3 E;
    public final Function3 F;
    public final ClosedFloatingPointRange G;
    public final int H;
    public final int I;
    public final int J;
    public final float w;
    public final Function1 x;
    public final Modifier y;
    public final boolean z;

    public bl(float f, Function1 function10, Modifier modifier0, boolean z, Function0 function00, SliderColors sliderColors0, MutableInteractionSource mutableInteractionSource0, int v, Function3 function30, Function3 function31, ClosedFloatingPointRange closedFloatingPointRange0, int v1, int v2, int v3) {
        this.w = f;
        this.x = function10;
        this.y = modifier0;
        this.z = z;
        this.A = function00;
        this.B = sliderColors0;
        this.C = mutableInteractionSource0;
        this.D = v;
        this.E = function30;
        this.F = function31;
        this.G = closedFloatingPointRange0;
        this.H = v1;
        this.I = v2;
        this.J = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SliderKt.Slider(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

