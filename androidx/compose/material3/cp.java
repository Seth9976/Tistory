package androidx.compose.material3;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class cp extends Lambda implements Function2 {
    public final long A;
    public final FontStyle B;
    public final FontWeight C;
    public final FontFamily D;
    public final long E;
    public final TextDecoration F;
    public final TextAlign G;
    public final long H;
    public final int I;
    public final boolean J;
    public final int K;
    public final Map L;
    public final Function1 M;
    public final TextStyle N;
    public final int O;
    public final int P;
    public final int Q;
    public final int w;
    public final AnnotatedString x;
    public final Modifier y;
    public final long z;

    public cp(AnnotatedString annotatedString0, Modifier modifier0, long v, long v1, FontStyle fontStyle0, FontWeight fontWeight0, FontFamily fontFamily0, long v2, TextDecoration textDecoration0, TextAlign textAlign0, long v3, int v4, boolean z, int v5, Map map0, Function1 function10, TextStyle textStyle0, int v6, int v7, int v8, int v9) {
        this.w = v9;
        this.x = annotatedString0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = fontStyle0;
        this.C = fontWeight0;
        this.D = fontFamily0;
        this.E = v2;
        this.F = textDecoration0;
        this.G = textAlign0;
        this.H = v3;
        this.I = v4;
        this.J = z;
        this.K = v5;
        this.L = map0;
        this.M = function10;
        this.N = textStyle0;
        this.O = v6;
        this.P = v7;
        this.Q = v8;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextKt.Text--4IGK_g(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.TextKt.Text--4IGK_g(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
        return Unit.INSTANCE;
    }
}

