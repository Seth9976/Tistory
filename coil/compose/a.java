package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final Function1 A;
    public final Alignment B;
    public final ContentScale C;
    public final float D;
    public final ColorFilter E;
    public final int F;
    public final boolean G;
    public final int H;
    public final int I;
    public final AsyncImageState w;
    public final String x;
    public final Modifier y;
    public final Function1 z;

    public a(AsyncImageState asyncImageState0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, boolean z, int v1, int v2) {
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
        this.H = v1;
        this.I = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AsyncImageKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I));
        return Unit.INSTANCE;
    }
}

