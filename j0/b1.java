package j0;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function2 {
    public final boolean A;
    public final int B;
    public final int C;
    public final Function1 D;
    public final Function1 E;
    public final int F;
    public final int G;
    public final AnnotatedString w;
    public final Function1 x;
    public final Modifier y;
    public final TextStyle z;

    public b1(AnnotatedString annotatedString0, Function1 function10, Modifier modifier0, TextStyle textStyle0, boolean z, int v, int v1, Function1 function11, Function1 function12, int v2, int v3) {
        this.w = annotatedString0;
        this.x = function10;
        this.y = modifier0;
        this.z = textStyle0;
        this.A = z;
        this.B = v;
        this.C = v1;
        this.D = function11;
        this.E = function12;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ClickableTextKt.ClickableText-03UYbkw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

