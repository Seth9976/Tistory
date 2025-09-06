package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n3 extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final Function2 C;
    public final Shape D;
    public final ChipColors E;
    public final ChipElevation F;
    public final ChipBorder G;
    public final MutableInteractionSource H;
    public final int I;
    public final int J;
    public final int K;
    public final int w;
    public final Function0 x;
    public final Function2 y;
    public final Modifier z;

    public n3(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Function2 function22, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2, int v3) {
        this.w = v3;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z;
        this.B = function21;
        this.C = function22;
        this.D = shape0;
        this.E = chipColors0;
        this.F = chipElevation0;
        this.G = chipBorder0;
        this.H = mutableInteractionSource0;
        this.I = v;
        this.J = v1;
        this.K = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ChipKt.ElevatedAssistChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ChipKt.AssistChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

