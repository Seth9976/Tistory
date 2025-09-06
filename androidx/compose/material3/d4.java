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

public final class d4 extends Lambda implements Function2 {
    public final Function2 A;
    public final TextStyle B;
    public final Function2 C;
    public final Function2 D;
    public final Function2 E;
    public final Shape F;
    public final SelectableChipColors G;
    public final SelectableChipElevation H;
    public final BorderStroke I;
    public final float J;
    public final PaddingValues K;
    public final MutableInteractionSource L;
    public final int M;
    public final int N;
    public final boolean w;
    public final Modifier x;
    public final Function0 y;
    public final boolean z;

    public d4(boolean z, Modifier modifier0, Function0 function00, boolean z1, Function2 function20, TextStyle textStyle0, Function2 function21, Function2 function22, Function2 function23, Shape shape0, SelectableChipColors selectableChipColors0, SelectableChipElevation selectableChipElevation0, BorderStroke borderStroke0, float f, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = z;
        this.x = modifier0;
        this.y = function00;
        this.z = z1;
        this.A = function20;
        this.B = textStyle0;
        this.C = function21;
        this.D = function22;
        this.E = function23;
        this.F = shape0;
        this.G = selectableChipColors0;
        this.H = selectableChipElevation0;
        this.I = borderStroke0;
        this.J = f;
        this.K = paddingValues0;
        this.L = mutableInteractionSource0;
        this.M = v;
        this.N = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ChipKt.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N));
        return Unit.INSTANCE;
    }
}

