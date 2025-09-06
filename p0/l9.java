package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l9 extends Lambda implements Function2 {
    public final long A;
    public final BorderStroke B;
    public final float C;
    public final MutableInteractionSource D;
    public final Indication E;
    public final boolean F;
    public final String G;
    public final Role H;
    public final Function2 I;
    public final int J;
    public final int K;
    public final int L;
    public final Function0 w;
    public final Modifier x;
    public final Shape y;
    public final long z;

    public l9(Function0 function00, Modifier modifier0, Shape shape0, long v, long v1, BorderStroke borderStroke0, float f, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, Function2 function20, int v2, int v3, int v4) {
        this.w = function00;
        this.x = modifier0;
        this.y = shape0;
        this.z = v;
        this.A = v1;
        this.B = borderStroke0;
        this.C = f;
        this.D = mutableInteractionSource0;
        this.E = indication0;
        this.F = z;
        this.G = s;
        this.H = role0;
        this.I = function20;
        this.J = v2;
        this.K = v3;
        this.L = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SurfaceKt.Surface-9VG74zQ(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

