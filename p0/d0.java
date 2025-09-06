package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.FloatingActionButtonElevation;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function2 {
    public final Function2 A;
    public final Shape B;
    public final long C;
    public final long D;
    public final int E;
    public final int F;
    public final Object G;
    public final Object H;
    public final int w;
    public final Function2 x;
    public final Function0 y;
    public final Modifier z;

    public d0(Function0 function00, Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Shape shape0, long v, long v1, DialogProperties dialogProperties0, int v2, int v3) {
        this.w = 0;
        this.y = function00;
        this.x = function20;
        this.z = modifier0;
        this.A = function21;
        this.G = function22;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.H = dialogProperties0;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public d0(Function2 function20, Function0 function00, Modifier modifier0, Function2 function21, MutableInteractionSource mutableInteractionSource0, Shape shape0, long v, long v1, FloatingActionButtonElevation floatingActionButtonElevation0, int v2, int v3) {
        this.w = 1;
        this.x = function20;
        this.y = function00;
        this.z = modifier0;
        this.A = function21;
        this.G = mutableInteractionSource0;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.H = floatingActionButtonElevation0;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            FloatingActionButtonKt.ExtendedFloatingActionButton-wqdebIU(this.x, this.y, this.z, this.A, ((MutableInteractionSource)this.G), this.B, this.C, this.D, ((FloatingActionButtonElevation)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AndroidAlertDialog_androidKt.AlertDialog-wqdebIU(this.y, this.x, this.z, this.A, ((Function2)this.G), this.B, this.C, this.D, ((DialogProperties)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

