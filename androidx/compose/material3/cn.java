package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class cn extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final Function2 C;
    public final long D;
    public final long E;
    public final MutableInteractionSource F;
    public final int G;
    public final int H;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public cn(boolean z, Function0 function00, Modifier modifier0, boolean z1, Function2 function20, Function2 function21, long v, long v1, MutableInteractionSource mutableInteractionSource0, int v2, int v3) {
        this.w = 1;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = z1;
        this.B = function20;
        this.C = function21;
        this.D = v;
        this.E = v1;
        this.F = mutableInteractionSource0;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    public cn(boolean z, Function0 function00, Modifier modifier0, boolean z1, Function2 function20, Function2 function21, MutableInteractionSource mutableInteractionSource0, long v, long v1, int v2, int v3) {
        this.w = 3;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = z1;
        this.B = function20;
        this.C = function21;
        this.F = mutableInteractionSource0;
        this.D = v;
        this.E = v1;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    public cn(boolean z, Function0 function00, Function2 function20, Function2 function21, Modifier modifier0, boolean z1, long v, long v1, MutableInteractionSource mutableInteractionSource0, int v2, int v3) {
        this.w = 0;
        this.x = z;
        this.y = function00;
        this.B = function20;
        this.C = function21;
        this.z = modifier0;
        this.A = z1;
        this.D = v;
        this.E = v1;
        this.F = mutableInteractionSource0;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    public cn(boolean z, Function0 function00, Function2 function20, Function2 function21, Modifier modifier0, boolean z1, MutableInteractionSource mutableInteractionSource0, long v, long v1, int v2, int v3) {
        this.w = 2;
        this.x = z;
        this.y = function00;
        this.B = function20;
        this.C = function21;
        this.z = modifier0;
        this.A = z1;
        this.F = mutableInteractionSource0;
        this.D = v;
        this.E = v1;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                TabKt.LeadingIconTab-wqdebIU(this.x, this.y, this.B, this.C, this.z, this.A, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                TabKt.Tab-wqdebIU(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                androidx.compose.material.TabKt.LeadingIconTab-0nD-MI0(this.x, this.y, this.B, this.C, this.z, this.A, this.F, this.D, this.E, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.TabKt.Tab-0nD-MI0(this.x, this.y, this.z, this.A, this.B, this.C, this.F, this.D, this.E, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
        }
    }
}

