package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
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

public final class al extends Lambda implements Function2 {
    public final boolean A;
    public final ClosedFloatingPointRange B;
    public final int C;
    public final Function0 D;
    public final MutableInteractionSource E;
    public final int F;
    public final int G;
    public final Object H;
    public final int w;
    public final float x;
    public final Function1 y;
    public final Modifier z;

    public al(float f, Function1 function10, Modifier modifier0, boolean z, ClosedFloatingPointRange closedFloatingPointRange0, int v, Function0 function00, MutableInteractionSource mutableInteractionSource0, SliderColors sliderColors0, int v1, int v2) {
        this.w = 1;
        this.x = f;
        this.y = function10;
        this.z = modifier0;
        this.A = z;
        this.B = closedFloatingPointRange0;
        this.C = v;
        this.D = function00;
        this.E = mutableInteractionSource0;
        this.H = sliderColors0;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    public al(float f, Function1 function10, Modifier modifier0, boolean z, ClosedFloatingPointRange closedFloatingPointRange0, int v, Function0 function00, androidx.compose.material3.SliderColors sliderColors0, MutableInteractionSource mutableInteractionSource0, int v1, int v2) {
        this.w = 0;
        this.x = f;
        this.y = function10;
        this.z = modifier0;
        this.A = z;
        this.B = closedFloatingPointRange0;
        this.C = v;
        this.D = function00;
        this.H = sliderColors0;
        this.E = mutableInteractionSource0;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SliderKt.Slider(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((SliderColors)this.H), ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.SliderKt.Slider(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((androidx.compose.material3.SliderColors)this.H), this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

