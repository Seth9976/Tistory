package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ja extends Lambda implements Function2 {
    public final Function0 A;
    public final InteractionSource B;
    public final int C;
    public final BoxScope w;
    public final boolean x;
    public final boolean y;
    public final SwitchColors z;

    public ja(BoxScope boxScope0, boolean z, boolean z1, SwitchColors switchColors0, Function0 function00, InteractionSource interactionSource0, int v) {
        this.w = boxScope0;
        this.x = z;
        this.y = z1;
        this.z = switchColors0;
        this.A = function00;
        this.B = interactionSource0;
        this.C = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SwitchKt.a(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
        return Unit.INSTANCE;
    }
}

