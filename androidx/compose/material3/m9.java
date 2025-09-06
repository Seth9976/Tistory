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

public final class m9 extends Lambda implements Function2 {
    public final ScrollState A;
    public final boolean B;
    public final boolean C;
    public final Shape D;
    public final long E;
    public final float F;
    public final float G;
    public final BorderStroke H;
    public final Function3 I;
    public final int J;
    public final int K;
    public final int L;
    public final ExposedDropdownMenuBoxScope w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public m9(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, boolean z, Function0 function00, Modifier modifier0, ScrollState scrollState0, boolean z1, boolean z2, Shape shape0, long v, float f, float f1, BorderStroke borderStroke0, Function3 function30, int v1, int v2, int v3) {
        this.w = exposedDropdownMenuBoxScope0;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = scrollState0;
        this.B = z1;
        this.C = z2;
        this.D = shape0;
        this.E = v;
        this.F = f;
        this.G = f1;
        this.H = borderStroke0;
        this.I = function30;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.ExposedDropdownMenu-kbRbctU(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

