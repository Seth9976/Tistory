package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m9 extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final BorderStroke C;
    public final float D;
    public final MutableInteractionSource E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final Function0 w;
    public final Modifier x;
    public final boolean y;
    public final Shape z;

    public m9(Function0 function00, Modifier modifier0, boolean z, Shape shape0, long v, long v1, BorderStroke borderStroke0, float f, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v2, int v3) {
        this.w = function00;
        this.x = modifier0;
        this.y = z;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = borderStroke0;
        this.D = f;
        this.E = mutableInteractionSource0;
        this.F = function20;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SurfaceKt.Surface-LPr_se0(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

