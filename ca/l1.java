package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class l1 extends Lambda implements Function2 {
    public final float A;
    public final Function2 B;
    public final boolean C;
    public final String D;
    public final int E;
    public final ClosedFloatingPointRange F;
    public final int G;
    public final int H;
    public final Modifier w;
    public final boolean x;
    public final float y;
    public final Function1 z;

    public l1(Modifier modifier0, boolean z, float f, Function1 function10, float f1, Function2 function20, boolean z1, String s, int v, ClosedFloatingPointRange closedFloatingPointRange0, int v1, int v2) {
        this.w = modifier0;
        this.x = z;
        this.y = f;
        this.z = function10;
        this.A = f1;
        this.B = function20;
        this.C = z1;
        this.D = s;
        this.E = v;
        this.F = closedFloatingPointRange0;
        this.G = v1;
        this.H = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KDSliderKt.KDSlider(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

