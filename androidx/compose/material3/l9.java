package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class l9 extends Lambda implements Function2 {
    public final ScrollState A;
    public final boolean B;
    public final Shape C;
    public final long D;
    public final float E;
    public final float F;
    public final BorderStroke G;
    public final Function3 H;
    public final int I;
    public final int J;
    public final int K;
    public final ExposedDropdownMenuBoxScope w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public l9(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, boolean z, Function0 function00, Modifier modifier0, ScrollState scrollState0, boolean z1, Shape shape0, long v, float f, float f1, BorderStroke borderStroke0, Function3 function30, int v1, int v2, int v3) {
        this.w = exposedDropdownMenuBoxScope0;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = scrollState0;
        this.B = z1;
        this.C = shape0;
        this.D = v;
        this.E = f;
        this.F = f1;
        this.G = borderStroke0;
        this.H = function30;
        this.I = v1;
        this.J = v2;
        this.K = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.ExposedDropdownMenu-vNxi1II(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

