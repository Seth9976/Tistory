package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final Function2 A;
    public final int B;
    public final int C;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final DialogProperties z;

    public a(Function0 function00, Modifier modifier0, DialogProperties dialogProperties0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = dialogProperties0;
        this.A = function20;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AlertDialogKt.BasicAlertDialog(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AlertDialogKt.AlertDialog(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

