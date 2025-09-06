package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q3 extends Lambda implements Function2 {
    public final TextStyle A;
    public final long B;
    public final Function2 C;
    public final Function2 D;
    public final Shape E;
    public final ChipColors F;
    public final ChipElevation G;
    public final BorderStroke H;
    public final float I;
    public final PaddingValues J;
    public final MutableInteractionSource K;
    public final int L;
    public final int M;
    public final Modifier w;
    public final Function0 x;
    public final boolean y;
    public final Function2 z;

    public q3(Modifier modifier0, Function0 function00, boolean z, Function2 function20, TextStyle textStyle0, long v, Function2 function21, Function2 function22, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, BorderStroke borderStroke0, float f, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, int v1, int v2) {
        this.w = modifier0;
        this.x = function00;
        this.y = z;
        this.z = function20;
        this.A = textStyle0;
        this.B = v;
        this.C = function21;
        this.D = function22;
        this.E = shape0;
        this.F = chipColors0;
        this.G = chipElevation0;
        this.H = borderStroke0;
        this.I = f;
        this.J = paddingValues0;
        this.K = mutableInteractionSource0;
        this.L = v1;
        this.M = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ChipKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M));
        return Unit.INSTANCE;
    }
}

