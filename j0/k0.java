package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final CharSequence G;
    public final Object H;
    public final int w;
    public final Modifier x;
    public final TextStyle y;
    public final Function1 z;

    public k0(CharSequence charSequence0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, Object object0, int v3, int v4, int v5) {
        this.w = v5;
        this.G = charSequence0;
        this.x = modifier0;
        this.y = textStyle0;
        this.z = function10;
        this.A = v;
        this.B = z;
        this.C = v1;
        this.D = v2;
        this.H = object0;
        this.E = v3;
        this.F = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            BasicTextKt.BasicText-VhcvRP8(((AnnotatedString)this.G), this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Map)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        BasicTextKt.BasicText-VhcvRP8(((String)this.G), this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((ColorProducer)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

