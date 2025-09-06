package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class em extends Lambda implements Function2 {
    public final TextStyle A;
    public final long B;
    public final long C;
    public final boolean w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public em(boolean z, Function2 function20, Function2 function21, Function2 function22, TextStyle textStyle0, long v, long v1) {
        this.w = z;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = textStyle0;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(835891690, v, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
        }
        if(!this.w || this.x == null) {
            ((Composer)object0).startReplaceGroup(-810701708);
            SnackbarKt.access$OneRowSnackbar-kKq0p4A(this.y, this.x, this.z, this.A, this.B, this.C, ((Composer)object0), 0);
        }
        else {
            ((Composer)object0).startReplaceGroup(0xCFAD7705);
            SnackbarKt.access$NewLineButtonSnackbar-kKq0p4A(this.y, this.x, this.z, this.A, this.B, this.C, ((Composer)object0), 0);
        }
        ((Composer)object0).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

