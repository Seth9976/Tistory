package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lb extends Lambda implements Function2 {
    public final Shape A;
    public final IconToggleButtonColors B;
    public final BorderStroke C;
    public final MutableInteractionSource D;
    public final Function2 E;
    public final int F;
    public final int G;
    public final boolean w;
    public final Function1 x;
    public final Modifier y;
    public final boolean z;

    public lb(boolean z, Function1 function10, Modifier modifier0, boolean z1, Shape shape0, IconToggleButtonColors iconToggleButtonColors0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1) {
        this.w = z;
        this.x = function10;
        this.y = modifier0;
        this.z = z1;
        this.A = shape0;
        this.B = iconToggleButtonColors0;
        this.C = borderStroke0;
        this.D = mutableInteractionSource0;
        this.E = function20;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        IconButtonKt.OutlinedIconToggleButton(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

