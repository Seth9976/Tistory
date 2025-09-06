package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class va extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final FloatingActionButtonElevation C;
    public final MutableInteractionSource D;
    public final Function2 E;
    public final int F;
    public final int G;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final Shape z;

    public va(Function0 function00, Modifier modifier0, Shape shape0, long v, long v1, FloatingActionButtonElevation floatingActionButtonElevation0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v2, int v3, int v4) {
        this.w = v4;
        this.x = function00;
        this.y = modifier0;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = floatingActionButtonElevation0;
        this.D = mutableInteractionSource0;
        this.E = function20;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                FloatingActionButtonKt.FloatingActionButton-X-z6DiA(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                FloatingActionButtonKt.LargeFloatingActionButton-X-z6DiA(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                FloatingActionButtonKt.SmallFloatingActionButton-X-z6DiA(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
        }
    }
}

