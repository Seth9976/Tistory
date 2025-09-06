package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function2 {
    public final boolean A;
    public final int B;
    public final int C;
    public final Function1 D;
    public final int E;
    public final int F;
    public final Object G;
    public final int w;
    public final AnnotatedString x;
    public final Modifier y;
    public final TextStyle z;

    public o0(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, Map map0, int v2, int v3) {
        this.w = 0;
        this.x = annotatedString0;
        this.y = modifier0;
        this.z = textStyle0;
        this.D = function10;
        this.B = v;
        this.A = z;
        this.C = v1;
        this.G = map0;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public o0(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, boolean z, int v, int v1, Function1 function10, Function1 function11, int v2, int v3) {
        this.w = 1;
        this.x = annotatedString0;
        this.y = modifier0;
        this.z = textStyle0;
        this.A = z;
        this.B = v;
        this.C = v1;
        this.D = function10;
        this.G = function11;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ClickableTextKt.ClickableText-4YKlhWE(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Function1)this.G), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        BasicTextKt.BasicText-4YKlhWE(this.x, this.y, this.z, this.D, this.B, this.A, this.C, ((Map)this.G), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

