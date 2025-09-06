package u;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function2 {
    public final ContentScale A;
    public final float B;
    public final ColorFilter C;
    public final int D;
    public final int E;
    public final Painter w;
    public final String x;
    public final Modifier y;
    public final Alignment z;

    public e2(Painter painter0, String s, Modifier modifier0, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, int v1) {
        this.w = painter0;
        this.x = s;
        this.y = modifier0;
        this.z = alignment0;
        this.A = contentScale0;
        this.B = f;
        this.C = colorFilter0;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ImageKt.Image(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

