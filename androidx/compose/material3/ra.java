package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ra extends Lambda implements Function2 {
    public final boolean A;
    public final Shape B;
    public final long C;
    public final long D;
    public final FloatingActionButtonElevation E;
    public final MutableInteractionSource F;
    public final int G;
    public final int H;
    public final Function2 w;
    public final Function2 x;
    public final Function0 y;
    public final Modifier z;

    public ra(Function2 function20, Function2 function21, Function0 function00, Modifier modifier0, boolean z, Shape shape0, long v, long v1, FloatingActionButtonElevation floatingActionButtonElevation0, MutableInteractionSource mutableInteractionSource0, int v2, int v3) {
        this.w = function20;
        this.x = function21;
        this.y = function00;
        this.z = modifier0;
        this.A = z;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.E = floatingActionButtonElevation0;
        this.F = mutableInteractionSource0;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FloatingActionButtonKt.ExtendedFloatingActionButton-ElI5-7k(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

