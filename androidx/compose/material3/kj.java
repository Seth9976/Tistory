package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class kj extends Lambda implements Function2 {
    public final Function1 A;
    public final Modifier B;
    public final boolean C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final Shape G;
    public final SearchBarColors H;
    public final float I;
    public final float J;
    public final WindowInsets K;
    public final MutableInteractionSource L;
    public final Function3 M;
    public final int N;
    public final int O;
    public final int P;
    public final String w;
    public final Function1 x;
    public final Function1 y;
    public final boolean z;

    public kj(String s, Function1 function10, Function1 function11, boolean z, Function1 function12, Modifier modifier0, boolean z1, Function2 function20, Function2 function21, Function2 function22, Shape shape0, SearchBarColors searchBarColors0, float f, float f1, WindowInsets windowInsets0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v, int v1, int v2) {
        this.w = s;
        this.x = function10;
        this.y = function11;
        this.z = z;
        this.A = function12;
        this.B = modifier0;
        this.C = z1;
        this.D = function20;
        this.E = function21;
        this.F = function22;
        this.G = shape0;
        this.H = searchBarColors0;
        this.I = f;
        this.J = f1;
        this.K = windowInsets0;
        this.L = mutableInteractionSource0;
        this.M = function30;
        this.N = v;
        this.O = v1;
        this.P = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchBar_androidKt.SearchBar-WuY5d9Q(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, ((Composer)object0), (this.N | 1) & -920350135 | ((0x24924924 & (this.N | 1)) >> 1 | 306783378 & (this.N | 1)) | (306783378 & (this.N | 1)) << 1 & (0x24924924 & (this.N | 1)), this.O & -920350135 | ((0x24924924 & this.O) >> 1 | 306783378 & this.O) | (306783378 & this.O) << 1 & (0x24924924 & this.O), this.P);
        return Unit.INSTANCE;
    }
}

