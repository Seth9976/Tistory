package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class bb extends Lambda implements Function2 {
    public final boolean A;
    public final Shape B;
    public final IconToggleButtonColors C;
    public final MutableInteractionSource D;
    public final Function2 E;
    public final int F;
    public final int G;
    public final int w;
    public final boolean x;
    public final Function1 y;
    public final Modifier z;

    public bb(boolean z, Function1 function10, Modifier modifier0, boolean z1, Shape shape0, IconToggleButtonColors iconToggleButtonColors0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.y = function10;
        this.z = modifier0;
        this.A = z1;
        this.B = shape0;
        this.C = iconToggleButtonColors0;
        this.D = mutableInteractionSource0;
        this.E = function20;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            IconButtonKt.FilledTonalIconToggleButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        IconButtonKt.FilledIconToggleButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

