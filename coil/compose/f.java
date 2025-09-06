package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Function1 A;
    public final Alignment B;
    public final ContentScale C;
    public final float D;
    public final ColorFilter E;
    public final int F;
    public final boolean G;
    public final Function3 H;
    public final int I;
    public final int J;
    public final int K;
    public final AsyncImageState w;
    public final String x;
    public final Modifier y;
    public final Function1 z;

    public f(AsyncImageState asyncImageState0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, boolean z, Function3 function30, int v1, int v2, int v3) {
        this.w = asyncImageState0;
        this.x = s;
        this.y = modifier0;
        this.z = function10;
        this.A = function11;
        this.B = alignment0;
        this.C = contentScale0;
        this.D = f;
        this.E = colorFilter0;
        this.F = v;
        this.G = z;
        this.H = function30;
        this.I = v1;
        this.J = v2;
        this.K = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SubcomposeAsyncImageKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

