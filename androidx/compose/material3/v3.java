package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SelectableChipColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function2 {
    public final Modifier A;
    public final boolean B;
    public final Function2 C;
    public final Function2 D;
    public final Shape E;
    public final Object F;
    public final Object G;
    public final BorderStroke H;
    public final MutableInteractionSource I;
    public final int J;
    public final int K;
    public final int L;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Function2 z;

    public v3(boolean z, Function0 function00, Modifier modifier0, boolean z1, MutableInteractionSource mutableInteractionSource0, Shape shape0, BorderStroke borderStroke0, SelectableChipColors selectableChipColors0, Function2 function20, Function2 function21, Function2 function22, Function3 function30, int v, int v1, int v2) {
        this.w = 2;
        this.x = z;
        this.y = function00;
        this.A = modifier0;
        this.B = z1;
        this.I = mutableInteractionSource0;
        this.E = shape0;
        this.H = borderStroke0;
        this.F = selectableChipColors0;
        this.z = function20;
        this.C = function21;
        this.D = function22;
        this.G = function30;
        this.J = v;
        this.K = v1;
        this.L = v2;
        super(2);
    }

    public v3(boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, Function2 function22, Shape shape0, androidx.compose.material3.SelectableChipColors selectableChipColors0, SelectableChipElevation selectableChipElevation0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2, int v3) {
        this.w = v3;
        this.x = z;
        this.y = function00;
        this.z = function20;
        this.A = modifier0;
        this.B = z1;
        this.C = function21;
        this.D = function22;
        this.E = shape0;
        this.F = selectableChipColors0;
        this.G = selectableChipElevation0;
        this.H = borderStroke0;
        this.I = mutableInteractionSource0;
        this.J = v;
        this.K = v1;
        this.L = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ChipKt.ElevatedFilterChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((androidx.compose.material3.SelectableChipColors)this.F), ((SelectableChipElevation)this.G), this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ChipKt.FilterChip(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((androidx.compose.material3.SelectableChipColors)this.F), ((SelectableChipElevation)this.G), this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.ChipKt.FilterChip(this.x, this.y, this.A, this.B, this.I, this.E, this.H, ((SelectableChipColors)this.F), this.z, this.C, this.D, ((Function3)this.G), ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
                return Unit.INSTANCE;
            }
        }
    }
}

