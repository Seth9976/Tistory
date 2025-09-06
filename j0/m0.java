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

public final class m0 extends Lambda implements Function2 {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final Map E;
    public final ColorProducer F;
    public final int G;
    public final int H;
    public final AnnotatedString w;
    public final Modifier x;
    public final TextStyle y;
    public final Function1 z;

    public m0(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, Map map0, ColorProducer colorProducer0, int v3, int v4) {
        this.w = annotatedString0;
        this.x = modifier0;
        this.y = textStyle0;
        this.z = function10;
        this.A = v;
        this.B = z;
        this.C = v1;
        this.D = v2;
        this.E = map0;
        this.F = colorProducer0;
        this.G = v3;
        this.H = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicTextKt.BasicText-RWo7tUw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

