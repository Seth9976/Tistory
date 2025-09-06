package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function2 {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final String w;
    public final Modifier x;
    public final TextStyle y;
    public final Function1 z;

    public n0(String s, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, int v3) {
        this.w = s;
        this.x = modifier0;
        this.y = textStyle0;
        this.z = function10;
        this.A = v;
        this.B = z;
        this.C = v1;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicTextKt.BasicText-BpD7jsM(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

