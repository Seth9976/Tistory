package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ir extends Lambda implements Function2 {
    public final long A;
    public final Shape B;
    public final RichTooltipColors C;
    public final float D;
    public final float E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final TooltipScope w;
    public final Modifier x;
    public final Function2 y;
    public final Function2 z;

    public ir(TooltipScope tooltipScope0, Modifier modifier0, Function2 function20, Function2 function21, long v, Shape shape0, RichTooltipColors richTooltipColors0, float f, float f1, Function2 function22, int v1, int v2) {
        this.w = tooltipScope0;
        this.x = modifier0;
        this.y = function20;
        this.z = function21;
        this.A = v;
        this.B = shape0;
        this.C = richTooltipColors0;
        this.D = f;
        this.E = f1;
        this.F = function22;
        this.G = v1;
        this.H = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        Tooltip_androidKt.RichTooltip-yDvdmqw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

