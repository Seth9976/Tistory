package p0;

import androidx.compose.material.AlertDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final int D;
    public final int E;
    public final Function2 w;
    public final Modifier x;
    public final Function2 y;
    public final Function2 z;

    public d(Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Shape shape0, long v, long v1, int v2, int v3) {
        this.w = function20;
        this.x = modifier0;
        this.y = function21;
        this.z = function22;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AlertDialogKt.AlertDialogContent-WMdw5o4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

