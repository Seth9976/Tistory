package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class fm extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final boolean w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public fm(boolean z, Function2 function20, Function2 function21, Function2 function22, long v, long v1) {
        this.w = z;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = v;
        this.B = v1;
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
            ComposerKt.traceEventStart(0x92F18D2A, v, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
        }
        TextStyle textStyle0 = TypographyKt.getValue(SnackbarTokens.INSTANCE.getSupportingTextFont(), ((Composer)object0), 6);
        TextStyle textStyle1 = TypographyKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextFont(), ((Composer)object0), 6);
        CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(textStyle0), ComposableLambdaKt.rememberComposableLambda(835891690, true, new em(this.w, this.x, this.y, this.z, textStyle1, this.A, this.B), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

