package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final ContextualFlowRowOverflow C;
    public final Function4 D;
    public final int E;
    public final int F;
    public final int w;
    public final Modifier x;
    public final Horizontal y;
    public final Vertical z;

    public k0(int v, Modifier modifier0, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, int v1, int v2, ContextualFlowRowOverflow contextualFlowRowOverflow0, Function4 function40, int v3, int v4) {
        this.w = v;
        this.x = modifier0;
        this.y = arrangement$Horizontal0;
        this.z = arrangement$Vertical0;
        this.A = v1;
        this.B = v2;
        this.C = contextualFlowRowOverflow0;
        this.D = function40;
        this.E = v3;
        this.F = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ContextualFlowLayoutKt.ContextualFlowRow(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

