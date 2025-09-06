package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j9 extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final BorderStroke D;
    public final float E;
    public final MutableInteractionSource F;
    public final Function2 G;
    public final int H;
    public final int I;
    public final int J;
    public final Function K;
    public final int w;
    public final boolean x;
    public final Modifier y;
    public final boolean z;

    public j9(boolean z, Function function0, Modifier modifier0, boolean z1, Shape shape0, long v, long v1, BorderStroke borderStroke0, float f, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v2, int v3, int v4, int v5) {
        this.w = v5;
        this.x = z;
        this.K = function0;
        this.y = modifier0;
        this.z = z1;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.D = borderStroke0;
        this.E = f;
        this.F = mutableInteractionSource0;
        this.G = function20;
        this.H = v2;
        this.I = v3;
        this.J = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SurfaceKt.Surface-Ny5ogXk(this.x, ((Function0)this.K), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SurfaceKt.Surface-Ny5ogXk(this.x, ((Function1)this.K), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

