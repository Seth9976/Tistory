package p0;

import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d8 extends Lambda implements Function2 {
    public final float A;
    public final List B;
    public final float C;
    public final float D;
    public final int E;
    public final Modifier w;
    public final SliderColors x;
    public final boolean y;
    public final float z;

    public d8(Modifier modifier0, SliderColors sliderColors0, boolean z, float f, float f1, List list0, float f2, float f3, int v) {
        this.w = modifier0;
        this.x = sliderColors0;
        this.y = z;
        this.z = f;
        this.A = f1;
        this.B = list0;
        this.C = f2;
        this.D = f3;
        this.E = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SliderKt.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)));
        return Unit.INSTANCE;
    }
}

