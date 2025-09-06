package p0;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Shape C;
    public final long D;
    public final long E;
    public final DialogProperties F;
    public final int G;
    public final int H;
    public final Function0 w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public b0(Function0 function00, Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Function2 function23, Shape shape0, long v, long v1, DialogProperties dialogProperties0, int v2, int v3) {
        this.w = function00;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function22;
        this.B = function23;
        this.C = shape0;
        this.D = v;
        this.E = v1;
        this.F = dialogProperties0;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidAlertDialog_androidKt.AlertDialog-6oU6zVQ(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

