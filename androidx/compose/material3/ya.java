package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ya extends Lambda implements Function2 {
    public final Shape A;
    public final IconButtonColors B;
    public final MutableInteractionSource C;
    public final Function2 D;
    public final int E;
    public final int F;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final boolean z;

    public ya(Function0 function00, Modifier modifier0, boolean z, Shape shape0, IconButtonColors iconButtonColors0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = shape0;
        this.B = iconButtonColors0;
        this.C = mutableInteractionSource0;
        this.D = function20;
        this.E = v;
        this.F = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            IconButtonKt.FilledTonalIconButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        IconButtonKt.FilledIconButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

