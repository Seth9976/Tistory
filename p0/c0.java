package p0;

import androidx.compose.material.AlertDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final Function2 w;
    public final Modifier x;
    public final Function2 y;
    public final Function2 z;

    public c0(Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Shape shape0, long v, long v1) {
        this.w = function20;
        this.x = modifier0;
        this.y = function21;
        this.z = function22;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9576276C, v, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:140)");
        }
        AlertDialogKt.AlertDialogContent-WMdw5o4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

