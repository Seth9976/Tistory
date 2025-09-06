package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class eg extends Lambda implements Function2 {
    public final int A;
    public final Function2 B;
    public final Function0 C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final int I;
    public final int J;
    public final InteractionSource w;
    public final long x;
    public final Shape y;
    public final Function2 z;

    public eg(InteractionSource interactionSource0, long v, Shape shape0, Function2 function20, int v1, Function2 function21, Function0 function00, float f, float f1, float f2, float f3, float f4, int v2, int v3) {
        this.w = interactionSource0;
        this.x = v;
        this.y = shape0;
        this.z = function20;
        this.A = v1;
        this.B = function21;
        this.C = function00;
        this.D = f;
        this.E = f1;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        this.I = v2;
        this.J = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationItemKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J));
        return Unit.INSTANCE;
    }
}

