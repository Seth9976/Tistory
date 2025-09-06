package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function2 {
    public final Map A;
    public final TextStyle B;
    public final int C;
    public final boolean D;
    public final int E;
    public final int F;
    public final Resolver G;
    public final SelectionController H;
    public final ColorProducer I;
    public final Function1 J;
    public final int K;
    public final int L;
    public final int M;
    public final Modifier w;
    public final AnnotatedString x;
    public final Function1 y;
    public final boolean z;

    public v0(Modifier modifier0, AnnotatedString annotatedString0, Function1 function10, boolean z, Map map0, TextStyle textStyle0, int v, boolean z1, int v1, int v2, Resolver fontFamily$Resolver0, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function11, int v3, int v4, int v5) {
        this.w = modifier0;
        this.x = annotatedString0;
        this.y = function10;
        this.z = z;
        this.A = map0;
        this.B = textStyle0;
        this.C = v;
        this.D = z1;
        this.E = v1;
        this.F = v2;
        this.G = fontFamily$Resolver0;
        this.H = selectionController0;
        this.I = colorProducer0;
        this.J = function11;
        this.K = v3;
        this.L = v4;
        this.M = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicTextKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L), this.M);
        return Unit.INSTANCE;
    }
}

