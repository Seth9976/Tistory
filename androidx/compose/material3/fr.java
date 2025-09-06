package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class fr extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final float C;
    public final float D;
    public final Function2 E;
    public final int F;
    public final int G;
    public final TooltipScope w;
    public final Modifier x;
    public final long y;
    public final Shape z;

    public fr(TooltipScope tooltipScope0, Modifier modifier0, long v, Shape shape0, long v1, long v2, float f, float f1, Function2 function20, int v3, int v4) {
        this.w = tooltipScope0;
        this.x = modifier0;
        this.y = v;
        this.z = shape0;
        this.A = v1;
        this.B = v2;
        this.C = f;
        this.D = f1;
        this.E = function20;
        this.F = v3;
        this.G = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        Tooltip_androidKt.PlainTooltip-7QI4Sbk(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

