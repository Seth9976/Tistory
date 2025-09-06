package p5;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.SubcomposeAsyncImageKt;
import coil.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final Alignment A;
    public final ContentScale B;
    public final float C;
    public final ColorFilter D;
    public final boolean E;
    public final int F;
    public final int G;
    public final SubcomposeAsyncImageScope w;
    public final Modifier x;
    public final Painter y;
    public final String z;

    public k(SubcomposeAsyncImageScope subcomposeAsyncImageScope0, Modifier modifier0, Painter painter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, boolean z, int v, int v1) {
        this.w = subcomposeAsyncImageScope0;
        this.x = modifier0;
        this.y = painter0;
        this.z = s;
        this.A = alignment0;
        this.B = contentScale0;
        this.C = f;
        this.D = colorFilter0;
        this.E = z;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

