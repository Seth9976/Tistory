package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class bg extends Lambda implements Function2 {
    public final Shape A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final NavigationItemColors H;
    public final Modifier I;
    public final boolean J;
    public final Function2 K;
    public final Function2 L;
    public final int M;
    public final MutableInteractionSource N;
    public final int O;
    public final int P;
    public final boolean w;
    public final Function0 x;
    public final Function2 y;
    public final TextStyle z;

    public bg(boolean z, Function0 function00, Function2 function20, TextStyle textStyle0, Shape shape0, float f, float f1, float f2, float f3, float f4, float f5, NavigationItemColors navigationItemColors0, Modifier modifier0, boolean z1, Function2 function21, Function2 function22, int v, MutableInteractionSource mutableInteractionSource0, int v1, int v2) {
        this.w = z;
        this.x = function00;
        this.y = function20;
        this.z = textStyle0;
        this.A = shape0;
        this.B = f;
        this.C = f1;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = f5;
        this.H = navigationItemColors0;
        this.I = modifier0;
        this.J = z1;
        this.K = function21;
        this.L = function22;
        this.M = v;
        this.N = mutableInteractionSource0;
        this.O = v1;
        this.P = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationItemKt.NavigationItem-SHbi2eg(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P));
        return Unit.INSTANCE;
    }
}

