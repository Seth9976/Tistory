package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x3 extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final Shape C;
    public final ChipColors D;
    public final ChipElevation E;
    public final ChipBorder F;
    public final MutableInteractionSource G;
    public final int H;
    public final int I;
    public final int w;
    public final Function0 x;
    public final Function2 y;
    public final Modifier z;

    public x3(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z;
        this.B = function21;
        this.C = shape0;
        this.D = chipColors0;
        this.E = chipElevation0;
        this.F = chipBorder0;
        this.G = mutableInteractionSource0;
        this.H = v;
        this.I = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ChipKt.SuggestionChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ChipKt.ElevatedSuggestionChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
        return Unit.INSTANCE;
    }
}

