package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.FloatingActionButtonElevation;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class oa extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final int D;
    public final int E;
    public final Object F;
    public final Function G;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final MutableInteractionSource z;

    public oa(Function0 function00, Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Shape shape0, long v, long v1, FloatingActionButtonElevation floatingActionButtonElevation0, Function2 function20, int v2, int v3) {
        this.w = 1;
        this.x = function00;
        this.y = modifier0;
        this.z = mutableInteractionSource0;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.F = floatingActionButtonElevation0;
        this.G = function20;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    public oa(Function0 function00, Modifier modifier0, Shape shape0, long v, long v1, androidx.compose.material3.FloatingActionButtonElevation floatingActionButtonElevation0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.x = function00;
        this.y = modifier0;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.F = floatingActionButtonElevation0;
        this.z = mutableInteractionSource0;
        this.G = function30;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            FloatingActionButtonKt.FloatingActionButton-bogVsAg(this.x, this.y, this.z, this.A, this.B, this.C, ((FloatingActionButtonElevation)this.F), ((Function2)this.G), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.FloatingActionButtonKt.ExtendedFloatingActionButton-X-z6DiA(this.x, this.y, this.A, this.B, this.C, ((androidx.compose.material3.FloatingActionButtonElevation)this.F), this.z, ((Function3)this.G), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

