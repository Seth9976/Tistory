package p5;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImageKt;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final ContentScale A;
    public final float B;
    public final ColorFilter C;
    public final boolean D;
    public final int E;
    public final Modifier w;
    public final AsyncImagePainter x;
    public final String y;
    public final Alignment z;

    public c(Modifier modifier0, AsyncImagePainter asyncImagePainter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, boolean z, int v) {
        this.w = modifier0;
        this.x = asyncImagePainter0;
        this.y = s;
        this.z = alignment0;
        this.A = contentScale0;
        this.B = f;
        this.C = colorFilter0;
        this.D = z;
        this.E = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AsyncImageKt.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)));
        return Unit.INSTANCE;
    }
}

