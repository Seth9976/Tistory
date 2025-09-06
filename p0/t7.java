package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t7 extends Lambda implements Function2 {
    public final SliderColors A;
    public final float B;
    public final MutableInteractionSource C;
    public final MutableInteractionSource D;
    public final Modifier E;
    public final Modifier F;
    public final Modifier G;
    public final int H;
    public final int I;
    public final boolean w;
    public final float x;
    public final float y;
    public final List z;

    public t7(boolean z, float f, float f1, List list0, SliderColors sliderColors0, float f2, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Modifier modifier0, Modifier modifier1, Modifier modifier2, int v, int v1) {
        this.w = z;
        this.x = f;
        this.y = f1;
        this.z = list0;
        this.A = sliderColors0;
        this.B = f2;
        this.C = mutableInteractionSource0;
        this.D = mutableInteractionSource1;
        this.E = modifier0;
        this.F = modifier1;
        this.G = modifier2;
        this.H = v;
        this.I = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SliderKt.access$RangeSliderImpl(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I));
        return Unit.INSTANCE;
    }
}

