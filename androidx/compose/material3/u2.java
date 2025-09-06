package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class u2 extends Lambda implements Function2 {
    public final Shape A;
    public final CardColors B;
    public final CardElevation C;
    public final BorderStroke D;
    public final MutableInteractionSource E;
    public final Function3 F;
    public final int G;
    public final int H;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final boolean z;

    public u2(Function0 function00, Modifier modifier0, boolean z, Shape shape0, CardColors cardColors0, CardElevation cardElevation0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = shape0;
        this.B = cardColors0;
        this.C = cardElevation0;
        this.D = borderStroke0;
        this.E = mutableInteractionSource0;
        this.F = function30;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            CardKt.OutlinedCard(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        CardKt.Card(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

